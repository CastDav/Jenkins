
package schemas.dynamics.microsoft.page.pedidosventa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PedidosVenta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidosVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sell_to_Customer_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sell_to_Contact_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sell_to_Customer_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sell_to_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sell_to_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sell_to_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sell_to_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sell_to_County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sell_to_Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_of_Archived_Versions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Posting_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Order_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Document_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Requested_Delivery_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Promised_Delivery_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Quote_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External_Document_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salesperson_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campaign_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Responsibility_Center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assigned_User_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}Status" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}DocumentType" minOccurs="0"/>
 *         &lt;element name="Bill_to_Customer_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_to_Contact_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_to_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_to_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_to_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_to_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_to_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_to_County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_to_Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shortcut_Dimension_1_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shortcut_Dimension_2_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payment_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Due_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Payment_Discount_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Pmt_Discount_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Payment_Method_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prices_Including_VAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VAT_Bus_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Credit_Card_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GetCreditcardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outbound_Whse_Handling_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipment_Method_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Agent_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Agent_Service_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Late_Order_Shipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Package_Tracking_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Shipping_Advice" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}Shipping_Advice" minOccurs="0"/>
 *         &lt;element name="Pay_at_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cust_Bank_Acc_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EU_3_Party_Trade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Transaction_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction_Specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transport_Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exit_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BizTalk_Sales_Order" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Date_Received" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Time_Received" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="BizTalk_Sales_Order_Cnfmn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Date_Sent" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Time_Sent" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Customer_Order_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prepayment_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Compress_Prepayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Prepmt_Payment_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prepayment_Due_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Prepmt_Payment_Discount_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Pmt_Discount_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SalesLines" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}Sales_Order_Line_List" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidosVenta", propOrder = {
    "key",
    "no",
    "sellToCustomerNo",
    "sellToContactNo",
    "sellToCustomerName",
    "sellToAddress",
    "sellToAddress2",
    "sellToPostCode",
    "sellToCity",
    "sellToCounty",
    "sellToContact",
    "noOfArchivedVersions",
    "postingDate",
    "orderDate",
    "documentDate",
    "requestedDeliveryDate",
    "promisedDeliveryDate",
    "quoteNo",
    "externalDocumentNo",
    "salespersonCode",
    "campaignNo",
    "opportunityNo",
    "responsibilityCenter",
    "assignedUserID",
    "status",
    "documentType",
    "billToCustomerNo",
    "billToContactNo",
    "billToName",
    "billToAddress",
    "billToAddress2",
    "billToPostCode",
    "billToCity",
    "billToCounty",
    "billToContact",
    "shortcutDimension1Code",
    "shortcutDimension2Code",
    "paymentTermsCode",
    "dueDate",
    "paymentDiscountPercent",
    "pmtDiscountDate",
    "paymentMethodCode",
    "pricesIncludingVAT",
    "vatBusPostingGroup",
    "creditCardNo",
    "getCreditcardNumber",
    "shipToCode",
    "shipToName",
    "shipToAddress",
    "shipToAddress2",
    "shipToPostCode",
    "shipToCity",
    "shipToCounty",
    "shipToContact",
    "locationCode",
    "outboundWhseHandlingTime",
    "shipmentMethodCode",
    "shippingAgentCode",
    "shippingAgentServiceCode",
    "shippingTime",
    "lateOrderShipping",
    "packageTrackingNo",
    "shipmentDate",
    "shippingAdvice",
    "payAtCode",
    "custBankAccCode",
    "currencyCode",
    "eu3PartyTrade",
    "transactionType",
    "transactionSpecification",
    "transportMethod",
    "exitPoint",
    "area",
    "bizTalkSalesOrder",
    "dateReceived",
    "timeReceived",
    "bizTalkSalesOrderCnfmn",
    "dateSent",
    "timeSent",
    "customerOrderNo",
    "prepaymentPercent",
    "compressPrepayment",
    "prepmtPaymentTermsCode",
    "prepaymentDueDate",
    "prepmtPaymentDiscountPercent",
    "prepmtPmtDiscountDate",
    "salesLines"
})
public class PedidosVenta {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Sell_to_Customer_No")
    protected String sellToCustomerNo;
    @XmlElement(name = "Sell_to_Contact_No")
    protected String sellToContactNo;
    @XmlElement(name = "Sell_to_Customer_Name")
    protected String sellToCustomerName;
    @XmlElement(name = "Sell_to_Address")
    protected String sellToAddress;
    @XmlElement(name = "Sell_to_Address_2")
    protected String sellToAddress2;
    @XmlElement(name = "Sell_to_Post_Code")
    protected String sellToPostCode;
    @XmlElement(name = "Sell_to_City")
    protected String sellToCity;
    @XmlElement(name = "Sell_to_County")
    protected String sellToCounty;
    @XmlElement(name = "Sell_to_Contact")
    protected String sellToContact;
    @XmlElement(name = "No_of_Archived_Versions")
    protected Integer noOfArchivedVersions;
    @XmlElement(name = "Posting_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postingDate;
    @XmlElement(name = "Order_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "Document_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "Requested_Delivery_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDeliveryDate;
    @XmlElement(name = "Promised_Delivery_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar promisedDeliveryDate;
    @XmlElement(name = "Quote_No")
    protected String quoteNo;
    @XmlElement(name = "External_Document_No")
    protected String externalDocumentNo;
    @XmlElement(name = "Salesperson_Code")
    protected String salespersonCode;
    @XmlElement(name = "Campaign_No")
    protected String campaignNo;
    @XmlElement(name = "Opportunity_No")
    protected String opportunityNo;
    @XmlElement(name = "Responsibility_Center")
    protected String responsibilityCenter;
    @XmlElement(name = "Assigned_User_ID")
    protected String assignedUserID;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "DocumentType")
    protected DocumentType documentType;
    @XmlElement(name = "Bill_to_Customer_No")
    protected String billToCustomerNo;
    @XmlElement(name = "Bill_to_Contact_No")
    protected String billToContactNo;
    @XmlElement(name = "Bill_to_Name")
    protected String billToName;
    @XmlElement(name = "Bill_to_Address")
    protected String billToAddress;
    @XmlElement(name = "Bill_to_Address_2")
    protected String billToAddress2;
    @XmlElement(name = "Bill_to_Post_Code")
    protected String billToPostCode;
    @XmlElement(name = "Bill_to_City")
    protected String billToCity;
    @XmlElement(name = "Bill_to_County")
    protected String billToCounty;
    @XmlElement(name = "Bill_to_Contact")
    protected String billToContact;
    @XmlElement(name = "Shortcut_Dimension_1_Code")
    protected String shortcutDimension1Code;
    @XmlElement(name = "Shortcut_Dimension_2_Code")
    protected String shortcutDimension2Code;
    @XmlElement(name = "Payment_Terms_Code")
    protected String paymentTermsCode;
    @XmlElement(name = "Due_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "Payment_Discount_Percent")
    protected BigDecimal paymentDiscountPercent;
    @XmlElement(name = "Pmt_Discount_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDiscountDate;
    @XmlElement(name = "Payment_Method_Code")
    protected String paymentMethodCode;
    @XmlElement(name = "Prices_Including_VAT")
    protected Boolean pricesIncludingVAT;
    @XmlElement(name = "VAT_Bus_Posting_Group")
    protected String vatBusPostingGroup;
    @XmlElement(name = "Credit_Card_No")
    protected String creditCardNo;
    @XmlElement(name = "GetCreditcardNumber")
    protected String getCreditcardNumber;
    @XmlElement(name = "Ship_to_Code")
    protected String shipToCode;
    @XmlElement(name = "Ship_to_Name")
    protected String shipToName;
    @XmlElement(name = "Ship_to_Address")
    protected String shipToAddress;
    @XmlElement(name = "Ship_to_Address_2")
    protected String shipToAddress2;
    @XmlElement(name = "Ship_to_Post_Code")
    protected String shipToPostCode;
    @XmlElement(name = "Ship_to_City")
    protected String shipToCity;
    @XmlElement(name = "Ship_to_County")
    protected String shipToCounty;
    @XmlElement(name = "Ship_to_Contact")
    protected String shipToContact;
    @XmlElement(name = "Location_Code")
    protected String locationCode;
    @XmlElement(name = "Outbound_Whse_Handling_Time")
    protected String outboundWhseHandlingTime;
    @XmlElement(name = "Shipment_Method_Code")
    protected String shipmentMethodCode;
    @XmlElement(name = "Shipping_Agent_Code")
    protected String shippingAgentCode;
    @XmlElement(name = "Shipping_Agent_Service_Code")
    protected String shippingAgentServiceCode;
    @XmlElement(name = "Shipping_Time")
    protected String shippingTime;
    @XmlElement(name = "Late_Order_Shipping")
    protected Boolean lateOrderShipping;
    @XmlElement(name = "Package_Tracking_No")
    protected String packageTrackingNo;
    @XmlElement(name = "Shipment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipmentDate;
    @XmlElement(name = "Shipping_Advice")
    protected ShippingAdvice shippingAdvice;
    @XmlElement(name = "Pay_at_Code")
    protected String payAtCode;
    @XmlElement(name = "Cust_Bank_Acc_Code")
    protected String custBankAccCode;
    @XmlElement(name = "Currency_Code")
    protected String currencyCode;
    @XmlElement(name = "EU_3_Party_Trade")
    protected Boolean eu3PartyTrade;
    @XmlElement(name = "Transaction_Type")
    protected String transactionType;
    @XmlElement(name = "Transaction_Specification")
    protected String transactionSpecification;
    @XmlElement(name = "Transport_Method")
    protected String transportMethod;
    @XmlElement(name = "Exit_Point")
    protected String exitPoint;
    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "BizTalk_Sales_Order")
    protected Boolean bizTalkSalesOrder;
    @XmlElement(name = "Date_Received")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateReceived;
    @XmlElement(name = "Time_Received")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeReceived;
    @XmlElement(name = "BizTalk_Sales_Order_Cnfmn")
    protected Boolean bizTalkSalesOrderCnfmn;
    @XmlElement(name = "Date_Sent")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSent;
    @XmlElement(name = "Time_Sent")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeSent;
    @XmlElement(name = "Customer_Order_No")
    protected String customerOrderNo;
    @XmlElement(name = "Prepayment_Percent")
    protected BigDecimal prepaymentPercent;
    @XmlElement(name = "Compress_Prepayment")
    protected Boolean compressPrepayment;
    @XmlElement(name = "Prepmt_Payment_Terms_Code")
    protected String prepmtPaymentTermsCode;
    @XmlElement(name = "Prepayment_Due_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prepaymentDueDate;
    @XmlElement(name = "Prepmt_Payment_Discount_Percent")
    protected BigDecimal prepmtPaymentDiscountPercent;
    @XmlElement(name = "Prepmt_Pmt_Discount_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prepmtPmtDiscountDate;
    @XmlElement(name = "SalesLines")
    protected SalesOrderLineList salesLines;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the sellToCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellToCustomerNo() {
        return sellToCustomerNo;
    }

    /**
     * Sets the value of the sellToCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellToCustomerNo(String value) {
        this.sellToCustomerNo = value;
    }

    /**
     * Gets the value of the sellToContactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellToContactNo() {
        return sellToContactNo;
    }

    /**
     * Sets the value of the sellToContactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellToContactNo(String value) {
        this.sellToContactNo = value;
    }

    /**
     * Gets the value of the sellToCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellToCustomerName() {
        return sellToCustomerName;
    }

    /**
     * Sets the value of the sellToCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellToCustomerName(String value) {
        this.sellToCustomerName = value;
    }

    /**
     * Gets the value of the sellToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellToAddress() {
        return sellToAddress;
    }

    /**
     * Sets the value of the sellToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellToAddress(String value) {
        this.sellToAddress = value;
    }

    /**
     * Gets the value of the sellToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellToAddress2() {
        return sellToAddress2;
    }

    /**
     * Sets the value of the sellToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellToAddress2(String value) {
        this.sellToAddress2 = value;
    }

    /**
     * Gets the value of the sellToPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellToPostCode() {
        return sellToPostCode;
    }

    /**
     * Sets the value of the sellToPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellToPostCode(String value) {
        this.sellToPostCode = value;
    }

    /**
     * Gets the value of the sellToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellToCity() {
        return sellToCity;
    }

    /**
     * Sets the value of the sellToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellToCity(String value) {
        this.sellToCity = value;
    }

    /**
     * Gets the value of the sellToCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellToCounty() {
        return sellToCounty;
    }

    /**
     * Sets the value of the sellToCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellToCounty(String value) {
        this.sellToCounty = value;
    }

    /**
     * Gets the value of the sellToContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellToContact() {
        return sellToContact;
    }

    /**
     * Sets the value of the sellToContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellToContact(String value) {
        this.sellToContact = value;
    }

    /**
     * Gets the value of the noOfArchivedVersions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfArchivedVersions() {
        return noOfArchivedVersions;
    }

    /**
     * Sets the value of the noOfArchivedVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfArchivedVersions(Integer value) {
        this.noOfArchivedVersions = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the requestedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Sets the value of the requestedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDeliveryDate(XMLGregorianCalendar value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Gets the value of the promisedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromisedDeliveryDate() {
        return promisedDeliveryDate;
    }

    /**
     * Sets the value of the promisedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromisedDeliveryDate(XMLGregorianCalendar value) {
        this.promisedDeliveryDate = value;
    }

    /**
     * Gets the value of the quoteNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNo() {
        return quoteNo;
    }

    /**
     * Sets the value of the quoteNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNo(String value) {
        this.quoteNo = value;
    }

    /**
     * Gets the value of the externalDocumentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDocumentNo() {
        return externalDocumentNo;
    }

    /**
     * Sets the value of the externalDocumentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDocumentNo(String value) {
        this.externalDocumentNo = value;
    }

    /**
     * Gets the value of the salespersonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalespersonCode() {
        return salespersonCode;
    }

    /**
     * Sets the value of the salespersonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalespersonCode(String value) {
        this.salespersonCode = value;
    }

    /**
     * Gets the value of the campaignNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignNo() {
        return campaignNo;
    }

    /**
     * Sets the value of the campaignNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignNo(String value) {
        this.campaignNo = value;
    }

    /**
     * Gets the value of the opportunityNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityNo() {
        return opportunityNo;
    }

    /**
     * Sets the value of the opportunityNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityNo(String value) {
        this.opportunityNo = value;
    }

    /**
     * Gets the value of the responsibilityCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilityCenter() {
        return responsibilityCenter;
    }

    /**
     * Sets the value of the responsibilityCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilityCenter(String value) {
        this.responsibilityCenter = value;
    }

    /**
     * Gets the value of the assignedUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUserID() {
        return assignedUserID;
    }

    /**
     * Sets the value of the assignedUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUserID(String value) {
        this.assignedUserID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the billToCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCustomerNo() {
        return billToCustomerNo;
    }

    /**
     * Sets the value of the billToCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCustomerNo(String value) {
        this.billToCustomerNo = value;
    }

    /**
     * Gets the value of the billToContactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToContactNo() {
        return billToContactNo;
    }

    /**
     * Sets the value of the billToContactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToContactNo(String value) {
        this.billToContactNo = value;
    }

    /**
     * Gets the value of the billToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToName() {
        return billToName;
    }

    /**
     * Sets the value of the billToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToName(String value) {
        this.billToName = value;
    }

    /**
     * Gets the value of the billToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddress() {
        return billToAddress;
    }

    /**
     * Sets the value of the billToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddress(String value) {
        this.billToAddress = value;
    }

    /**
     * Gets the value of the billToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddress2() {
        return billToAddress2;
    }

    /**
     * Sets the value of the billToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddress2(String value) {
        this.billToAddress2 = value;
    }

    /**
     * Gets the value of the billToPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToPostCode() {
        return billToPostCode;
    }

    /**
     * Sets the value of the billToPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToPostCode(String value) {
        this.billToPostCode = value;
    }

    /**
     * Gets the value of the billToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCity() {
        return billToCity;
    }

    /**
     * Sets the value of the billToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCity(String value) {
        this.billToCity = value;
    }

    /**
     * Gets the value of the billToCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCounty() {
        return billToCounty;
    }

    /**
     * Sets the value of the billToCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCounty(String value) {
        this.billToCounty = value;
    }

    /**
     * Gets the value of the billToContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToContact() {
        return billToContact;
    }

    /**
     * Sets the value of the billToContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToContact(String value) {
        this.billToContact = value;
    }

    /**
     * Gets the value of the shortcutDimension1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimension1Code() {
        return shortcutDimension1Code;
    }

    /**
     * Sets the value of the shortcutDimension1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimension1Code(String value) {
        this.shortcutDimension1Code = value;
    }

    /**
     * Gets the value of the shortcutDimension2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimension2Code() {
        return shortcutDimension2Code;
    }

    /**
     * Sets the value of the shortcutDimension2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimension2Code(String value) {
        this.shortcutDimension2Code = value;
    }

    /**
     * Gets the value of the paymentTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermsCode() {
        return paymentTermsCode;
    }

    /**
     * Sets the value of the paymentTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermsCode(String value) {
        this.paymentTermsCode = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the paymentDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentDiscountPercent() {
        return paymentDiscountPercent;
    }

    /**
     * Sets the value of the paymentDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentDiscountPercent(BigDecimal value) {
        this.paymentDiscountPercent = value;
    }

    /**
     * Gets the value of the pmtDiscountDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDiscountDate() {
        return pmtDiscountDate;
    }

    /**
     * Sets the value of the pmtDiscountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDiscountDate(XMLGregorianCalendar value) {
        this.pmtDiscountDate = value;
    }

    /**
     * Gets the value of the paymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Sets the value of the paymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodCode(String value) {
        this.paymentMethodCode = value;
    }

    /**
     * Gets the value of the pricesIncludingVAT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricesIncludingVAT() {
        return pricesIncludingVAT;
    }

    /**
     * Sets the value of the pricesIncludingVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricesIncludingVAT(Boolean value) {
        this.pricesIncludingVAT = value;
    }

    /**
     * Gets the value of the vatBusPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATBusPostingGroup() {
        return vatBusPostingGroup;
    }

    /**
     * Sets the value of the vatBusPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATBusPostingGroup(String value) {
        this.vatBusPostingGroup = value;
    }

    /**
     * Gets the value of the creditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * Sets the value of the creditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNo(String value) {
        this.creditCardNo = value;
    }

    /**
     * Gets the value of the getCreditcardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCreditcardNumber() {
        return getCreditcardNumber;
    }

    /**
     * Sets the value of the getCreditcardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCreditcardNumber(String value) {
        this.getCreditcardNumber = value;
    }

    /**
     * Gets the value of the shipToCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCode() {
        return shipToCode;
    }

    /**
     * Sets the value of the shipToCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCode(String value) {
        this.shipToCode = value;
    }

    /**
     * Gets the value of the shipToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToName() {
        return shipToName;
    }

    /**
     * Sets the value of the shipToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToName(String value) {
        this.shipToName = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress(String value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress2(String value) {
        this.shipToAddress2 = value;
    }

    /**
     * Gets the value of the shipToPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToPostCode() {
        return shipToPostCode;
    }

    /**
     * Sets the value of the shipToPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToPostCode(String value) {
        this.shipToPostCode = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCounty() {
        return shipToCounty;
    }

    /**
     * Sets the value of the shipToCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCounty(String value) {
        this.shipToCounty = value;
    }

    /**
     * Gets the value of the shipToContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContact() {
        return shipToContact;
    }

    /**
     * Sets the value of the shipToContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContact(String value) {
        this.shipToContact = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the outboundWhseHandlingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundWhseHandlingTime() {
        return outboundWhseHandlingTime;
    }

    /**
     * Sets the value of the outboundWhseHandlingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundWhseHandlingTime(String value) {
        this.outboundWhseHandlingTime = value;
    }

    /**
     * Gets the value of the shipmentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentMethodCode() {
        return shipmentMethodCode;
    }

    /**
     * Sets the value of the shipmentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentMethodCode(String value) {
        this.shipmentMethodCode = value;
    }

    /**
     * Gets the value of the shippingAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAgentCode() {
        return shippingAgentCode;
    }

    /**
     * Sets the value of the shippingAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAgentCode(String value) {
        this.shippingAgentCode = value;
    }

    /**
     * Gets the value of the shippingAgentServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAgentServiceCode() {
        return shippingAgentServiceCode;
    }

    /**
     * Sets the value of the shippingAgentServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAgentServiceCode(String value) {
        this.shippingAgentServiceCode = value;
    }

    /**
     * Gets the value of the shippingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTime() {
        return shippingTime;
    }

    /**
     * Sets the value of the shippingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTime(String value) {
        this.shippingTime = value;
    }

    /**
     * Gets the value of the lateOrderShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLateOrderShipping() {
        return lateOrderShipping;
    }

    /**
     * Sets the value of the lateOrderShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLateOrderShipping(Boolean value) {
        this.lateOrderShipping = value;
    }

    /**
     * Gets the value of the packageTrackingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTrackingNo() {
        return packageTrackingNo;
    }

    /**
     * Sets the value of the packageTrackingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTrackingNo(String value) {
        this.packageTrackingNo = value;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Sets the value of the shipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipmentDate(XMLGregorianCalendar value) {
        this.shipmentDate = value;
    }

    /**
     * Gets the value of the shippingAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAdvice }
     *     
     */
    public ShippingAdvice getShippingAdvice() {
        return shippingAdvice;
    }

    /**
     * Sets the value of the shippingAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAdvice }
     *     
     */
    public void setShippingAdvice(ShippingAdvice value) {
        this.shippingAdvice = value;
    }

    /**
     * Gets the value of the payAtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayAtCode() {
        return payAtCode;
    }

    /**
     * Sets the value of the payAtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayAtCode(String value) {
        this.payAtCode = value;
    }

    /**
     * Gets the value of the custBankAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustBankAccCode() {
        return custBankAccCode;
    }

    /**
     * Sets the value of the custBankAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustBankAccCode(String value) {
        this.custBankAccCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the eu3PartyTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEU3PartyTrade() {
        return eu3PartyTrade;
    }

    /**
     * Sets the value of the eu3PartyTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEU3PartyTrade(Boolean value) {
        this.eu3PartyTrade = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSpecification() {
        return transactionSpecification;
    }

    /**
     * Sets the value of the transactionSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSpecification(String value) {
        this.transactionSpecification = value;
    }

    /**
     * Gets the value of the transportMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMethod() {
        return transportMethod;
    }

    /**
     * Sets the value of the transportMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMethod(String value) {
        this.transportMethod = value;
    }

    /**
     * Gets the value of the exitPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitPoint() {
        return exitPoint;
    }

    /**
     * Sets the value of the exitPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitPoint(String value) {
        this.exitPoint = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the bizTalkSalesOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBizTalkSalesOrder() {
        return bizTalkSalesOrder;
    }

    /**
     * Sets the value of the bizTalkSalesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBizTalkSalesOrder(Boolean value) {
        this.bizTalkSalesOrder = value;
    }

    /**
     * Gets the value of the dateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReceived() {
        return dateReceived;
    }

    /**
     * Sets the value of the dateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReceived(XMLGregorianCalendar value) {
        this.dateReceived = value;
    }

    /**
     * Gets the value of the timeReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeReceived() {
        return timeReceived;
    }

    /**
     * Sets the value of the timeReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeReceived(XMLGregorianCalendar value) {
        this.timeReceived = value;
    }

    /**
     * Gets the value of the bizTalkSalesOrderCnfmn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBizTalkSalesOrderCnfmn() {
        return bizTalkSalesOrderCnfmn;
    }

    /**
     * Sets the value of the bizTalkSalesOrderCnfmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBizTalkSalesOrderCnfmn(Boolean value) {
        this.bizTalkSalesOrderCnfmn = value;
    }

    /**
     * Gets the value of the dateSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSent() {
        return dateSent;
    }

    /**
     * Sets the value of the dateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSent(XMLGregorianCalendar value) {
        this.dateSent = value;
    }

    /**
     * Gets the value of the timeSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeSent() {
        return timeSent;
    }

    /**
     * Sets the value of the timeSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeSent(XMLGregorianCalendar value) {
        this.timeSent = value;
    }

    /**
     * Gets the value of the customerOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOrderNo() {
        return customerOrderNo;
    }

    /**
     * Sets the value of the customerOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOrderNo(String value) {
        this.customerOrderNo = value;
    }

    /**
     * Gets the value of the prepaymentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepaymentPercent() {
        return prepaymentPercent;
    }

    /**
     * Sets the value of the prepaymentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepaymentPercent(BigDecimal value) {
        this.prepaymentPercent = value;
    }

    /**
     * Gets the value of the compressPrepayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompressPrepayment() {
        return compressPrepayment;
    }

    /**
     * Sets the value of the compressPrepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompressPrepayment(Boolean value) {
        this.compressPrepayment = value;
    }

    /**
     * Gets the value of the prepmtPaymentTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepmtPaymentTermsCode() {
        return prepmtPaymentTermsCode;
    }

    /**
     * Sets the value of the prepmtPaymentTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepmtPaymentTermsCode(String value) {
        this.prepmtPaymentTermsCode = value;
    }

    /**
     * Gets the value of the prepaymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrepaymentDueDate() {
        return prepaymentDueDate;
    }

    /**
     * Sets the value of the prepaymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrepaymentDueDate(XMLGregorianCalendar value) {
        this.prepaymentDueDate = value;
    }

    /**
     * Gets the value of the prepmtPaymentDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepmtPaymentDiscountPercent() {
        return prepmtPaymentDiscountPercent;
    }

    /**
     * Sets the value of the prepmtPaymentDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepmtPaymentDiscountPercent(BigDecimal value) {
        this.prepmtPaymentDiscountPercent = value;
    }

    /**
     * Gets the value of the prepmtPmtDiscountDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrepmtPmtDiscountDate() {
        return prepmtPmtDiscountDate;
    }

    /**
     * Sets the value of the prepmtPmtDiscountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrepmtPmtDiscountDate(XMLGregorianCalendar value) {
        this.prepmtPmtDiscountDate = value;
    }

    /**
     * Gets the value of the salesLines property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderLineList }
     *     
     */
    public SalesOrderLineList getSalesLines() {
        return salesLines;
    }

    /**
     * Sets the value of the salesLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderLineList }
     *     
     */
    public void setSalesLines(SalesOrderLineList value) {
        this.salesLines = value;
    }

}
