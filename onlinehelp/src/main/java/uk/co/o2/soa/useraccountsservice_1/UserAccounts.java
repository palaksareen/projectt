
package uk.co.o2.soa.useraccountsservice_1;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserAccounts", targetNamespace = "http://soa.o2.co.uk/useraccountsservice_1", wsdlLocation = "useraccountsservice_1_0.wsdl")
public class UserAccounts
    extends Service
{

    private final static URL USERACCOUNTS_WSDL_LOCATION;
    private final static WebServiceException USERACCOUNTS_EXCEPTION;
    private final static QName USERACCOUNTS_QNAME = new QName("http://soa.o2.co.uk/useraccountsservice_1", "UserAccounts");

    static {
        USERACCOUNTS_WSDL_LOCATION = uk.co.o2.soa.useraccountsservice_1.UserAccounts.class.getResource("useraccountsservice_1_0.wsdl");
        WebServiceException e = null;
        if (USERACCOUNTS_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'useraccountsservice_1_0.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        USERACCOUNTS_EXCEPTION = e;
    }

    public UserAccounts() {
        super(__getWsdlLocation(), USERACCOUNTS_QNAME);
    }

    public UserAccounts(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERACCOUNTS_QNAME, features);
    }

    public UserAccounts(URL wsdlLocation) {
        super(wsdlLocation, USERACCOUNTS_QNAME);
    }

    public UserAccounts(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERACCOUNTS_QNAME, features);
    }

    public UserAccounts(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserAccounts(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserAccountsPortType
     */
    @WebEndpoint(name = "UserAccountsPortTypeSoapPort")
    public UserAccountsPortType getUserAccountsPortTypeSoapPort() {
        return super.getPort(new QName("http://soa.o2.co.uk/useraccountsservice_1", "UserAccountsPortTypeSoapPort"), UserAccountsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserAccountsPortType
     */
    @WebEndpoint(name = "UserAccountsPortTypeSoapPort")
    public UserAccountsPortType getUserAccountsPortTypeSoapPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soa.o2.co.uk/useraccountsservice_1", "UserAccountsPortTypeSoapPort"), UserAccountsPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERACCOUNTS_EXCEPTION!= null) {
            throw USERACCOUNTS_EXCEPTION;
        }
        return USERACCOUNTS_WSDL_LOCATION;
    }

}
