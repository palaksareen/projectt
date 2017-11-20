package uk.co.o2.onlinehelp.soapclient.soap;

import com.codahale.metrics.annotation.Timed;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.exception.SOAFaultException;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;
import uk.co.o2.onlinehelp.model.UserAcctDetails;
import uk.co.o2.onlinehelp.model.builder.ExceptionMessageBuilder;
import uk.co.o2.onlinehelp.model.builder.SearchOnlineAccountsRequestBuilder;
import uk.co.o2.onlinehelp.model.builder.UserAcctDetailsBuilder;
import uk.co.o2.onlinehelp.soapclient.helper.SoaServiceFactoryClient;
import uk.co.o2.soa.useraccountsdata_1.AllOrSummaryType;
import uk.co.o2.soa.useraccountsdata_1.PortalOrIdentitySwitchType;
import uk.co.o2.soa.useraccountsdata_1.SearchOnlineAccounts1;
import uk.co.o2.soa.useraccountsdata_1.SearchOnlineAccounts1Response;
import uk.co.o2.soa.useraccountsservice_1.SearchOnlineAccounts1Fault;
import uk.co.o2.soa.useraccountsservice_1.UserAccountsPortType;

@Component
public class UserAcctServiceImpl implements UserAcctService, InitializingBean {

    @Autowired
    private OnlineHelpLogger logger;

    @Autowired
    private SoaServiceFactoryClient soaServiceFactoryClient;

    @Timed
    @Override
    public UserAcctDetails getUserAcctDetails(String mpn) throws SOAFaultException {
        UserAcctDetails userAcctDetails;
        UserAccountsPortType userAccountsPort = soaServiceFactoryClient.getUserAccountsPort();
        try {
            SearchOnlineAccounts1Response response = userAccountsPort.searchOnlineAccounts1(createRequest(mpn));
            userAcctDetails = new UserAcctDetailsBuilder(response).build();
            userAcctDetails.setMpn(mpn);
            logger.accessLog("RESPONSE:", userAcctDetails.toString());
        } catch (SearchOnlineAccounts1Fault e) {
            throw new SOAFaultException(new ExceptionMessageBuilder().forException(e).build(), e);
        }

        return userAcctDetails;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        assert soaServiceFactoryClient != null;
    }

    private SearchOnlineAccounts1 createRequest(String mpn) {
        return new SearchOnlineAccountsRequestBuilder().withSearchCriteriaAsMsisdn(mpn).withSearchOptionsType
                (PortalOrIdentitySwitchType.PORTAL)
                .withSearchResultsType(AllOrSummaryType.ALL).build();
    }
}
