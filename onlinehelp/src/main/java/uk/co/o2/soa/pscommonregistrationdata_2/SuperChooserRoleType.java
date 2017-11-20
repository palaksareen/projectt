
package uk.co.o2.soa.pscommonregistrationdata_2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.useraccountsdata_1.IdentitySuperchooserRoleType;


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
 *         &lt;element name="billingCustomerId" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingCustomerIdType" minOccurs="0"/>
 *         &lt;element name="billingCustomerName" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingCustomerNameType" minOccurs="0"/>
 *         &lt;element name="companyCustnum" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}customerNumberType" minOccurs="0"/>
 *         &lt;element name="companyCustomerType" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}customerCategoryType" minOccurs="0"/>
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
    "billingCustomerId",
    "billingCustomerName",
    "companyCustnum",
    "companyCustomerType"
})
@XmlSeeAlso({
    IdentitySuperchooserRoleType.class
})
public class SuperChooserRoleType {

    protected String billingCustomerId;
    protected String billingCustomerName;
    protected BigInteger companyCustnum;
    protected String companyCustomerType;

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

}
