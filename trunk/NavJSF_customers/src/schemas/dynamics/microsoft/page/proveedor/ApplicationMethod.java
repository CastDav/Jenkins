
package schemas.dynamics.microsoft.page.proveedor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Application_Method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Application_Method">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Apply_to_Oldest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Application_Method")
@XmlEnum
public enum ApplicationMethod {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Apply_to_Oldest")
    APPLY_TO_OLDEST("Apply_to_Oldest");
    private final String value;

    ApplicationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationMethod fromValue(String v) {
        for (ApplicationMethod c: ApplicationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
