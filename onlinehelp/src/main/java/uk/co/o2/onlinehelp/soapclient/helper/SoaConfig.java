package uk.co.o2.onlinehelp.soapclient.helper;

import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.util.DynamicProperties;

@Component
public class SoaConfig {

    private String httpsProtocols = DynamicProperties.getProperty("https.protocols");
    private Integer soaSoapReadTimeout = DynamicProperties.getIntegerProperty("soa.read.timeoutMS");
    private Integer soaSoapConnectionTimeout = DynamicProperties.getIntegerProperty("soa.connection.timeoutMS");
    private Integer soaRestReadTimeout = DynamicProperties.getIntegerProperty("kana.read.timeoutMS");
    private Integer soaRestConnectionTimeout = DynamicProperties.getIntegerProperty("kana.connection.timeoutMS");
    private String subscriberServiceUrl = DynamicProperties.getProperty("subscriber.service.url");
    private String userAcctsServiceUrl = DynamicProperties.getProperty("useraccts.service.url");
    private String kanaServiceUrl = DynamicProperties.getProperty("kana.service.url");
    // key store
    private String keyStorePassword = DynamicProperties.getProperty("soa.keystore.password");
    private String username = DynamicProperties.getProperty("soa.username");
    private String password = DynamicProperties.getProperty("soa.password");
    // Trust store
    private String soaTrustedStoreCertificateLocation = DynamicProperties.getProperty("soa.trustedstore.certificate.location");
    private String soaTrustedStorePassword = DynamicProperties.getProperty("soa.trustedstore.password");
    private String soaCertificateLocation = DynamicProperties.getProperty("soa.certificate.location");

    public SoaConfig() {
    }

    public String getHttpsProtocols() {
        return httpsProtocols;
    }

    public Integer getSoaSoapReadTimeout() {
        return soaSoapReadTimeout;
    }

    public String getSubscriberServiceUrl() {
        return subscriberServiceUrl;
    }

    public String getUserAcctsServiceUrl() {
        return userAcctsServiceUrl;
    }

    public Integer getSoaSoapConnectionTimeout() {
        return soaSoapConnectionTimeout;
    }

    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSoaTrustedStoreCertificateLocation() {
        return soaTrustedStoreCertificateLocation;
    }

    public String getSoaTrustedStorePassword() {
        return soaTrustedStorePassword;
    }

    public String getSoaCertificateLocation() {
        return soaCertificateLocation;
    }

    public String getKanaServiceUrl() {
        return kanaServiceUrl;
    }

    public Integer getSoaRestReadTimeout() {
        return soaRestReadTimeout;
    }

    public Integer getSoaRestConnectionTimeout() {
        return soaRestConnectionTimeout;
    }
}
