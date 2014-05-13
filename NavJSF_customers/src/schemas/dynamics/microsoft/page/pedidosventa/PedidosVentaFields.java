
package schemas.dynamics.microsoft.page.pedidosventa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PedidosVenta_Fields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PedidosVenta_Fields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Sell_to_Customer_No"/>
 *     &lt;enumeration value="Sell_to_Contact_No"/>
 *     &lt;enumeration value="Sell_to_Customer_Name"/>
 *     &lt;enumeration value="Sell_to_Address"/>
 *     &lt;enumeration value="Sell_to_Address_2"/>
 *     &lt;enumeration value="Sell_to_Post_Code"/>
 *     &lt;enumeration value="Sell_to_City"/>
 *     &lt;enumeration value="Sell_to_County"/>
 *     &lt;enumeration value="Sell_to_Contact"/>
 *     &lt;enumeration value="No_of_Archived_Versions"/>
 *     &lt;enumeration value="Posting_Date"/>
 *     &lt;enumeration value="Order_Date"/>
 *     &lt;enumeration value="Document_Date"/>
 *     &lt;enumeration value="Requested_Delivery_Date"/>
 *     &lt;enumeration value="Promised_Delivery_Date"/>
 *     &lt;enumeration value="Quote_No"/>
 *     &lt;enumeration value="External_Document_No"/>
 *     &lt;enumeration value="Salesperson_Code"/>
 *     &lt;enumeration value="Campaign_No"/>
 *     &lt;enumeration value="Opportunity_No"/>
 *     &lt;enumeration value="Responsibility_Center"/>
 *     &lt;enumeration value="Assigned_User_ID"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="Bill_to_Customer_No"/>
 *     &lt;enumeration value="Bill_to_Contact_No"/>
 *     &lt;enumeration value="Bill_to_Name"/>
 *     &lt;enumeration value="Bill_to_Address"/>
 *     &lt;enumeration value="Bill_to_Address_2"/>
 *     &lt;enumeration value="Bill_to_Post_Code"/>
 *     &lt;enumeration value="Bill_to_City"/>
 *     &lt;enumeration value="Bill_to_County"/>
 *     &lt;enumeration value="Bill_to_Contact"/>
 *     &lt;enumeration value="Shortcut_Dimension_1_Code"/>
 *     &lt;enumeration value="Shortcut_Dimension_2_Code"/>
 *     &lt;enumeration value="Payment_Terms_Code"/>
 *     &lt;enumeration value="Due_Date"/>
 *     &lt;enumeration value="Payment_Discount_Percent"/>
 *     &lt;enumeration value="Pmt_Discount_Date"/>
 *     &lt;enumeration value="Payment_Method_Code"/>
 *     &lt;enumeration value="Prices_Including_VAT"/>
 *     &lt;enumeration value="VAT_Bus_Posting_Group"/>
 *     &lt;enumeration value="Credit_Card_No"/>
 *     &lt;enumeration value="GetCreditcardNumber"/>
 *     &lt;enumeration value="Ship_to_Code"/>
 *     &lt;enumeration value="Ship_to_Name"/>
 *     &lt;enumeration value="Ship_to_Address"/>
 *     &lt;enumeration value="Ship_to_Address_2"/>
 *     &lt;enumeration value="Ship_to_Post_Code"/>
 *     &lt;enumeration value="Ship_to_City"/>
 *     &lt;enumeration value="Ship_to_County"/>
 *     &lt;enumeration value="Ship_to_Contact"/>
 *     &lt;enumeration value="Location_Code"/>
 *     &lt;enumeration value="Outbound_Whse_Handling_Time"/>
 *     &lt;enumeration value="Shipment_Method_Code"/>
 *     &lt;enumeration value="Shipping_Agent_Code"/>
 *     &lt;enumeration value="Shipping_Agent_Service_Code"/>
 *     &lt;enumeration value="Shipping_Time"/>
 *     &lt;enumeration value="Late_Order_Shipping"/>
 *     &lt;enumeration value="Package_Tracking_No"/>
 *     &lt;enumeration value="Shipment_Date"/>
 *     &lt;enumeration value="Shipping_Advice"/>
 *     &lt;enumeration value="Pay_at_Code"/>
 *     &lt;enumeration value="Cust_Bank_Acc_Code"/>
 *     &lt;enumeration value="Currency_Code"/>
 *     &lt;enumeration value="EU_3_Party_Trade"/>
 *     &lt;enumeration value="Transaction_Type"/>
 *     &lt;enumeration value="Transaction_Specification"/>
 *     &lt;enumeration value="Transport_Method"/>
 *     &lt;enumeration value="Exit_Point"/>
 *     &lt;enumeration value="Area"/>
 *     &lt;enumeration value="BizTalk_Sales_Order"/>
 *     &lt;enumeration value="Date_Received"/>
 *     &lt;enumeration value="Time_Received"/>
 *     &lt;enumeration value="BizTalk_Sales_Order_Cnfmn"/>
 *     &lt;enumeration value="Date_Sent"/>
 *     &lt;enumeration value="Time_Sent"/>
 *     &lt;enumeration value="Customer_Order_No"/>
 *     &lt;enumeration value="Prepayment_Percent"/>
 *     &lt;enumeration value="Compress_Prepayment"/>
 *     &lt;enumeration value="Prepmt_Payment_Terms_Code"/>
 *     &lt;enumeration value="Prepayment_Due_Date"/>
 *     &lt;enumeration value="Prepmt_Payment_Discount_Percent"/>
 *     &lt;enumeration value="Prepmt_Pmt_Discount_Date"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PedidosVenta_Fields")
