
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
 *         &lt;element name="Delete_PurchLines_Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deletePurchLinesResult"
})
@XmlRootElement(name = "Delete_PurchLines_Result")
public class DeletePurchLinesResult {

    @XmlElement(name = "Delete_PurchLines_Result")
    protected boolean deletePurchLinesResult;

    /**
     * Gets the value of the deletePurchLinesResult property.
     * 
     */
    public boolean isDeletePurchLinesResult() {
        return deletePurchLinesResult;
    }

    /**
     * Sets the value of the deletePurchLinesResult property.
     * 
     */
    public void setDeletePurchLinesResult(boolean value) {
        this.deletePurchLinesResult = value;
    }

}
