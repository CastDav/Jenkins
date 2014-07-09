
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
 *         &lt;element name="LoginWebList" type="{urn:microsoft-dynamics-schemas/page/loginweblist}LoginWebList" minOccurs="0"/>
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
    "loginWebList"
})
@XmlRootElement(name = "Read_Result")
public class ReadResult {

    @XmlElement(name = "LoginWebList")
    protected LoginWebList loginWebList;

    /**
     * Obtiene el valor de la propiedad loginWebList.
     * 
     * @return
     *     possible object is
     *     {@link LoginWebList }
     *     
     */
    public LoginWebList getLoginWebList() {
        return loginWebList;
    }

    /**
     * Define el valor de la propiedad loginWebList.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginWebList }
     *     
     */
    public void setLoginWebList(LoginWebList value) {
        this.loginWebList = value;
    }

}
