
package uk.co.o2.soa.pscommonregistrationdata_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifying information only.
 * 
 * <p>Java class for identityReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identityReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identityUID" type="{http://soa.o2.co.uk/coredata_1}identityUIDType" minOccurs="0"/>
 *         &lt;element name="identityUserName" type="{http://soa.o2.co.uk/coredata_1}identityUsernameType" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://soa.o2.co.uk/pscommonregistrationdata_2}domainType" minOccurs="0"/>
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
@XmlType(name = "identityReferenceType", propOrder = {
    "identityUID",
    "identityUserName",
    "domain",
    "bfId"
})
public class IdentityReferenceType {

    protected String identityUID;
    protected String identityUserName;
    protected String domain;
    protected String bfId;

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
     * Gets the value of the identityUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityUserName() {
        return identityUserName;
    }

    /**
     * Sets the value of the identityUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityUserName(String value) {
        this.identityUserName = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
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
