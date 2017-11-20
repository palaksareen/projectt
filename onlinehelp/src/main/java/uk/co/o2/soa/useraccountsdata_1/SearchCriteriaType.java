
package uk.co.o2.soa.useraccountsdata_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type used for holding the criteria to be used in
 * 				the search
 * 
 * <p>Java class for searchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerNumber" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}customerNumberType" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://soa.o2.co.uk/coredata_1}msisdnType" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://soa.o2.co.uk/useraccountsdata_1}userNameMatchingType" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://soa.o2.co.uk/useraccountsdata_1}firstNameMatchingType" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://soa.o2.co.uk/useraccountsdata_1}lastNameType" minOccurs="0"/>
 *         &lt;element name="password" type="{http://soa.o2.co.uk/useraccountsdata_1}passwordType" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://soa.o2.co.uk/useraccountsdata_1}postCodeMatchingType" minOccurs="0"/>
 *         &lt;element name="identityUID" type="{http://soa.o2.co.uk/coredata_1}identityUIDType" minOccurs="0"/>
 *         &lt;element name="bfId" type="{http://soa.o2.co.uk/coredata_1}customerIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCriteriaType", propOrder = {
    "customerNumber",
    "msisdn",
    "userName",
    "firstName",
    "lastName",
    "password",
    "postCode",
    "identityUID",
    "bfId"
})
public class SearchCriteriaType {

    protected BigInteger customerNumber;
    protected String msisdn;
    protected UserNameMatchingType userName;
    protected FirstNameMatchingType firstName;
    protected LastNameType lastName;
    protected String password;
    protected PostCodeMatchingType postCode;
    protected String identityUID;
    protected String bfId;

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerNumber(BigInteger value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link UserNameMatchingType }
     *     
     */
    public UserNameMatchingType getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserNameMatchingType }
     *     
     */
    public void setUserName(UserNameMatchingType value) {
        this.userName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link FirstNameMatchingType }
     *     
     */
    public FirstNameMatchingType getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstNameMatchingType }
     *     
     */
    public void setFirstName(FirstNameMatchingType value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link LastNameType }
     *     
     */
    public LastNameType getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastNameType }
     *     
     */
    public void setLastName(LastNameType value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link PostCodeMatchingType }
     *     
     */
    public PostCodeMatchingType getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostCodeMatchingType }
     *     
     */
    public void setPostCode(PostCodeMatchingType value) {
        this.postCode = value;
    }

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
     * Gets the value of the bfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBfId() {
        return bfId;
    }

    /**
     * Sets the value of the bfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBfId(String value) {
        this.bfId = value;
    }

}
