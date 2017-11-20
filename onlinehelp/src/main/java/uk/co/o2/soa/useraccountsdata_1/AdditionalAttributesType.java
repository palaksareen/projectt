
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds additional attributes pertaining to legacyAandRCustomerDataType.
 * 			
 * 
 * <p>Java class for additionalAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directoryEntryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryEntryFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryEntryLastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryEntryLastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companionAdministrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryEntryListingLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credentialRemindersAccountNumberUsedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalAttributesType", propOrder = {
    "directoryEntryType",
    "directoryEntryFormat",
    "directoryEntryLastModifiedDate",
    "directoryEntryLastModifiedBy",
    "companionAdministrator",
    "directoryEntryListingLevel",
    "credentialRemindersAccountNumberUsedFlag"
})
public class AdditionalAttributesType {

    protected String directoryEntryType;
    protected String directoryEntryFormat;
    protected String directoryEntryLastModifiedDate;
    protected String directoryEntryLastModifiedBy;
    protected String companionAdministrator;
    protected String directoryEntryListingLevel;
    protected String credentialRemindersAccountNumberUsedFlag;

    /**
     * Gets the value of the directoryEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryEntryType() {
        return directoryEntryType;
    }

    /**
     * Sets the value of the directoryEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryEntryType(String value) {
        this.directoryEntryType = value;
    }

    /**
     * Gets the value of the directoryEntryFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryEntryFormat() {
        return directoryEntryFormat;
    }

    /**
     * Sets the value of the directoryEntryFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryEntryFormat(String value) {
        this.directoryEntryFormat = value;
    }

    /**
     * Gets the value of the directoryEntryLastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryEntryLastModifiedDate() {
        return directoryEntryLastModifiedDate;
    }

    /**
     * Sets the value of the directoryEntryLastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryEntryLastModifiedDate(String value) {
        this.directoryEntryLastModifiedDate = value;
    }

    /**
     * Gets the value of the directoryEntryLastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryEntryLastModifiedBy() {
        return directoryEntryLastModifiedBy;
    }

    /**
     * Sets the value of the directoryEntryLastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryEntryLastModifiedBy(String value) {
        this.directoryEntryLastModifiedBy = value;
    }

    /**
     * Gets the value of the companionAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanionAdministrator() {
        return companionAdministrator;
    }

    /**
     * Sets the value of the companionAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanionAdministrator(String value) {
        this.companionAdministrator = value;
    }

    /**
     * Gets the value of the directoryEntryListingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryEntryListingLevel() {
        return directoryEntryListingLevel;
    }

    /**
     * Sets the value of the directoryEntryListingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryEntryListingLevel(String value) {
        this.directoryEntryListingLevel = value;
    }

    /**
     * Gets the value of the credentialRemindersAccountNumberUsedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialRemindersAccountNumberUsedFlag() {
        return credentialRemindersAccountNumberUsedFlag;
    }

    /**
     * Sets the value of the credentialRemindersAccountNumberUsedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialRemindersAccountNumberUsedFlag(String value) {
        this.credentialRemindersAccountNumberUsedFlag = value;
    }

}
