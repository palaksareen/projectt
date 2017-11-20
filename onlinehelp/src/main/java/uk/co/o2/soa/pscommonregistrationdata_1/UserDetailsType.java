
package uk.co.o2.soa.pscommonregistrationdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * USer details inclusing User data and CRUD action
 * 
 * <p>Java class for UserDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}UserType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{http://soa.o2.co.uk/pscommonregistrationdata_1}CRUD" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDetailsType", propOrder = {
    "user"
})
public class UserDetailsType {

    protected UserType user;
    @XmlAttribute(name = "action")
    protected CRUD action;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link CRUD }
     *     
     */
    public CRUD getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRUD }
     *     
     */
    public void setAction(CRUD value) {
        this.action = value;
    }

}
