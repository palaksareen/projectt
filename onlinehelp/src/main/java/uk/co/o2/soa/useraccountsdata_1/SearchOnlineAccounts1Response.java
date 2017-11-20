
package uk.co.o2.soa.useraccountsdata_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.coredata_1.ServiceResultType;


/**
 * Response for searchOnlineAccounts_1 operation
 * 			
 * 
 * <p>Java class for searchOnlineAccounts_1Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchOnlineAccounts_1Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchResultStatus" type="{http://soa.o2.co.uk/coredata_1}ServiceResultType"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="userDetailRecord" type="{http://soa.o2.co.uk/useraccountsdata_1}userDetailRecordType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchOnlineAccounts_1Response", propOrder = {
    "searchResultStatus",
    "count",
    "userDetailRecord"
})
public class SearchOnlineAccounts1Response {

    @XmlElement(required = true)
    protected ServiceResultType searchResultStatus;
    @XmlElement(required = true)
    protected BigInteger count;
    @XmlElement(required = true)
    protected List<UserDetailRecordType> userDetailRecord;

    /**
     * Gets the value of the searchResultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResultType }
     *     
     */
    public ServiceResultType getSearchResultStatus() {
        return searchResultStatus;
    }

    /**
     * Sets the value of the searchResultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResultType }
     *     
     */
    public void setSearchResultStatus(ServiceResultType value) {
        this.searchResultStatus = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the userDetailRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDetailRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDetailRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDetailRecordType }
     * 
     * 
     */
    public List<UserDetailRecordType> getUserDetailRecord() {
        if (userDetailRecord == null) {
            userDetailRecord = new ArrayList<UserDetailRecordType>();
        }
        return this.userDetailRecord;
    }

}
