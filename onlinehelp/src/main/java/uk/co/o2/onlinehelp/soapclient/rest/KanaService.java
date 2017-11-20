package uk.co.o2.onlinehelp.soapclient.rest;

import com.codahale.metrics.annotation.Timed;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.o2.onlinehelp.exception.KanaException;
import uk.co.o2.onlinehelp.exception.OHEncryptionException;
import uk.co.o2.onlinehelp.exception.SOAException;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.Map;

/**
 * Created by cts1 on 29/6/17.
 */
@Service
public class KanaService {

    private final WebResource kanaWebResource;

    private OnlineHelpLogger logger;

    @Autowired
    public KanaService(SoaRestClientFactory soaRestClientFactory, OnlineHelpLogger logger) throws OHEncryptionException {
        this.kanaWebResource = soaRestClientFactory.createKanaResource();
        this.logger = logger;
    }

    @Timed
    public void submitForm(Map<String, String> kanaDetails) throws Exception {

        MultivaluedMap<String, String> multivaluedMap = new MultivaluedMapImpl();
        kanaDetails.forEach((key, value) -> multivaluedMap.add(key, value));
        ClientResponse response = kanaWebResource.type("application/x-www-form-urlencoded;charset=UTF-8")
                .post(ClientResponse.class, multivaluedMap);
        String htmlResponse = response.getEntity(String.class);
        StringBuilder responseString = (StringBuilder) response.getProperties().get("HeaderInfo");
        responseString.append("Response Payload: ").append(htmlResponse);
        logger.accessLog(responseString.toString());

        if (response.getStatus() == 200) {
            if (StringUtils.contains(htmlResponse, "You Submitted")) {
                logger.opsLog("Details Submitted successfully to KANA for: ",
                        kanaDetails.get("FRH_msg_firstname"),
                        kanaDetails.get("FRH_msg_lastname"),
                        ", Msisdn:",
                        kanaDetails.get("FRH_msg_mobile_number"),
                        "for case as:",
                        kanaDetails.get("SX_SUBJECT"));
            } else {
                throw new KanaException("Received error in response from KANA.");
            }
        } else if (response.getStatus() == 401) {
            throw new KanaException("Incorrect Credentials.");
        } else if (response.getStatus() == 500) {
            throw new SOAException("Internal SOA service error.");
        } else {
            throw new Exception("Service failed with status as " + response.getStatus());
        }
    }

}
