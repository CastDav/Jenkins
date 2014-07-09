
package schemas.dynamics.microsoft.page.pedidoscompra;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para PedidosCompra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
    @XmlSchemaType(name = "string")
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
     * Obtiene el valor de la propiedad buyFromVendorNo.
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
     * Define el valor de la propiedad buyFromVendorNo.
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
     * Obtiene el valor de la propiedad buyFromContactNo.
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
     * Define el valor de la propiedad buyFromContactNo.
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
     * Obtiene el valor de la propiedad buyFromVendorName.
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
     * Define el valor de la propiedad buyFromVendorName.
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
     * Obtiene el valor de la propiedad buyFromAddress.
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
     * Define el valor de la propiedad buyFromAddress.
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
     * Obtiene el valor de la propiedad buyFromAddress2.
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
     * Define el valor de la propiedad buyFromAddress2.
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
     * Obtiene el valor de la propiedad buyFromPostCode.
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
     * Define el valor de la propiedad buyFromPostCode.
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
     * Obtiene el valor de la propiedad buyFromCity.
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
     * Define el valor de la propiedad buyFromCity.
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
     * Obtiene el valor de la propiedad buyFromCounty.
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
     * Define el valor de la propiedad buyFromCounty.
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
     * Obtiene el valor de la propiedad buyFromContact.
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
     * Define el valor de la propiedad buyFromContact.
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
     * Obtiene el valor de la propiedad vendorOrderNo.
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
     * Define el valor de la propiedad vendorOrderNo.
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
     * Obtiene el valor de la propiedad vendorShipmentNo.
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
     * Define el valor de la propiedad vendorShipmentNo.
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
     * Obtiene el valor de la propiedad vendorInvoiceNo.
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
     * Define el valor de la propiedad vendorInvoiceNo.
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
     * Obtiene el valor de la propiedad orderAddressCode.
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
     * Define el valor de la propiedad orderAddressCode.
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
     * Obtiene el valor de la propiedad purchaserCode.
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
     * Define el valor de la propiedad purchaserCode.
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
     * Obtiene el valor de la propiedad payToVendorNo.
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
     * Define el valor de la propiedad payToVendorNo.
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
     * Obtiene el valor de la propiedad payToContactNo.
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
     * Define el valor de la propiedad payToContactNo.
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
     * Obtiene el valor de la propiedad payToName.
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
     * Define el valor de la propiedad payToName.
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
     * Obtiene el valor de la propiedad payToAddress.
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
     * Define el valor de la propiedad payToAddress.
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
     * Obtiene el valor de la propiedad payToAddress2.
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
     * Define el valor de la propiedad payToAddress2.
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
     * Obtiene el valor de la propiedad payToPostCode.
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
     * Define el valor de la propiedad payToPostCode.
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
     * Obtiene el valor de la propiedad payToCity.
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
     * Define el valor de la propiedad payToCity.
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
     * Obtiene el valor de la propiedad payToCounty.
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
     * Define el valor de la propiedad payToCounty.
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
     * Obtiene el valor de la propiedad payToContact.
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
     * Define el valor de la propiedad payToContact.
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
     * Obtiene el valor de la propiedad onHold.
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
     * Define el valor de la propiedad onHold.
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
     * Obtiene el valor de la propiedad inboundWhseHandlingTime.
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
     * Define el valor de la propiedad inboundWhseHandlingTime.
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
     * Obtiene el valor de la propiedad leadTimeCalculation.
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
     * Define el valor de la propiedad leadTimeCalculation.
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
     * Obtiene el valor de la propiedad requestedReceiptDate.
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
     * Define el valor de la propiedad requestedReceiptDate.
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
     * Obtiene el valor de la propiedad promisedReceiptDate.
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
     * Define el valor de la propiedad promisedReceiptDate.
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
     * Obtiene el valor de la propiedad expectedReceiptDate.
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
     * Define el valor de la propiedad expectedReceiptDate.
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
     * Obtiene el valor de la propiedad vendorBankAccCode.
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
     * Define el valor de la propiedad vendorBankAccCode.
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
     * Obtiene el valor de la propiedad entryPoint.
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
     * Define el valor de la propiedad entryPoint.
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
     * Obtiene el valor de la propiedad bizTalkPurchaseOrder.
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
     * Define el valor de la propiedad bizTalkPurchaseOrder.
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
     * Obtiene el valor de la propiedad vendorQuoteNo.
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
     * Define el valor de la propiedad vendorQuoteNo.
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
     * Obtiene el valor de la propiedad bizTalkPurchOrderCnfmn.
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
     * Define el valor de la propiedad bizTalkPurchOrderCnfmn.
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
     * Obtiene el valor de la propiedad bizTalkPurchaseReceipt.
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
     * Define el valor de la propiedad bizTalkPurchaseReceipt.
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
     * Obtiene el valor de la propiedad bizTalkPurchaseInvoice.
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
     * Define el valor de la propiedad bizTalkPurchaseInvoice.
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
     * Obtiene el valor de la propiedad vendorCrMemoNo.
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
     * Define el valor de la propiedad vendorCrMemoNo.
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
     * Obtiene el valor de la propiedad purchLines.
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
     * Define el valor de la propiedad purchLines.
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
