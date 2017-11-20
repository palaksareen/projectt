
package uk.co.o2.soa.useraccountsdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Orange account registration super-chooser role data
 * 			
 * 
 * <p>Java class for superChooserRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="superChooserRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genevaCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genevaCustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horizonCompanyCustnum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="companyCustomerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "superChooserRoleType", propOrder = {
    "genevaCustomerId",
    "genevaCustomerName",
    "horizonCompanyCustnum",
    "companyCustomerType"
})
public class SuperChooserRoleType {

    @XmlElement(required = true)
    protected String genevaCustomerId;
    @XmlElement(required = true)
    protected String genevaCustomerName;
    @XmlElement(required = true)
    protected BigInteger horizonCompanyCustnum;
    @XmlElement(required = true)
    protected String companyCustomerType;

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

}
