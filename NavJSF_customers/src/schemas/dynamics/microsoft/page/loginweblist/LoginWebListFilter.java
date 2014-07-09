
package schemas.dynamics.microsoft.page.loginweblist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoginWebList_Filter complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoginWebList_Filter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field" type="{urn:microsoft-dynamics-schemas/page/loginweblist}LoginWebList_Fields"/>
 *         &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginWebList_Filter", propOrder = {
    "field",
    "criteria"
})
public class LoginWebListFilter {

    @XmlElement(name = "Field", required = true)
    @XmlSchemaType(name = "string")
    protected LoginWebListFields field;
    @XmlElement(name = "Criteria", required = true)
    protected String criteria;

    /**
     * Obtiene el valor de la propiedad field.
     * 
     * @return
     *     possible object is
     *     {@link LoginWebListFields }
     *     
     */
    public LoginWebListFields getField() {
        return field;
    }

    /**
     * Define el valor de la propiedad field.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginWebListFields }
     *     
     */
    public void setField(LoginWebListFields value) {
        this.field = value;
    }

    /**
     * Obtiene el valor de la propiedad criteria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Define el valor de la propiedad criteria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

}
