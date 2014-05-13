
package schemas.dynamics.microsoft.page.supplier;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Blocked.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Blocked">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_blank_"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Blocked")
@XmlEnum
public enum Blocked {

    @XmlEnumValue("_blank_")
    BLANK("_blank_"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    Blocked(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Blocked fromValue(String v) {
        for (Blocked c: Blocked.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
