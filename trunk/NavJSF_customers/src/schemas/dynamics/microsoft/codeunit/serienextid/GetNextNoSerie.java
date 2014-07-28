
package schemas.dynamics.microsoft.codeunit.serienextid;

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
 *         &lt;element name="noSeriesCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "noSeriesCode"
})
@XmlRootElement(name = "GetNextNoSerie")
public class GetNextNoSerie {

    @XmlElement(required = true)
    protected String noSeriesCode;

    /**
     * Gets the value of the noSeriesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSeriesCode() {
        return noSeriesCode;
    }

    /**
     * Sets the value of the noSeriesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSeriesCode(String value) {
        this.noSeriesCode = value;
    }

}
