package uk.co.o2.onlinehelp.soapclient.helper;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.exception.OHEncryptionException;

@Component
public class SslCertBean implements InitializingBean {

    @Autowired
    private SoaConfig soaConfig;

    @Autowired
    private SoaPasswordEncryption soaPasswordEncryption;

    private void setSSLProperties() throws OHEncryptionException {
        System.setProperty("javax.net.debug", "all");
        System.setProperty("javax.net.ssl.keyStore", soaConfig.getSoaCertificateLocation());
        System.setProperty("javax.net.ssl.keyStorePassword", soaPasswordEncryption.decrypt(soaConfig.getKeyStorePassword()));
        System.setProperty("javax.net.ssl.trustStore", soaConfig.getSoaTrustedStoreCertificateLocation());
        System.setProperty("javax.net.ssl.trustStorePassword", soaPasswordEncryption.decrypt(soaConfig.getSoaTrustedStorePassword()));
        System.setProperty("https.protocols", soaConfig.getHttpsProtocols());
    }

    @Override
    public void afterPropertiesSet() throws OHEncryptionException {
        setSSLProperties();
    }
}
