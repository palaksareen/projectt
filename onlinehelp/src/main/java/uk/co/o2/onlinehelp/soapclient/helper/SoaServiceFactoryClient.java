package uk.co.o2.onlinehelp.soapclient.helper;

import com.sun.xml.ws.client.BindingProviderProperties;
import com.sun.xml.ws.developer.WSBindingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.o2.soa.subscriberservice_2.SubscriberPort;
import uk.co.o2.soa.useraccountsservice_1.UserAccountsPortType;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import java.net.URL;

@Component
public class SoaServiceFactoryClient {

    @Autowired
    private SoaConfig soaConfig;
    @Autowired
    private SOAHandler soaHandler;

    private static final String WSDL_SUBSCRIBERSERVICE_2_0 =
            "../../../../../wsdl/subscriberservice_2_0/subscriberservice_2_0.wsdl";
    private static final String WSDL_USERACCOUNTSSERVICE_1_0 =
            "../../../../../wsdl/useraccountsservice_1_0/useraccountsservice_1_0.wsdl";

    private SubscriberPort subscriberPort;
    private UserAccountsPortType userAccountsPortType;

    public SubscriberPort getSubscriberPort() {
        URL baseUrl = uk.co.o2.soa.subscriberservice_2.SubscriberService.class.getResource(WSDL_SUBSCRIBERSERVICE_2_0);
        uk.co.o2.soa.subscriberservice_2.SubscriberService subscriberService = new uk.co.o2.soa.subscriberservice_2.SubscriberService(baseUrl,
                new QName("http://soa.o2.co.uk/subscriberservice_2", "SubscriberService"));
        subscriberPort = subscriberService.getSubscriberPort();
        getPropertiesSet(soaConfig.getSubscriberServiceUrl(), subscriberPort);
        return subscriberPort;
    }

    public UserAccountsPortType getUserAccountsPort() {
        URL baseUrl = uk.co.o2.soa.useraccountsservice_1.UserAccounts.class.getResource(WSDL_USERACCOUNTSSERVICE_1_0);
        uk.co.o2.soa.useraccountsservice_1.UserAccounts userAccountsService = new uk.co.o2.soa.useraccountsservice_1.UserAccounts(
                baseUrl, new QName("http://soa.o2.co.uk/useraccountsservice_1", "UserAccounts"));
        userAccountsPortType = userAccountsService.getUserAccountsPortTypeSoapPort();
        getPropertiesSet(soaConfig.getUserAcctsServiceUrl(), userAccountsPortType);
        return userAccountsPortType;
    }

    public void getPropertiesSet(String serviceUrl, Object port) {
        BindingProvider provider = (BindingProvider) port;

        WSBindingProvider wsBindingProvider = (WSBindingProvider) port;
        wsBindingProvider.getRequestContext().put(BindingProviderProperties.CONNECT_TIMEOUT, soaConfig.getSoaSoapConnectionTimeout());
        wsBindingProvider.getRequestContext().put(BindingProviderProperties.REQUEST_TIMEOUT, soaConfig.getSoaSoapReadTimeout());
        wsBindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);

        java.util.List<Handler> handlers = provider.getBinding().getHandlerChain();
        handlers.add(soaHandler);
        provider.getBinding().setHandlerChain(handlers);
    }
}
