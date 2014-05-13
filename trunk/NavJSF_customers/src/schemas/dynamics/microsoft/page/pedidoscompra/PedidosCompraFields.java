
package schemas.dynamics.microsoft.page.pedidoscompra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PedidosCompra_Fields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PedidosCompra_Fields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Buy_from_Vendor_No"/>
 *     &lt;enumeration value="Buy_from_Contact_No"/>
 *     &lt;enumeration value="Buy_from_Vendor_Name"/>
 *     &lt;enumeration value="Buy_from_Address"/>
 *     &lt;enumeration value="Buy_from_Address_2"/>
 *     &lt;enumeration value="Buy_from_Post_Code"/>
 *     &lt;enumeration value="Buy_from_City"/>
 *     &lt;enumeration value="Buy_from_County"/>
 *     &lt;enumeration value="Buy_from_Contact"/>
 *     &lt;enumeration value="No_of_Archived_Versions"/>
 *     &lt;enumeration value="Posting_Date"/>
 *     &lt;enumeration value="Order_Date"/>
 *     &lt;enumeration value="Document_Date"/>
 *     &lt;enumeration value="Quote_No"/>
 *     &lt;enumeration value="Vendor_Order_No"/>
 *     &lt;enumeration value="Vendor_Shipment_No"/>
 *     &lt;enumeration value="Vendor_Invoice_No"/>
 *     &lt;enumeration value="Order_Address_Code"/>
 *     &lt;enumeration value="Purchaser_Code"/>
 *     &lt;enumeration value="Responsibility_Center"/>
 *     &lt;enumeration value="Assigned_User_ID"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="Pay_to_Vendor_No"/>
 *     &lt;enumeration value="Pay_to_Contact_No"/>
 *     &lt;enumeration value="Pay_to_Name"/>
 *     &lt;enumeration value="Pay_to_Address"/>
 *     &lt;enumeration value="Pay_to_Address_2"/>
 *     &lt;enumeration value="Pay_to_Post_Code"/>
 *     &lt;enumeration value="Pay_to_City"/>
 *     &lt;enumeration value="Pay_to_County"/>
 *     &lt;enumeration value="Pay_to_Contact"/>
 *     &lt;enumeration value="Shortcut_Dimension_1_Code"/>
 *     &lt;enumeration value="Shortcut_Dimension_2_Code"/>
 *     &lt;enumeration value="Payment_Terms_Code"/>
 *     &lt;enumeration value="Due_Date"/>
 *     &lt;enumeration value="Payment_Discount_Percent"/>
 *     &lt;enumeration value="Pmt_Discount_Date"/>
 *     &lt;enumeration value="Payment_Method_Code"/>
 *     &lt;enumeration value="On_Hold"/>
 *     &lt;enumeration value="Prices_Including_VAT"/>
 *     &lt;enumeration value="VAT_Bus_Posting_Group"/>
 *     &lt;enumeration value="Ship_to_Name"/>
 *     &lt;enumeration value="Ship_to_Address"/>
 *     &lt;enumeration value="Ship_to_Address_2"/>
 *     &lt;enumeration value="Ship_to_Post_Code"/>
 *     &lt;enumeration value="Ship_to_City"/>
 *     &lt;enumeration value="Ship_to_County"/>
 *     &lt;enumeration value="Ship_to_Contact"/>
 *     &lt;enumeration value="Location_Code"/>
 *     &lt;enumeration value="Inbound_Whse_Handling_Time"/>
 *     &lt;enumeration value="Shipment_Method_Code"/>
 *     &lt;enumeration value="Lead_Time_Calculation"/>
 *     &lt;enumeration value="Requested_Receipt_Date"/>
 *     &lt;enumeration value="Promised_Receipt_Date"/>
 *     &lt;enumeration value="Expected_Receipt_Date"/>
 *     &lt;enumeration value="Sell_to_Customer_No"/>
 *     &lt;enumeration value="Ship_to_Code"/>
 *     &lt;enumeration value="Pay_at_Code"/>
 *     &lt;enumeration value="Vendor_Bank_Acc_Code"/>
 *     &lt;enumeration value="Currency_Code"/>
 *     &lt;enumeration value="Transaction_Type"/>
 *     &lt;enumeration value="Transaction_Specification"/>
 *     &lt;enumeration value="Transport_Method"/>
 *     &lt;enumeration value="Entry_Point"/>
 *     &lt;enumeration value="Area"/>
 *     &lt;enumeration value="BizTalk_Purchase_Order"/>
 *     &lt;enumeration value="Date_Sent"/>
 *     &lt;enumeration value="Time_Sent"/>
 *     &lt;enumeration value="Vendor_Quote_No"/>
 *     &lt;enumeration value="BizTalk_Purch_Order_Cnfmn"/>
 *     &lt;enumeration value="Date_Received"/>
 *     &lt;enumeration value="Time_Received"/>
 *     &lt;enumeration value="BizTalk_Purchase_Receipt"/>
 *     &lt;enumeration value="BizTalk_Purchase_Invoice"/>
 *     &lt;enumeration value="Prepayment_Percent"/>
 *     &lt;enumeration value="Compress_Prepayment"/>
 *     &lt;enumeration value="Prepmt_Payment_Terms_Code"/>
 *     &lt;enumeration value="Prepayment_Due_Date"/>
 *     &lt;enumeration value="Prepmt_Payment_Discount_Percent"/>
 *     &lt;enumeration value="Prepmt_Pmt_Discount_Date"/>
 *     &lt;enumeration value="Vendor_Cr_Memo_No"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PedidosCompra_Fields")
