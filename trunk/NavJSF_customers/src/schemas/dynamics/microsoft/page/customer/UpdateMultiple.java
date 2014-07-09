
package schemas.dynamics.microsoft.page.customer;

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
 *         &lt;element name="Customer_List" type="{urn:microsoft-dynamics-schemas/page/customer}Customer_List"/>
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
    "customerList"
})
@XmlRootElement(name = "UpdateMultiple")
public class UpdateMultiple {

    @XmlElement(name = "Customer_List", required = true)
    protected CustomerList customerList;

    /**
     * Obtiene el valor de la propiedad customerList.
     * 
     * @return
     *     possible object is
     *     {@link CustomerList }
     *     
     */
    public CustomerList getCustomerList() {
        return customerList;
    }

    /**
     * Define el valor de la propiedad customerList.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerList }
     *     
     */
    public void setCustomerList(CustomerList value) {
        this.customerList = value;
    }

}
