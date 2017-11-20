
package uk.co.o2.soa.useraccountsdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Orange account registration chooser role
 * 
 * <p>Java class for chooserRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chooserRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genevaAccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genevaAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genevaCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genevaCustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyCustomerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horizonCompanyCustnum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="accountType" type="{http://soa.o2.co.uk/useraccountsdata_1}typeOfAccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chooserRoleType", propOrder = {
    "genevaAccountId",
    "genevaAccountName",
    "genevaCustomerId",
    "genevaCustomerName",
    "companyCustomerType",
    "horizonCompanyCustnum",
    "accountType"
})
public class ChooserRoleType {

    @XmlElement(required = true)
    protected String genevaAccountId;
    protected String genevaAccountName;
    @XmlElement(required = true)
    protected String genevaCustomerId;
    @XmlElement(required = true)
    protected String genevaCustomerName;
    @XmlElement(required = true)
    protected String companyCustomerType;
    @XmlElement(required = true)
    protected BigInteger horizonCompanyCustnum;
    @XmlSchemaType(name = "string")
    protected TypeOfAccountType accountType;

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
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAccountType }
     *     
     */
    public TypeOfAccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAccountType }
     *     
     */
    public void setAccountType(TypeOfAccountType value) {
        this.accountType = value;
    }

}
