
package schemas.dynamics.microsoft.page.pedidosventa;

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
@XmlRootElement(name = "CreateMultiple_Result")
public class CreateMultipleResult {

    @XmlElement(name = "PedidosVenta_List", required = true)
    protected PedidosVentaList pedidosVentaList;

    /**
     * Obtiene el valor de la propiedad pedidosVentaList.
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
     * Define el valor de la propiedad pedidosVentaList.
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
