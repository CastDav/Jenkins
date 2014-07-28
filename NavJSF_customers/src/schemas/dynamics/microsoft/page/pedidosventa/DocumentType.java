
package schemas.dynamics.microsoft.page.pedidosventa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Quote"/>
 *     &lt;enumeration value="Order"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Credit_Memo"/>
 *     &lt;enumeration value="Blanket_Order"/>
 *     &lt;enumeration value="Return_Order"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType")
@XmlEnum
public enum DocumentType {

    @XmlEnumValue("Quote")
    QUOTE("Quote"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Credit_Memo")
    CREDIT_MEMO("Credit_Memo"),
    @XmlEnumValue("Blanket_Order")
    BLANKET_ORDER("Blanket_Order"),
    @XmlEnumValue("Return_Order")
    RETURN_ORDER("Return_Order");
    private final String value;

    DocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentType fromValue(String v) {
        for (DocumentType c: DocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
