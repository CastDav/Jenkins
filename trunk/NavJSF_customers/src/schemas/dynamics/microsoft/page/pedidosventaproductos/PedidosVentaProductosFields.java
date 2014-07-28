
package schemas.dynamics.microsoft.page.pedidosventaproductos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PedidosVentaProductos_Fields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PedidosVentaProductos_Fields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Type"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Description"/>
 *     &lt;enumeration value="Shipment_Date"/>
 *     &lt;enumeration value="Sell_to_Customer_No"/>
 *     &lt;enumeration value="Document_No"/>
 *     &lt;enumeration value="Currency_Code"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="Outstanding_Quantity"/>
 *     &lt;enumeration value="Unit_of_Measure_Code"/>
 *     &lt;enumeration value="Work_Type_Code"/>
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="Unit_Price"/>
 *     &lt;enumeration value="lineNo"/>
 *     &lt;enumeration value="Line_Discount_Percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PedidosVentaProductos_Fields")
@XmlEnum
public enum PedidosVentaProductosFields {

    @XmlEnumValue("Type")
    TYPE("Type"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("Shipment_Date")
    SHIPMENT_DATE("Shipment_Date"),
    @XmlEnumValue("Sell_to_Customer_No")
    SELL_TO_CUSTOMER_NO("Sell_to_Customer_No"),
    @XmlEnumValue("Document_No")
    DOCUMENT_NO("Document_No"),
    @XmlEnumValue("Currency_Code")
    CURRENCY_CODE("Currency_Code"),
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity"),
    @XmlEnumValue("Outstanding_Quantity")
    OUTSTANDING_QUANTITY("Outstanding_Quantity"),
    @XmlEnumValue("Unit_of_Measure_Code")
    UNIT_OF_MEASURE_CODE("Unit_of_Measure_Code"),
    @XmlEnumValue("Work_Type_Code")
    WORK_TYPE_CODE("Work_Type_Code"),
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("Unit_Price")
    UNIT_PRICE("Unit_Price"),
    @XmlEnumValue("lineNo")
    LINE_NO("lineNo"),
    @XmlEnumValue("Line_Discount_Percent")
    LINE_DISCOUNT_PERCENT("Line_Discount_Percent");
    private final String value;

    PedidosVentaProductosFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PedidosVentaProductosFields fromValue(String v) {
        for (PedidosVentaProductosFields c: PedidosVentaProductosFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