@XmlEnum
public enum PedidosVentaFields {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Sell_to_Customer_No")
    SELL_TO_CUSTOMER_NO("Sell_to_Customer_No"),
    @XmlEnumValue("Sell_to_Contact_No")
    SELL_TO_CONTACT_NO("Sell_to_Contact_No"),
    @XmlEnumValue("Sell_to_Customer_Name")
    SELL_TO_CUSTOMER_NAME("Sell_to_Customer_Name"),
    @XmlEnumValue("Sell_to_Address")
    SELL_TO_ADDRESS("Sell_to_Address"),
    @XmlEnumValue("Sell_to_Address_2")
    SELL_TO_ADDRESS_2("Sell_to_Address_2"),
    @XmlEnumValue("Sell_to_Post_Code")
    SELL_TO_POST_CODE("Sell_to_Post_Code"),
    @XmlEnumValue("Sell_to_City")
    SELL_TO_CITY("Sell_to_City"),
    @XmlEnumValue("Sell_to_County")
    SELL_TO_COUNTY("Sell_to_County"),
    @XmlEnumValue("Sell_to_Contact")
    SELL_TO_CONTACT("Sell_to_Contact"),
    @XmlEnumValue("No_of_Archived_Versions")
    NO_OF_ARCHIVED_VERSIONS("No_of_Archived_Versions"),
    @XmlEnumValue("Posting_Date")
    POSTING_DATE("Posting_Date"),
    @XmlEnumValue("Order_Date")
    ORDER_DATE("Order_Date"),
    @XmlEnumValue("Document_Date")
    DOCUMENT_DATE("Document_Date"),
    @XmlEnumValue("Requested_Delivery_Date")
    REQUESTED_DELIVERY_DATE("Requested_Delivery_Date"),
    @XmlEnumValue("Promised_Delivery_Date")
    PROMISED_DELIVERY_DATE("Promised_Delivery_Date"),
    @XmlEnumValue("Quote_No")
    QUOTE_NO("Quote_No"),
    @XmlEnumValue("External_Document_No")
    EXTERNAL_DOCUMENT_NO("External_Document_No"),
    @XmlEnumValue("Salesperson_Code")
    SALESPERSON_CODE("Salesperson_Code"),
    @XmlEnumValue("Campaign_No")
    CAMPAIGN_NO("Campaign_No"),
    @XmlEnumValue("Opportunity_No")
    OPPORTUNITY_NO("Opportunity_No"),
    @XmlEnumValue("Responsibility_Center")
    RESPONSIBILITY_CENTER("Responsibility_Center"),
    @XmlEnumValue("Assigned_User_ID")
    ASSIGNED_USER_ID("Assigned_User_ID"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Bill_to_Customer_No")
    BILL_TO_CUSTOMER_NO("Bill_to_Customer_No"),
    @XmlEnumValue("Bill_to_Contact_No")
    BILL_TO_CONTACT_NO("Bill_to_Contact_No"),
    @XmlEnumValue("Bill_to_Name")
    BILL_TO_NAME("Bill_to_Name"),
    @XmlEnumValue("Bill_to_Address")
    BILL_TO_ADDRESS("Bill_to_Address"),
    @XmlEnumValue("Bill_to_Address_2")
    BILL_TO_ADDRESS_2("Bill_to_Address_2"),
    @XmlEnumValue("Bill_to_Post_Code")
    BILL_TO_POST_CODE("Bill_to_Post_Code"),
    @XmlEnumValue("Bill_to_City")
    BILL_TO_CITY("Bill_to_City"),
    @XmlEnumValue("Bill_to_County")
    BILL_TO_COUNTY("Bill_to_County"),
    @XmlEnumValue("Bill_to_Contact")
    BILL_TO_CONTACT("Bill_to_Contact"),
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
    @XmlEnumValue("Prices_Including_VAT")
    PRICES_INCLUDING_VAT("Prices_Including_VAT"),
    @XmlEnumValue("VAT_Bus_Posting_Group")
    VAT_BUS_POSTING_GROUP("VAT_Bus_Posting_Group"),
    @XmlEnumValue("Credit_Card_No")
    CREDIT_CARD_NO("Credit_Card_No"),
    @XmlEnumValue("GetCreditcardNumber")
    GET_CREDITCARD_NUMBER("GetCreditcardNumber"),
    @XmlEnumValue("Ship_to_Code")
    SHIP_TO_CODE("Ship_to_Code"),
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
    @XmlEnumValue("Outbound_Whse_Handling_Time")
    OUTBOUND_WHSE_HANDLING_TIME("Outbound_Whse_Handling_Time"),
    @XmlEnumValue("Shipment_Method_Code")
    SHIPMENT_METHOD_CODE("Shipment_Method_Code"),
    @XmlEnumValue("Shipping_Agent_Code")
    SHIPPING_AGENT_CODE("Shipping_Agent_Code"),
    @XmlEnumValue("Shipping_Agent_Service_Code")
    SHIPPING_AGENT_SERVICE_CODE("Shipping_Agent_Service_Code"),
    @XmlEnumValue("Shipping_Time")
    SHIPPING_TIME("Shipping_Time"),
    @XmlEnumValue("Late_Order_Shipping")
    LATE_ORDER_SHIPPING("Late_Order_Shipping"),
    @XmlEnumValue("Package_Tracking_No")
    PACKAGE_TRACKING_NO("Package_Tracking_No"),
    @XmlEnumValue("Shipment_Date")
    SHIPMENT_DATE("Shipment_Date"),
    @XmlEnumValue("Shipping_Advice")
    SHIPPING_ADVICE("Shipping_Advice"),
    @XmlEnumValue("Pay_at_Code")
    PAY_AT_CODE("Pay_at_Code"),
    @XmlEnumValue("Cust_Bank_Acc_Code")
    CUST_BANK_ACC_CODE("Cust_Bank_Acc_Code"),
    @XmlEnumValue("Currency_Code")
    CURRENCY_CODE("Currency_Code"),
    @XmlEnumValue("EU_3_Party_Trade")
    EU_3_PARTY_TRADE("EU_3_Party_Trade"),
    @XmlEnumValue("Transaction_Type")
    TRANSACTION_TYPE("Transaction_Type"),
    @XmlEnumValue("Transaction_Specification")
    TRANSACTION_SPECIFICATION("Transaction_Specification"),
    @XmlEnumValue("Transport_Method")
    TRANSPORT_METHOD("Transport_Method"),
    @XmlEnumValue("Exit_Point")
    EXIT_POINT("Exit_Point"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("BizTalk_Sales_Order")
    BIZ_TALK_SALES_ORDER("BizTalk_Sales_Order"),
    @XmlEnumValue("Date_Received")
    DATE_RECEIVED("Date_Received"),
    @XmlEnumValue("Time_Received")
    TIME_RECEIVED("Time_Received"),
    @XmlEnumValue("BizTalk_Sales_Order_Cnfmn")
    BIZ_TALK_SALES_ORDER_CNFMN("BizTalk_Sales_Order_Cnfmn"),
    @XmlEnumValue("Date_Sent")
    DATE_SENT("Date_Sent"),
    @XmlEnumValue("Time_Sent")
    TIME_SENT("Time_Sent"),
    @XmlEnumValue("Customer_Order_No")
    CUSTOMER_ORDER_NO("Customer_Order_No"),
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
    PREPMT_PMT_DISCOUNT_DATE("Prepmt_Pmt_Discount_Date");
    private final String value;

    PedidosVentaFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PedidosVentaFields fromValue(String v) {
        for (PedidosVentaFields c: PedidosVentaFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
