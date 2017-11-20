
package uk.co.o2.soa.useraccountsdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Orange account user details, for database updates
 * 
 * <p>Java class for userDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://soa.o2.co.uk/useraccountsdata_1}addressType" minOccurs="0"/>
 *         &lt;element name="roleSet" type="{http://soa.o2.co.uk/useraccountsdata_1}roleSetType" minOccurs="0"/>
 *         &lt;element name="accountManagerEmail" type="{http://soa.o2.co.uk/useraccountsdata_1}emailAddressType" minOccurs="0"/>
 *         &lt;element name="accountManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternativeContactNumber" type="{http://soa.o2.co.uk/useraccountsdata_1}phoneNumberType" minOccurs="0"/>
 *         &lt;element name="alternativeEmail" type="{http://soa.o2.co.uk/useraccountsdata_1}emailAddressType" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyTelephoneNumber" type="{http://soa.o2.co.uk/useraccountsdata_1}phoneNumberType" minOccurs="0"/>
 *         &lt;element name="contactMedium" type="{http://soa.o2.co.uk/useraccountsdata_1}contactMediumType" minOccurs="0"/>
 *         &lt;element name="creditVetDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="creditVetPassed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custnum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="discountEligibilityFlag" type="{http://soa.o2.co.uk/useraccountsdata_1}yesNoType" minOccurs="0"/>
 *         &lt;element name="dqListingDetail" type="{http://soa.o2.co.uk/useraccountsdata_1}listingDetailType" minOccurs="0"/>
 *         &lt;element name="dqListingLevel" type="{http://soa.o2.co.uk/useraccountsdata_1}listingLevelType" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://soa.o2.co.uk/useraccountsdata_1}emailAddressType" minOccurs="0"/>
 *         &lt;element name="forename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://soa.o2.co.uk/useraccountsdata_1}genderType" minOccurs="0"/>
 *         &lt;element name="genevaCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasBeenBillingContact" type="{http://soa.o2.co.uk/useraccountsdata_1}yesNoType" minOccurs="0"/>
 *         &lt;element name="hasHadRole" type="{http://soa.o2.co.uk/useraccountsdata_1}yesNoType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isESMECustomer" type="{http://soa.o2.co.uk/useraccountsdata_1}yesNoType" minOccurs="0"/>
 *         &lt;element name="jobFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level2Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://soa.o2.co.uk/coredata_1}msisdnType" minOccurs="0"/>
 *         &lt;element name="msisdnValid" type="{http://soa.o2.co.uk/useraccountsdata_1}portalMSISDNStatusType" minOccurs="0"/>
 *         &lt;element name="network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="owningBusinessDivision" type="{http://soa.o2.co.uk/useraccountsdata_1}owningBusinessDivisionType" minOccurs="0"/>
 *         &lt;element name="partner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneMake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posBusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryAccountUser" type="{http://soa.o2.co.uk/useraccountsdata_1}yesNoType" minOccurs="0"/>
 *         &lt;element name="referral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="registrationType" type="{http://soa.o2.co.uk/useraccountsdata_1}userRegistrationType" minOccurs="0"/>
 *         &lt;element name="riskThreshold" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="riskThresholdDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="roleSummary" type="{http://soa.o2.co.uk/useraccountsdata_1}customerRoleSummaryType" minOccurs="0"/>
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sector" type="{http://soa.o2.co.uk/useraccountsdata_1}sectorType" minOccurs="0"/>
 *         &lt;element name="securityQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentation" type="{http://soa.o2.co.uk/useraccountsdata_1}customerSegmentationType" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wantsGenieMarketing" type="{http://soa.o2.co.uk/useraccountsdata_1}yesNoType" minOccurs="0"/>
 *         &lt;element name="wantsOtherMarketing" type="{http://soa.o2.co.uk/useraccountsdata_1}yesNoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDataType", propOrder = {
    "address",
    "roleSet",
    "accountManagerEmail",
    "accountManagerName",
    "alternativeContactNumber",
    "alternativeEmail",
    "companyName",
    "companyRegistrationNumber",
    "companyTelephoneNumber",
    "contactMedium",
    "creditVetDate",
    "creditVetPassed",
    "customerType",
    "custnum",
    "dateOfBirth",
    "discountEligibilityFlag",
    "dqListingDetail",
    "dqListingLevel",
    "domain",
    "emailAddress",
    "forename",
    "gender",
    "genevaCustomerId",
    "hasBeenBillingContact",
    "hasHadRole",
    "id",
    "initials",
    "isESMECustomer",
    "jobFunction",
    "jobTitle",
    "key",
    "lastname",
    "level2Password",
    "msisdn",
    "msisdnValid",
    "network",
    "numberOfEmployees",
    "owningBusinessDivision",
    "partner",
    "password",
    "phoneMake",
    "posBusinessUnit",
    "primaryAccountUser",
    "referral",
    "referralDate",
    "registrationType",
    "riskThreshold",
    "riskThresholdDate",
    "roleSummary",
    "saleDate",
    "sector",
    "securityQuestion",
    "securityAnswer",
    "segmentation",
    "timeStamp",
    "title",
    "wantsGenieMarketing",
    "wantsOtherMarketing"
})
public class UserDataType {

    protected AddressType address;
    protected RoleSetType roleSet;
    protected String accountManagerEmail;
    protected String accountManagerName;
    protected String alternativeContactNumber;
    protected String alternativeEmail;
    protected String companyName;
    protected String companyRegistrationNumber;
    protected String companyTelephoneNumber;
    @XmlSchemaType(name = "string")
    protected ContactMediumType contactMedium;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditVetDate;
    protected String creditVetPassed;
    protected String customerType;
    protected BigInteger custnum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlSchemaType(name = "string")
    protected YesNoType discountEligibilityFlag;
    @XmlSchemaType(name = "string")
    protected ListingDetailType dqListingDetail;
    @XmlSchemaType(name = "string")
    protected ListingLevelType dqListingLevel;
    protected String domain;
    protected String emailAddress;
    protected String forename;
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    protected String genevaCustomerId;
    @XmlSchemaType(name = "string")
    protected YesNoType hasBeenBillingContact;
    @XmlSchemaType(name = "string")
    protected YesNoType hasHadRole;
    protected String id;
    protected String initials;
    @XmlSchemaType(name = "string")
    protected YesNoType isESMECustomer;
    protected String jobFunction;
    protected String jobTitle;
    protected String key;
    protected String lastname;
    protected String level2Password;
    protected String msisdn;
    @XmlSchemaType(name = "string")
    protected PortalMSISDNStatusType msisdnValid;
    protected String network;
    protected BigInteger numberOfEmployees;
    @XmlSchemaType(name = "string")
    protected OwningBusinessDivisionType owningBusinessDivision;
    protected String partner;
    protected String password;
    protected String phoneMake;
    protected String posBusinessUnit;
    @XmlSchemaType(name = "string")
    protected YesNoType primaryAccountUser;
    protected String referral;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referralDate;
    @XmlSchemaType(name = "string")
    protected UserRegistrationType registrationType;
    protected BigInteger riskThreshold;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar riskThresholdDate;
    protected String roleSummary;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    @XmlSchemaType(name = "string")
    protected SectorType sector;
    protected String securityQuestion;
    protected String securityAnswer;
    @XmlSchemaType(name = "string")
    protected CustomerSegmentationType segmentation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    protected String title;
    @XmlSchemaType(name = "string")
    protected YesNoType wantsGenieMarketing;
    @XmlSchemaType(name = "string")
    protected YesNoType wantsOtherMarketing;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the roleSet property.
     * 
     * @return
     *     possible object is
     *     {@link RoleSetType }
     *     
     */
    public RoleSetType getRoleSet() {
        return roleSet;
    }

    /**
     * Sets the value of the roleSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleSetType }
     *     
     */
    public void setRoleSet(RoleSetType value) {
        this.roleSet = value;
    }

    /**
     * Gets the value of the accountManagerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountManagerEmail() {
        return accountManagerEmail;
    }

    /**
     * Sets the value of the accountManagerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountManagerEmail(String value) {
        this.accountManagerEmail = value;
    }

    /**
     * Gets the value of the accountManagerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountManagerName() {
        return accountManagerName;
    }

    /**
     * Sets the value of the accountManagerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountManagerName(String value) {
        this.accountManagerName = value;
    }

    /**
     * Gets the value of the alternativeContactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeContactNumber() {
        return alternativeContactNumber;
    }

    /**
     * Sets the value of the alternativeContactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeContactNumber(String value) {
        this.alternativeContactNumber = value;
    }

    /**
     * Gets the value of the alternativeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    /**
     * Sets the value of the alternativeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeEmail(String value) {
        this.alternativeEmail = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * Sets the value of the companyRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegistrationNumber(String value) {
        this.companyRegistrationNumber = value;
    }

    /**
     * Gets the value of the companyTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyTelephoneNumber() {
        return companyTelephoneNumber;
    }

    /**
     * Sets the value of the companyTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyTelephoneNumber(String value) {
        this.companyTelephoneNumber = value;
    }

    /**
     * Gets the value of the contactMedium property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMediumType }
     *     
     */
    public ContactMediumType getContactMedium() {
        return contactMedium;
    }

    /**
     * Sets the value of the contactMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMediumType }
     *     
     */
    public void setContactMedium(ContactMediumType value) {
        this.contactMedium = value;
    }

    /**
     * Gets the value of the creditVetDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditVetDate() {
        return creditVetDate;
    }

    /**
     * Sets the value of the creditVetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditVetDate(XMLGregorianCalendar value) {
        this.creditVetDate = value;
    }

    /**
     * Gets the value of the creditVetPassed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditVetPassed() {
        return creditVetPassed;
    }

    /**
     * Sets the value of the creditVetPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditVetPassed(String value) {
        this.creditVetPassed = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the custnum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustnum() {
        return custnum;
    }

    /**
     * Sets the value of the custnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustnum(BigInteger value) {
        this.custnum = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the discountEligibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getDiscountEligibilityFlag() {
        return discountEligibilityFlag;
    }

    /**
     * Sets the value of the discountEligibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setDiscountEligibilityFlag(YesNoType value) {
        this.discountEligibilityFlag = value;
    }

    /**
     * Gets the value of the dqListingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListingDetailType }
     *     
     */
    public ListingDetailType getDqListingDetail() {
        return dqListingDetail;
    }

    /**
     * Sets the value of the dqListingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingDetailType }
     *     
     */
    public void setDqListingDetail(ListingDetailType value) {
        this.dqListingDetail = value;
    }

    /**
     * Gets the value of the dqListingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ListingLevelType }
     *     
     */
    public ListingLevelType getDqListingLevel() {
        return dqListingLevel;
    }

    /**
     * Sets the value of the dqListingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingLevelType }
     *     
     */
    public void setDqListingLevel(ListingLevelType value) {
        this.dqListingLevel = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the genevaCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenevaCustomerId() {
        return genevaCustomerId;
    }

    /**
     * Sets the value of the genevaCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenevaCustomerId(String value) {
        this.genevaCustomerId = value;
    }

    /**
     * Gets the value of the hasBeenBillingContact property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getHasBeenBillingContact() {
        return hasBeenBillingContact;
    }

    /**
     * Sets the value of the hasBeenBillingContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setHasBeenBillingContact(YesNoType value) {
        this.hasBeenBillingContact = value;
    }

    /**
     * Gets the value of the hasHadRole property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getHasHadRole() {
        return hasHadRole;
    }

    /**
     * Sets the value of the hasHadRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setHasHadRole(YesNoType value) {
        this.hasHadRole = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the isESMECustomer property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getIsESMECustomer() {
        return isESMECustomer;
    }

    /**
     * Sets the value of the isESMECustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setIsESMECustomer(YesNoType value) {
        this.isESMECustomer = value;
    }

    /**
     * Gets the value of the jobFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobFunction() {
        return jobFunction;
    }

    /**
     * Sets the value of the jobFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobFunction(String value) {
        this.jobFunction = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the level2Password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel2Password() {
        return level2Password;
    }

    /**
     * Sets the value of the level2Password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel2Password(String value) {
        this.level2Password = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the msisdnValid property.
     * 
     * @return
     *     possible object is
     *     {@link PortalMSISDNStatusType }
     *     
     */
    public PortalMSISDNStatusType getMsisdnValid() {
        return msisdnValid;
    }

    /**
     * Sets the value of the msisdnValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalMSISDNStatusType }
     *     
     */
    public void setMsisdnValid(PortalMSISDNStatusType value) {
        this.msisdnValid = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEmployees(BigInteger value) {
        this.numberOfEmployees = value;
    }

    /**
     * Gets the value of the owningBusinessDivision property.
     * 
     * @return
     *     possible object is
     *     {@link OwningBusinessDivisionType }
     *     
     */
    public OwningBusinessDivisionType getOwningBusinessDivision() {
        return owningBusinessDivision;
    }

    /**
     * Sets the value of the owningBusinessDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwningBusinessDivisionType }
     *     
     */
    public void setOwningBusinessDivision(OwningBusinessDivisionType value) {
        this.owningBusinessDivision = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner(String value) {
        this.partner = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the phoneMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneMake() {
        return phoneMake;
    }

    /**
     * Sets the value of the phoneMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneMake(String value) {
        this.phoneMake = value;
    }

    /**
     * Gets the value of the posBusinessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosBusinessUnit() {
        return posBusinessUnit;
    }

    /**
     * Sets the value of the posBusinessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosBusinessUnit(String value) {
        this.posBusinessUnit = value;
    }

    /**
     * Gets the value of the primaryAccountUser property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getPrimaryAccountUser() {
        return primaryAccountUser;
    }

    /**
     * Sets the value of the primaryAccountUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setPrimaryAccountUser(YesNoType value) {
        this.primaryAccountUser = value;
    }

    /**
     * Gets the value of the referral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferral() {
        return referral;
    }

    /**
     * Sets the value of the referral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferral(String value) {
        this.referral = value;
    }

    /**
     * Gets the value of the referralDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferralDate() {
        return referralDate;
    }

    /**
     * Sets the value of the referralDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferralDate(XMLGregorianCalendar value) {
        this.referralDate = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link UserRegistrationType }
     *     
     */
    public UserRegistrationType getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRegistrationType }
     *     
     */
    public void setRegistrationType(UserRegistrationType value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the riskThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRiskThreshold() {
        return riskThreshold;
    }

    /**
     * Sets the value of the riskThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRiskThreshold(BigInteger value) {
        this.riskThreshold = value;
    }

    /**
     * Gets the value of the riskThresholdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRiskThresholdDate() {
        return riskThresholdDate;
    }

    /**
     * Sets the value of the riskThresholdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRiskThresholdDate(XMLGregorianCalendar value) {
        this.riskThresholdDate = value;
    }

    /**
     * Gets the value of the roleSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleSummary() {
        return roleSummary;
    }

    /**
     * Sets the value of the roleSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleSummary(String value) {
        this.roleSummary = value;
    }

    /**
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link SectorType }
     *     
     */
    public SectorType getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorType }
     *     
     */
    public void setSector(SectorType value) {
        this.sector = value;
    }

    /**
     * Gets the value of the securityQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    /**
     * Sets the value of the securityQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityQuestion(String value) {
        this.securityQuestion = value;
    }

    /**
     * Gets the value of the securityAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAnswer() {
        return securityAnswer;
    }

    /**
     * Sets the value of the securityAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAnswer(String value) {
        this.securityAnswer = value;
    }

    /**
     * Gets the value of the segmentation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSegmentationType }
     *     
     */
    public CustomerSegmentationType getSegmentation() {
        return segmentation;
    }

    /**
     * Sets the value of the segmentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSegmentationType }
     *     
     */
    public void setSegmentation(CustomerSegmentationType value) {
        this.segmentation = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the wantsGenieMarketing property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getWantsGenieMarketing() {
        return wantsGenieMarketing;
    }

    /**
     * Sets the value of the wantsGenieMarketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setWantsGenieMarketing(YesNoType value) {
        this.wantsGenieMarketing = value;
    }

    /**
     * Gets the value of the wantsOtherMarketing property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getWantsOtherMarketing() {
        return wantsOtherMarketing;
    }

    /**
     * Sets the value of the wantsOtherMarketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setWantsOtherMarketing(YesNoType value) {
        this.wantsOtherMarketing = value;
    }

}
