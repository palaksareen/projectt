package uk.co.o2.onlinehelp.model.builder;

import uk.co.o2.soa.useraccountsdata_1.*;

public class SearchOnlineAccountsRequestBuilder {
    private String msisdn;
    private PortalOrIdentitySwitchType switchType;
    private AllOrSummaryType type;

    public SearchOnlineAccountsRequestBuilder withSearchCriteriaAsMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }

    public SearchOnlineAccountsRequestBuilder withSearchOptionsType(PortalOrIdentitySwitchType switchType) {
        this.switchType = switchType;
        return this;
    }

    public SearchOnlineAccountsRequestBuilder withSearchResultsType(AllOrSummaryType type) {
        this.type = type;
        return this;
    }

    public SearchOnlineAccounts1 build() {
        SearchOnlineAccounts1 searchOnlineAccounts1 = new SearchOnlineAccounts1();

        SearchCriteriaType searchCriteria = new SearchCriteriaType();
        searchCriteria.setMsisdn(msisdn);

        SearchOptionsType searchOptionsType = new SearchOptionsType();

        SearchResultsType searchResultsType = new SearchResultsType();
        searchResultsType.setAllOrSummary(type);

        searchOptionsType.setSearchResults(searchResultsType);
        searchOptionsType.setPortalOrIdentitySwitch(switchType);

        searchOnlineAccounts1.setSearchCriteria(searchCriteria);
        searchOnlineAccounts1.setSearchOptions(searchOptionsType);

        return searchOnlineAccounts1;
    }
}
