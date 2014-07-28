
package schemas.dynamics.microsoft.page.pedidosventaproductos;

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
 *         &lt;element name="PedidosVentaProductos_List" type="{urn:microsoft-dynamics-schemas/page/pedidosventaproductos}PedidosVentaProductos_List"/>
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
    "pedidosVentaProductosList"
})
@XmlRootElement(name = "UpdateMultiple")
public class UpdateMultiple {

    @XmlElement(name = "PedidosVentaProductos_List", required = true)
    protected PedidosVentaProductosList pedidosVentaProductosList;

    /**
     * Gets the value of the pedidosVentaProductosList property.
     * 
     * @return
     *     possible object is
     *     {@link PedidosVentaProductosList }
     *     
     */
    public PedidosVentaProductosList getPedidosVentaProductosList() {
        return pedidosVentaProductosList;
    }

    /**
     * Sets the value of the pedidosVentaProductosList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosVentaProductosList }
     *     
     */
    public void setPedidosVentaProductosList(PedidosVentaProductosList value) {
        this.pedidosVentaProductosList = value;
    }

}
