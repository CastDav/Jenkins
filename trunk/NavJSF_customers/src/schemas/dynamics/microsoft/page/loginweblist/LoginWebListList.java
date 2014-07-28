
package schemas.dynamics.microsoft.page.loginweblist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginWebList_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginWebList_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginWebList" type="{urn:microsoft-dynamics-schemas/page/loginweblist}LoginWebList" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginWebList_List", propOrder = {
    "loginWebList"
})
public class LoginWebListList {

    @XmlElement(name = "LoginWebList", required = true)
    protected List<LoginWebList> loginWebList;

    /**
     * Gets the value of the loginWebList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loginWebList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoginWebList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoginWebList }
     * 
     * 
     */
    public List<LoginWebList> getLoginWebList() {
        if (loginWebList == null) {
            loginWebList = new ArrayList<LoginWebList>();
        }
        return this.loginWebList;
    }

}
