
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
 *         &lt;element name="PurchLines_Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "purchLinesKey"
})
@XmlRootElement(name = "Delete_PurchLines")
public class DeletePurchLines {

    @XmlElement(name = "PurchLines_Key", required = true)
    protected String purchLinesKey;

    /**
     * Obtiene el valor de la propiedad purchLinesKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchLinesKey() {
        return purchLinesKey;
    }

    /**
     * Define el valor de la propiedad purchLinesKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchLinesKey(String value) {
        this.purchLinesKey = value;
    }

}
