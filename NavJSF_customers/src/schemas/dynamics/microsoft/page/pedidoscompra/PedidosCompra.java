
package schemas.dynamics.microsoft.page.pedidoscompra;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PedidosCompra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidosCompra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Buy_from_Vendor_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Buy_from_Contact_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Buy_from_Vendor_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Buy_from_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Buy_from_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Buy_from_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Buy_from_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Buy_from_County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Buy_from_Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_of_Archived_Versions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Posting_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Order_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Document_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Quote_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Order_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Shipment_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Invoice_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order_Address_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Purchaser_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Responsibility_Center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assigned_User_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}Status" minOccurs="0"/>
 *         &lt;element name="Pay_to_Vendor_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pay_to_Contact_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pay_to_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pay_to_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pay_to_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pay_to_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pay_to_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pay_to_County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pay_to_Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shortcut_Dimension_1_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shortcut_Dimension_2_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payment_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Due_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Payment_Discount_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Pmt_Discount_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Payment_Method_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="On_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prices_Including_VAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VAT_Bus_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inbound_Whse_Handling_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipment_Method_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Time_Calculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Requested_Receipt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Promised_Receipt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expected_Receipt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Sell_to_Customer_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pay_at_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Bank_Acc_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction_Specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transport_Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Entry_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BizTalk_Purchase_Order" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Date_Sent" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Time_Sent" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Vendor_Quote_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BizTalk_Purch_Order_Cnfmn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Date_Received" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Time_Received" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="BizTalk_Purchase_Receipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BizTalk_Purchase_Invoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Prepayment_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Compress_Prepayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Prepmt_Payment_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prepayment_Due_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Prepmt_Payment_Discount_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Pmt_Discount_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Vendor_Cr_Memo_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchLines" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}Purchase_Order_Line_List" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidosCompra", propOrder = {
    "key",
    "no",
    "buyFromVendorNo",
    "buyFromContactNo",
    "buyFromVendorName",
    "buyFromAddress",
    "buyFromAddress2",
    "buyFromPostCode",
    "buyFromCity",
    "buyFromCounty",
    "buyFromContact",
    "noOfArchivedVersions",
    "postingDate",
    "orderDate",
    "documentDate",
    "quoteNo",
    "vendorOrderNo",
    "vendorShipmentNo",
    "vendorInvoiceNo",
    "orderAddressCode",
    "purchaserCode",
    "responsibilityCenter",
    "assignedUserID",
    "status",
    "payToVendorNo",
    "payToContactNo",
    "payToName",
    "payToAddress",
    "payToAddress2",
    "payToPostCode",
    "payToCity",
    "payToCounty",
    "payToContact",
    "shortcutDimension1Code",
    "shortcutDimension2Code",
    "paymentTermsCode",
    "dueDate",
    "paymentDiscountPercent",
    "pmtDiscountDate",
    "paymentMethodCode",
    "onHold",
    "pricesIncludingVAT",
    "vatBusPostingGroup",
    "shipToName",
    "shipToAddress",
    "shipToAddress2",
    "shipToPostCode",
    "shipToCity",
    "shipToCounty",
    "shipToContact",
    "locationCode",
    "inboundWhseHandlingTime",
    "shipmentMethodCode",
    "leadTimeCalculation",
    "requestedReceiptDate",
    "promisedReceiptDate",
    "expectedReceiptDate",
    "sellToCustomerNo",
    "shipToCode",
    "payAtCode",
    "vendorBankAccCode",
    "currencyCode",
    "transactionType",
    "transactionSpecification",
    "transportMethod",
    "entryPoint",
    "area",
    "bizTalkPurchaseOrder",
    "dateSent",
    "timeSent",
    "vendorQuoteNo",
    "bizTalkPurchOrderCnfmn",
    "dateReceived",
    "timeReceived",
    "bizTalkPurchaseReceipt",
    "bizTalkPurchaseInvoice",
    "prepaymentPercent",
    "compressPrepayment",
    "prepmtPaymentTermsCode",
    "prepaymentDueDate",
    "prepmtPaymentDiscountPercent",
    "prepmtPmtDiscountDate",
    "vendorCrMemoNo",
    "purchLines"
})
public class PedidosCompra {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Buy_from_Vendor_No")
    protected String buyFromVendorNo;
    @XmlElement(name = "Buy_from_Contact_No")
    protected String buyFromContactNo;
    @XmlElement(name = "Buy_from_Vendor_Name")
    protected String buyFromVendorName;
    @XmlElement(name = "Buy_from_Address")
    protected String buyFromAddress;
    @XmlElement(name = "Buy_from_Address_2")
    protected String buyFromAddress2;
    @XmlElement(name = "Buy_from_Post_Code")
    protected String buyFromPostCode;
    @XmlElement(name = "Buy_from_City")
    protected String buyFromCity;
    @XmlElement(name = "Buy_from_County")
    protected String buyFromCounty;
    @XmlElement(name = "Buy_from_Contact")
    protected String buyFromContact;
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
    @XmlElement(name = "Quote_No")
    protected String quoteNo;
    @XmlElement(name = "Vendor_Order_No")
    protected String vendorOrderNo;
    @XmlElement(name = "Vendor_Shipment_No")
    protected String vendorShipmentNo;
    @XmlElement(name = "Vendor_Invoice_No")
    protected String vendorInvoiceNo;
    @XmlElement(name = "Order_Address_Code")
    protected String orderAddressCode;
    @XmlElement(name = "Purchaser_Code")
    protected String purchaserCode;
    @XmlElement(name = "Responsibility_Center")
    protected String responsibilityCenter;
    @XmlElement(name = "Assigned_User_ID")
    protected String assignedUserID;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "Pay_to_Vendor_No")
    protected String payToVendorNo;
    @XmlElement(name = "Pay_to_Contact_No")
    protected String payToContactNo;
    @XmlElement(name = "Pay_to_Name")
    protected String payToName;
    @XmlElement(name = "Pay_to_Address")
    protected String payToAddress;
    @XmlElement(name = "Pay_to_Address_2")
    protected String payToAddress2;
    @XmlElement(name = "Pay_to_Post_Code")
    protected String payToPostCode;
    @XmlElement(name = "Pay_to_City")
    protected String payToCity;
    @XmlElement(name = "Pay_to_County")
    protected String payToCounty;
    @XmlElement(name = "Pay_to_Contact")
    protected String payToContact;
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
    @XmlElement(name = "On_Hold")
    protected String onHold;
    @XmlElement(name = "Prices_Including_VAT")
    protected Boolean pricesIncludingVAT;
    @XmlElement(name = "VAT_Bus_Posting_Group")
    protected String vatBusPostingGroup;
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
    @XmlElement(name = "Inbound_Whse_Handling_Time")
    protected String inboundWhseHandlingTime;
    @XmlElement(name = "Shipment_Method_Code")
    protected String shipmentMethodCode;
    @XmlElement(name = "Lead_Time_Calculation")
    protected String leadTimeCalculation;
    @XmlElement(name = "Requested_Receipt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedReceiptDate;
    @XmlElement(name = "Promised_Receipt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar promisedReceiptDate;
    @XmlElement(name = "Expected_Receipt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedReceiptDate;
    @XmlElement(name = "Sell_to_Customer_No")
    protected String sellToCustomerNo;
    @XmlElement(name = "Ship_to_Code")
    protected String shipToCode;
    @XmlElement(name = "Pay_at_Code")
    protected String payAtCode;
    @XmlElement(name = "Vendor_Bank_Acc_Code")
    protected String vendorBankAccCode;
    @XmlElement(name = "Currency_Code")
    protected String currencyCode;
    @XmlElement(name = "Transaction_Type")
    protected String transactionType;
    @XmlElement(name = "Transaction_Specification")
    protected String transactionSpecification;
    @XmlElement(name = "Transport_Method")
    protected String transportMethod;
    @XmlElement(name = "Entry_Point")
    protected String entryPoint;
    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "BizTalk_Purchase_Order")
    protected Boolean bizTalkPurchaseOrder;
    @XmlElement(name = "Date_Sent")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSent;
    @XmlElement(name = "Time_Sent")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeSent;
    @XmlElement(name = "Vendor_Quote_No")
    protected String vendorQuoteNo;
    @XmlElement(name = "BizTalk_Purch_Order_Cnfmn")
    protected Boolean bizTalkPurchOrderCnfmn;
    @XmlElement(name = "Date_Received")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateReceived;
    @XmlElement(name = "Time_Received")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeReceived;
    @XmlElement(name = "BizTalk_Purchase_Receipt")
    protected Boolean bizTalkPurchaseReceipt;
    @XmlElement(name = "BizTalk_Purchase_Invoice")
    protected Boolean bizTalkPurchaseInvoice;
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
    @XmlElement(name = "Vendor_Cr_Memo_No")
    protected String vendorCrMemoNo;
    @XmlElement(name = "PurchLines")
    protected PurchaseOrderLineList purchLines;

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
     * Gets the value of the buyFromVendorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFromVendorNo() {
        return buyFromVendorNo;
    }

    /**
     * Sets the value of the buyFromVendorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFromVendorNo(String value) {
        this.buyFromVendorNo = value;
    }

    /**
     * Gets the value of the buyFromContactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFromContactNo() {
        return buyFromContactNo;
    }

    /**
     * Sets the value of the buyFromContactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFromContactNo(String value) {
        this.buyFromContactNo = value;
    }

    /**
     * Gets the value of the buyFromVendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFromVendorName() {
        return buyFromVendorName;
    }

    /**
     * Sets the value of the buyFromVendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFromVendorName(String value) {
        this.buyFromVendorName = value;
    }

    /**
     * Gets the value of the buyFromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFromAddress() {
        return buyFromAddress;
    }

    /**
     * Sets the value of the buyFromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFromAddress(String value) {
        this.buyFromAddress = value;
    }

    /**
     * Gets the value of the buyFromAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFromAddress2() {
        return buyFromAddress2;
    }

    /**
     * Sets the value of the buyFromAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFromAddress2(String value) {
        this.buyFromAddress2 = value;
    }

    /**
     * Gets the value of the buyFromPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFromPostCode() {
        return buyFromPostCode;
    }

    /**
     * Sets the value of the buyFromPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFromPostCode(String value) {
        this.buyFromPostCode = value;
    }

    /**
     * Gets the value of the buyFromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFromCity() {
        return buyFromCity;
    }

    /**
     * Sets the value of the buyFromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFromCity(String value) {
        this.buyFromCity = value;
    }

    /**
     * Gets the value of the buyFromCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFromCounty() {
        return buyFromCounty;
    }

    /**
     * Sets the value of the buyFromCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFromCounty(String value) {
        this.buyFromCounty = value;
    }

    /**
     * Gets the value of the buyFromContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFromContact() {
        return buyFromContact;
    }

    /**
     * Sets the value of the buyFromContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFromContact(String value) {
        this.buyFromContact = value;
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
     * Gets the value of the vendorOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorOrderNo() {
        return vendorOrderNo;
    }

    /**
     * Sets the value of the vendorOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorOrderNo(String value) {
        this.vendorOrderNo = value;
    }

    /**
     * Gets the value of the vendorShipmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorShipmentNo() {
        return vendorShipmentNo;
    }

    /**
     * Sets the value of the vendorShipmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorShipmentNo(String value) {
        this.vendorShipmentNo = value;
    }

    /**
     * Gets the value of the vendorInvoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorInvoiceNo() {
        return vendorInvoiceNo;
    }

    /**
     * Sets the value of the vendorInvoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorInvoiceNo(String value) {
        this.vendorInvoiceNo = value;
    }

    /**
     * Gets the value of the orderAddressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAddressCode() {
        return orderAddressCode;
    }

    /**
     * Sets the value of the orderAddressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAddressCode(String value) {
        this.orderAddressCode = value;
    }

    /**
     * Gets the value of the purchaserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserCode() {
        return purchaserCode;
    }

    /**
     * Sets the value of the purchaserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserCode(String value) {
        this.purchaserCode = value;
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
     * Gets the value of the payToVendorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToVendorNo() {
        return payToVendorNo;
    }

    /**
     * Sets the value of the payToVendorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToVendorNo(String value) {
        this.payToVendorNo = value;
    }

    /**
     * Gets the value of the payToContactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactNo() {
        return payToContactNo;
    }

    /**
     * Sets the value of the payToContactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactNo(String value) {
        this.payToContactNo = value;
    }

    /**
     * Gets the value of the payToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToName() {
        return payToName;
    }

    /**
     * Sets the value of the payToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToName(String value) {
        this.payToName = value;
    }

    /**
     * Gets the value of the payToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAddress() {
        return payToAddress;
    }

    /**
     * Sets the value of the payToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAddress(String value) {
        this.payToAddress = value;
    }

    /**
     * Gets the value of the payToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAddress2() {
        return payToAddress2;
    }

    /**
     * Sets the value of the payToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAddress2(String value) {
        this.payToAddress2 = value;
    }

    /**
     * Gets the value of the payToPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToPostCode() {
        return payToPostCode;
    }

    /**
     * Sets the value of the payToPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToPostCode(String value) {
        this.payToPostCode = value;
    }

    /**
     * Gets the value of the payToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToCity() {
        return payToCity;
    }

    /**
     * Sets the value of the payToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToCity(String value) {
        this.payToCity = value;
    }

    /**
     * Gets the value of the payToCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToCounty() {
        return payToCounty;
    }

    /**
     * Sets the value of the payToCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToCounty(String value) {
        this.payToCounty = value;
    }

    /**
     * Gets the value of the payToContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContact() {
        return payToContact;
    }

    /**
     * Sets the value of the payToContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContact(String value) {
        this.payToContact = value;
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
     * Gets the value of the onHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnHold() {
        return onHold;
    }

    /**
     * Sets the value of the onHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnHold(String value) {
        this.onHold = value;
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
     * Gets the value of the inboundWhseHandlingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundWhseHandlingTime() {
        return inboundWhseHandlingTime;
    }

    /**
     * Sets the value of the inboundWhseHandlingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundWhseHandlingTime(String value) {
        this.inboundWhseHandlingTime = value;
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
     * Gets the value of the leadTimeCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadTimeCalculation() {
        return leadTimeCalculation;
    }

    /**
     * Sets the value of the leadTimeCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadTimeCalculation(String value) {
        this.leadTimeCalculation = value;
    }

    /**
     * Gets the value of the requestedReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedReceiptDate() {
        return requestedReceiptDate;
    }

    /**
     * Sets the value of the requestedReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedReceiptDate(XMLGregorianCalendar value) {
        this.requestedReceiptDate = value;
    }

    /**
     * Gets the value of the promisedReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromisedReceiptDate() {
        return promisedReceiptDate;
    }

    /**
     * Sets the value of the promisedReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromisedReceiptDate(XMLGregorianCalendar value) {
        this.promisedReceiptDate = value;
    }

    /**
     * Gets the value of the expectedReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedReceiptDate() {
        return expectedReceiptDate;
    }

    /**
     * Sets the value of the expectedReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedReceiptDate(XMLGregorianCalendar value) {
        this.expectedReceiptDate = value;
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
     * Gets the value of the vendorBankAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorBankAccCode() {
        return vendorBankAccCode;
    }

    /**
     * Sets the value of the vendorBankAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorBankAccCode(String value) {
        this.vendorBankAccCode = value;
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
     * Gets the value of the entryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPoint() {
        return entryPoint;
    }

    /**
     * Sets the value of the entryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPoint(String value) {
        this.entryPoint = value;
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
     * Gets the value of the bizTalkPurchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBizTalkPurchaseOrder() {
        return bizTalkPurchaseOrder;
    }

    /**
     * Sets the value of the bizTalkPurchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBizTalkPurchaseOrder(Boolean value) {
        this.bizTalkPurchaseOrder = value;
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
     * Gets the value of the vendorQuoteNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorQuoteNo() {
        return vendorQuoteNo;
    }

    /**
     * Sets the value of the vendorQuoteNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorQuoteNo(String value) {
        this.vendorQuoteNo = value;
    }

    /**
     * Gets the value of the bizTalkPurchOrderCnfmn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBizTalkPurchOrderCnfmn() {
        return bizTalkPurchOrderCnfmn;
    }

    /**
     * Sets the value of the bizTalkPurchOrderCnfmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBizTalkPurchOrderCnfmn(Boolean value) {
        this.bizTalkPurchOrderCnfmn = value;
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
     * Gets the value of the bizTalkPurchaseReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBizTalkPurchaseReceipt() {
        return bizTalkPurchaseReceipt;
    }

    /**
     * Sets the value of the bizTalkPurchaseReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBizTalkPurchaseReceipt(Boolean value) {
        this.bizTalkPurchaseReceipt = value;
    }

    /**
     * Gets the value of the bizTalkPurchaseInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBizTalkPurchaseInvoice() {
        return bizTalkPurchaseInvoice;
    }

    /**
     * Sets the value of the bizTalkPurchaseInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBizTalkPurchaseInvoice(Boolean value) {
        this.bizTalkPurchaseInvoice = value;
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
     * Gets the value of the vendorCrMemoNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCrMemoNo() {
        return vendorCrMemoNo;
    }

    /**
     * Sets the value of the vendorCrMemoNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCrMemoNo(String value) {
        this.vendorCrMemoNo = value;
    }

    /**
     * Gets the value of the purchLines property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderLineList }
     *     
     */
    public PurchaseOrderLineList getPurchLines() {
        return purchLines;
    }

    /**
     * Sets the value of the purchLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderLineList }
     *     
     */
    public void setPurchLines(PurchaseOrderLineList value) {
        this.purchLines = value;
    }

}
