
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * List of named marketing flags (currently numbering
 * 				two, may grow/shrink in future).
 * 
 * <p>Java class for marketingPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marketingPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isGenieMarketingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOtherMarketingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marketingPreferencesType", propOrder = {
    "isGenieMarketingRequired",
    "isOtherMarketingRequired"
})
public class MarketingPreferencesType {

    protected Boolean isGenieMarketingRequired;
    protected Boolean isOtherMarketingRequired;

    /**
     * Gets the value of the isGenieMarketingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGenieMarketingRequired() {
        return isGenieMarketingRequired;
    }

    /**
     * Sets the value of the isGenieMarketingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGenieMarketingRequired(Boolean value) {
        this.isGenieMarketingRequired = value;
    }

    /**
     * Gets the value of the isOtherMarketingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOtherMarketingRequired() {
        return isOtherMarketingRequired;
    }

    /**
     * Sets the value of the isOtherMarketingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOtherMarketingRequired(Boolean value) {
        this.isOtherMarketingRequired = value;
    }

}
