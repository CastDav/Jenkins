
package schemas.dynamics.microsoft.page.product;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Product complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created_From_Nonstock_Item" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Substitutes_Exist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Stockkeeping_Unit_Exists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Bill_of_Materials" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Production_BOM_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Routing_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Base_Unit_of_Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shelf_Bin_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Costing_Method" type="{urn:microsoft-dynamics-schemas/page/product}Costing_Method" minOccurs="0"/>
 *         &lt;element name="Cost_is_Adjusted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Unit_Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Last_Direct_Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Price_Profit_Calculation" type="{urn:microsoft-dynamics-schemas/page/product}Price_Profit_Calculation" minOccurs="0"/>
 *         &lt;element name="Profit_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Unit_Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Inventory_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gen_Prod_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VAT_Prod_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_Disc_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Item_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tariff_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Search_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Overhead_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Indirect_Cost_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Item_Category_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Group_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Last_Date_Modified" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Sales_Unit_of_Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Replenishment_System" type="{urn:microsoft-dynamics-schemas/page/product}Replenishment_System" minOccurs="0"/>
 *         &lt;element name="Purch_Unit_of_Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Time_Calculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturing_Policy" type="{urn:microsoft-dynamics-schemas/page/product}Manufacturing_Policy" minOccurs="0"/>
 *         &lt;element name="Flushing_Method" type="{urn:microsoft-dynamics-schemas/page/product}Flushing_Method" minOccurs="0"/>
 *         &lt;element name="qtyOnPurchOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="qtyOnSalesOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numUnidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_Tracking_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "key",
    "no",
    "description",
    "createdFromNonstockItem",
    "substitutesExist",
    "stockkeepingUnitExists",
    "billOfMaterials",
    "productionBOMNo",
    "routingNo",
    "baseUnitOfMeasure",
    "shelfBinNo",
    "costingMethod",
    "costIsAdjusted",
    "standardCost",
    "unitCost",
    "lastDirectCost",
    "priceProfitCalculation",
    "profitPercent",
    "unitPrice",
    "inventoryPostingGroup",
    "genProdPostingGroup",
    "vatProdPostingGroup",
    "itemDiscGroup",
    "vendorNo",
    "vendorItemNo",
    "tariffNo",
    "searchDescription",
    "overheadRate",
    "indirectCostPercent",
    "itemCategoryCode",
    "productGroupCode",
    "blocked",
    "lastDateModified",
    "salesUnitOfMeasure",
    "replenishmentSystem",
    "purchUnitOfMeasure",
    "leadTimeCalculation",
    "manufacturingPolicy",
    "flushingMethod",
    "qtyOnPurchOrder",
    "inventory",
    "qtyOnSalesOrder",
    "numUnidades",
    "itemTrackingCode"
})
public class Product {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Created_From_Nonstock_Item")
    protected Boolean createdFromNonstockItem;
    @XmlElement(name = "Substitutes_Exist")
    protected Boolean substitutesExist;
    @XmlElement(name = "Stockkeeping_Unit_Exists")
    protected Boolean stockkeepingUnitExists;
    @XmlElement(name = "Bill_of_Materials")
    protected Boolean billOfMaterials;
    @XmlElement(name = "Production_BOM_No")
    protected String productionBOMNo;
    @XmlElement(name = "Routing_No")
    protected String routingNo;
    @XmlElement(name = "Base_Unit_of_Measure")
    protected String baseUnitOfMeasure;
    @XmlElement(name = "Shelf_Bin_No")
    protected String shelfBinNo;
    @XmlElement(name = "Costing_Method")
    @XmlSchemaType(name = "string")
    protected CostingMethod costingMethod;
    @XmlElement(name = "Cost_is_Adjusted")
    protected Boolean costIsAdjusted;
    @XmlElement(name = "Standard_Cost")
    protected BigDecimal standardCost;
    @XmlElement(name = "Unit_Cost")
    protected BigDecimal unitCost;
    @XmlElement(name = "Last_Direct_Cost")
    protected BigDecimal lastDirectCost;
    @XmlElement(name = "Price_Profit_Calculation")
    @XmlSchemaType(name = "string")
    protected PriceProfitCalculation priceProfitCalculation;
    @XmlElement(name = "Profit_Percent")
    protected BigDecimal profitPercent;
    @XmlElement(name = "Unit_Price")
    protected BigDecimal unitPrice;
    @XmlElement(name = "Inventory_Posting_Group")
    protected String inventoryPostingGroup;
    @XmlElement(name = "Gen_Prod_Posting_Group")
    protected String genProdPostingGroup;
    @XmlElement(name = "VAT_Prod_Posting_Group")
    protected String vatProdPostingGroup;
    @XmlElement(name = "Item_Disc_Group")
    protected String itemDiscGroup;
    @XmlElement(name = "Vendor_No")
    protected String vendorNo;
    @XmlElement(name = "Vendor_Item_No")
    protected String vendorItemNo;
    @XmlElement(name = "Tariff_No")
    protected String tariffNo;
    @XmlElement(name = "Search_Description")
    protected String searchDescription;
    @XmlElement(name = "Overhead_Rate")
    protected BigDecimal overheadRate;
    @XmlElement(name = "Indirect_Cost_Percent")
    protected BigDecimal indirectCostPercent;
    @XmlElement(name = "Item_Category_Code")
    protected String itemCategoryCode;
    @XmlElement(name = "Product_Group_Code")
    protected String productGroupCode;
    @XmlElement(name = "Blocked")
    protected Boolean blocked;
    @XmlElement(name = "Last_Date_Modified")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateModified;
    @XmlElement(name = "Sales_Unit_of_Measure")
    protected String salesUnitOfMeasure;
    @XmlElement(name = "Replenishment_System")
    @XmlSchemaType(name = "string")
    protected ReplenishmentSystem replenishmentSystem;
    @XmlElement(name = "Purch_Unit_of_Measure")
    protected String purchUnitOfMeasure;
    @XmlElement(name = "Lead_Time_Calculation")
    protected String leadTimeCalculation;
    @XmlElement(name = "Manufacturing_Policy")
    @XmlSchemaType(name = "string")
    protected ManufacturingPolicy manufacturingPolicy;
    @XmlElement(name = "Flushing_Method")
    @XmlSchemaType(name = "string")
    protected FlushingMethod flushingMethod;
    protected BigDecimal qtyOnPurchOrder;
    @XmlElement(name = "Inventory")
    protected BigDecimal inventory;
    protected BigDecimal qtyOnSalesOrder;
    protected String numUnidades;
    @XmlElement(name = "Item_Tracking_Code")
    protected String itemTrackingCode;

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
     * Obtiene el valor de la propiedad createdFromNonstockItem.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatedFromNonstockItem() {
        return createdFromNonstockItem;
    }

