
package schemas.dynamics.microsoft.page.productos;

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
 *         &lt;element name="Productos" type="{urn:microsoft-dynamics-schemas/page/productos}Productos" minOccurs="0"/>
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
    "productos"
})
@XmlRootElement(name = "ReadByRecId_Result")
public class ReadByRecIdResult {

    @XmlElement(name = "Productos")
    protected Productos productos;

    /**
     * Gets the value of the productos property.
     * 
     * @return
     *     possible object is
     *     {@link Productos }
     *     
     */
    public Productos getProductos() {
        return productos;
    }

    /**
     * Sets the value of the productos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Productos }
     *     
     */
    public void setProductos(Productos value) {
        this.productos = value;
    }

}