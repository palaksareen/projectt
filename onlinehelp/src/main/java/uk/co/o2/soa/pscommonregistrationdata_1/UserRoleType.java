
package uk.co.o2.soa.pscommonregistrationdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Geneva User Role Complext Type
 * 
 * <p>Java class for UserRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenevaAccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GenevaAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GenevaCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GenevaCustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HorizonCompanyCustnum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CompanyCustomerType" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}CustomerCategoryType"/>
 *         &lt;element name="MSISDN" type="{http://soa.o2.co.uk/coredata_1}msisdnType"/>
 *         &lt;element name="AccountType" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}AccountCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRoleType", propOrder = {
    "genevaAccountId",
    "genevaAccountName",
    "genevaCustomerId",
    "genevaCustomerName",
    "horizonCompanyCustnum",
    "companyCustomerType",
    "msisdn",
    "accountType"
})
public class UserRoleType {

    @XmlElement(name = "GenevaAccountId", required = true)
    protected String genevaAccountId;
    @XmlElement(name = "GenevaAccountName")
    protected String genevaAccountName;
    @XmlElement(name = "GenevaCustomerId", required = true)
    protected String genevaCustomerId;
    @XmlElement(name = "GenevaCustomerName", required = true)
    protected String genevaCustomerName;
    @XmlElement(name = "HorizonCompanyCustnum", required = true)
    protected BigInteger horizonCompanyCustnum;
    @XmlElement(name = "CompanyCustomerType", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerCategoryType companyCustomerType;
    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "AccountType")
    @XmlSchemaType(name = "string")
    protected AccountCategoryType accountType;

    /**
     * Gets the value of the genevaAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenevaAccountId() {
        return genevaAccountId;
    }

    /**
     * Sets the value of the genevaAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenevaAccountId(String value) {
        this.genevaAccountId = value;
    }

    /**
     * Gets the value of the genevaAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenevaAccountName() {
        return genevaAccountName;
    }

    /**
     * Sets the value of the genevaAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenevaAccountName(String value) {
        this.genevaAccountName = value;
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
     * Gets the value of the genevaCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenevaCustomerName() {
        return genevaCustomerName;
    }

    /**
     * Sets the value of the genevaCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenevaCustomerName(String value) {
        this.genevaCustomerName = value;
    }

    /**
     * Gets the value of the horizonCompanyCustnum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHorizonCompanyCustnum() {
        return horizonCompanyCustnum;
    }

    /**
     * Sets the value of the horizonCompanyCustnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHorizonCompanyCustnum(BigInteger value) {
        this.horizonCompanyCustnum = value;
    }

    /**
     * Gets the value of the companyCustomerType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCategoryType }
     *     
     */
    public CustomerCategoryType getCompanyCustomerType() {
        return companyCustomerType;
    }

    /**
     * Sets the value of the companyCustomerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCategoryType }
     *     
     */
    public void setCompanyCustomerType(CustomerCategoryType value) {
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
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCategoryType }
     *     
     */
    public AccountCategoryType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCategoryType }
     *     
     */
    public void setAccountType(AccountCategoryType value) {
        this.accountType = value;
    }

}
