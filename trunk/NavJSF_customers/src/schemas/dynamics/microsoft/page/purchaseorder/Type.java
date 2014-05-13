
package schemas.dynamics.microsoft.page.purchaseorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_blank_"/>
 *     &lt;enumeration value="G_L_Account"/>
 *     &lt;enumeration value="Item"/>
 *     &lt;enumeration value="Fixed_Asset"/>
 *     &lt;enumeration value="Charge_Item"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Type")
@XmlEnum
public enum Type {

    @XmlEnumValue("_blank_")
    BLANK("_blank_"),
    @XmlEnumValue("G_L_Account")
    G_L_ACCOUNT("G_L_Account"),
    @XmlEnumValue("Item")
    ITEM("Item"),
    @XmlEnumValue("Fixed_Asset")
    FIXED_ASSET("Fixed_Asset"),
    @XmlEnumValue("Charge_Item")
    CHARGE_ITEM("Charge_Item");
    private final String value;

    Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type fromValue(String v) {
        for (Type c: Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
