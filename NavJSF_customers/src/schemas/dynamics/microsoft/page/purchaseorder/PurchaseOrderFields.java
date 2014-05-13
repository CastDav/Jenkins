
package schemas.dynamics.microsoft.page.purchaseorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrder_Fields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseOrder_Fields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Type"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Description"/>
 *     &lt;enumeration value="Expected_Receipt_Date"/>
 *     &lt;enumeration value="Buy_from_Vendor_No"/>
 *     &lt;enumeration value="Document_No"/>
 *     &lt;enumeration value="Currency_Code"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="Outstanding_Quantity"/>
 *     &lt;enumeration value="Unit_of_Measure_Code"/>
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="Direct_Unit_Cost"/>
 *     &lt;enumeration value="Line_Discount_Percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrder_Fields")
@XmlEnum
public enum PurchaseOrderFields {

    @XmlEnumValue("Type")
    TYPE("Type"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("Expected_Receipt_Date")
    EXPECTED_RECEIPT_DATE("Expected_Receipt_Date"),
    @XmlEnumValue("Buy_from_Vendor_No")
    BUY_FROM_VENDOR_NO("Buy_from_Vendor_No"),
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
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("Direct_Unit_Cost")
    DIRECT_UNIT_COST("Direct_Unit_Cost"),
    @XmlEnumValue("Line_Discount_Percent")
    LINE_DISCOUNT_PERCENT("Line_Discount_Percent");
    private final String value;

    PurchaseOrderFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseOrderFields fromValue(String v) {
        for (PurchaseOrderFields c: PurchaseOrderFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
