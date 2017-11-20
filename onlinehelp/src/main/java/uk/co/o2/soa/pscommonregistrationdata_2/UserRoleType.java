
package uk.co.o2.soa.pscommonregistrationdata_2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.useraccountsdata_1.IdentityUserRoleType;


/**
 * Orange account registration user role data
 * 
 * <p>Java class for userRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingAccountId" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingAccountIdType" minOccurs="0"/>
 *         &lt;element name="billingAccountName" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingAccountNameType" minOccurs="0"/>
 *         &lt;element name="billingCustomerId" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingCustomerIdType" minOccurs="0"/>
 *         &lt;element name="billingCustomerName" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingCustomerNameType" minOccurs="0"/>
 *         &lt;element name="companyCustnum" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}customerNumberType" minOccurs="0"/>
 *         &lt;element name="companyCustomerType" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}customerCategoryType" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://soa.o2.co.uk/coredata_1}msisdnType" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}accountCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userRoleType", propOrder = {
    "billingAccountId",
    "billingAccountName",
    "billingCustomerId",
    "billingCustomerName",
    "companyCustnum",
    "companyCustomerType",
    "msisdn",
    "accountType"
})
@XmlSeeAlso({
    IdentityUserRoleType.class
})
public class UserRoleType {

    protected String billingAccountId;
    protected String billingAccountName;
    protected String billingCustomerId;
    protected String billingCustomerName;
    protected BigInteger companyCustnum;
    protected String companyCustomerType;
    protected String msisdn;
    protected String accountType;

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
     * Gets the value of the companyCustnum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompanyCustnum() {
        return companyCustnum;
    }

    /**
     * Sets the value of the companyCustnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompanyCustnum(BigInteger value) {
        this.companyCustnum = value;
    }

    /**
     * Gets the value of the companyCustomerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCustomerType() {
        return companyCustomerType;
    }

    /**
     * Sets the value of the companyCustomerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCustomerType(String value) {
        this.companyCustomerType = value;
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
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

}
