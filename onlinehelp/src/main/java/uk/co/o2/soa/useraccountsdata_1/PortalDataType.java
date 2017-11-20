
package uk.co.o2.soa.useraccountsdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.o2.soa.coredata_1.GenderType;
import uk.co.o2.soa.pscommonregistrationdata_2.PortalAddressType;


/**
 * Portal information
 * 
 * <p>Java class for portalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="portalDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portalId" type="{http://soa.o2.co.uk/coredata_1}portalIDType" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}domainType" minOccurs="0"/>
 *         &lt;element name="bfId" type="{http://soa.o2.co.uk/coredata_1}customerIDType" minOccurs="0"/>
 *         &lt;element name="mobilePhoneDetails" type="{http://soa.o2.co.uk/useraccountsdata_1}registeredMsisdnType" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://soa.o2.co.uk/useraccountsdata_1}fullNameType" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://soa.o2.co.uk/coredata_1}genderType" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="alternativeContactNumber" type="{http://soa.o2.co.uk/useraccountsdata_1}phoneNumberType" minOccurs="0"/>
 *         &lt;element name="alternativeEmailAddress" type="{http://soa.o2.co.uk/coredata_1}emailAddressType" minOccurs="0"/>
 *         &lt;element name="preferredContactMedium" type="{http://soa.o2.co.uk/useraccountsdata_1}contactMediumType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}portalAddressType" minOccurs="0"/>
 *         &lt;element name="marketingPreferences" type="{http://soa.o2.co.uk/useraccountsdata_1}marketingPreferencesType" minOccurs="0"/>
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
@XmlType(name = "portalDataType", propOrder = {
    "portalId",
    "domain",
    "bfId",
    "mobilePhoneDetails",
    "fullName",
    "gender",
    "dateOfBirth",
    "alternativeContactNumber",
    "alternativeEmailAddress",
    "preferredContactMedium",
    "address",
    "marketingPreferences",
    "customerNumber"
})
public class PortalDataType {

    protected String portalId;
    protected String domain;
    protected String bfId;
    protected RegisteredMsisdnType mobilePhoneDetails;
    protected FullNameType fullName;
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    protected String alternativeContactNumber;
    protected String alternativeEmailAddress;
    @XmlSchemaType(name = "string")
    protected ContactMediumType preferredContactMedium;
    protected PortalAddressType address;
    protected MarketingPreferencesType marketingPreferences;
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
     * Gets the value of the bfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBfId() {
        return bfId;
    }

    /**
     * Sets the value of the bfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBfId(String value) {
        this.bfId = value;
    }

    /**
     * Gets the value of the mobilePhoneDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredMsisdnType }
     *     
     */
    public RegisteredMsisdnType getMobilePhoneDetails() {
        return mobilePhoneDetails;
    }

    /**
     * Sets the value of the mobilePhoneDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredMsisdnType }
     *     
     */
    public void setMobilePhoneDetails(RegisteredMsisdnType value) {
        this.mobilePhoneDetails = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link FullNameType }
     *     
     */
    public FullNameType getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullNameType }
     *     
     */
    public void setFullName(FullNameType value) {
        this.fullName = value;
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
     * Gets the value of the alternativeEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeEmailAddress() {
        return alternativeEmailAddress;
    }

    /**
     * Sets the value of the alternativeEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeEmailAddress(String value) {
        this.alternativeEmailAddress = value;
    }

    /**
     * Gets the value of the preferredContactMedium property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMediumType }
     *     
     */
    public ContactMediumType getPreferredContactMedium() {
        return preferredContactMedium;
    }

    /**
     * Sets the value of the preferredContactMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMediumType }
     *     
     */
    public void setPreferredContactMedium(ContactMediumType value) {
        this.preferredContactMedium = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link PortalAddressType }
     *     
     */
    public PortalAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalAddressType }
     *     
     */
    public void setAddress(PortalAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the marketingPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingPreferencesType }
     *     
     */
    public MarketingPreferencesType getMarketingPreferences() {
        return marketingPreferences;
    }

    /**
     * Sets the value of the marketingPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingPreferencesType }
     *     
     */
    public void setMarketingPreferences(MarketingPreferencesType value) {
        this.marketingPreferences = value;
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
