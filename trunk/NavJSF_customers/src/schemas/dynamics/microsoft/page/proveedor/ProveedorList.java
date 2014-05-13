
package schemas.dynamics.microsoft.page.proveedor;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proveedor_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Proveedor_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Proveedor" type="{urn:microsoft-dynamics-schemas/page/proveedor}Proveedor" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proveedor_List", propOrder = {
    "proveedor"
})
public class ProveedorList {

    @XmlElement(name = "Proveedor", required = true)
    protected List<Proveedor> proveedor;

    /**
     * Gets the value of the proveedor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proveedor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProveedor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Proveedor }
     * 
     * 
     */
    public List<Proveedor> getProveedor() {
        if (proveedor == null) {
            proveedor = new ArrayList<Proveedor>();
        }
        return this.proveedor;
    }

}
