
package uk.co.o2.soa.useraccountsdata_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type returning users' details [extracted from the
 * 				Registration platform]
 * 
 * <p>Java class for userDetailRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userDetailRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identityData" type="{http://soa.o2.co.uk/useraccountsdata_1}identityDataType" minOccurs="0"/>
 *         &lt;element name="profileData" type="{http://soa.o2.co.uk/useraccountsdata_1}profileDataType" minOccurs="0"/>
 *         &lt;element name="portalData" type="{http://soa.o2.co.uk/useraccountsdata_1}portalDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billingData" type="{http://soa.o2.co.uk/useraccountsdata_1}billingDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billingMsisdn" type="{http://soa.o2.co.uk/useraccountsdata_1}billingMsisdnType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="legacyAandRCustomerData" type="{http://soa.o2.co.uk/useraccountsdata_1}legacyAandRCustomerDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="broadbandData" type="{http://soa.o2.co.uk/useraccountsdata_1}broadbandDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userRole" type="{http://soa.o2.co.uk/useraccountsdata_1}identityUserRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chooserRole" type="{http://soa.o2.co.uk/useraccountsdata_1}identityChooserRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="superChooserRole" type="{http://soa.o2.co.uk/useraccountsdata_1}identitySuperchooserRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountLinkage" type="{http://soa.o2.co.uk/useraccountsdata_1}accountLinkageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDetailRecordType", propOrder = {
    "identityData",
    "profileData",
    "portalData",
    "billingData",
    "billingMsisdn",
    "legacyAandRCustomerData",
    "broadbandData",
    "userRole",
    "chooserRole",
    "superChooserRole",
    "accountLinkage"
})
public class UserDetailRecordType {

    protected IdentityDataType identityData;
    protected ProfileDataType profileData;
    protected List<PortalDataType> portalData;
    protected List<BillingDataType> billingData;
    protected List<BillingMsisdnType> billingMsisdn;
    protected List<LegacyAandRCustomerDataType> legacyAandRCustomerData;
    protected List<BroadbandDataType> broadbandData;
    protected List<IdentityUserRoleType> userRole;
    protected List<IdentityChooserRoleType> chooserRole;
    protected List<IdentitySuperchooserRoleType> superChooserRole;
    protected AccountLinkageType accountLinkage;

    /**
     * Gets the value of the identityData property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDataType }
     *     
     */
    public IdentityDataType getIdentityData() {
        return identityData;
    }

    /**
     * Sets the value of the identityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDataType }
     *     
     */
    public void setIdentityData(IdentityDataType value) {
        this.identityData = value;
    }

    /**
     * Gets the value of the profileData property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileDataType }
     *     
     */
    public ProfileDataType getProfileData() {
        return profileData;
    }

    /**
     * Sets the value of the profileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileDataType }
     *     
     */
    public void setProfileData(ProfileDataType value) {
        this.profileData = value;
    }

    /**
     * Gets the value of the portalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortalDataType }
     * 
     * 
     */
    public List<PortalDataType> getPortalData() {
        if (portalData == null) {
            portalData = new ArrayList<PortalDataType>();
        }
        return this.portalData;
    }

    /**
     * Gets the value of the billingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDataType }
     * 
     * 
     */
    public List<BillingDataType> getBillingData() {
        if (billingData == null) {
            billingData = new ArrayList<BillingDataType>();
        }
        return this.billingData;
    }

    /**
     * Gets the value of the billingMsisdn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingMsisdn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingMsisdn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingMsisdnType }
     * 
     * 
     */
    public List<BillingMsisdnType> getBillingMsisdn() {
        if (billingMsisdn == null) {
            billingMsisdn = new ArrayList<BillingMsisdnType>();
        }
        return this.billingMsisdn;
    }

    /**
     * Gets the value of the legacyAandRCustomerData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legacyAandRCustomerData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegacyAandRCustomerData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegacyAandRCustomerDataType }
     * 
     * 
     */
    public List<LegacyAandRCustomerDataType> getLegacyAandRCustomerData() {
        if (legacyAandRCustomerData == null) {
            legacyAandRCustomerData = new ArrayList<LegacyAandRCustomerDataType>();
        }
        return this.legacyAandRCustomerData;
    }

    /**
     * Gets the value of the broadbandData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the broadbandData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBroadbandData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BroadbandDataType }
     * 
     * 
     */
    public List<BroadbandDataType> getBroadbandData() {
        if (broadbandData == null) {
            broadbandData = new ArrayList<BroadbandDataType>();
        }
        return this.broadbandData;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityUserRoleType }
     * 
     * 
     */
    public List<IdentityUserRoleType> getUserRole() {
        if (userRole == null) {
            userRole = new ArrayList<IdentityUserRoleType>();
        }
        return this.userRole;
    }

    /**
     * Gets the value of the chooserRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chooserRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChooserRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityChooserRoleType }
     * 
     * 
     */
    public List<IdentityChooserRoleType> getChooserRole() {
        if (chooserRole == null) {
            chooserRole = new ArrayList<IdentityChooserRoleType>();
        }
        return this.chooserRole;
    }

    /**
     * Gets the value of the superChooserRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superChooserRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperChooserRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentitySuperchooserRoleType }
     * 
     * 
     */
    public List<IdentitySuperchooserRoleType> getSuperChooserRole() {
        if (superChooserRole == null) {
            superChooserRole = new ArrayList<IdentitySuperchooserRoleType>();
        }
        return this.superChooserRole;
    }

    /**
     * Gets the value of the accountLinkage property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLinkageType }
     *     
     */
    public AccountLinkageType getAccountLinkage() {
        return accountLinkage;
    }

    /**
     * Sets the value of the accountLinkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLinkageType }
     *     
     */
    public void setAccountLinkage(AccountLinkageType value) {
        this.accountLinkage = value;
    }

}
