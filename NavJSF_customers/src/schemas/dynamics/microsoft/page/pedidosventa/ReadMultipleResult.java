
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
 *         &lt;element name="ReadMultiple_Result" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}PedidosVenta_List" minOccurs="0"/>
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
    "readMultipleResult"
})
@XmlRootElement(name = "ReadMultiple_Result")
public class ReadMultipleResult {

    @XmlElement(name = "ReadMultiple_Result")
    protected PedidosVentaList readMultipleResult;

    /**
     * Obtiene el valor de la propiedad readMultipleResult.
     * 
     * @return
     *     possible object is
     *     {@link PedidosVentaList }
     *     
     */
    public PedidosVentaList getReadMultipleResult() {
        return readMultipleResult;
    }

    /**
     * Define el valor de la propiedad readMultipleResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidosVentaList }
     *     
     */
    public void setReadMultipleResult(PedidosVentaList value) {
        this.readMultipleResult = value;
    }

}
