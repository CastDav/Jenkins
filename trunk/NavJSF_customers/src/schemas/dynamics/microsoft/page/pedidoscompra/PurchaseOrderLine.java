
package schemas.dynamics.microsoft.page.pedidoscompra;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Purchase_Order_Line complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the directUnitCost property.
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
     * Sets the value of the directUnitCost property.
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
     * Gets the value of the indirectCostPercent property.
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
     * Sets the value of the indirectCostPercent property.
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
     * Gets the value of the unitPriceLCY property.
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
     * Sets the value of the unitPriceLCY property.
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
     * Gets the value of the qtyToReceive property.
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
     * Sets the value of the qtyToReceive property.
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
     * Gets the value of the quantityReceived property.
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
     * Sets the value of the quantityReceived property.
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
     * Gets the value of the jobNo property.
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
     * Sets the value of the jobNo property.
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
     * Gets the value of the jobTaskNo property.
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
     * Sets the value of the jobTaskNo property.
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
     * Gets the value of the jobLineType property.
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
     * Sets the value of the jobLineType property.
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
     * Gets the value of the jobUnitPrice property.
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
     * Sets the value of the jobUnitPrice property.
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
     * Gets the value of the jobLineAmount property.
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
     * Sets the value of the jobLineAmount property.
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
     * Gets the value of the jobLineDiscountAmount property.
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
     * Sets the value of the jobLineDiscountAmount property.
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
     * Gets the value of the jobLineDiscountPercent property.
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
     * Sets the value of the jobLineDiscountPercent property.
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
     * Gets the value of the jobTotalPrice property.
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
     * Sets the value of the jobTotalPrice property.
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
     * Gets the value of the jobUnitPriceLCY property.
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
     * Sets the value of the jobUnitPriceLCY property.
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
     * Gets the value of the jobTotalPriceLCY property.
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
     * Sets the value of the jobTotalPriceLCY property.
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
     * Gets the value of the jobLineAmountLCY property.
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
     * Sets the value of the jobLineAmountLCY property.
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
     * Gets the value of the jobLineDiscAmountLCY property.
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
     * Sets the value of the jobLineDiscAmountLCY property.
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
     * Gets the value of the plannedReceiptDate property.
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
     * Sets the value of the plannedReceiptDate property.
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
     * Gets the value of the planningFlexibility property.
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
     * Sets the value of the planningFlexibility property.
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
     * Gets the value of the prodOrderNo property.
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
     * Sets the value of the prodOrderNo property.
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
     * Gets the value of the prodOrderLineNo property.
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
     * Sets the value of the prodOrderLineNo property.
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
     * Gets the value of the operationNo property.
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
     * Sets the value of the operationNo property.
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
     * Gets the value of the workCenterNo property.
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
     * Sets the value of the workCenterNo property.
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
     * Gets the value of the finished property.
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
     * Sets the value of the finished property.
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

}
