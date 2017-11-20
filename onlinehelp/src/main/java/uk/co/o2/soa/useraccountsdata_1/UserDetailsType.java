
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A complex type holding various user-details along with a CRUD field
 * 
 * <p>Java class for userDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://soa.o2.co.uk/useraccountsdata_1}crudType" minOccurs="0"/>
 *         &lt;element name="userData" type="{http://soa.o2.co.uk/useraccountsdata_1}userDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDetailsType", propOrder = {
    "action",
    "userData"
})
public class UserDetailsType {

    @XmlSchemaType(name = "string")
    protected CrudType action;
    protected UserDataType userData;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link CrudType }
     *     
     */
    public CrudType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrudType }
     *     
     */
    public void setAction(CrudType value) {
        this.action = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link UserDataType }
     *     
     */
    public UserDataType getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDataType }
     *     
     */
    public void setUserData(UserDataType value) {
        this.userData = value;
    }

}
