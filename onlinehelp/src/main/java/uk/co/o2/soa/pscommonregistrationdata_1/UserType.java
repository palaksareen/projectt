
package uk.co.o2.soa.pscommonregistrationdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Complex Type to define the online user
 * 
 * <p>Java class for UserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}AddressType" minOccurs="0"/>
 *         &lt;element name="roleSet" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}RoleSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="custnum" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="domain" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecurityQuestion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecurityAnswer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level2Password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gender" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}GenderType" />
 *       &lt;attribute name="forename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initials" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="alternativeEmail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="alternativeContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="partner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MSISDN" type="{http://soa.o2.co.uk/coredata_1}msisdnType" />
 *       &lt;attribute name="MSISDNvalid" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}PortalMSISDNStatusType" />
 *       &lt;attribute name="phoneMake" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="network" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wantsGenieMarketting" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wantsOtherMarketting" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="roleSummary" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}CustomerRoleSummaryType" />
 *       &lt;attribute name="segmentation" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}CustomerSegmentationType" />
 *       &lt;attribute name="customerType" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}CustomerCategoryType" />
 *       &lt;attribute name="contactMedium" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}ContactMediumType" />
 *       &lt;attribute name="posBusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="saleDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="riskThreshold" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="riskThresholdDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="creditVetPassed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditVetDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="referral" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="referralDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="jobTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobFunction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasHadRole" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hasBeenBillingContact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="owningBusinessDivision" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}OwningBusinessDivisionType" />
 *       &lt;attribute name="registrationType" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}RegistrationCategoryType" />
 *       &lt;attribute name="sector" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}SectorType" />
 *       &lt;attribute name="companyRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isESMECustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GenevaCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accountManagerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accountManagerEmail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dqlistingdetail" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}ListingDetailType" />
 *       &lt;attribute name="dqlistinglevel" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}ListingLevelType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserType", propOrder = {
    "address",
    "roleSet"
})
public class UserType {

