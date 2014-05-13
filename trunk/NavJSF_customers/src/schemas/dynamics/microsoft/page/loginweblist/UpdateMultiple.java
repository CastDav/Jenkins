
package schemas.dynamics.microsoft.page.loginweblist;

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
     * Gets the value of the loginWebListList property.
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
     * Sets the value of the loginWebListList property.
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
