
package schemas.dynamics.microsoft.page.pedidosventa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Sales_Order_Line complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sales_Order_Line">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}Type" minOccurs="0"/>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cross_Reference_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IC_Partner_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IC_Partner_Ref_Type" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}IC_Partner_Ref_Type" minOccurs="0"/>
 *         &lt;element name="IC_Partner_Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Variant_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Substitution_Available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Purchasing_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nonstock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VAT_Prod_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Drop_Shipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Special_Order" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Return_Reason_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bin_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reserve" type="{urn:microsoft-dynamics-schemas/page/pedidosventa}Reserve" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Reserved_Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Unit_of_Measure_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unit_of_Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unit_Cost_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesPriceExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Unit_Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Line_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesLineDiscExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Line_Discount_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Line_Discount_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepayment_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Line_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Amt_Inv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Allow_Invoice_Disc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inv_Discount_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_to_Ship" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity_Shipped" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_to_Invoice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity_Invoiced" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Amt_to_Deduct" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Amt_Deducted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Allow_Item_Charge_Assignment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qty_to_Assign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_Assigned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Requested_Delivery_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Promised_Delivery_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Planned_Delivery_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Planned_Shipment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Shipment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Shipping_Agent_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Agent_Service_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Whse_Outstanding_Qty_Base" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Outbound_Whse_Handling_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blanket_Order_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blanket_Order_Line_No" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FA_Posting_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Depr_until_FA_Posting_Date" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Depreciation_Book_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Use_Duplication_List" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Duplicate_in_Depreciation_Book" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Appl_from_Item_Entry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Appl_to_Item_Entry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Shortcut_Dimension_1_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shortcut_Dimension_2_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_3_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_4_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_5_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_6_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_7_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_8_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Document_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line_No" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sales_Order_Line", propOrder = {
    "key",
    "type",
    "no",
    "crossReferenceNo",
    "icPartnerCode",
    "icPartnerRefType",
    "icPartnerReference",
    "variantCode",
    "substitutionAvailable",
    "purchasingCode",
    "nonstock",
    "vatProdPostingGroup",
    "description",
    "dropShipment",
    "specialOrder",
    "returnReasonCode",
    "locationCode",
    "binCode",
    "reserve",
    "quantity",
    "reservedQuantity",
    "unitOfMeasureCode",
    "unitOfMeasure",
    "unitCostLCY",
    "salesPriceExist",
    "unitPrice",
    "lineAmount",
    "salesLineDiscExists",
    "lineDiscountPercent",
    "lineDiscountAmount",
    "prepaymentPercent",
    "prepmtLineAmount",
    "prepmtAmtInv",
    "allowInvoiceDisc",
    "invDiscountAmount",
    "qtyToShip",
    "quantityShipped",
    "qtyToInvoice",
    "quantityInvoiced",
    "prepmtAmtToDeduct",
    "prepmtAmtDeducted",
    "allowItemChargeAssignment",
    "qtyToAssign",
    "qtyAssigned",
    "requestedDeliveryDate",
    "promisedDeliveryDate",
    "plannedDeliveryDate",
    "plannedShipmentDate",
    "shipmentDate",
    "shippingAgentCode",
    "shippingAgentServiceCode",
    "shippingTime",
    "workTypeCode",
    "whseOutstandingQtyBase",
    "outboundWhseHandlingTime",
    "blanketOrderNo",
    "blanketOrderLineNo",
    "faPostingDate",
    "deprUntilFAPostingDate",
    "depreciationBookCode",
    "useDuplicationList",
    "duplicateInDepreciationBook",
    "applFromItemEntry",
    "applToItemEntry",
    "shortcutDimension1Code",
    "shortcutDimension2Code",
    "shortcutDimCodeX005B3X005D",
    "shortcutDimCodeX005B4X005D",
    "shortcutDimCodeX005B5X005D",
    "shortcutDimCodeX005B6X005D",
    "shortcutDimCodeX005B7X005D",
    "shortcutDimCodeX005B8X005D",
    "documentNo",
    "lineNo"
})
public class SalesOrderLine {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Type")
    protected Type type;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Cross_Reference_No")
    protected String crossReferenceNo;
    @XmlElement(name = "IC_Partner_Code")
    protected String icPartnerCode;
    @XmlElement(name = "IC_Partner_Ref_Type")
    protected ICPartnerRefType icPartnerRefType;
    @XmlElement(name = "IC_Partner_Reference")
    protected String icPartnerReference;
    @XmlElement(name = "Variant_Code")
    protected String variantCode;
    @XmlElement(name = "Substitution_Available")
    protected Boolean substitutionAvailable;
    @XmlElement(name = "Purchasing_Code")
    protected String purchasingCode;
    @XmlElement(name = "Nonstock")
    protected Boolean nonstock;
    @XmlElement(name = "VAT_Prod_Posting_Group")
    protected String vatProdPostingGroup;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Drop_Shipment")
    protected Boolean dropShipment;
    @XmlElement(name = "Special_Order")
    protected Boolean specialOrder;
    @XmlElement(name = "Return_Reason_Code")
    protected String returnReasonCode;
    @XmlElement(name = "Location_Code")
    protected String locationCode;
    @XmlElement(name = "Bin_Code")
    protected String binCode;
    @XmlElement(name = "Reserve")
    protected Reserve reserve;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "Reserved_Quantity")
    protected BigDecimal reservedQuantity;
    @XmlElement(name = "Unit_of_Measure_Code")
    protected String unitOfMeasureCode;
    @XmlElement(name = "Unit_of_Measure")
    protected String unitOfMeasure;
    @XmlElement(name = "Unit_Cost_LCY")
    protected BigDecimal unitCostLCY;
    @XmlElement(name = "SalesPriceExist")
    protected Boolean salesPriceExist;
    @XmlElement(name = "Unit_Price")
    protected BigDecimal unitPrice;
    @XmlElement(name = "Line_Amount")
    protected BigDecimal lineAmount;
    @XmlElement(name = "SalesLineDiscExists")
    protected Boolean salesLineDiscExists;
    @XmlElement(name = "Line_Discount_Percent")
    protected BigDecimal lineDiscountPercent;
    @XmlElement(name = "Line_Discount_Amount")
    protected BigDecimal lineDiscountAmount;
    @XmlElement(name = "Prepayment_Percent")
    protected BigDecimal prepaymentPercent;
    @XmlElement(name = "Prepmt_Line_Amount")
    protected BigDecimal prepmtLineAmount;
    @XmlElement(name = "Prepmt_Amt_Inv")
    protected BigDecimal prepmtAmtInv;
    @XmlElement(name = "Allow_Invoice_Disc")
    protected Boolean allowInvoiceDisc;
    @XmlElement(name = "Inv_Discount_Amount")
    protected BigDecimal invDiscountAmount;
    @XmlElement(name = "Qty_to_Ship")
    protected BigDecimal qtyToShip;
    @XmlElement(name = "Quantity_Shipped")
    protected BigDecimal quantityShipped;
    @XmlElement(name = "Qty_to_Invoice")
    protected BigDecimal qtyToInvoice;
    @XmlElement(name = "Quantity_Invoiced")
    protected BigDecimal quantityInvoiced;
    @XmlElement(name = "Prepmt_Amt_to_Deduct")
    protected BigDecimal prepmtAmtToDeduct;
    @XmlElement(name = "Prepmt_Amt_Deducted")
    protected BigDecimal prepmtAmtDeducted;
    @XmlElement(name = "Allow_Item_Charge_Assignment")
    protected Boolean allowItemChargeAssignment;
    @XmlElement(name = "Qty_to_Assign")
    protected BigDecimal qtyToAssign;
    @XmlElement(name = "Qty_Assigned")
    protected BigDecimal qtyAssigned;
    @XmlElement(name = "Requested_Delivery_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDeliveryDate;
    @XmlElement(name = "Promised_Delivery_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar promisedDeliveryDate;
    @XmlElement(name = "Planned_Delivery_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar plannedDeliveryDate;
    @XmlElement(name = "Planned_Shipment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar plannedShipmentDate;
    @XmlElement(name = "Shipment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipmentDate;
    @XmlElement(name = "Shipping_Agent_Code")
    protected String shippingAgentCode;
    @XmlElement(name = "Shipping_Agent_Service_Code")
    protected String shippingAgentServiceCode;
    @XmlElement(name = "Shipping_Time")
    protected String shippingTime;
    @XmlElement(name = "Work_Type_Code")
    protected String workTypeCode;
    @XmlElement(name = "Whse_Outstanding_Qty_Base")
    protected BigDecimal whseOutstandingQtyBase;
    @XmlElement(name = "Outbound_Whse_Handling_Time")
    protected String outboundWhseHandlingTime;
    @XmlElement(name = "Blanket_Order_No")
    protected String blanketOrderNo;
    @XmlElement(name = "Blanket_Order_Line_No")
    protected Integer blanketOrderLineNo;
    @XmlElement(name = "FA_Posting_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar faPostingDate;
    @XmlElement(name = "Depr_until_FA_Posting_Date")
    protected Boolean deprUntilFAPostingDate;
    @XmlElement(name = "Depreciation_Book_Code")
    protected String depreciationBookCode;
    @XmlElement(name = "Use_Duplication_List")
    protected Boolean useDuplicationList;
    @XmlElement(name = "Duplicate_in_Depreciation_Book")
    protected String duplicateInDepreciationBook;
    @XmlElement(name = "Appl_from_Item_Entry")
    protected Integer applFromItemEntry;
    @XmlElement(name = "Appl_to_Item_Entry")
    protected Integer applToItemEntry;
    @XmlElement(name = "Shortcut_Dimension_1_Code")
    protected String shortcutDimension1Code;
    @XmlElement(name = "Shortcut_Dimension_2_Code")
    protected String shortcutDimension2Code;
    @XmlElement(name = "ShortcutDimCode_x005B_3_x005D_")
    protected String shortcutDimCodeX005B3X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_4_x005D_")
    protected String shortcutDimCodeX005B4X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_5_x005D_")
    protected String shortcutDimCodeX005B5X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_6_x005D_")
    protected String shortcutDimCodeX005B6X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_7_x005D_")
    protected String shortcutDimCodeX005B7X005D;
    @XmlElement(name = "ShortcutDimCode_x005B_8_x005D_")
    protected String shortcutDimCodeX005B8X005D;
    @XmlElement(name = "Document_No")
    protected String documentNo;
    @XmlElement(name = "Line_No")
    protected Integer lineNo;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
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
     * Gets the value of the crossReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossReferenceNo() {
        return crossReferenceNo;
    }

    /**
     * Sets the value of the crossReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossReferenceNo(String value) {
        this.crossReferenceNo = value;
    }

    /**
     * Gets the value of the icPartnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICPartnerCode() {
        return icPartnerCode;
    }

    /**
     * Sets the value of the icPartnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICPartnerCode(String value) {
        this.icPartnerCode = value;
    }

    /**
     * Gets the value of the icPartnerRefType property.
     * 
     * @return
     *     possible object is
     *     {@link ICPartnerRefType }
     *     
     */
    public ICPartnerRefType getICPartnerRefType() {
        return icPartnerRefType;
    }

    /**
     * Sets the value of the icPartnerRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICPartnerRefType }
     *     
     */
    public void setICPartnerRefType(ICPartnerRefType value) {
        this.icPartnerRefType = value;
    }

    /**
     * Gets the value of the icPartnerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICPartnerReference() {
        return icPartnerReference;
    }

    /**
     * Sets the value of the icPartnerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICPartnerReference(String value) {
        this.icPartnerReference = value;
    }

    /**
     * Gets the value of the variantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantCode() {
        return variantCode;
    }

    /**
     * Sets the value of the variantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantCode(String value) {
        this.variantCode = value;
    }

    /**
     * Gets the value of the substitutionAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubstitutionAvailable() {
        return substitutionAvailable;
    }

    /**
     * Sets the value of the substitutionAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubstitutionAvailable(Boolean value) {
        this.substitutionAvailable = value;
    }

    /**
     * Gets the value of the purchasingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingCode() {
        return purchasingCode;
    }

    /**
     * Sets the value of the purchasingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingCode(String value) {
        this.purchasingCode = value;
    }

    /**
     * Gets the value of the nonstock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonstock() {
        return nonstock;
    }

    /**
     * Sets the value of the nonstock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonstock(Boolean value) {
        this.nonstock = value;
    }

    /**
     * Gets the value of the vatProdPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATProdPostingGroup() {
        return vatProdPostingGroup;
    }

    /**
     * Sets the value of the vatProdPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATProdPostingGroup(String value) {
        this.vatProdPostingGroup = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dropShipment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropShipment() {
        return dropShipment;
    }

    /**
     * Sets the value of the dropShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropShipment(Boolean value) {
        this.dropShipment = value;
    }

    /**
     * Gets the value of the specialOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialOrder() {
        return specialOrder;
    }

    /**
     * Sets the value of the specialOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialOrder(Boolean value) {
        this.specialOrder = value;
    }

    /**
     * Gets the value of the returnReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnReasonCode() {
        return returnReasonCode;
    }

    /**
     * Sets the value of the returnReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnReasonCode(String value) {
        this.returnReasonCode = value;
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
     * Gets the value of the binCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinCode() {
        return binCode;
    }

    /**
     * Sets the value of the binCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinCode(String value) {
        this.binCode = value;
    }

    /**
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link Reserve }
     *     
     */
    public Reserve getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reserve }
     *     
     */
    public void setReserve(Reserve value) {
        this.reserve = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the reservedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservedQuantity() {
        return reservedQuantity;
    }

    /**
     * Sets the value of the reservedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservedQuantity(BigDecimal value) {
        this.reservedQuantity = value;
    }

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the unitCostLCY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCostLCY() {
        return unitCostLCY;
    }

    /**
     * Sets the value of the unitCostLCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCostLCY(BigDecimal value) {
        this.unitCostLCY = value;
    }

    /**
     * Gets the value of the salesPriceExist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesPriceExist() {
        return salesPriceExist;
    }

    /**
     * Sets the value of the salesPriceExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesPriceExist(Boolean value) {
        this.salesPriceExist = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the lineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineAmount() {
        return lineAmount;
    }

    /**
     * Sets the value of the lineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineAmount(BigDecimal value) {
        this.lineAmount = value;
    }

    /**
     * Gets the value of the salesLineDiscExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesLineDiscExists() {
        return salesLineDiscExists;
    }

    /**
     * Sets the value of the salesLineDiscExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesLineDiscExists(Boolean value) {
        this.salesLineDiscExists = value;
    }

    /**
     * Gets the value of the lineDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineDiscountPercent() {
        return lineDiscountPercent;
    }

    /**
     * Sets the value of the lineDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineDiscountPercent(BigDecimal value) {
        this.lineDiscountPercent = value;
    }

    /**
     * Gets the value of the lineDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineDiscountAmount() {
        return lineDiscountAmount;
    }

    /**
     * Sets the value of the lineDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineDiscountAmount(BigDecimal value) {
        this.lineDiscountAmount = value;
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
     * Gets the value of the prepmtLineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepmtLineAmount() {
        return prepmtLineAmount;
    }

    /**
     * Sets the value of the prepmtLineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepmtLineAmount(BigDecimal value) {
        this.prepmtLineAmount = value;
    }

    /**
     * Gets the value of the prepmtAmtInv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepmtAmtInv() {
        return prepmtAmtInv;
    }

    /**
     * Sets the value of the prepmtAmtInv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepmtAmtInv(BigDecimal value) {
        this.prepmtAmtInv = value;
    }

    /**
     * Gets the value of the allowInvoiceDisc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowInvoiceDisc() {
        return allowInvoiceDisc;
    }

    /**
     * Sets the value of the allowInvoiceDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowInvoiceDisc(Boolean value) {
        this.allowInvoiceDisc = value;
    }

    /**
     * Gets the value of the invDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvDiscountAmount() {
        return invDiscountAmount;
    }

    /**
     * Sets the value of the invDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvDiscountAmount(BigDecimal value) {
        this.invDiscountAmount = value;
    }

    /**
     * Gets the value of the qtyToShip property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyToShip() {
        return qtyToShip;
    }

    /**
     * Sets the value of the qtyToShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyToShip(BigDecimal value) {
        this.qtyToShip = value;
    }

    /**
     * Gets the value of the quantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Sets the value of the quantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityShipped(BigDecimal value) {
        this.quantityShipped = value;
    }

    /**
     * Gets the value of the qtyToInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyToInvoice() {
        return qtyToInvoice;
    }

    /**
     * Sets the value of the qtyToInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyToInvoice(BigDecimal value) {
        this.qtyToInvoice = value;
    }

    /**
     * Gets the value of the quantityInvoiced property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityInvoiced() {
        return quantityInvoiced;
    }

    /**
     * Sets the value of the quantityInvoiced property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityInvoiced(BigDecimal value) {
        this.quantityInvoiced = value;
    }

    /**
     * Gets the value of the prepmtAmtToDeduct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepmtAmtToDeduct() {
        return prepmtAmtToDeduct;
    }

    /**
     * Sets the value of the prepmtAmtToDeduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepmtAmtToDeduct(BigDecimal value) {
        this.prepmtAmtToDeduct = value;
    }

    /**
     * Gets the value of the prepmtAmtDeducted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepmtAmtDeducted() {
        return prepmtAmtDeducted;
    }

    /**
     * Sets the value of the prepmtAmtDeducted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepmtAmtDeducted(BigDecimal value) {
        this.prepmtAmtDeducted = value;
    }

    /**
     * Gets the value of the allowItemChargeAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowItemChargeAssignment() {
        return allowItemChargeAssignment;
    }

    /**
     * Sets the value of the allowItemChargeAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowItemChargeAssignment(Boolean value) {
        this.allowItemChargeAssignment = value;
    }

    /**
     * Gets the value of the qtyToAssign property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyToAssign() {
        return qtyToAssign;
    }

    /**
     * Sets the value of the qtyToAssign property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyToAssign(BigDecimal value) {
        this.qtyToAssign = value;
    }

    /**
     * Gets the value of the qtyAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyAssigned() {
        return qtyAssigned;
    }

    /**
     * Sets the value of the qtyAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyAssigned(BigDecimal value) {
        this.qtyAssigned = value;
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
     * Gets the value of the plannedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedDeliveryDate() {
        return plannedDeliveryDate;
    }

    /**
     * Sets the value of the plannedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedDeliveryDate(XMLGregorianCalendar value) {
        this.plannedDeliveryDate = value;
    }

    /**
     * Gets the value of the plannedShipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedShipmentDate() {
        return plannedShipmentDate;
    }

    /**
     * Sets the value of the plannedShipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedShipmentDate(XMLGregorianCalendar value) {
        this.plannedShipmentDate = value;
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
     * Gets the value of the workTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTypeCode() {
        return workTypeCode;
    }

    /**
     * Sets the value of the workTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTypeCode(String value) {
        this.workTypeCode = value;
    }

    /**
     * Gets the value of the whseOutstandingQtyBase property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWhseOutstandingQtyBase() {
        return whseOutstandingQtyBase;
    }

    /**
     * Sets the value of the whseOutstandingQtyBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWhseOutstandingQtyBase(BigDecimal value) {
        this.whseOutstandingQtyBase = value;
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
     * Gets the value of the blanketOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlanketOrderNo() {
        return blanketOrderNo;
    }

    /**
     * Sets the value of the blanketOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlanketOrderNo(String value) {
        this.blanketOrderNo = value;
    }

    /**
     * Gets the value of the blanketOrderLineNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlanketOrderLineNo() {
        return blanketOrderLineNo;
    }

    /**
     * Sets the value of the blanketOrderLineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlanketOrderLineNo(Integer value) {
        this.blanketOrderLineNo = value;
    }

    /**
     * Gets the value of the faPostingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFAPostingDate() {
        return faPostingDate;
    }

    /**
     * Sets the value of the faPostingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFAPostingDate(XMLGregorianCalendar value) {
        this.faPostingDate = value;
    }

    /**
     * Gets the value of the deprUntilFAPostingDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeprUntilFAPostingDate() {
        return deprUntilFAPostingDate;
    }

    /**
     * Sets the value of the deprUntilFAPostingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprUntilFAPostingDate(Boolean value) {
        this.deprUntilFAPostingDate = value;
    }

    /**
     * Gets the value of the depreciationBookCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepreciationBookCode() {
        return depreciationBookCode;
    }

    /**
     * Sets the value of the depreciationBookCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepreciationBookCode(String value) {
        this.depreciationBookCode = value;
    }

    /**
     * Gets the value of the useDuplicationList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDuplicationList() {
        return useDuplicationList;
    }

    /**
     * Sets the value of the useDuplicationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDuplicationList(Boolean value) {
        this.useDuplicationList = value;
    }

    /**
     * Gets the value of the duplicateInDepreciationBook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateInDepreciationBook() {
        return duplicateInDepreciationBook;
    }

    /**
     * Sets the value of the duplicateInDepreciationBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateInDepreciationBook(String value) {
        this.duplicateInDepreciationBook = value;
    }

    /**
     * Gets the value of the applFromItemEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplFromItemEntry() {
        return applFromItemEntry;
    }

    /**
     * Sets the value of the applFromItemEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplFromItemEntry(Integer value) {
        this.applFromItemEntry = value;
    }

    /**
     * Gets the value of the applToItemEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplToItemEntry() {
        return applToItemEntry;
    }

    /**
     * Sets the value of the applToItemEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplToItemEntry(Integer value) {
        this.applToItemEntry = value;
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
     * Gets the value of the shortcutDimCodeX005B3X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B3X005D() {
        return shortcutDimCodeX005B3X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B3X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B3X005D(String value) {
        this.shortcutDimCodeX005B3X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B4X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B4X005D() {
        return shortcutDimCodeX005B4X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B4X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B4X005D(String value) {
        this.shortcutDimCodeX005B4X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B5X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B5X005D() {
        return shortcutDimCodeX005B5X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B5X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B5X005D(String value) {
        this.shortcutDimCodeX005B5X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B6X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B6X005D() {
        return shortcutDimCodeX005B6X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B6X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B6X005D(String value) {
        this.shortcutDimCodeX005B6X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B7X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B7X005D() {
        return shortcutDimCodeX005B7X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B7X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B7X005D(String value) {
        this.shortcutDimCodeX005B7X005D = value;
    }

    /**
     * Gets the value of the shortcutDimCodeX005B8X005D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutDimCodeX005B8X005D() {
        return shortcutDimCodeX005B8X005D;
    }

    /**
     * Sets the value of the shortcutDimCodeX005B8X005D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutDimCodeX005B8X005D(String value) {
        this.shortcutDimCodeX005B8X005D = value;
    }

    /**
     * Gets the value of the documentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNo() {
        return documentNo;
    }

    /**
     * Sets the value of the documentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNo(String value) {
        this.documentNo = value;
    }

    /**
     * Gets the value of the lineNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNo() {
        return lineNo;
    }

    /**
     * Sets the value of the lineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNo(Integer value) {
        this.lineNo = value;
    }

}
