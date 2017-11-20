package uk.co.o2.onlinehelp.util;

import uk.co.o2.onlinehelp.exception.OHEncryptionException;
import uk.co.o2.onlinehelp.soapclient.helper.SoaPasswordEncryption;

public class PasswordEncryption {

    public static void main(String[] args) throws OHEncryptionException {

        SoaPasswordEncryption encryption = new SoaPasswordEncryption();
        System.out.println("Usage: java uk.co.o2.onlinehelp.soapclient.helper.SoaPasswordEncryption <arg>\nWhere arg is:\n<password> -Output the encrypted version of the password\n");

        System.out.println("Encrypted password: " + encryption.encrypt("Qwrh8>Yr}"));
        System.out.println("Encrypted password: " + encryption.decrypt("qHh/rAdIy/3B5LqUr0YAUg=="));


    }

}
