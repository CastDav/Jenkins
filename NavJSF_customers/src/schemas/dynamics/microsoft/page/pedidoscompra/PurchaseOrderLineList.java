
package schemas.dynamics.microsoft.page.pedidoscompra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Purchase_Order_Line_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Purchase_Order_Line_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Purchase_Order_Line" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}Purchase_Order_Line" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Purchase_Order_Line_List", propOrder = {
    "purchaseOrderLine"
})
public class PurchaseOrderLineList {

    @XmlElement(name = "Purchase_Order_Line", required = true)
    protected List<PurchaseOrderLine> purchaseOrderLine;

    /**
     * Gets the value of the purchaseOrderLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOrderLine }
     * 
     * 
     */
    public List<PurchaseOrderLine> getPurchaseOrderLine() {
        if (purchaseOrderLine == null) {
            purchaseOrderLine = new ArrayList<PurchaseOrderLine>();
        }
        return this.purchaseOrderLine;
    }

}
