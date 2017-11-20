
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.pscommonregistrationdata_2.IdentityReferenceType;


/**
 * Holds information related to the A&R linked
 * 				account.
 * 			
 * 
 * <p>Java class for linkedAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkedAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityReference" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}identityReferenceType" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkedAccountType", propOrder = {
    "label",
    "identityReference",
    "isDefault"
})
public class LinkedAccountType {

    protected String label;
    protected IdentityReferenceType identityReference;
    protected Boolean isDefault;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the identityReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityReferenceType }
     *     
     */
    public IdentityReferenceType getIdentityReference() {
        return identityReference;
    }

    /**
     * Sets the value of the identityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityReferenceType }
     *     
     */
    public void setIdentityReference(IdentityReferenceType value) {
        this.identityReference = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

}
