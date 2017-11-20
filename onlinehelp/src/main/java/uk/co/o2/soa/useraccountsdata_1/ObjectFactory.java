
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import uk.co.o2.soa.coredata_1.SOAFaultType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.o2.soa.useraccountsdata_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateOrUpdateUserResponse_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "createOrUpdateUserResponse");
    private final static QName _GetUserDetails_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "getUserDetails");
    private final static QName _SearchOnlineAccounts1_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "searchOnlineAccounts_1");
    private final static QName _SearchResponse_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "searchResponse");
    private final static QName _GetUserNameSuggestion_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "getUserNameSuggestion");
    private final static QName _SearchFault_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "searchFault");
    private final static QName _GetUserDetailsFault_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "getUserDetailsFault");
    private final static QName _SearchOnlineAccounts1Response_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "searchOnlineAccounts_1Response");
    private final static QName _GetUserNameSuggestionResponse_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "getUserNameSuggestionResponse");
    private final static QName _GetUserNameSuggestionFault_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "getUserNameSuggestionFault");
    private final static QName _SearchOnlineAccounts1Fault_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "searchOnlineAccounts_1Fault");
    private final static QName _CreateOrUpdateUser_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "createOrUpdateUser");
    private final static QName _Search_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "search");
    private final static QName _GetUserDetailsResponse_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "getUserDetailsResponse");
    private final static QName _CreateOrUpdateUserFault_QNAME = new QName("http://soa.o2.co.uk/useraccountsdata_1", "createOrUpdateUserFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.o2.soa.useraccountsdata_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link GetUserNameSuggestionResponse }
     * 
     */
    public GetUserNameSuggestionResponse createGetUserNameSuggestionResponse() {
        return new GetUserNameSuggestionResponse();
    }

    /**
     * Create an instance of {@link SearchOnlineAccounts1Response }
     * 
     */
    public SearchOnlineAccounts1Response createSearchOnlineAccounts1Response() {
        return new SearchOnlineAccounts1Response();
    }

    /**
     * Create an instance of {@link CreateOrUpdateUserResponse }
     * 
     */
    public CreateOrUpdateUserResponse createCreateOrUpdateUserResponse() {
        return new CreateOrUpdateUserResponse();
    }

    /**
     * Create an instance of {@link GetUserDetails }
     * 
     */
    public GetUserDetails createGetUserDetails() {
        return new GetUserDetails();
    }

    /**
     * Create an instance of {@link SearchOnlineAccounts1 }
     * 
     */
    public SearchOnlineAccounts1 createSearchOnlineAccounts1() {
        return new SearchOnlineAccounts1();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link GetUserNameSuggestion }
     * 
     */
    public GetUserNameSuggestion createGetUserNameSuggestion() {
        return new GetUserNameSuggestion();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link CreateOrUpdateUser }
     * 
     */
    public CreateOrUpdateUser createCreateOrUpdateUser() {
        return new CreateOrUpdateUser();
    }

    /**
     * Create an instance of {@link SearchOptionsType }
     * 
     */
    public SearchOptionsType createSearchOptionsType() {
        return new SearchOptionsType();
    }

    /**
     * Create an instance of {@link SearchResultsType }
     * 
     */
    public SearchResultsType createSearchResultsType() {
        return new SearchResultsType();
    }

    /**
     * Create an instance of {@link BillingMsisdnType }
     * 
     */
    public BillingMsisdnType createBillingMsisdnType() {
        return new BillingMsisdnType();
    }

    /**
     * Create an instance of {@link SearchCriteriaType }
     * 
     */
    public SearchCriteriaType createSearchCriteriaType() {
        return new SearchCriteriaType();
    }

    /**
     * Create an instance of {@link RoleSetType }
     * 
     */
    public RoleSetType createRoleSetType() {
        return new RoleSetType();
    }

    /**
     * Create an instance of {@link BroadbandSecondaryAccountList }
     * 
     */
    public BroadbandSecondaryAccountList createBroadbandSecondaryAccountList() {
        return new BroadbandSecondaryAccountList();
    }

    /**
     * Create an instance of {@link RegisteredMsisdnType }
     * 
     */
    public RegisteredMsisdnType createRegisteredMsisdnType() {
        return new RegisteredMsisdnType();
    }

    /**
     * Create an instance of {@link BillingDataType }
     * 
     */
    public BillingDataType createBillingDataType() {
        return new BillingDataType();
    }

    /**
     * Create an instance of {@link MarketingPreferencesType }
     * 
     */
    public MarketingPreferencesType createMarketingPreferencesType() {
        return new MarketingPreferencesType();
    }

    /**
     * Create an instance of {@link BroadbandDataType }
     * 
     */
    public BroadbandDataType createBroadbandDataType() {
        return new BroadbandDataType();
    }

    /**
     * Create an instance of {@link AdditionalAttributesType }
     * 
     */
    public AdditionalAttributesType createAdditionalAttributesType() {
        return new AdditionalAttributesType();
    }

    /**
     * Create an instance of {@link IdentityDataType }
     * 
     */
    public IdentityDataType createIdentityDataType() {
        return new IdentityDataType();
    }

    /**
     * Create an instance of {@link FullNameType }
     * 
     */
    public FullNameType createFullNameType() {
        return new FullNameType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link UserDetailsType }
     * 
     */
    public UserDetailsType createUserDetailsType() {
        return new UserDetailsType();
    }

    /**
     * Create an instance of {@link UserDataType }
     * 
     */
    public UserDataType createUserDataType() {
        return new UserDataType();
    }

    /**
     * Create an instance of {@link LastNameType }
     * 
     */
    public LastNameType createLastNameType() {
        return new LastNameType();
    }

    /**
     * Create an instance of {@link SortOrderType }
     * 
     */
    public SortOrderType createSortOrderType() {
        return new SortOrderType();
    }

    /**
     * Create an instance of {@link LinkedAccountType }
     * 
     */
    public LinkedAccountType createLinkedAccountType() {
        return new LinkedAccountType();
    }

    /**
     * Create an instance of {@link IdentityUserRoleType }
     * 
     */
    public IdentityUserRoleType createIdentityUserRoleType() {
        return new IdentityUserRoleType();
    }

    /**
     * Create an instance of {@link PostCodeMatchingType }
     * 
     */
    public PostCodeMatchingType createPostCodeMatchingType() {
        return new PostCodeMatchingType();
    }

    /**
     * Create an instance of {@link UserNameMatchingType }
     * 
     */
    public UserNameMatchingType createUserNameMatchingType() {
        return new UserNameMatchingType();
    }

    /**
     * Create an instance of {@link IdentitySuperchooserRoleType }
     * 
     */
    public IdentitySuperchooserRoleType createIdentitySuperchooserRoleType() {
        return new IdentitySuperchooserRoleType();
    }

    /**
     * Create an instance of {@link SuperChooserRoleType }
     * 
     */
    public SuperChooserRoleType createSuperChooserRoleType() {
        return new SuperChooserRoleType();
    }

    /**
     * Create an instance of {@link PortalDataType }
     * 
     */
    public PortalDataType createPortalDataType() {
        return new PortalDataType();
    }

    /**
     * Create an instance of {@link ChooserRoleType }
     * 
     */
    public ChooserRoleType createChooserRoleType() {
        return new ChooserRoleType();
    }

    /**
     * Create an instance of {@link AccountLinkageType }
     * 
     */
    public AccountLinkageType createAccountLinkageType() {
        return new AccountLinkageType();
    }

    /**
     * Create an instance of {@link IdentityChooserRoleType }
     * 
     */
    public IdentityChooserRoleType createIdentityChooserRoleType() {
        return new IdentityChooserRoleType();
    }

    /**
     * Create an instance of {@link UserDetailRecordType }
     * 
     */
    public UserDetailRecordType createUserDetailRecordType() {
        return new UserDetailRecordType();
    }

    /**
     * Create an instance of {@link UserRoleType }
     * 
     */
    public UserRoleType createUserRoleType() {
        return new UserRoleType();
    }

    /**
     * Create an instance of {@link ProfileDataType }
     * 
     */
    public ProfileDataType createProfileDataType() {
        return new ProfileDataType();
    }

    /**
     * Create an instance of {@link FirstNameMatchingType }
     * 
     */
    public FirstNameMatchingType createFirstNameMatchingType() {
        return new FirstNameMatchingType();
    }

    /**
     * Create an instance of {@link LegacyAandRCustomerDataType }
     * 
     */
    public LegacyAandRCustomerDataType createLegacyAandRCustomerDataType() {
        return new LegacyAandRCustomerDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "createOrUpdateUserResponse")
    public JAXBElement<CreateOrUpdateUserResponse> createCreateOrUpdateUserResponse(CreateOrUpdateUserResponse value) {
        return new JAXBElement<CreateOrUpdateUserResponse>(_CreateOrUpdateUserResponse_QNAME, CreateOrUpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "getUserDetails")
    public JAXBElement<GetUserDetails> createGetUserDetails(GetUserDetails value) {
        return new JAXBElement<GetUserDetails>(_GetUserDetails_QNAME, GetUserDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOnlineAccounts1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "searchOnlineAccounts_1")
    public JAXBElement<SearchOnlineAccounts1> createSearchOnlineAccounts1(SearchOnlineAccounts1 value) {
        return new JAXBElement<SearchOnlineAccounts1>(_SearchOnlineAccounts1_QNAME, SearchOnlineAccounts1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserNameSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "getUserNameSuggestion")
    public JAXBElement<GetUserNameSuggestion> createGetUserNameSuggestion(GetUserNameSuggestion value) {
        return new JAXBElement<GetUserNameSuggestion>(_GetUserNameSuggestion_QNAME, GetUserNameSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "searchFault")
    public JAXBElement<SOAFaultType> createSearchFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SearchFault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "getUserDetailsFault")
    public JAXBElement<SOAFaultType> createGetUserDetailsFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_GetUserDetailsFault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOnlineAccounts1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "searchOnlineAccounts_1Response")
    public JAXBElement<SearchOnlineAccounts1Response> createSearchOnlineAccounts1Response(SearchOnlineAccounts1Response value) {
        return new JAXBElement<SearchOnlineAccounts1Response>(_SearchOnlineAccounts1Response_QNAME, SearchOnlineAccounts1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserNameSuggestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "getUserNameSuggestionResponse")
    public JAXBElement<GetUserNameSuggestionResponse> createGetUserNameSuggestionResponse(GetUserNameSuggestionResponse value) {
        return new JAXBElement<GetUserNameSuggestionResponse>(_GetUserNameSuggestionResponse_QNAME, GetUserNameSuggestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "getUserNameSuggestionFault")
    public JAXBElement<SOAFaultType> createGetUserNameSuggestionFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_GetUserNameSuggestionFault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "searchOnlineAccounts_1Fault")
    public JAXBElement<SOAFaultType> createSearchOnlineAccounts1Fault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SearchOnlineAccounts1Fault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "createOrUpdateUser")
    public JAXBElement<CreateOrUpdateUser> createCreateOrUpdateUser(CreateOrUpdateUser value) {
        return new JAXBElement<CreateOrUpdateUser>(_CreateOrUpdateUser_QNAME, CreateOrUpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Search }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "search")
    public JAXBElement<Search> createSearch(Search value) {
        return new JAXBElement<Search>(_Search_QNAME, Search.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "getUserDetailsResponse")
    public JAXBElement<GetUserDetailsResponse> createGetUserDetailsResponse(GetUserDetailsResponse value) {
        return new JAXBElement<GetUserDetailsResponse>(_GetUserDetailsResponse_QNAME, GetUserDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/useraccountsdata_1", name = "createOrUpdateUserFault")
    public JAXBElement<SOAFaultType> createCreateOrUpdateUserFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_CreateOrUpdateUserFault_QNAME, SOAFaultType.class, null, value);
    }

}
