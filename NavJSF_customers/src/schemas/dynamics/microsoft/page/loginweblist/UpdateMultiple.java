
package schemas.dynamics.microsoft.page.loginweblist;

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
 *         &lt;element name="LoginWebList_List" type="{urn:microsoft-dynamics-schemas/page/loginweblist}LoginWebList_List"/>
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
    "loginWebListList"
})
@XmlRootElement(name = "UpdateMultiple")
public class UpdateMultiple {

    @XmlElement(name = "LoginWebList_List", required = true)
    protected LoginWebListList loginWebListList;

    /**
     * Obtiene el valor de la propiedad loginWebListList.
     * 
     * @return
     *     possible object is
     *     {@link LoginWebListList }
     *     
     */
    public LoginWebListList getLoginWebListList() {
        return loginWebListList;
    }

    /**
     * Define el valor de la propiedad loginWebListList.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginWebListList }
     *     
     */
    public void setLoginWebListList(LoginWebListList value) {
        this.loginWebListList = value;
    }

}
