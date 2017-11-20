
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.coredata_1.PaymentCategoryType;
import uk.co.o2.soa.pscommonregistrationdata_2.BillingMsisdnStatusType;
import uk.co.o2.soa.pscommonregistrationdata_2.IdentityReferenceType;


/**
 * Holds information related to the A&R billing
 * 				msisdn record that is not available from other sources.
 * 			
 * 
 * <p>Java class for billingMsisdnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingMsisdnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="owningPortalAccount" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}identityReferenceType" minOccurs="0"/>
 *         &lt;element name="billingMsisdn" type="{http://soa.o2.co.uk/coredata_1}msisdnType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingMsisdnStatusType" minOccurs="0"/>
 *         &lt;element name="serviceStatus" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}billingMsisdnServiceStatusType" minOccurs="0"/>
 *         &lt;element name="msisdnType" type="{http://soa.o2.co.uk/coredata_1}PaymentCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingMsisdnType", propOrder = {
    "owningPortalAccount",
    "billingMsisdn",
    "status",
    "serviceStatus",
    "msisdnType"
})
public class BillingMsisdnType {

    protected IdentityReferenceType owningPortalAccount;
    protected String billingMsisdn;
    @XmlSchemaType(name = "string")
    protected BillingMsisdnStatusType status;
    protected String serviceStatus;
    @XmlSchemaType(name = "string")
    protected PaymentCategoryType msisdnType;

    /**
     * Gets the value of the owningPortalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityReferenceType }
     *     
     */
    public IdentityReferenceType getOwningPortalAccount() {
        return owningPortalAccount;
    }

    /**
     * Sets the value of the owningPortalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityReferenceType }
     *     
     */
    public void setOwningPortalAccount(IdentityReferenceType value) {
        this.owningPortalAccount = value;
    }

    /**
     * Gets the value of the billingMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMsisdn() {
        return billingMsisdn;
    }

    /**
     * Sets the value of the billingMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMsisdn(String value) {
        this.billingMsisdn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMsisdnStatusType }
     *     
     */
    public BillingMsisdnStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMsisdnStatusType }
     *     
     */
    public void setStatus(BillingMsisdnStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the msisdnType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCategoryType }
     *     
     */
    public PaymentCategoryType getMsisdnType() {
        return msisdnType;
    }

    /**
     * Sets the value of the msisdnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCategoryType }
     *     
     */
    public void setMsisdnType(PaymentCategoryType value) {
        this.msisdnType = value;
    }

}
