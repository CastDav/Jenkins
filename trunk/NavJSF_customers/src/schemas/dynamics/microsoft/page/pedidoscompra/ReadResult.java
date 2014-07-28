
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
 *         &lt;element name="PedidosCompra" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}PedidosCompra" minOccurs="0"/>
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
    "pedidosCompra"
})
@XmlRootElement(name = "Read_Result")
public class ReadResult {

    @XmlElement(name = "PedidosCompra")
    protected PedidosCompra pedidosCompra;

    /**
     * Gets the value of the pedidosCompra property.
     * 
     * @return
     *     possible object is
     *     {@link PedidosCompra }
     *     
     */
    public PedidosCompra getPedidosCompra() {
        return pedidosCompra;
    }

    /**
     * Sets the value of the pedidosCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosCompra }
     *     
     */
    public void setPedidosCompra(PedidosCompra value) {
        this.pedidosCompra = value;
    }

}
