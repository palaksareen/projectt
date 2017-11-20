
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Request for searchOnlineAccounts_1 operation
 * 			
 * 
 * <p>Java class for searchOnlineAccounts_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchOnlineAccounts_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchCriteria" type="{http://soa.o2.co.uk/useraccountsdata_1}searchCriteriaType"/>
 *         &lt;element name="searchOptions" type="{http://soa.o2.co.uk/useraccountsdata_1}searchOptionsType"/>
 *         &lt;element name="sortOrder" type="{http://soa.o2.co.uk/useraccountsdata_1}sortOrderType" minOccurs="0"/>
 *         &lt;element name="returnPartialSearchResults" type="{http://soa.o2.co.uk/useraccountsdata_1}returnPartialSearchResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchOnlineAccounts_1", propOrder = {
    "searchCriteria",
    "searchOptions",
    "sortOrder",
    "returnPartialSearchResults"
})
public class SearchOnlineAccounts1 {

    @XmlElement(required = true)
    protected SearchCriteriaType searchCriteria;
    @XmlElement(required = true)
    protected SearchOptionsType searchOptions;
    protected SortOrderType sortOrder;
    @XmlSchemaType(name = "string")
    protected ReturnPartialSearchResultsType returnPartialSearchResults;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaType }
     *     
     */
    public SearchCriteriaType getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaType }
     *     
     */
    public void setSearchCriteria(SearchCriteriaType value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the searchOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOptionsType }
     *     
     */
    public SearchOptionsType getSearchOptions() {
        return searchOptions;
    }

    /**
     * Sets the value of the searchOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOptionsType }
     *     
     */
    public void setSearchOptions(SearchOptionsType value) {
        this.searchOptions = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderType }
     *     
     */
    public SortOrderType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderType }
     *     
     */
    public void setSortOrder(SortOrderType value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the returnPartialSearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnPartialSearchResultsType }
     *     
     */
    public ReturnPartialSearchResultsType getReturnPartialSearchResults() {
        return returnPartialSearchResults;
    }

    /**
     * Sets the value of the returnPartialSearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPartialSearchResultsType }
     *     
     */
    public void setReturnPartialSearchResults(ReturnPartialSearchResultsType value) {
        this.returnPartialSearchResults = value;
    }

}
