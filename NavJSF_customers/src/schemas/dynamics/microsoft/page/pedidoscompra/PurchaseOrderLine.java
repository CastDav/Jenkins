
package schemas.dynamics.microsoft.page.pedidoscompra;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Purchase_Order_Line complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Purchase_Order_Line">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}Type" minOccurs="0"/>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cross_Reference_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IC_Partner_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IC_Partner_Ref_Type" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}IC_Partner_Ref_Type" minOccurs="0"/>
 *         &lt;element name="IC_Partner_Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Variant_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nonstock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VAT_Prod_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Drop_Shipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Return_Reason_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bin_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Reserved_Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Unit_of_Measure_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unit_of_Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_Unit_Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Indirect_Cost_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Unit_Cost_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Unit_Price_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Line_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Line_Discount_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Line_Discount_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepayment_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Line_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Amt_Inv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Allow_Invoice_Disc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inv_Discount_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_to_Receive" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity_Received" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_to_Invoice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity_Invoiced" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Amt_to_Deduct" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prepmt_Amt_Deducted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Allow_Item_Charge_Assignment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qty_to_Assign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_Assigned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Job_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Task_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Line_Type" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}Job_Line_Type" minOccurs="0"/>
 *         &lt;element name="Job_Unit_Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Job_Line_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Job_Line_Discount_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Job_Line_Discount_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Job_Total_Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Job_Unit_Price_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Job_Total_Price_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Job_Line_Amount_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Job_Line_Disc_Amount_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Requested_Receipt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Promised_Receipt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Planned_Receipt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expected_Receipt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Order_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Lead_Time_Calculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Planning_Flexibility" type="{urn:microsoft-dynamics-schemas/page/pedidoscompra}Planning_Flexibility" minOccurs="0"/>
 *         &lt;element name="Prod_Order_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prod_Order_Line_No" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Operation_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_Center_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Finished" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Whse_Outstanding_Qty_Base" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Inbound_Whse_Handling_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blanket_Order_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blanket_Order_Line_No" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Appl_to_Item_Entry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Shortcut_Dimension_1_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shortcut_Dimension_2_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_3_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_4_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_5_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_6_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_7_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortcutDimCode_x005B_8_x005D_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Purchase_Order_Line", propOrder = {
    "key",
    "type",
    "no",
    "crossReferenceNo",
    "icPartnerCode",
    "icPartnerRefType",
    "icPartnerReference",
    "variantCode",
    "nonstock",
    "vatProdPostingGroup",
    "description",
    "dropShipment",
    "returnReasonCode",
    "locationCode",
    "binCode",
    "quantity",
    "reservedQuantity",
    "unitOfMeasureCode",
    "unitOfMeasure",
    "directUnitCost",
    "indirectCostPercent",
    "unitCostLCY",
    "unitPriceLCY",
    "lineAmount",
    "lineDiscountPercent",
    "lineDiscountAmount",
    "prepaymentPercent",
    "prepmtLineAmount",
    "prepmtAmtInv",
    "allowInvoiceDisc",
    "invDiscountAmount",
    "qtyToReceive",
    "quantityReceived",
    "qtyToInvoice",
    "quantityInvoiced",
    "prepmtAmtToDeduct",
    "prepmtAmtDeducted",
    "allowItemChargeAssignment",
    "qtyToAssign",
    "qtyAssigned",
    "jobNo",
    "jobTaskNo",
    "jobLineType",
    "jobUnitPrice",
    "jobLineAmount",
    "jobLineDiscountAmount",
    "jobLineDiscountPercent",
    "jobTotalPrice",
    "jobUnitPriceLCY",
    "jobTotalPriceLCY",
    "jobLineAmountLCY",
    "jobLineDiscAmountLCY",
    "requestedReceiptDate",
    "promisedReceiptDate",
    "plannedReceiptDate",
    "expectedReceiptDate",
    "orderDate",
    "leadTimeCalculation",
    "planningFlexibility",
    "prodOrderNo",
    "prodOrderLineNo",
    "operationNo",
    "workCenterNo",
    "finished",
    "whseOutstandingQtyBase",
    "inboundWhseHandlingTime",
    "blanketOrderNo",
    "blanketOrderLineNo",
    "applToItemEntry",
    "shortcutDimension1Code",
    "shortcutDimension2Code",
    "shortcutDimCodeX005B3X005D",
    "shortcutDimCodeX005B4X005D",
    "shortcutDimCodeX005B5X005D",
    "shortcutDimCodeX005B6X005D",
    "shortcutDimCodeX005B7X005D",
    "shortcutDimCodeX005B8X005D"
})
public class PurchaseOrderLine {

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
    @XmlElement(name = "Nonstock")
    protected Boolean nonstock;
    @XmlElement(name = "VAT_Prod_Posting_Group")
    protected String vatProdPostingGroup;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Drop_Shipment")
    protected Boolean dropShipment;
    @XmlElement(name = "Return_Reason_Code")
    protected String returnReasonCode;
    @XmlElement(name = "Location_Code")
    protected String locationCode;
    @XmlElement(name = "Bin_Code")
    protected String binCode;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "Reserved_Quantity")
    protected BigDecimal reservedQuantity;
    @XmlElement(name = "Unit_of_Measure_Code")
    protected String unitOfMeasureCode;
    @XmlElement(name = "Unit_of_Measure")
    protected String unitOfMeasure;
    @XmlElement(name = "Direct_Unit_Cost")
    protected BigDecimal directUnitCost;
    @XmlElement(name = "Indirect_Cost_Percent")
    protected BigDecimal indirectCostPercent;
    @XmlElement(name = "Unit_Cost_LCY")
    protected BigDecimal unitCostLCY;
    @XmlElement(name = "Unit_Price_LCY")
    protected BigDecimal unitPriceLCY;
    @XmlElement(name = "Line_Amount")
    protected BigDecimal lineAmount;
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
    @XmlElement(name = "Qty_to_Receive")
    protected BigDecimal qtyToReceive;
    @XmlElement(name = "Quantity_Received")
    protected BigDecimal quantityReceived;
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
    @XmlElement(name = "Job_No")
    protected String jobNo;
    @XmlElement(name = "Job_Task_No")
    protected String jobTaskNo;
    @XmlElement(name = "Job_Line_Type")
    @XmlSchemaType(name = "string")
    protected JobLineType jobLineType;
    @XmlElement(name = "Job_Unit_Price")
    protected BigDecimal jobUnitPrice;
    @XmlElement(name = "Job_Line_Amount")
    protected BigDecimal jobLineAmount;
    @XmlElement(name = "Job_Line_Discount_Amount")
    protected BigDecimal jobLineDiscountAmount;
    @XmlElement(name = "Job_Line_Discount_Percent")
    protected BigDecimal jobLineDiscountPercent;
    @XmlElement(name = "Job_Total_Price")
    protected BigDecimal jobTotalPrice;
    @XmlElement(name = "Job_Unit_Price_LCY")
    protected BigDecimal jobUnitPriceLCY;
    @XmlElement(name = "Job_Total_Price_LCY")
    protected BigDecimal jobTotalPriceLCY;
    @XmlElement(name = "Job_Line_Amount_LCY")
    protected BigDecimal jobLineAmountLCY;
    @XmlElement(name = "Job_Line_Disc_Amount_LCY")
    protected BigDecimal jobLineDiscAmountLCY;
    @XmlElement(name = "Requested_Receipt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedReceiptDate;
    @XmlElement(name = "Promised_Receipt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar promisedReceiptDate;
    @XmlElement(name = "Planned_Receipt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar plannedReceiptDate;
    @XmlElement(name = "Expected_Receipt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedReceiptDate;
    @XmlElement(name = "Order_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "Lead_Time_Calculation")
    protected String leadTimeCalculation;
    @XmlElement(name = "Planning_Flexibility")
    @XmlSchemaType(name = "string")
    protected PlanningFlexibility planningFlexibility;
    @XmlElement(name = "Prod_Order_No")
    protected String prodOrderNo;
    @XmlElement(name = "Prod_Order_Line_No")
    protected Integer prodOrderLineNo;
    @XmlElement(name = "Operation_No")
    protected String operationNo;
    @XmlElement(name = "Work_Center_No")
    protected String workCenterNo;
    @XmlElement(name = "Finished")
    protected Boolean finished;
    @XmlElement(name = "Whse_Outstanding_Qty_Base")
    protected BigDecimal whseOutstandingQtyBase;
    @XmlElement(name = "Inbound_Whse_Handling_Time")
    protected String inboundWhseHandlingTime;
    @XmlElement(name = "Blanket_Order_No")
    protected String blanketOrderNo;
    @XmlElement(name = "Blanket_Order_Line_No")
    protected Integer blanketOrderLineNo;
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
     * Obtiene el valor de la propiedad directUnitCost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDirectUnitCost() {
        return directUnitCost;
    }

    /**
     * Define el valor de la propiedad directUnitCost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDirectUnitCost(BigDecimal value) {
        this.directUnitCost = value;
    }

    /**
     * Obtiene el valor de la propiedad indirectCostPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndirectCostPercent() {
        return indirectCostPercent;
    }

    /**
     * Define el valor de la propiedad indirectCostPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndirectCostPercent(BigDecimal value) {
        this.indirectCostPercent = value;
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
     * Obtiene el valor de la propiedad unitPriceLCY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPriceLCY() {
        return unitPriceLCY;
    }

    /**
     * Define el valor de la propiedad unitPriceLCY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPriceLCY(BigDecimal value) {
        this.unitPriceLCY = value;
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
     * Obtiene el valor de la propiedad qtyToReceive.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyToReceive() {
        return qtyToReceive;
    }

    /**
     * Define el valor de la propiedad qtyToReceive.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyToReceive(BigDecimal value) {
        this.qtyToReceive = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityReceived.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Define el valor de la propiedad quantityReceived.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityReceived(BigDecimal value) {
        this.quantityReceived = value;
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
     * Obtiene el valor de la propiedad jobNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNo() {
        return jobNo;
    }

    /**
     * Define el valor de la propiedad jobNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNo(String value) {
        this.jobNo = value;
    }

    /**
     * Obtiene el valor de la propiedad jobTaskNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTaskNo() {
        return jobTaskNo;
    }

    /**
     * Define el valor de la propiedad jobTaskNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTaskNo(String value) {
        this.jobTaskNo = value;
    }

    /**
     * Obtiene el valor de la propiedad jobLineType.
     * 
     * @return
     *     possible object is
     *     {@link JobLineType }
     *     
     */
    public JobLineType getJobLineType() {
        return jobLineType;
    }

    /**
     * Define el valor de la propiedad jobLineType.
     * 
     * @param value
     *     allowed object is
     *     {@link JobLineType }
     *     
     */
    public void setJobLineType(JobLineType value) {
        this.jobLineType = value;
    }

    /**
     * Obtiene el valor de la propiedad jobUnitPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobUnitPrice() {
        return jobUnitPrice;
    }

    /**
     * Define el valor de la propiedad jobUnitPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobUnitPrice(BigDecimal value) {
        this.jobUnitPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad jobLineAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobLineAmount() {
        return jobLineAmount;
    }

    /**
     * Define el valor de la propiedad jobLineAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobLineAmount(BigDecimal value) {
        this.jobLineAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad jobLineDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobLineDiscountAmount() {
        return jobLineDiscountAmount;
    }

    /**
     * Define el valor de la propiedad jobLineDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobLineDiscountAmount(BigDecimal value) {
        this.jobLineDiscountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad jobLineDiscountPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobLineDiscountPercent() {
        return jobLineDiscountPercent;
    }

    /**
     * Define el valor de la propiedad jobLineDiscountPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobLineDiscountPercent(BigDecimal value) {
        this.jobLineDiscountPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad jobTotalPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobTotalPrice() {
        return jobTotalPrice;
    }

    /**
     * Define el valor de la propiedad jobTotalPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobTotalPrice(BigDecimal value) {
        this.jobTotalPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad jobUnitPriceLCY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobUnitPriceLCY() {
        return jobUnitPriceLCY;
    }

    /**
     * Define el valor de la propiedad jobUnitPriceLCY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobUnitPriceLCY(BigDecimal value) {
        this.jobUnitPriceLCY = value;
    }

    /**
     * Obtiene el valor de la propiedad jobTotalPriceLCY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobTotalPriceLCY() {
        return jobTotalPriceLCY;
    }

    /**
     * Define el valor de la propiedad jobTotalPriceLCY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobTotalPriceLCY(BigDecimal value) {
        this.jobTotalPriceLCY = value;
    }

    /**
     * Obtiene el valor de la propiedad jobLineAmountLCY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobLineAmountLCY() {
        return jobLineAmountLCY;
    }

    /**
     * Define el valor de la propiedad jobLineAmountLCY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobLineAmountLCY(BigDecimal value) {
        this.jobLineAmountLCY = value;
    }

    /**
     * Obtiene el valor de la propiedad jobLineDiscAmountLCY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobLineDiscAmountLCY() {
        return jobLineDiscAmountLCY;
    }

    /**
     * Define el valor de la propiedad jobLineDiscAmountLCY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobLineDiscAmountLCY(BigDecimal value) {
        this.jobLineDiscAmountLCY = value;
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
     * Obtiene el valor de la propiedad plannedReceiptDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedReceiptDate() {
        return plannedReceiptDate;
    }

    /**
     * Define el valor de la propiedad plannedReceiptDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedReceiptDate(XMLGregorianCalendar value) {
        this.plannedReceiptDate = value;
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
     * Obtiene el valor de la propiedad planningFlexibility.
     * 
     * @return
     *     possible object is
     *     {@link PlanningFlexibility }
     *     
     */
    public PlanningFlexibility getPlanningFlexibility() {
        return planningFlexibility;
    }

    /**
     * Define el valor de la propiedad planningFlexibility.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningFlexibility }
     *     
     */
    public void setPlanningFlexibility(PlanningFlexibility value) {
        this.planningFlexibility = value;
    }

    /**
     * Obtiene el valor de la propiedad prodOrderNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdOrderNo() {
        return prodOrderNo;
    }

    /**
     * Define el valor de la propiedad prodOrderNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdOrderNo(String value) {
        this.prodOrderNo = value;
    }

    /**
     * Obtiene el valor de la propiedad prodOrderLineNo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProdOrderLineNo() {
        return prodOrderLineNo;
    }

    /**
     * Define el valor de la propiedad prodOrderLineNo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProdOrderLineNo(Integer value) {
        this.prodOrderLineNo = value;
    }

    /**
     * Obtiene el valor de la propiedad operationNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationNo() {
        return operationNo;
    }

    /**
     * Define el valor de la propiedad operationNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationNo(String value) {
        this.operationNo = value;
    }

    /**
     * Obtiene el valor de la propiedad workCenterNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCenterNo() {
        return workCenterNo;
    }

    /**
     * Define el valor de la propiedad workCenterNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCenterNo(String value) {
        this.workCenterNo = value;
    }

    /**
     * Obtiene el valor de la propiedad finished.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinished() {
        return finished;
    }

    /**
     * Define el valor de la propiedad finished.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinished(Boolean value) {
        this.finished = value;
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

}
