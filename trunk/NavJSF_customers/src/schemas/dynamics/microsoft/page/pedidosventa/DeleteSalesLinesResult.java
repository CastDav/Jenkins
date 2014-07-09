
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
 *         &lt;element name="Delete_SalesLines_Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deleteSalesLinesResult"
})
@XmlRootElement(name = "Delete_SalesLines_Result")
public class DeleteSalesLinesResult {

    @XmlElement(name = "Delete_SalesLines_Result")
    protected boolean deleteSalesLinesResult;

    /**
     * Obtiene el valor de la propiedad deleteSalesLinesResult.
     * 
     */
    public boolean isDeleteSalesLinesResult() {
        return deleteSalesLinesResult;
    }

    /**
     * Define el valor de la propiedad deleteSalesLinesResult.
     * 
     */
    public void setDeleteSalesLinesResult(boolean value) {
        this.deleteSalesLinesResult = value;
    }

}
