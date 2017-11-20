
package uk.co.o2.soa.useraccountsdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information not contained in above types,
 * 				specifically for use of Strategic A&R co-existence. (Do not rely
 * 				on this continuing to be supported for other purposes.)
 * 			
 * 
 * <p>Java class for legacyAandRCustomerDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legacyAandRCustomerDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portalId" type="{http://soa.o2.co.uk/coredata_1}portalIDType" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}domainType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusUpdatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="partner" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}partnerType" minOccurs="0"/>
 *         &lt;element name="network" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}networkType" minOccurs="0"/>
 *         &lt;element name="addressStatus" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}addressStatusType" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}companyNameType" minOccurs="0"/>
 *         &lt;element name="billingCustomerId" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingCustomerIdType" minOccurs="0"/>
 *         &lt;element name="billingCustomerName" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingCustomerNameType" minOccurs="0"/>
 *         &lt;element name="segmentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}customerCategoryType" minOccurs="0"/>
 *         &lt;element name="posBusinessUnit" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}posBusinessUnitType" minOccurs="0"/>
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="riskThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskThresholdDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="referral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="companyPhone" type="{http://soa.o2.co.uk/coredata_1}msisdnType" minOccurs="0"/>
 *         &lt;element name="companyEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ptCaps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditVetPassed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditVetDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="verificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remindCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remindCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="remindDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="hasHadRole" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasBeenBillingContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="owningBusinessDivision" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}owningBusinessDivisionType" minOccurs="0"/>
 *         &lt;element name="registrationType" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}registrationCategoryType" minOccurs="0"/>
 *         &lt;element name="sector" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}sectorType" minOccurs="0"/>
 *         &lt;element name="isESMECustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="companyRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountManagerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="additionalAttributes" type="{http://soa.o2.co.uk/useraccountsdata_1}additionalAttributesType" minOccurs="0"/>
 *         &lt;element name="customerNumber" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}customerNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legacyAandRCustomerDataType", propOrder = {
    "portalId",
    "domain",
    "status",
    "statusUpdatedBy",
    "statusUpdatedTime",
    "partner",
    "network",
    "addressStatus",
    "companyName",
    "billingCustomerId",
    "billingCustomerName",
    "segmentation",
    "customerType",
    "posBusinessUnit",
    "saleDate",
    "riskThreshold",
    "riskThresholdDate",
    "referral",
    "referralDate",
    "companyPhone",
    "companyEmployees",
    "jobTitle",
    "jobFunction",
    "ptCaps",
    "creditVetPassed",
    "creditVetDate",
    "verificationCode",
    "remindCode",
    "remindCount",
    "remindDate",
    "startDate",
    "hasHadRole",
    "hasBeenBillingContact",
    "owningBusinessDivision",
    "registrationType",
    "sector",
    "isESMECustomer",
    "companyRegNumber",
    "accountManagerName",
    "accountManagerEmail",
    "modifiedDate",
    "additionalAttributes",
    "customerNumber"
})
public class LegacyAandRCustomerDataType {

    protected String portalId;
    protected String domain;
    protected String status;
    protected String statusUpdatedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusUpdatedTime;
    protected String partner;
    protected String network;
    protected String addressStatus;
    protected String companyName;
    protected String billingCustomerId;
    protected String billingCustomerName;
    protected String segmentation;
    protected String customerType;
    protected String posBusinessUnit;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    protected String riskThreshold;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar riskThresholdDate;
    protected String referral;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referralDate;
    protected String companyPhone;
    protected String companyEmployees;
    protected String jobTitle;
    protected String jobFunction;
    protected String ptCaps;
    protected String creditVetPassed;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditVetDate;
    protected String verificationCode;
    protected String remindCode;
    protected BigInteger remindCount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar remindDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    protected Boolean hasHadRole;
    protected Boolean hasBeenBillingContact;
    protected String owningBusinessDivision;
    protected String registrationType;
    protected String sector;
    protected Boolean isESMECustomer;
    protected String companyRegNumber;
    protected String accountManagerName;
    protected String accountManagerEmail;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    protected AdditionalAttributesType additionalAttributes;
    protected BigInteger customerNumber;

