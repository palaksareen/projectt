
package uk.co.o2.soa.useraccountsdata_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type which controls what data is to be returned in search results.
 * 			
 * 
 * <p>Java class for searchResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="allOrSummary" type="{http://soa.o2.co.uk/useraccountsdata_1}allOrSummaryType"/>
 *         &lt;sequence>
 *           &lt;element name="resultSpecificData" type="{http://soa.o2.co.uk/useraccountsdata_1}resultSpecificDataType" maxOccurs="6"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchResultsType", propOrder = {
    "allOrSummary",
    "resultSpecificData"
})
public class SearchResultsType {

    @XmlSchemaType(name = "string")
    protected AllOrSummaryType allOrSummary;
    @XmlSchemaType(name = "string")
    protected List<ResultSpecificDataType> resultSpecificData;

    /**
     * Gets the value of the allOrSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AllOrSummaryType }
     *     
     */
    public AllOrSummaryType getAllOrSummary() {
        return allOrSummary;
    }

    /**
     * Sets the value of the allOrSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllOrSummaryType }
     *     
     */
    public void setAllOrSummary(AllOrSummaryType value) {
        this.allOrSummary = value;
    }

    /**
     * Gets the value of the resultSpecificData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultSpecificData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultSpecificData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultSpecificDataType }
     * 
     * 
     */
    public List<ResultSpecificDataType> getResultSpecificData() {
        if (resultSpecificData == null) {
            resultSpecificData = new ArrayList<ResultSpecificDataType>();
        }
        return this.resultSpecificData;
    }

}
