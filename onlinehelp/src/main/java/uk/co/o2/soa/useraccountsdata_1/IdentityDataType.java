
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Container to hold the Portal-Identity related information.
 * 			
 * 
 * <p>Java class for identityDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identityDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identityUID" type="{http://soa.o2.co.uk/coredata_1}identityUIDType" minOccurs="0"/>
 *         &lt;element name="identityUsername" type="{http://soa.o2.co.uk/coredata_1}identityUsernameType" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://soa.o2.co.uk/useraccountsdata_1}fullNameType" minOccurs="0"/>
 *         &lt;element name="isEmailValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityDataType", propOrder = {
    "identityUID",
    "identityUsername",
    "fullName",
    "isEmailValidated"
})
public class IdentityDataType {

    protected String identityUID;
    protected String identityUsername;
    protected FullNameType fullName;
    protected Boolean isEmailValidated;

    /**
     * Gets the value of the identityUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityUID() {
        return identityUID;
    }

    /**
     * Sets the value of the identityUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityUID(String value) {
        this.identityUID = value;
    }

    /**
     * Gets the value of the identityUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityUsername() {
        return identityUsername;
    }

    /**
     * Sets the value of the identityUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityUsername(String value) {
        this.identityUsername = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link FullNameType }
     *     
     */
    public FullNameType getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullNameType }
     *     
     */
    public void setFullName(FullNameType value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the isEmailValidated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmailValidated() {
        return isEmailValidated;
    }

    /**
     * Sets the value of the isEmailValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmailValidated(Boolean value) {
        this.isEmailValidated = value;
    }

}
