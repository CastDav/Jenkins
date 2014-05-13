
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
@XmlRootElement(name = "ReadByRecId_Result")
public class ReadByRecIdResult {

    @XmlElement(name = "PedidosVenta")
    protected PedidosVenta pedidosVenta;

    /**
     * Gets the value of the pedidosVenta property.
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
     * Sets the value of the pedidosVenta property.
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
