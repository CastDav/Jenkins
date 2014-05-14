
package schemas.dynamics.microsoft.page.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReadMultiple_Result" type="{urn:microsoft-dynamics-schemas/page/supplier}Supplier_List" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "readMultipleResult"
})
@XmlRootElement(name = "ReadMultiple_Result")
public class ReadMultipleResult {

    @XmlElement(name = "ReadMultiple_Result")
    protected SupplierList readMultipleResult;

    /**
     * Gets the value of the readMultipleResult property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierList }
     *     
     */
    public SupplierList getReadMultipleResult() {
        return readMultipleResult;
    }

    /**
     * Sets the value of the readMultipleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierList }
     *     
     */
    public void setReadMultipleResult(SupplierList value) {
        this.readMultipleResult = value;
    }

}