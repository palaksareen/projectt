package uk.co.o2.onlinehelp.soapclient.helper;

import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.exception.OHEncryptionException;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Component
public class SoaPasswordEncryption {

    private static final int KEY_LENGTH = 128;
    private static final String ENCRYPTION_ALGORITHM = "AES";

    private final byte[] defaultKeyBytes = {-5, -6, 68, 78, -24, -118, 20, 101, 60, -75, 28, 67, -62, 96, 22, 120};

    private final SecretKey secretKey = new SecretKeySpec(defaultKeyBytes, ENCRYPTION_ALGORITHM);

    public String decrypt(String encryptedPassword) throws OHEncryptionException {
        try {
            Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedPassword)));
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            throw new OHEncryptionException(ex);
        }
    }

    public String encrypt(String password) throws OHEncryptionException {
        try {
            Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal(password.getBytes());
            return new String(Base64.getEncoder().encodeToString(encrypted));
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            throw new OHEncryptionException(ex);
        }
    }

}