    @XmlElement(name = "Address")
    protected AddressType address;
    protected RoleSetType roleSet;
    @XmlAttribute(name = "custnum", required = true)
    protected BigInteger custnum;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "domain", required = true)
    protected String domain;
    @XmlAttribute(name = "SecurityQuestion")
    protected String securityQuestion;
    @XmlAttribute(name = "SecurityAnswer")
    protected String securityAnswer;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "level2Password")
    protected String level2Password;
    @XmlAttribute(name = "gender")
    protected GenderType gender;
    @XmlAttribute(name = "forename")
    protected String forename;
    @XmlAttribute(name = "lastname")
    protected String lastname;
    @XmlAttribute(name = "initials")
    protected String initials;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "alternativeEmail")
    protected String alternativeEmail;
    @XmlAttribute(name = "alternativeContactNumber")
    protected String alternativeContactNumber;
    @XmlAttribute(name = "dateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlAttribute(name = "partner")
    protected String partner;
    @XmlAttribute(name = "MSISDN")
    protected String msisdn;
    @XmlAttribute(name = "MSISDNvalid")
    protected PortalMSISDNStatusType msisdNvalid;
    @XmlAttribute(name = "phoneMake")
    protected String phoneMake;
    @XmlAttribute(name = "network")
    protected String network;
    @XmlAttribute(name = "wantsGenieMarketting")
    protected Boolean wantsGenieMarketting;
    @XmlAttribute(name = "wantsOtherMarketting")
    protected Boolean wantsOtherMarketting;
    @XmlAttribute(name = "roleSummary")
    protected String roleSummary;
    @XmlAttribute(name = "segmentation")
    protected CustomerSegmentationType segmentation;
    @XmlAttribute(name = "customerType")
    protected CustomerCategoryType customerType;
    @XmlAttribute(name = "contactMedium")
    protected ContactMediumType contactMedium;
    @XmlAttribute(name = "posBusinessUnit")
    protected String posBusinessUnit;
    @XmlAttribute(name = "saleDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    @XmlAttribute(name = "riskThreshold")
    protected BigInteger riskThreshold;
    @XmlAttribute(name = "riskThresholdDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar riskThresholdDate;
    @XmlAttribute(name = "creditVetPassed")
    protected String creditVetPassed;
    @XmlAttribute(name = "creditVetDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditVetDate;
    @XmlAttribute(name = "referral")
    protected String referral;
    @XmlAttribute(name = "referralDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referralDate;
    @XmlAttribute(name = "companyName")
    protected String companyName;
    @XmlAttribute(name = "companyTelephoneNumber")
    protected String companyTelephoneNumber;
    @XmlAttribute(name = "numberOfEmployees")
    protected BigInteger numberOfEmployees;
    @XmlAttribute(name = "jobTitle")
    protected String jobTitle;
    @XmlAttribute(name = "jobFunction")
    protected String jobFunction;
    @XmlAttribute(name = "hasHadRole")
    protected Boolean hasHadRole;
    @XmlAttribute(name = "hasBeenBillingContact")
    protected Boolean hasBeenBillingContact;
    @XmlAttribute(name = "owningBusinessDivision")
    protected OwningBusinessDivisionType owningBusinessDivision;
    @XmlAttribute(name = "registrationType")
    protected RegistrationCategoryType registrationType;
    @XmlAttribute(name = "sector")
    protected SectorType sector;
    @XmlAttribute(name = "companyRegistrationNumber")
    protected String companyRegistrationNumber;
    @XmlAttribute(name = "isESMECustomer")
    protected Boolean isESMECustomer;
    @XmlAttribute(name = "GenevaCustomerId")
    protected String genevaCustomerId;
    @XmlAttribute(name = "accountManagerName")
    protected String accountManagerName;
    @XmlAttribute(name = "accountManagerEmail")
    protected String accountManagerEmail;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "dqlistingdetail")
    protected ListingDetailType dqlistingdetail;
    @XmlAttribute(name = "dqlistinglevel")
    protected ListingLevelType dqlistinglevel;

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
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
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
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the msisdNvalid property.
     * 
     * @return
     *     possible object is
     *     {@link PortalMSISDNStatusType }
     *     
     */
    public PortalMSISDNStatusType getMSISDNvalid() {
        return msisdNvalid;
    }

    /**
     * Sets the value of the msisdNvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalMSISDNStatusType }
     *     
     */
    public void setMSISDNvalid(PortalMSISDNStatusType value) {
        this.msisdNvalid = value;
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
     * Gets the value of the wantsGenieMarketting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantsGenieMarketting() {
        return wantsGenieMarketting;
    }

    /**
     * Sets the value of the wantsGenieMarketting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantsGenieMarketting(Boolean value) {
        this.wantsGenieMarketting = value;
    }

    /**
     * Gets the value of the wantsOtherMarketting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantsOtherMarketting() {
        return wantsOtherMarketting;
    }

    /**
     * Sets the value of the wantsOtherMarketting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantsOtherMarketting(Boolean value) {
        this.wantsOtherMarketting = value;
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
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCategoryType }
     *     
     */
    public CustomerCategoryType getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCategoryType }
     *     
     */
    public void setCustomerType(CustomerCategoryType value) {
        this.customerType = value;
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
     * Gets the value of the hasHadRole property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHadRole() {
        return hasHadRole;
    }

    /**
     * Sets the value of the hasHadRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHadRole(Boolean value) {
        this.hasHadRole = value;
    }

    /**
     * Gets the value of the hasBeenBillingContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenBillingContact() {
        return hasBeenBillingContact;
    }

    /**
     * Sets the value of the hasBeenBillingContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenBillingContact(Boolean value) {
        this.hasBeenBillingContact = value;
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
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationCategoryType }
     *     
     */
    public RegistrationCategoryType getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationCategoryType }
     *     
     */
    public void setRegistrationType(RegistrationCategoryType value) {
        this.registrationType = value;
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
     * Gets the value of the isESMECustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsESMECustomer() {
        return isESMECustomer;
    }

    /**
     * Sets the value of the isESMECustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsESMECustomer(Boolean value) {
        this.isESMECustomer = value;
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
     * Gets the value of the dqlistingdetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListingDetailType }
     *     
     */
    public ListingDetailType getDqlistingdetail() {
        return dqlistingdetail;
    }

    /**
     * Sets the value of the dqlistingdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingDetailType }
     *     
     */
    public void setDqlistingdetail(ListingDetailType value) {
        this.dqlistingdetail = value;
    }

    /**
     * Gets the value of the dqlistinglevel property.
     * 
     * @return
     *     possible object is
     *     {@link ListingLevelType }
     *     
     */
    public ListingLevelType getDqlistinglevel() {
        return dqlistinglevel;
    }

    /**
     * Sets the value of the dqlistinglevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingLevelType }
     *     
     */
    public void setDqlistinglevel(ListingLevelType value) {
        this.dqlistinglevel = value;
    }

}
