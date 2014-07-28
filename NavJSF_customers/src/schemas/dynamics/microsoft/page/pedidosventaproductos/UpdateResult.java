
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
 *         &lt;element name="PedidosVentaProductos" type="{urn:microsoft-dynamics-schemas/page/pedidosventaproductos}PedidosVentaProductos"/>
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
    "pedidosVentaProductos"
})
@XmlRootElement(name = "Update_Result")
public class UpdateResult {

    @XmlElement(name = "PedidosVentaProductos", required = true)
    protected PedidosVentaProductos pedidosVentaProductos;

    /**
     * Gets the value of the pedidosVentaProductos property.
     * 
     * @return
     *     possible object is
     *     {@link PedidosVentaProductos }
     *     
     */
    public PedidosVentaProductos getPedidosVentaProductos() {
        return pedidosVentaProductos;
    }

    /**
     * Sets the value of the pedidosVentaProductos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosVentaProductos }
     *     
     */
    public void setPedidosVentaProductos(PedidosVentaProductos value) {
        this.pedidosVentaProductos = value;
    }

}
