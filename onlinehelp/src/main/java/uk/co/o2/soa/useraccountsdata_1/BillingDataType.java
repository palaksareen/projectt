
package uk.co.o2.soa.useraccountsdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.pscommonregistrationdata_2.IdentityReferenceType;


/**
 * Billing information
 * 
 * <p>Java class for billingDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingMsisdn" type="{http://soa.o2.co.uk/coredata_1}msisdnType" minOccurs="0"/>
 *         &lt;element name="billingAccountId" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingAccountIdType" minOccurs="0"/>
 *         &lt;element name="billingAccountName" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingAccountNameType" minOccurs="0"/>
 *         &lt;element name="billingAccountType" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}accountCategoryType" minOccurs="0"/>
 *         &lt;element name="owningPortalAccount" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}identityReferenceType" minOccurs="0"/>
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
@XmlType(name = "billingDataType", propOrder = {
    "billingMsisdn",
    "billingAccountId",
    "billingAccountName",
    "billingAccountType",
    "owningPortalAccount",
    "customerNumber"
})
public class BillingDataType {

    protected String billingMsisdn;
    protected String billingAccountId;
    protected String billingAccountName;
    protected String billingAccountType;
    protected IdentityReferenceType owningPortalAccount;
    protected BigInteger customerNumber;

    /**
     * Gets the value of the billingMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMsisdn() {
        return billingMsisdn;
    }

    /**
     * Sets the value of the billingMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMsisdn(String value) {
        this.billingMsisdn = value;
    }

    /**
     * Gets the value of the billingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountId() {
        return billingAccountId;
    }

    /**
     * Sets the value of the billingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountId(String value) {
        this.billingAccountId = value;
    }

    /**
     * Gets the value of the billingAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountName() {
        return billingAccountName;
    }

    /**
     * Sets the value of the billingAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountName(String value) {
        this.billingAccountName = value;
    }

    /**
     * Gets the value of the billingAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountType() {
        return billingAccountType;
    }

    /**
     * Sets the value of the billingAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountType(String value) {
        this.billingAccountType = value;
    }

    /**
     * Gets the value of the owningPortalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityReferenceType }
     *     
     */
    public IdentityReferenceType getOwningPortalAccount() {
        return owningPortalAccount;
    }

    /**
     * Sets the value of the owningPortalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityReferenceType }
     *     
     */
    public void setOwningPortalAccount(IdentityReferenceType value) {
        this.owningPortalAccount = value;
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
