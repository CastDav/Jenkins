
package schemas.dynamics.microsoft.page.pedidosventa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shipping_Advice.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Shipping_Advice">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Partial"/>
 *     &lt;enumeration value="Complete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Shipping_Advice")
@XmlEnum
public enum ShippingAdvice {

    @XmlEnumValue("Partial")
    PARTIAL("Partial"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete");
    private final String value;

    ShippingAdvice(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingAdvice fromValue(String v) {
        for (ShippingAdvice c: ShippingAdvice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
