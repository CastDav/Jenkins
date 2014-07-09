
package schemas.dynamics.microsoft.page.pedidoscompra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad pedidosCompraList.
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
     * Define el valor de la propiedad pedidosCompraList.
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
