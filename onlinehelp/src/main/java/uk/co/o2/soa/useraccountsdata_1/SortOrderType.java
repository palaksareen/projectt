
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines the sort order; the set is an ordered
 * 				collection. The first order field should be specified first; second
 * 				order fields will be consulted should the first order field not
 * 				result in a unique ordering of results, and so on.
 * 			
 * 
 * <p>Java class for sortOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sortOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sortBy" type="{http://soa.o2.co.uk/useraccountsdata_1}sortByType"/>
 *         &lt;element name="sortDirection" type="{http://soa.o2.co.uk/useraccountsdata_1}sortDirectionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sortOrderType", propOrder = {
    "sortBy",
    "sortDirection"
})
public class SortOrderType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SortByType sortBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SortDirectionType sortDirection;

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link SortByType }
     *     
     */
    public SortByType getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortByType }
     *     
     */
    public void setSortBy(SortByType value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SortDirectionType }
     *     
     */
    public SortDirectionType getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirectionType }
     *     
     */
    public void setSortDirection(SortDirectionType value) {
        this.sortDirection = value;
    }

}
