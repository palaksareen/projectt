package uk.co.o2.onlinehelp.soapclient.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.exception.OHEncryptionException;
import uk.co.o2.onlinehelp.soapclient.helper.SoaConfig;
import uk.co.o2.onlinehelp.soapclient.helper.SoaPasswordEncryption;
import uk.co.o2.onlinehelp.soapclient.rest.filter.KanaLoggingFilter;
import uk.co.o2.onlinehelp.soapclient.rest.filter.SoaConsumerIdFilter;

/**
 * Created by cts1 on 29/6/17.
 */
@Component
public class SoaRestClientFactory {

    @Autowired
    private SoaPasswordEncryption decryptor;

    @Autowired
    private SoaConfig soaConfig;

    @Autowired
    private KanaLoggingFilter kanaLoggingFilter;

    @Autowired
    private SoaConsumerIdFilter soaConsumerIdFilter;

    private Client client;

    public SoaRestClientFactory() {
        client = Client.create();
    }

    public WebResource createKanaResource() throws OHEncryptionException {

        client.addFilter(new HTTPBasicAuthFilter(soaConfig.getUsername(), decryptor.decrypt(soaConfig.getPassword())));
        client.addFilter(kanaLoggingFilter);
        client.addFilter(soaConsumerIdFilter);

        client.setConnectTimeout(soaConfig.getSoaRestConnectionTimeout());
        client.setReadTimeout(soaConfig.getSoaRestReadTimeout());

        WebResource webResource = client.resource(soaConfig.getKanaServiceUrl());
        return webResource;
    }
}
