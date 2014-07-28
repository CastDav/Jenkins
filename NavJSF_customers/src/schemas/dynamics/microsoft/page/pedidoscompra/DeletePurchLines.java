
package schemas.dynamics.microsoft.page.pedidoscompra;

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
 *         &lt;element name="PurchLines_Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "purchLinesKey"
})
@XmlRootElement(name = "Delete_PurchLines")
public class DeletePurchLines {

    @XmlElement(name = "PurchLines_Key", required = true)
    protected String purchLinesKey;

    /**
     * Gets the value of the purchLinesKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchLinesKey() {
        return purchLinesKey;
    }

    /**
     * Sets the value of the purchLinesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchLinesKey(String value) {
        this.purchLinesKey = value;
    }

}
