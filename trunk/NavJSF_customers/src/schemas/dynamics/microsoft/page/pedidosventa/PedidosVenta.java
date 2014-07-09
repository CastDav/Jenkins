
package schemas.dynamics.microsoft.page.pedidosventa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para PedidosVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
    @XmlSchemaType(name = "string")
    protected Status status;
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
    @XmlSchemaType(name = "string")
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
     * Obtiene el valor de la propiedad key.
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
     * Define el valor de la propiedad key.
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
     * Obtiene el valor de la propiedad no.
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
     * Define el valor de la propiedad no.
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
     * Obtiene el valor de la propiedad sellToCustomerNo.
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
     * Define el valor de la propiedad sellToCustomerNo.
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
     * Obtiene el valor de la propiedad sellToContactNo.
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
     * Define el valor de la propiedad sellToContactNo.
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
     * Obtiene el valor de la propiedad sellToCustomerName.
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
     * Define el valor de la propiedad sellToCustomerName.
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
     * Obtiene el valor de la propiedad sellToAddress.
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
     * Define el valor de la propiedad sellToAddress.
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
     * Obtiene el valor de la propiedad sellToAddress2.
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
     * Define el valor de la propiedad sellToAddress2.
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
     * Obtiene el valor de la propiedad sellToPostCode.
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
     * Define el valor de la propiedad sellToPostCode.
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
     * Obtiene el valor de la propiedad sellToCity.
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
     * Define el valor de la propiedad sellToCity.
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
     * Obtiene el valor de la propiedad sellToCounty.
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
     * Define el valor de la propiedad sellToCounty.
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
     * Obtiene el valor de la propiedad sellToContact.
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
     * Define el valor de la propiedad sellToContact.
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
     * Obtiene el valor de la propiedad noOfArchivedVersions.
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
     * Define el valor de la propiedad noOfArchivedVersions.
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
     * Obtiene el valor de la propiedad postingDate.
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
     * Define el valor de la propiedad postingDate.
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
     * Obtiene el valor de la propiedad orderDate.
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
     * Define el valor de la propiedad orderDate.
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
     * Obtiene el valor de la propiedad documentDate.
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
     * Define el valor de la propiedad documentDate.
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
     * Obtiene el valor de la propiedad requestedDeliveryDate.
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
     * Define el valor de la propiedad requestedDeliveryDate.
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
     * Obtiene el valor de la propiedad promisedDeliveryDate.
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
     * Define el valor de la propiedad promisedDeliveryDate.
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
     * Obtiene el valor de la propiedad quoteNo.
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
     * Define el valor de la propiedad quoteNo.
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
     * Obtiene el valor de la propiedad externalDocumentNo.
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
     * Define el valor de la propiedad externalDocumentNo.
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
     * Obtiene el valor de la propiedad salespersonCode.
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
     * Define el valor de la propiedad salespersonCode.
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
     * Obtiene el valor de la propiedad campaignNo.
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
     * Define el valor de la propiedad campaignNo.
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
     * Obtiene el valor de la propiedad opportunityNo.
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
     * Define el valor de la propiedad opportunityNo.
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
     * Obtiene el valor de la propiedad responsibilityCenter.
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
     * Define el valor de la propiedad responsibilityCenter.
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
     * Obtiene el valor de la propiedad assignedUserID.
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
     * Define el valor de la propiedad assignedUserID.
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
     * Obtiene el valor de la propiedad status.
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
     * Define el valor de la propiedad status.
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
     * Obtiene el valor de la propiedad billToCustomerNo.
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
     * Define el valor de la propiedad billToCustomerNo.
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
     * Obtiene el valor de la propiedad billToContactNo.
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
     * Define el valor de la propiedad billToContactNo.
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
     * Obtiene el valor de la propiedad billToName.
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
     * Define el valor de la propiedad billToName.
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
     * Obtiene el valor de la propiedad billToAddress.
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
     * Define el valor de la propiedad billToAddress.
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
     * Obtiene el valor de la propiedad billToAddress2.
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
     * Define el valor de la propiedad billToAddress2.
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
     * Obtiene el valor de la propiedad billToPostCode.
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
     * Define el valor de la propiedad billToPostCode.
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
     * Obtiene el valor de la propiedad billToCity.
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
     * Define el valor de la propiedad billToCity.
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
     * Obtiene el valor de la propiedad billToCounty.
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
     * Define el valor de la propiedad billToCounty.
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
     * Obtiene el valor de la propiedad billToContact.
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
     * Define el valor de la propiedad billToContact.
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
     * Obtiene el valor de la propiedad shortcutDimension1Code.
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
     * Define el valor de la propiedad shortcutDimension1Code.
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
     * Obtiene el valor de la propiedad shortcutDimension2Code.
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
     * Define el valor de la propiedad shortcutDimension2Code.
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
     * Obtiene el valor de la propiedad paymentTermsCode.
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
     * Define el valor de la propiedad paymentTermsCode.
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
     * Obtiene el valor de la propiedad dueDate.
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
     * Define el valor de la propiedad dueDate.
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
     * Obtiene el valor de la propiedad paymentDiscountPercent.
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
     * Define el valor de la propiedad paymentDiscountPercent.
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
     * Obtiene el valor de la propiedad pmtDiscountDate.
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
     * Define el valor de la propiedad pmtDiscountDate.
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
     * Obtiene el valor de la propiedad paymentMethodCode.
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
     * Define el valor de la propiedad paymentMethodCode.
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
     * Obtiene el valor de la propiedad pricesIncludingVAT.
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
     * Define el valor de la propiedad pricesIncludingVAT.
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
     * Obtiene el valor de la propiedad vatBusPostingGroup.
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
     * Define el valor de la propiedad vatBusPostingGroup.
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
     * Obtiene el valor de la propiedad creditCardNo.
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
     * Define el valor de la propiedad creditCardNo.
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
     * Obtiene el valor de la propiedad getCreditcardNumber.
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
     * Define el valor de la propiedad getCreditcardNumber.
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
     * Obtiene el valor de la propiedad shipToCode.
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
     * Define el valor de la propiedad shipToCode.
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
     * Obtiene el valor de la propiedad shipToName.
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
     * Define el valor de la propiedad shipToName.
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
     * Obtiene el valor de la propiedad shipToAddress.
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
     * Define el valor de la propiedad shipToAddress.
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
     * Obtiene el valor de la propiedad shipToAddress2.
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
     * Define el valor de la propiedad shipToAddress2.
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
     * Obtiene el valor de la propiedad shipToPostCode.
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
     * Define el valor de la propiedad shipToPostCode.
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
     * Obtiene el valor de la propiedad shipToCity.
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
     * Define el valor de la propiedad shipToCity.
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
     * Obtiene el valor de la propiedad shipToCounty.
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
     * Define el valor de la propiedad shipToCounty.
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
     * Obtiene el valor de la propiedad shipToContact.
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
     * Define el valor de la propiedad shipToContact.
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
     * Obtiene el valor de la propiedad locationCode.
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
     * Define el valor de la propiedad locationCode.
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
     * Obtiene el valor de la propiedad outboundWhseHandlingTime.
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
     * Define el valor de la propiedad outboundWhseHandlingTime.
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
     * Obtiene el valor de la propiedad shipmentMethodCode.
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
     * Define el valor de la propiedad shipmentMethodCode.
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
     * Obtiene el valor de la propiedad shippingAgentCode.
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
     * Define el valor de la propiedad shippingAgentCode.
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
     * Obtiene el valor de la propiedad shippingAgentServiceCode.
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
     * Define el valor de la propiedad shippingAgentServiceCode.
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
     * Obtiene el valor de la propiedad shippingTime.
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
     * Define el valor de la propiedad shippingTime.
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
     * Obtiene el valor de la propiedad lateOrderShipping.
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
     * Define el valor de la propiedad lateOrderShipping.
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
     * Obtiene el valor de la propiedad packageTrackingNo.
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
     * Define el valor de la propiedad packageTrackingNo.
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
     * Obtiene el valor de la propiedad shipmentDate.
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
     * Define el valor de la propiedad shipmentDate.
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
     * Obtiene el valor de la propiedad shippingAdvice.
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
     * Define el valor de la propiedad shippingAdvice.
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
     * Obtiene el valor de la propiedad payAtCode.
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
     * Define el valor de la propiedad payAtCode.
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
     * Obtiene el valor de la propiedad custBankAccCode.
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
     * Define el valor de la propiedad custBankAccCode.
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
     * Obtiene el valor de la propiedad currencyCode.
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
     * Define el valor de la propiedad currencyCode.
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
     * Obtiene el valor de la propiedad eu3PartyTrade.
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
     * Define el valor de la propiedad eu3PartyTrade.
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
     * Obtiene el valor de la propiedad transactionType.
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
     * Define el valor de la propiedad transactionType.
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
     * Obtiene el valor de la propiedad transactionSpecification.
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
     * Define el valor de la propiedad transactionSpecification.
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
     * Obtiene el valor de la propiedad transportMethod.
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
     * Define el valor de la propiedad transportMethod.
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
     * Obtiene el valor de la propiedad exitPoint.
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
     * Define el valor de la propiedad exitPoint.
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
     * Obtiene el valor de la propiedad area.
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
     * Define el valor de la propiedad area.
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
     * Obtiene el valor de la propiedad bizTalkSalesOrder.
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
     * Define el valor de la propiedad bizTalkSalesOrder.
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
     * Obtiene el valor de la propiedad dateReceived.
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
     * Define el valor de la propiedad dateReceived.
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
     * Obtiene el valor de la propiedad timeReceived.
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
     * Define el valor de la propiedad timeReceived.
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
     * Obtiene el valor de la propiedad bizTalkSalesOrderCnfmn.
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
     * Define el valor de la propiedad bizTalkSalesOrderCnfmn.
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
     * Obtiene el valor de la propiedad dateSent.
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
     * Define el valor de la propiedad dateSent.
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
     * Obtiene el valor de la propiedad timeSent.
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
     * Define el valor de la propiedad timeSent.
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
     * Obtiene el valor de la propiedad customerOrderNo.
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
     * Define el valor de la propiedad customerOrderNo.
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
     * Obtiene el valor de la propiedad prepaymentPercent.
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
     * Define el valor de la propiedad prepaymentPercent.
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
     * Obtiene el valor de la propiedad compressPrepayment.
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
     * Define el valor de la propiedad compressPrepayment.
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
     * Obtiene el valor de la propiedad prepmtPaymentTermsCode.
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
     * Define el valor de la propiedad prepmtPaymentTermsCode.
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
     * Obtiene el valor de la propiedad prepaymentDueDate.
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
     * Define el valor de la propiedad prepaymentDueDate.
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
     * Obtiene el valor de la propiedad prepmtPaymentDiscountPercent.
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
     * Define el valor de la propiedad prepmtPaymentDiscountPercent.
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
     * Obtiene el valor de la propiedad prepmtPmtDiscountDate.
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
     * Define el valor de la propiedad prepmtPmtDiscountDate.
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
     * Obtiene el valor de la propiedad salesLines.
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
     * Define el valor de la propiedad salesLines.
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
