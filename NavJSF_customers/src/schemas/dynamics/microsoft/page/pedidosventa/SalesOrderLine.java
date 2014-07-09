
package schemas.dynamics.microsoft.page.pedidosventa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Sales_Order_Line complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
    @XmlSchemaType(name = "string")
    protected Type type;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Cross_Reference_No")
    protected String crossReferenceNo;
    @XmlElement(name = "IC_Partner_Code")
    protected String icPartnerCode;
    @XmlElement(name = "IC_Partner_Ref_Type")
    @XmlSchemaType(name = "string")
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
    @XmlSchemaType(name = "string")
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
     * Obtiene el valor de la propiedad type.
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
     * Define el valor de la propiedad type.
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
     * Obtiene el valor de la propiedad crossReferenceNo.
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
     * Define el valor de la propiedad crossReferenceNo.
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
     * Obtiene el valor de la propiedad icPartnerCode.
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
     * Define el valor de la propiedad icPartnerCode.
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
     * Obtiene el valor de la propiedad icPartnerRefType.
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
     * Define el valor de la propiedad icPartnerRefType.
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
     * Obtiene el valor de la propiedad icPartnerReference.
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
     * Define el valor de la propiedad icPartnerReference.
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
     * Obtiene el valor de la propiedad variantCode.
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
     * Define el valor de la propiedad variantCode.
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
     * Obtiene el valor de la propiedad substitutionAvailable.
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
     * Define el valor de la propiedad substitutionAvailable.
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
     * Obtiene el valor de la propiedad purchasingCode.
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
     * Define el valor de la propiedad purchasingCode.
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
     * Obtiene el valor de la propiedad nonstock.
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
     * Define el valor de la propiedad nonstock.
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
     * Obtiene el valor de la propiedad vatProdPostingGroup.
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
     * Define el valor de la propiedad vatProdPostingGroup.
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
     * Obtiene el valor de la propiedad description.
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
     * Define el valor de la propiedad description.
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
     * Obtiene el valor de la propiedad dropShipment.
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
     * Define el valor de la propiedad dropShipment.
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
     * Obtiene el valor de la propiedad specialOrder.
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
     * Define el valor de la propiedad specialOrder.
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
     * Obtiene el valor de la propiedad returnReasonCode.
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
     * Define el valor de la propiedad returnReasonCode.
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
     * Obtiene el valor de la propiedad binCode.
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
     * Define el valor de la propiedad binCode.
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
     * Obtiene el valor de la propiedad reserve.
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
     * Define el valor de la propiedad reserve.
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
     * Obtiene el valor de la propiedad quantity.
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
     * Define el valor de la propiedad quantity.
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
     * Obtiene el valor de la propiedad reservedQuantity.
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
     * Define el valor de la propiedad reservedQuantity.
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
     * Obtiene el valor de la propiedad unitOfMeasureCode.
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
     * Define el valor de la propiedad unitOfMeasureCode.
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
     * Obtiene el valor de la propiedad unitOfMeasure.
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
     * Define el valor de la propiedad unitOfMeasure.
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
     * Obtiene el valor de la propiedad unitCostLCY.
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
     * Define el valor de la propiedad unitCostLCY.
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
     * Obtiene el valor de la propiedad salesPriceExist.
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
     * Define el valor de la propiedad salesPriceExist.
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
     * Obtiene el valor de la propiedad unitPrice.
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
     * Define el valor de la propiedad unitPrice.
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
     * Obtiene el valor de la propiedad lineAmount.
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
     * Define el valor de la propiedad lineAmount.
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
     * Obtiene el valor de la propiedad salesLineDiscExists.
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
     * Define el valor de la propiedad salesLineDiscExists.
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
     * Obtiene el valor de la propiedad lineDiscountPercent.
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
     * Define el valor de la propiedad lineDiscountPercent.
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
     * Obtiene el valor de la propiedad lineDiscountAmount.
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
     * Define el valor de la propiedad lineDiscountAmount.
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
     * Obtiene el valor de la propiedad prepmtLineAmount.
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
     * Define el valor de la propiedad prepmtLineAmount.
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
     * Obtiene el valor de la propiedad prepmtAmtInv.
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
     * Define el valor de la propiedad prepmtAmtInv.
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
     * Obtiene el valor de la propiedad allowInvoiceDisc.
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
     * Define el valor de la propiedad allowInvoiceDisc.
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
     * Obtiene el valor de la propiedad invDiscountAmount.
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
     * Define el valor de la propiedad invDiscountAmount.
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
     * Obtiene el valor de la propiedad qtyToShip.
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
     * Define el valor de la propiedad qtyToShip.
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
     * Obtiene el valor de la propiedad quantityShipped.
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
     * Define el valor de la propiedad quantityShipped.
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
     * Obtiene el valor de la propiedad qtyToInvoice.
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
     * Define el valor de la propiedad qtyToInvoice.
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
     * Obtiene el valor de la propiedad quantityInvoiced.
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
     * Define el valor de la propiedad quantityInvoiced.
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
     * Obtiene el valor de la propiedad prepmtAmtToDeduct.
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
     * Define el valor de la propiedad prepmtAmtToDeduct.
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
     * Obtiene el valor de la propiedad prepmtAmtDeducted.
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
     * Define el valor de la propiedad prepmtAmtDeducted.
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
     * Obtiene el valor de la propiedad allowItemChargeAssignment.
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
     * Define el valor de la propiedad allowItemChargeAssignment.
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
     * Obtiene el valor de la propiedad qtyToAssign.
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
     * Define el valor de la propiedad qtyToAssign.
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
     * Obtiene el valor de la propiedad qtyAssigned.
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
     * Define el valor de la propiedad qtyAssigned.
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
     * Obtiene el valor de la propiedad plannedDeliveryDate.
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
     * Define el valor de la propiedad plannedDeliveryDate.
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
     * Obtiene el valor de la propiedad plannedShipmentDate.
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
     * Define el valor de la propiedad plannedShipmentDate.
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
     * Obtiene el valor de la propiedad workTypeCode.
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
     * Define el valor de la propiedad workTypeCode.
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
     * Obtiene el valor de la propiedad whseOutstandingQtyBase.
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
     * Define el valor de la propiedad whseOutstandingQtyBase.
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
     * Obtiene el valor de la propiedad blanketOrderNo.
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
     * Define el valor de la propiedad blanketOrderNo.
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
     * Obtiene el valor de la propiedad blanketOrderLineNo.
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
     * Define el valor de la propiedad blanketOrderLineNo.
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
     * Obtiene el valor de la propiedad faPostingDate.
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
     * Define el valor de la propiedad faPostingDate.
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
     * Obtiene el valor de la propiedad deprUntilFAPostingDate.
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
     * Define el valor de la propiedad deprUntilFAPostingDate.
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
     * Obtiene el valor de la propiedad depreciationBookCode.
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
     * Define el valor de la propiedad depreciationBookCode.
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
     * Obtiene el valor de la propiedad useDuplicationList.
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
     * Define el valor de la propiedad useDuplicationList.
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
     * Obtiene el valor de la propiedad duplicateInDepreciationBook.
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
     * Define el valor de la propiedad duplicateInDepreciationBook.
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
     * Obtiene el valor de la propiedad applFromItemEntry.
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
     * Define el valor de la propiedad applFromItemEntry.
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
     * Obtiene el valor de la propiedad applToItemEntry.
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
     * Define el valor de la propiedad applToItemEntry.
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
     * Obtiene el valor de la propiedad shortcutDimCodeX005B3X005D.
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
     * Define el valor de la propiedad shortcutDimCodeX005B3X005D.
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
     * Obtiene el valor de la propiedad shortcutDimCodeX005B4X005D.
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
     * Define el valor de la propiedad shortcutDimCodeX005B4X005D.
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
     * Obtiene el valor de la propiedad shortcutDimCodeX005B5X005D.
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
     * Define el valor de la propiedad shortcutDimCodeX005B5X005D.
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
     * Obtiene el valor de la propiedad shortcutDimCodeX005B6X005D.
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
     * Define el valor de la propiedad shortcutDimCodeX005B6X005D.
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
     * Obtiene el valor de la propiedad shortcutDimCodeX005B7X005D.
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
     * Define el valor de la propiedad shortcutDimCodeX005B7X005D.
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
     * Obtiene el valor de la propiedad shortcutDimCodeX005B8X005D.
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
     * Define el valor de la propiedad shortcutDimCodeX005B8X005D.
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
     * Obtiene el valor de la propiedad documentNo.
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
     * Define el valor de la propiedad documentNo.
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
     * Obtiene el valor de la propiedad lineNo.
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
     * Define el valor de la propiedad lineNo.
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
