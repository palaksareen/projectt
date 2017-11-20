
package uk.co.o2.soa.useraccountsdata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.coredata_1.ServiceResultType;


/**
 * Response for createOrUpdateUser operation
 * 
 * <p>Java class for createOrUpdateUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOrUpdateUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceResult" type="{http://soa.o2.co.uk/coredata_1}ServiceResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrUpdateUserResponse", propOrder = {
    "serviceResult"
})
public class CreateOrUpdateUserResponse {

    @XmlElement(required = true)
    protected ServiceResultType serviceResult;

    /**
     * Gets the value of the serviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResultType }
     *     
     */
    public ServiceResultType getServiceResult() {
        return serviceResult;
    }

    /**
     * Sets the value of the serviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResultType }
     *     
     */
    public void setServiceResult(ServiceResultType value) {
        this.serviceResult = value;
    }

}
