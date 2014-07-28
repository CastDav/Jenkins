
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
     * Gets the value of the loginWebList property.
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
     * Sets the value of the loginWebList property.
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