    /**
     * Define el valor de la propiedad createdFromNonstockItem.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatedFromNonstockItem(Boolean value) {
        this.createdFromNonstockItem = value;
    }

    /**
     * Obtiene el valor de la propiedad substitutesExist.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubstitutesExist() {
        return substitutesExist;
    }

    /**
     * Define el valor de la propiedad substitutesExist.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubstitutesExist(Boolean value) {
        this.substitutesExist = value;
    }

    /**
     * Obtiene el valor de la propiedad stockkeepingUnitExists.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStockkeepingUnitExists() {
        return stockkeepingUnitExists;
    }

    /**
     * Define el valor de la propiedad stockkeepingUnitExists.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStockkeepingUnitExists(Boolean value) {
        this.stockkeepingUnitExists = value;
    }

    /**
     * Obtiene el valor de la propiedad billOfMaterials.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillOfMaterials() {
        return billOfMaterials;
    }

    /**
     * Define el valor de la propiedad billOfMaterials.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillOfMaterials(Boolean value) {
        this.billOfMaterials = value;
    }

    /**
     * Obtiene el valor de la propiedad productionBOMNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionBOMNo() {
        return productionBOMNo;
    }

    /**
     * Define el valor de la propiedad productionBOMNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionBOMNo(String value) {
        this.productionBOMNo = value;
    }

    /**
     * Obtiene el valor de la propiedad routingNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNo() {
        return routingNo;
    }

    /**
     * Define el valor de la propiedad routingNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNo(String value) {
        this.routingNo = value;
    }

    /**
     * Obtiene el valor de la propiedad baseUnitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUnitOfMeasure() {
        return baseUnitOfMeasure;
    }

    /**
     * Define el valor de la propiedad baseUnitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUnitOfMeasure(String value) {
        this.baseUnitOfMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad shelfBinNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelfBinNo() {
        return shelfBinNo;
    }

    /**
     * Define el valor de la propiedad shelfBinNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelfBinNo(String value) {
        this.shelfBinNo = value;
    }

    /**
     * Obtiene el valor de la propiedad costingMethod.
     * 
     * @return
     *     possible object is
     *     {@link CostingMethod }
     *     
     */
    public CostingMethod getCostingMethod() {
        return costingMethod;
    }

