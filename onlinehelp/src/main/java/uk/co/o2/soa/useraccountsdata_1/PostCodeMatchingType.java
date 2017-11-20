
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 			postCode type with an extra attribute denoting the kind of matching required.
 * 			
 * 
 * <p>Java class for postCodeMatchingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postCodeMatchingType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="matchingCondition" use="required" type="{http://soa.o2.co.uk/useraccountsdata_1}matchingConditionType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postCodeMatchingType", propOrder = {
    "value"
})
public class PostCodeMatchingType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "matchingCondition", required = true)
    protected MatchingConditionType matchingCondition;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the matchingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingConditionType }
     *     
     */
    public MatchingConditionType getMatchingCondition() {
        return matchingCondition;
    }

    /**
     * Sets the value of the matchingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingConditionType }
     *     
     */
    public void setMatchingCondition(MatchingConditionType value) {
        this.matchingCondition = value;
    }

}
