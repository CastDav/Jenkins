
package schemas.dynamics.microsoft.page.pedidosventa;

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
 *         &lt;element name="PedidosVenta_List" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}PedidosVenta_List"/>
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
    "pedidosVentaList"
})
@XmlRootElement(name = "UpdateMultiple")
public class UpdateMultiple {

    @XmlElement(name = "PedidosVenta_List", required = true)
    protected PedidosVentaList pedidosVentaList;

    /**
     * Gets the value of the pedidosVentaList property.
     * 
     * @return
     *     possible object is
     *     {@link PedidosVentaList }
     *     
     */
    public PedidosVentaList getPedidosVentaList() {
        return pedidosVentaList;
    }

    /**
     * Sets the value of the pedidosVentaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosVentaList }
     *     
     */
    public void setPedidosVentaList(PedidosVentaList value) {
        this.pedidosVentaList = value;
    }

}
