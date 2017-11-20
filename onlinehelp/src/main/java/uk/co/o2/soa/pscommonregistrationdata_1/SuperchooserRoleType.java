
package uk.co.o2.soa.pscommonregistrationdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Geneva Superuser Role complex type
 * 
 * <p>Java class for SuperchooserRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuperchooserRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenevaCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GenevaCustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HorizonCompanyCustnum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CompanyCustomerType" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}CustomerCategoryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuperchooserRoleType", propOrder = {
    "genevaCustomerId",
    "genevaCustomerName",
    "horizonCompanyCustnum",
    "companyCustomerType"
})
public class SuperchooserRoleType {

    @XmlElement(name = "GenevaCustomerId", required = true)
    protected String genevaCustomerId;
    @XmlElement(name = "GenevaCustomerName", required = true)
    protected String genevaCustomerName;
    @XmlElement(name = "HorizonCompanyCustnum", required = true)
    protected BigInteger horizonCompanyCustnum;
    @XmlElement(name = "CompanyCustomerType", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerCategoryType companyCustomerType;

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

}
