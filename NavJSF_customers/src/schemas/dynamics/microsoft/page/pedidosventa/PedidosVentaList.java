
package schemas.dynamics.microsoft.page.pedidosventa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PedidosVenta_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidosVenta_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PedidosVenta" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}PedidosVenta" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidosVenta_List", propOrder = {
    "pedidosVenta"
})
public class PedidosVentaList {

    @XmlElement(name = "PedidosVenta", required = true)
    protected List<PedidosVenta> pedidosVenta;

    /**
     * Gets the value of the pedidosVenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedidosVenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedidosVenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidosVenta }
     * 
     * 
     */
    public List<PedidosVenta> getPedidosVenta() {
        if (pedidosVenta == null) {
            pedidosVenta = new ArrayList<PedidosVenta>();
        }
        return this.pedidosVenta;
    }

}
