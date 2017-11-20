
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The user's registered mobile phone.
 * 			
 * 
 * <p>Java class for registeredMsisdnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registeredMsisdnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdn" type="{http://soa.o2.co.uk/coredata_1}msisdnType" minOccurs="0"/>
 *         &lt;element name="make" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}phoneMakeType" minOccurs="0"/>
 *         &lt;element name="isMsisdnValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="msisdnValidatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="msisdnValidToken" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}msisdnStatusTokenType" minOccurs="0"/>
 *         &lt;element name="msisdnVerificationCode" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}msisdnVerificationCodeType" minOccurs="0"/>
 *         &lt;element name="isMsisdnBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registeredMsisdnType", propOrder = {
    "msisdn",
    "make",
    "isMsisdnValidated",
    "msisdnValidatedDate",
    "msisdnValidToken",
    "msisdnVerificationCode",
    "isMsisdnBarred"
})
public class RegisteredMsisdnType {

    protected String msisdn;
    protected String make;
    protected Boolean isMsisdnValidated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msisdnValidatedDate;
    protected String msisdnValidToken;
    protected String msisdnVerificationCode;
    protected Boolean isMsisdnBarred;

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
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the isMsisdnValidated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMsisdnValidated() {
        return isMsisdnValidated;
    }

    /**
     * Sets the value of the isMsisdnValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMsisdnValidated(Boolean value) {
        this.isMsisdnValidated = value;
    }

    /**
     * Gets the value of the msisdnValidatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMsisdnValidatedDate() {
        return msisdnValidatedDate;
    }

    /**
     * Sets the value of the msisdnValidatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsisdnValidatedDate(XMLGregorianCalendar value) {
        this.msisdnValidatedDate = value;
    }

    /**
     * Gets the value of the msisdnValidToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdnValidToken() {
        return msisdnValidToken;
    }

    /**
     * Sets the value of the msisdnValidToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdnValidToken(String value) {
        this.msisdnValidToken = value;
    }

    /**
     * Gets the value of the msisdnVerificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdnVerificationCode() {
        return msisdnVerificationCode;
    }

    /**
     * Sets the value of the msisdnVerificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdnVerificationCode(String value) {
        this.msisdnVerificationCode = value;
    }

    /**
     * Gets the value of the isMsisdnBarred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMsisdnBarred() {
        return isMsisdnBarred;
    }

    /**
     * Sets the value of the isMsisdnBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMsisdnBarred(Boolean value) {
        this.isMsisdnBarred = value;
    }

}
