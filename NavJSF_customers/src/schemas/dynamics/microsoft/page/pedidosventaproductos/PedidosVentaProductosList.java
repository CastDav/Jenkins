
package schemas.dynamics.microsoft.page.pedidosventaproductos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PedidosVentaProductos_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidosVentaProductos_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PedidosVentaProductos" type="{urn:microsoft-dynamics-schemas/page/pedidosventaproductos}PedidosVentaProductos" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidosVentaProductos_List", propOrder = {
    "pedidosVentaProductos"
})
public class PedidosVentaProductosList {

    @XmlElement(name = "PedidosVentaProductos", required = true)
    protected List<PedidosVentaProductos> pedidosVentaProductos;

    /**
     * Gets the value of the pedidosVentaProductos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedidosVentaProductos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedidosVentaProductos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidosVentaProductos }
     * 
     * 
     */
    public List<PedidosVentaProductos> getPedidosVentaProductos() {
        if (pedidosVentaProductos == null) {
            pedidosVentaProductos = new ArrayList<PedidosVentaProductos>();
        }
        return this.pedidosVentaProductos;
    }

}
