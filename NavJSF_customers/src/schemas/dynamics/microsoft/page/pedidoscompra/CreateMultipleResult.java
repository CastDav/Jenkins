
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
 *         &lt;element name="PedidosCompra_List" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}PedidosCompra_List"/>
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
    "pedidosCompraList"
})
@XmlRootElement(name = "CreateMultiple_Result")
public class CreateMultipleResult {

    @XmlElement(name = "PedidosCompra_List", required = true)
    protected PedidosCompraList pedidosCompraList;

    /**
     * Gets the value of the pedidosCompraList property.
     * 
     * @return
     *     possible object is
     *     {@link PedidosCompraList }
     *     
     */
    public PedidosCompraList getPedidosCompraList() {
        return pedidosCompraList;
    }

    /**
     * Sets the value of the pedidosCompraList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosCompraList }
     *     
     */
    public void setPedidosCompraList(PedidosCompraList value) {
        this.pedidosCompraList = value;
    }

}