    /**
     * Define el valor de la propiedad costingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link CostingMethod }
     *     
     */
    public void setCostingMethod(CostingMethod value) {
        this.costingMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad costIsAdjusted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCostIsAdjusted() {
        return costIsAdjusted;
    }

    /**
     * Define el valor de la propiedad costIsAdjusted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostIsAdjusted(Boolean value) {
        this.costIsAdjusted = value;
    }

    /**
     * Obtiene el valor de la propiedad standardCost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStandardCost() {
        return standardCost;
    }

    /**
     * Define el valor de la propiedad standardCost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStandardCost(BigDecimal value) {
        this.standardCost = value;
    }

    /**
     * Obtiene el valor de la propiedad unitCost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    /**
     * Define el valor de la propiedad unitCost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCost(BigDecimal value) {
        this.unitCost = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDirectCost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastDirectCost() {
        return lastDirectCost;
    }

    /**
     * Define el valor de la propiedad lastDirectCost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastDirectCost(BigDecimal value) {
        this.lastDirectCost = value;
    }

    /**
     * Obtiene el valor de la propiedad priceProfitCalculation.
     * 
     * @return
     *     possible object is
     *     {@link PriceProfitCalculation }
     *     
     */
    public PriceProfitCalculation getPriceProfitCalculation() {
        return priceProfitCalculation;
    }

    /**
     * Define el valor de la propiedad priceProfitCalculation.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceProfitCalculation }
     *     
     */
    public void setPriceProfitCalculation(PriceProfitCalculation value) {
        this.priceProfitCalculation = value;
    }

    /**
     * Obtiene el valor de la propiedad profitPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitPercent() {
        return profitPercent;
    }

    /**
     * Define el valor de la propiedad profitPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitPercent(BigDecimal value) {
        this.profitPercent = value;
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
     * Obtiene el valor de la propiedad inventoryPostingGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryPostingGroup() {
        return inventoryPostingGroup;
    }

    /**
     * Define el valor de la propiedad inventoryPostingGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryPostingGroup(String value) {
        this.inventoryPostingGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad genProdPostingGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenProdPostingGroup() {
        return genProdPostingGroup;
    }

    /**
     * Define el valor de la propiedad genProdPostingGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenProdPostingGroup(String value) {
        this.genProdPostingGroup = value;
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
     * Obtiene el valor de la propiedad itemDiscGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDiscGroup() {
        return itemDiscGroup;
    }

    /**
     * Define el valor de la propiedad itemDiscGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDiscGroup(String value) {
        this.itemDiscGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNo() {
        return vendorNo;
    }

    /**
     * Define el valor de la propiedad vendorNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNo(String value) {
        this.vendorNo = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorItemNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorItemNo() {
        return vendorItemNo;
    }

    /**
     * Define el valor de la propiedad vendorItemNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorItemNo(String value) {
        this.vendorItemNo = value;
    }

    /**
     * Obtiene el valor de la propiedad tariffNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffNo() {
        return tariffNo;
    }

    /**
     * Define el valor de la propiedad tariffNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffNo(String value) {
        this.tariffNo = value;
    }

    /**
     * Obtiene el valor de la propiedad searchDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDescription() {
        return searchDescription;
    }

    /**
     * Define el valor de la propiedad searchDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDescription(String value) {
        this.searchDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad overheadRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverheadRate() {
        return overheadRate;
    }

    /**
     * Define el valor de la propiedad overheadRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverheadRate(BigDecimal value) {
        this.overheadRate = value;
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
     * Obtiene el valor de la propiedad itemCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCategoryCode() {
        return itemCategoryCode;
    }

    /**
     * Define el valor de la propiedad itemCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCategoryCode(String value) {
        this.itemCategoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad productGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupCode() {
        return productGroupCode;
    }

    /**
     * Define el valor de la propiedad productGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupCode(String value) {
        this.productGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad blocked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * Define el valor de la propiedad blocked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlocked(Boolean value) {
        this.blocked = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDateModified.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDateModified() {
        return lastDateModified;
    }

    /**
     * Define el valor de la propiedad lastDateModified.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDateModified(XMLGregorianCalendar value) {
        this.lastDateModified = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnitOfMeasure() {
        return salesUnitOfMeasure;
    }

    /**
     * Define el valor de la propiedad salesUnitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnitOfMeasure(String value) {
        this.salesUnitOfMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad replenishmentSystem.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentSystem }
     *     
     */
    public ReplenishmentSystem getReplenishmentSystem() {
        return replenishmentSystem;
    }

    /**
     * Define el valor de la propiedad replenishmentSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentSystem }
     *     
     */
    public void setReplenishmentSystem(ReplenishmentSystem value) {
        this.replenishmentSystem = value;
    }

    /**
     * Obtiene el valor de la propiedad purchUnitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchUnitOfMeasure() {
        return purchUnitOfMeasure;
    }

    /**
     * Define el valor de la propiedad purchUnitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchUnitOfMeasure(String value) {
        this.purchUnitOfMeasure = value;
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
     * Obtiene el valor de la propiedad manufacturingPolicy.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingPolicy }
     *     
     */
    public ManufacturingPolicy getManufacturingPolicy() {
        return manufacturingPolicy;
    }

    /**
     * Define el valor de la propiedad manufacturingPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingPolicy }
     *     
     */
    public void setManufacturingPolicy(ManufacturingPolicy value) {
        this.manufacturingPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad flushingMethod.
     * 
     * @return
     *     possible object is
     *     {@link FlushingMethod }
     *     
     */
    public FlushingMethod getFlushingMethod() {
        return flushingMethod;
    }

    /**
     * Define el valor de la propiedad flushingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link FlushingMethod }
     *     
     */
    public void setFlushingMethod(FlushingMethod value) {
        this.flushingMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad qtyOnPurchOrder.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnPurchOrder() {
        return qtyOnPurchOrder;
    }

    /**
     * Define el valor de la propiedad qtyOnPurchOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnPurchOrder(BigDecimal value) {
        this.qtyOnPurchOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad inventory.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInventory() {
        return inventory;
    }

    /**
     * Define el valor de la propiedad inventory.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInventory(BigDecimal value) {
        this.inventory = value;
    }

    /**
     * Obtiene el valor de la propiedad qtyOnSalesOrder.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnSalesOrder() {
        return qtyOnSalesOrder;
    }

    /**
     * Define el valor de la propiedad qtyOnSalesOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnSalesOrder(BigDecimal value) {
        this.qtyOnSalesOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad numUnidades.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumUnidades() {
        return numUnidades;
    }

    /**
     * Define el valor de la propiedad numUnidades.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumUnidades(String value) {
        this.numUnidades = value;
    }

    /**
     * Obtiene el valor de la propiedad itemTrackingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTrackingCode() {
        return itemTrackingCode;
    }

    /**
     * Define el valor de la propiedad itemTrackingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTrackingCode(String value) {
        this.itemTrackingCode = value;
    }

}
