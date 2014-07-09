
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
 *         &lt;element name="PedidosVenta" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}PedidosVenta" minOccurs="0"/>
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
    "pedidosVenta"
})
@XmlRootElement(name = "Read_Result")
public class ReadResult {

    @XmlElement(name = "PedidosVenta")
    protected PedidosVenta pedidosVenta;

    /**
     * Obtiene el valor de la propiedad pedidosVenta.
     * 
     * @return
     *     possible object is
     *     {@link PedidosVenta }
     *     
     */
    public PedidosVenta getPedidosVenta() {
        return pedidosVenta;
    }

    /**
     * Define el valor de la propiedad pedidosVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosVenta }
     *     
     */
    public void setPedidosVenta(PedidosVenta value) {
        this.pedidosVenta = value;
    }

}
