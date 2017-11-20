
package uk.co.o2.soa.useraccountsdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.o2.soa.pscommonregistrationdata_2.IdentityReferenceType;


/**
 * Broadband information
 * 
 * <p>Java class for broadbandDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="broadbandDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="broadbandAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="broadbandAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="broadbandPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="broadbandStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://soa.o2.co.uk/coredata_1}emailAddressType" minOccurs="0"/>
 *         &lt;element name="broadbandActivatedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="broadbandCeasedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="broadbandOrderedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="broadbandPartialOrderedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="broadbandTerminatedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="primaryPortalAccount" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}identityReferenceType" minOccurs="0"/>
 *         &lt;element name="secondaryPortalAccounts" type="{http://soa.o2.co.uk/useraccountsdata_1}broadbandSecondaryAccountList" minOccurs="0"/>
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
@XmlType(name = "broadbandDataType", propOrder = {
    "broadbandAccountId",
    "broadbandAccountType",
    "broadbandPackage",
    "broadbandStatus",
    "emailAddress",
    "broadbandActivatedDate",
    "broadbandCeasedDate",
    "broadbandOrderedDate",
    "broadbandPartialOrderedDate",
    "broadbandTerminatedDate",
    "primaryPortalAccount",
    "secondaryPortalAccounts",
    "customerNumber"
})
public class BroadbandDataType {

    protected String broadbandAccountId;
    protected String broadbandAccountType;
    protected String broadbandPackage;
    protected String broadbandStatus;
    protected String emailAddress;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar broadbandActivatedDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar broadbandCeasedDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar broadbandOrderedDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar broadbandPartialOrderedDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar broadbandTerminatedDate;
    protected IdentityReferenceType primaryPortalAccount;
    protected BroadbandSecondaryAccountList secondaryPortalAccounts;
    protected BigInteger customerNumber;

    /**
     * Gets the value of the broadbandAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadbandAccountId() {
        return broadbandAccountId;
    }

    /**
     * Sets the value of the broadbandAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadbandAccountId(String value) {
        this.broadbandAccountId = value;
    }

    /**
     * Gets the value of the broadbandAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadbandAccountType() {
        return broadbandAccountType;
    }

    /**
     * Sets the value of the broadbandAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadbandAccountType(String value) {
        this.broadbandAccountType = value;
    }

    /**
     * Gets the value of the broadbandPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadbandPackage() {
        return broadbandPackage;
    }

    /**
     * Sets the value of the broadbandPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadbandPackage(String value) {
        this.broadbandPackage = value;
    }

    /**
     * Gets the value of the broadbandStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadbandStatus() {
        return broadbandStatus;
    }

    /**
     * Sets the value of the broadbandStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadbandStatus(String value) {
        this.broadbandStatus = value;
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
     * Gets the value of the broadbandActivatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBroadbandActivatedDate() {
        return broadbandActivatedDate;
    }

    /**
     * Sets the value of the broadbandActivatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBroadbandActivatedDate(XMLGregorianCalendar value) {
        this.broadbandActivatedDate = value;
    }

    /**
     * Gets the value of the broadbandCeasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBroadbandCeasedDate() {
        return broadbandCeasedDate;
    }

    /**
     * Sets the value of the broadbandCeasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBroadbandCeasedDate(XMLGregorianCalendar value) {
        this.broadbandCeasedDate = value;
    }

    /**
     * Gets the value of the broadbandOrderedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBroadbandOrderedDate() {
        return broadbandOrderedDate;
    }

    /**
     * Sets the value of the broadbandOrderedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBroadbandOrderedDate(XMLGregorianCalendar value) {
        this.broadbandOrderedDate = value;
    }

    /**
     * Gets the value of the broadbandPartialOrderedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBroadbandPartialOrderedDate() {
        return broadbandPartialOrderedDate;
    }

    /**
     * Sets the value of the broadbandPartialOrderedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBroadbandPartialOrderedDate(XMLGregorianCalendar value) {
        this.broadbandPartialOrderedDate = value;
    }

    /**
     * Gets the value of the broadbandTerminatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBroadbandTerminatedDate() {
        return broadbandTerminatedDate;
    }

    /**
     * Sets the value of the broadbandTerminatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBroadbandTerminatedDate(XMLGregorianCalendar value) {
        this.broadbandTerminatedDate = value;
    }

    /**
     * Gets the value of the primaryPortalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityReferenceType }
     *     
     */
    public IdentityReferenceType getPrimaryPortalAccount() {
        return primaryPortalAccount;
    }

    /**
     * Sets the value of the primaryPortalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityReferenceType }
     *     
     */
    public void setPrimaryPortalAccount(IdentityReferenceType value) {
        this.primaryPortalAccount = value;
    }

    /**
     * Gets the value of the secondaryPortalAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link BroadbandSecondaryAccountList }
     *     
     */
    public BroadbandSecondaryAccountList getSecondaryPortalAccounts() {
        return secondaryPortalAccounts;
    }

    /**
     * Sets the value of the secondaryPortalAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadbandSecondaryAccountList }
     *     
     */
    public void setSecondaryPortalAccounts(BroadbandSecondaryAccountList value) {
        this.secondaryPortalAccounts = value;
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
