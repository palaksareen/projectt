
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines other aspects of the search behaviour.
 * 			
 * 
 * <p>Java class for searchOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portalOrIdentitySwitch" type="{http://soa.o2.co.uk/useraccountsdata_1}portalOrIdentitySwitchType" minOccurs="0"/>
 *         &lt;element name="searchResults" type="{http://soa.o2.co.uk/useraccountsdata_1}searchResultsType"/>
 *         &lt;element name="returnOrphanedAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchOptionsType", propOrder = {
    "portalOrIdentitySwitch",
    "searchResults",
    "returnOrphanedAccount"
})
public class SearchOptionsType {

    @XmlSchemaType(name = "string")
    protected PortalOrIdentitySwitchType portalOrIdentitySwitch;
    @XmlElement(required = true)
    protected SearchResultsType searchResults;
    protected Boolean returnOrphanedAccount;

    /**
     * Gets the value of the portalOrIdentitySwitch property.
     * 
     * @return
     *     possible object is
     *     {@link PortalOrIdentitySwitchType }
     *     
     */
    public PortalOrIdentitySwitchType getPortalOrIdentitySwitch() {
        return portalOrIdentitySwitch;
    }

    /**
     * Sets the value of the portalOrIdentitySwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalOrIdentitySwitchType }
     *     
     */
    public void setPortalOrIdentitySwitch(PortalOrIdentitySwitchType value) {
        this.portalOrIdentitySwitch = value;
    }

    /**
     * Gets the value of the searchResults property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsType }
     *     
     */
    public SearchResultsType getSearchResults() {
        return searchResults;
    }

    /**
     * Sets the value of the searchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsType }
     *     
     */
    public void setSearchResults(SearchResultsType value) {
        this.searchResults = value;
    }

    /**
     * Gets the value of the returnOrphanedAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOrphanedAccount() {
        return returnOrphanedAccount;
    }

    /**
     * Sets the value of the returnOrphanedAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOrphanedAccount(Boolean value) {
        this.returnOrphanedAccount = value;
    }

}
