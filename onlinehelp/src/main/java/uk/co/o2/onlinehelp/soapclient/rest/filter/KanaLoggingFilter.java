package uk.co.o2.onlinehelp.soapclient.rest.filter;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by cts1 on 29/6/17.
 */
@Component
public class KanaLoggingFilter extends ClientFilter {

    @Autowired
    private OnlineHelpLogger logger;

    @Override
    public ClientResponse handle(ClientRequest request) throws ClientHandlerException {
        Long soaRequestTime = System.currentTimeMillis();
        logRequest(request);
        ClientResponse response = getNext().handle(request);
        logResponse(response, soaRequestTime);
        return response;
    }

    private void logRequest(ClientRequest request) {
        StringBuilder message = new StringBuilder();

        message.append("KANA URL: ").append(request.getMethod()).append(" ").append(request.getURI());
        message.append(" KANA REQUEST: ");
        message.append("Headers:");
        request.getHeaders().forEach((key, value) -> message.append(";").append(key).append(" : ").append(value));
        message.append("Payload:");
        ((MultivaluedMap) request.getEntity()).forEach((key, value) -> message.append(";").append(key).append(" : ").append(value));
        logger.accessLog(message.toString());
    }

    private void logResponse(ClientResponse response, Long soaRequestTime) {
        StringBuilder message = new StringBuilder();

        Long soaOutputTime = System.currentTimeMillis();
        String responseTime = String.valueOf(soaOutputTime - soaRequestTime);

        message.append("KANA RESPONSE TIME: ").append(responseTime).append("ms");
        message.append(" KANA RESPONSE: ");
        message.append("Headers:");
        response.getHeaders().forEach((key, value) -> message.append(";").append(key).append(" : ").append(value));
//        logger.accessLog(message.toString());
        response.getProperties().put("HeaderInfo", message);
    }
}