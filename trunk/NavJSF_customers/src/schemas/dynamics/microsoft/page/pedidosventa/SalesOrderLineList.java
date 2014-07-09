
package schemas.dynamics.microsoft.page.pedidosventa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Sales_Order_Line_List complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Sales_Order_Line_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sales_Order_Line" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}Sales_Order_Line" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sales_Order_Line_List", propOrder = {
    "salesOrderLine"
})
public class SalesOrderLineList {

    @XmlElement(name = "Sales_Order_Line", required = true)
    protected List<SalesOrderLine> salesOrderLine;

    /**
     * Gets the value of the salesOrderLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderLine }
     * 
     * 
     */
    public List<SalesOrderLine> getSalesOrderLine() {
        if (salesOrderLine == null) {
            salesOrderLine = new ArrayList<SalesOrderLine>();
        }
        return this.salesOrderLine;
    }

}
