package uk.co.o2.onlinehelp.soapclient.rest.filter;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by cts1 on 29/6/17.
 */
@Component
public class SoaConsumerIdFilter extends ClientFilter {

    public static final String SOA_CONSUMER_TRANSACTION_ID_HEADER = "SOAConsumerTransactionID";

    @Override
    public ClientResponse handle(ClientRequest request) throws ClientHandlerException {
        String soaConsumerTransactionId = UUID.randomUUID().toString();
        request.getHeaders().add(SOA_CONSUMER_TRANSACTION_ID_HEADER, soaConsumerTransactionId);
        ClientResponse response = getNext().handle(request);
        return response;
    }
}