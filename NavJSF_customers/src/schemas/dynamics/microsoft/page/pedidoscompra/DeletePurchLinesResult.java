
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
 *         &lt;element name="Delete_PurchLines_Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deletePurchLinesResult"
})
@XmlRootElement(name = "Delete_PurchLines_Result")
public class DeletePurchLinesResult {

    @XmlElement(name = "Delete_PurchLines_Result")
    protected boolean deletePurchLinesResult;

    /**
     * Obtiene el valor de la propiedad deletePurchLinesResult.
     * 
     */
    public boolean isDeletePurchLinesResult() {
        return deletePurchLinesResult;
    }

    /**
     * Define el valor de la propiedad deletePurchLinesResult.
     * 
     */
    public void setDeletePurchLinesResult(boolean value) {
        this.deletePurchLinesResult = value;
    }

}