    /**
     * Gets the value of the portalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalId() {
        return portalId;
    }

    /**
     * Sets the value of the portalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalId(String value) {
        this.portalId = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusUpdatedBy() {
        return statusUpdatedBy;
    }

    /**
     * Sets the value of the statusUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusUpdatedBy(String value) {
        this.statusUpdatedBy = value;
    }

    /**
     * Gets the value of the statusUpdatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusUpdatedTime() {
        return statusUpdatedTime;
    }

    /**
     * Sets the value of the statusUpdatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusUpdatedTime(XMLGregorianCalendar value) {
        this.statusUpdatedTime = value;
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
     * Gets the value of the addressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStatus() {
        return addressStatus;
    }

    /**
     * Sets the value of the addressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStatus(String value) {
        this.addressStatus = value;
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
     * Gets the value of the billingCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCustomerId() {
        return billingCustomerId;
    }

    /**
     * Sets the value of the billingCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCustomerId(String value) {
        this.billingCustomerId = value;
    }

    /**
     * Gets the value of the billingCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCustomerName() {
        return billingCustomerName;
    }

    /**
     * Sets the value of the billingCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCustomerName(String value) {
        this.billingCustomerName = value;
    }

    /**
     * Gets the value of the segmentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentation() {
        return segmentation;
    }

    /**
     * Sets the value of the segmentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentation(String value) {
        this.segmentation = value;
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
     *     {@link String }
     *     
     */
    public String getRiskThreshold() {
        return riskThreshold;
    }

    /**
     * Sets the value of the riskThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskThreshold(String value) {
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
     * Gets the value of the companyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * Sets the value of the companyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPhone(String value) {
        this.companyPhone = value;
    }

    /**
     * Gets the value of the companyEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyEmployees() {
        return companyEmployees;
    }

    /**
     * Sets the value of the companyEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyEmployees(String value) {
        this.companyEmployees = value;
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
     * Gets the value of the ptCaps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtCaps() {
        return ptCaps;
    }

    /**
     * Sets the value of the ptCaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtCaps(String value) {
        this.ptCaps = value;
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
     * Gets the value of the verificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Sets the value of the verificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationCode(String value) {
        this.verificationCode = value;
    }

    /**
     * Gets the value of the remindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemindCode() {
        return remindCode;
    }

    /**
     * Sets the value of the remindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemindCode(String value) {
        this.remindCode = value;
    }

    /**
     * Gets the value of the remindCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRemindCount() {
        return remindCount;
    }

    /**
     * Sets the value of the remindCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRemindCount(BigInteger value) {
        this.remindCount = value;
    }

    /**
     * Gets the value of the remindDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRemindDate() {
        return remindDate;
    }

    /**
     * Sets the value of the remindDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRemindDate(XMLGregorianCalendar value) {
        this.remindDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
     *     {@link String }
     *     
     */
    public String getOwningBusinessDivision() {
        return owningBusinessDivision;
    }

    /**
     * Sets the value of the owningBusinessDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwningBusinessDivision(String value) {
        this.owningBusinessDivision = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationType(String value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
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
     * Gets the value of the companyRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegNumber() {
        return companyRegNumber;
    }

    /**
     * Sets the value of the companyRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegNumber(String value) {
        this.companyRegNumber = value;
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
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the additionalAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalAttributesType }
     *     
     */
    public AdditionalAttributesType getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * Sets the value of the additionalAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalAttributesType }
     *     
     */
    public void setAdditionalAttributes(AdditionalAttributesType value) {
        this.additionalAttributes = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerNumber(BigInteger value) {
        this.customerNumber = value;
    }

}
