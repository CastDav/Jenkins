
package schemas.dynamics.microsoft.page.pedidoscompra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedidosCompra_List complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PedidosCompra_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PedidosCompra" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}PedidosCompra" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidosCompra_List", propOrder = {
    "pedidosCompra"
})
public class PedidosCompraList {

    @XmlElement(name = "PedidosCompra", required = true)
    protected List<PedidosCompra> pedidosCompra;

    /**
     * Gets the value of the pedidosCompra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedidosCompra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedidosCompra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidosCompra }
     * 
     * 
     */
    public List<PedidosCompra> getPedidosCompra() {
        if (pedidosCompra == null) {
            pedidosCompra = new ArrayList<PedidosCompra>();
        }
        return this.pedidosCompra;
    }

}