@XmlEnum
public enum PedidosCompraFields {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Buy_from_Vendor_No")
    BUY_FROM_VENDOR_NO("Buy_from_Vendor_No"),
    @XmlEnumValue("Buy_from_Contact_No")
    BUY_FROM_CONTACT_NO("Buy_from_Contact_No"),
    @XmlEnumValue("Buy_from_Vendor_Name")
    BUY_FROM_VENDOR_NAME("Buy_from_Vendor_Name"),
    @XmlEnumValue("Buy_from_Address")
    BUY_FROM_ADDRESS("Buy_from_Address"),
    @XmlEnumValue("Buy_from_Address_2")
    BUY_FROM_ADDRESS_2("Buy_from_Address_2"),
    @XmlEnumValue("Buy_from_Post_Code")
    BUY_FROM_POST_CODE("Buy_from_Post_Code"),
    @XmlEnumValue("Buy_from_City")
    BUY_FROM_CITY("Buy_from_City"),
    @XmlEnumValue("Buy_from_County")
    BUY_FROM_COUNTY("Buy_from_County"),
    @XmlEnumValue("Buy_from_Contact")
    BUY_FROM_CONTACT("Buy_from_Contact"),
    @XmlEnumValue("No_of_Archived_Versions")
    NO_OF_ARCHIVED_VERSIONS("No_of_Archived_Versions"),
    @XmlEnumValue("Posting_Date")
    POSTING_DATE("Posting_Date"),
    @XmlEnumValue("Order_Date")
    ORDER_DATE("Order_Date"),
    @XmlEnumValue("Document_Date")
    DOCUMENT_DATE("Document_Date"),
    @XmlEnumValue("Quote_No")
    QUOTE_NO("Quote_No"),
    @XmlEnumValue("Vendor_Order_No")
    VENDOR_ORDER_NO("Vendor_Order_No"),
    @XmlEnumValue("Vendor_Shipment_No")
    VENDOR_SHIPMENT_NO("Vendor_Shipment_No"),
    @XmlEnumValue("Vendor_Invoice_No")
    VENDOR_INVOICE_NO("Vendor_Invoice_No"),
    @XmlEnumValue("Order_Address_Code")
    ORDER_ADDRESS_CODE("Order_Address_Code"),
    @XmlEnumValue("Purchaser_Code")
    PURCHASER_CODE("Purchaser_Code"),
    @XmlEnumValue("Responsibility_Center")
    RESPONSIBILITY_CENTER("Responsibility_Center"),
    @XmlEnumValue("Assigned_User_ID")
    ASSIGNED_USER_ID("Assigned_User_ID"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Pay_to_Vendor_No")
    PAY_TO_VENDOR_NO("Pay_to_Vendor_No"),
    @XmlEnumValue("Pay_to_Contact_No")
    PAY_TO_CONTACT_NO("Pay_to_Contact_No"),
    @XmlEnumValue("Pay_to_Name")
    PAY_TO_NAME("Pay_to_Name"),
    @XmlEnumValue("Pay_to_Address")
    PAY_TO_ADDRESS("Pay_to_Address"),
    @XmlEnumValue("Pay_to_Address_2")
    PAY_TO_ADDRESS_2("Pay_to_Address_2"),
    @XmlEnumValue("Pay_to_Post_Code")
    PAY_TO_POST_CODE("Pay_to_Post_Code"),
    @XmlEnumValue("Pay_to_City")
    PAY_TO_CITY("Pay_to_City"),
    @XmlEnumValue("Pay_to_County")
    PAY_TO_COUNTY("Pay_to_County"),
    @XmlEnumValue("Pay_to_Contact")
    PAY_TO_CONTACT("Pay_to_Contact"),
    @XmlEnumValue("Shortcut_Dimension_1_Code")
    SHORTCUT_DIMENSION_1_CODE("Shortcut_Dimension_1_Code"),
    @XmlEnumValue("Shortcut_Dimension_2_Code")
    SHORTCUT_DIMENSION_2_CODE("Shortcut_Dimension_2_Code"),
    @XmlEnumValue("Payment_Terms_Code")
    PAYMENT_TERMS_CODE("Payment_Terms_Code"),
    @XmlEnumValue("Due_Date")
    DUE_DATE("Due_Date"),
    @XmlEnumValue("Payment_Discount_Percent")
    PAYMENT_DISCOUNT_PERCENT("Payment_Discount_Percent"),
    @XmlEnumValue("Pmt_Discount_Date")
    PMT_DISCOUNT_DATE("Pmt_Discount_Date"),
    @XmlEnumValue("Payment_Method_Code")
    PAYMENT_METHOD_CODE("Payment_Method_Code"),
    @XmlEnumValue("On_Hold")
    ON_HOLD("On_Hold"),
    @XmlEnumValue("Prices_Including_VAT")
    PRICES_INCLUDING_VAT("Prices_Including_VAT"),
    @XmlEnumValue("VAT_Bus_Posting_Group")
    VAT_BUS_POSTING_GROUP("VAT_Bus_Posting_Group"),
    @XmlEnumValue("Ship_to_Name")
    SHIP_TO_NAME("Ship_to_Name"),
    @XmlEnumValue("Ship_to_Address")
    SHIP_TO_ADDRESS("Ship_to_Address"),
    @XmlEnumValue("Ship_to_Address_2")
    SHIP_TO_ADDRESS_2("Ship_to_Address_2"),
    @XmlEnumValue("Ship_to_Post_Code")
    SHIP_TO_POST_CODE("Ship_to_Post_Code"),
    @XmlEnumValue("Ship_to_City")
    SHIP_TO_CITY("Ship_to_City"),
    @XmlEnumValue("Ship_to_County")
    SHIP_TO_COUNTY("Ship_to_County"),
    @XmlEnumValue("Ship_to_Contact")
    SHIP_TO_CONTACT("Ship_to_Contact"),
    @XmlEnumValue("Location_Code")
    LOCATION_CODE("Location_Code"),
    @XmlEnumValue("Inbound_Whse_Handling_Time")
    INBOUND_WHSE_HANDLING_TIME("Inbound_Whse_Handling_Time"),
    @XmlEnumValue("Shipment_Method_Code")
    SHIPMENT_METHOD_CODE("Shipment_Method_Code"),
    @XmlEnumValue("Lead_Time_Calculation")
    LEAD_TIME_CALCULATION("Lead_Time_Calculation"),
    @XmlEnumValue("Requested_Receipt_Date")
    REQUESTED_RECEIPT_DATE("Requested_Receipt_Date"),
    @XmlEnumValue("Promised_Receipt_Date")
    PROMISED_RECEIPT_DATE("Promised_Receipt_Date"),
    @XmlEnumValue("Expected_Receipt_Date")
    EXPECTED_RECEIPT_DATE("Expected_Receipt_Date"),
    @XmlEnumValue("Sell_to_Customer_No")
    SELL_TO_CUSTOMER_NO("Sell_to_Customer_No"),
    @XmlEnumValue("Ship_to_Code")
    SHIP_TO_CODE("Ship_to_Code"),
    @XmlEnumValue("Pay_at_Code")
    PAY_AT_CODE("Pay_at_Code"),
    @XmlEnumValue("Vendor_Bank_Acc_Code")
    VENDOR_BANK_ACC_CODE("Vendor_Bank_Acc_Code"),
    @XmlEnumValue("Currency_Code")
    CURRENCY_CODE("Currency_Code"),
    @XmlEnumValue("Transaction_Type")
    TRANSACTION_TYPE("Transaction_Type"),
    @XmlEnumValue("Transaction_Specification")
    TRANSACTION_SPECIFICATION("Transaction_Specification"),
    @XmlEnumValue("Transport_Method")
    TRANSPORT_METHOD("Transport_Method"),
    @XmlEnumValue("Entry_Point")
    ENTRY_POINT("Entry_Point"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("BizTalk_Purchase_Order")
    BIZ_TALK_PURCHASE_ORDER("BizTalk_Purchase_Order"),
    @XmlEnumValue("Date_Sent")
    DATE_SENT("Date_Sent"),
    @XmlEnumValue("Time_Sent")
    TIME_SENT("Time_Sent"),
    @XmlEnumValue("Vendor_Quote_No")
    VENDOR_QUOTE_NO("Vendor_Quote_No"),
    @XmlEnumValue("BizTalk_Purch_Order_Cnfmn")
    BIZ_TALK_PURCH_ORDER_CNFMN("BizTalk_Purch_Order_Cnfmn"),
    @XmlEnumValue("Date_Received")
    DATE_RECEIVED("Date_Received"),
    @XmlEnumValue("Time_Received")
    TIME_RECEIVED("Time_Received"),
    @XmlEnumValue("BizTalk_Purchase_Receipt")
    BIZ_TALK_PURCHASE_RECEIPT("BizTalk_Purchase_Receipt"),
    @XmlEnumValue("BizTalk_Purchase_Invoice")
    BIZ_TALK_PURCHASE_INVOICE("BizTalk_Purchase_Invoice"),
    @XmlEnumValue("Prepayment_Percent")
    PREPAYMENT_PERCENT("Prepayment_Percent"),
    @XmlEnumValue("Compress_Prepayment")
    COMPRESS_PREPAYMENT("Compress_Prepayment"),
    @XmlEnumValue("Prepmt_Payment_Terms_Code")
    PREPMT_PAYMENT_TERMS_CODE("Prepmt_Payment_Terms_Code"),
    @XmlEnumValue("Prepayment_Due_Date")
    PREPAYMENT_DUE_DATE("Prepayment_Due_Date"),
    @XmlEnumValue("Prepmt_Payment_Discount_Percent")
    PREPMT_PAYMENT_DISCOUNT_PERCENT("Prepmt_Payment_Discount_Percent"),
    @XmlEnumValue("Prepmt_Pmt_Discount_Date")
    PREPMT_PMT_DISCOUNT_DATE("Prepmt_Pmt_Discount_Date"),
    @XmlEnumValue("Vendor_Cr_Memo_No")
    VENDOR_CR_MEMO_NO("Vendor_Cr_Memo_No");
    private final String value;

    PedidosCompraFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PedidosCompraFields fromValue(String v) {
        for (PedidosCompraFields c: PedidosCompraFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
