
package schemas.dynamics.microsoft.page.product;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
    protected ReplenishmentSystem replenishmentSystem;
    @XmlElement(name = "Purch_Unit_of_Measure")
    protected String purchUnitOfMeasure;
    @XmlElement(name = "Lead_Time_Calculation")
    protected String leadTimeCalculation;
    @XmlElement(name = "Manufacturing_Policy")
    protected ManufacturingPolicy manufacturingPolicy;
    @XmlElement(name = "Flushing_Method")
    protected FlushingMethod flushingMethod;
    @XmlElement(name = "Item_Tracking_Code")
    protected String itemTrackingCode;

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
     * Gets the value of the createdFromNonstockItem property.
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
     * Sets the value of the createdFromNonstockItem property.
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
     * Gets the value of the substitutesExist property.
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
     * Sets the value of the substitutesExist property.
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
     * Gets the value of the stockkeepingUnitExists property.
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
     * Sets the value of the stockkeepingUnitExists property.
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
     * Gets the value of the billOfMaterials property.
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
     * Sets the value of the billOfMaterials property.
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
     * Gets the value of the productionBOMNo property.
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
     * Sets the value of the productionBOMNo property.
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
     * Gets the value of the routingNo property.
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
     * Sets the value of the routingNo property.
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
     * Gets the value of the baseUnitOfMeasure property.
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
     * Sets the value of the baseUnitOfMeasure property.
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
     * Gets the value of the shelfBinNo property.
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
     * Sets the value of the shelfBinNo property.
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
     * Gets the value of the costingMethod property.
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
     * Sets the value of the costingMethod property.
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
     * Gets the value of the costIsAdjusted property.
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
     * Sets the value of the costIsAdjusted property.
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
     * Gets the value of the standardCost property.
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
     * Sets the value of the standardCost property.
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
     * Gets the value of the unitCost property.
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
     * Sets the value of the unitCost property.
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
     * Gets the value of the lastDirectCost property.
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
     * Sets the value of the lastDirectCost property.
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
     * Gets the value of the priceProfitCalculation property.
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
     * Sets the value of the priceProfitCalculation property.
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
     * Gets the value of the profitPercent property.
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
     * Sets the value of the profitPercent property.
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
     * Gets the value of the inventoryPostingGroup property.
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
     * Sets the value of the inventoryPostingGroup property.
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
     * Gets the value of the genProdPostingGroup property.
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
     * Sets the value of the genProdPostingGroup property.
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
     * Gets the value of the itemDiscGroup property.
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
     * Sets the value of the itemDiscGroup property.
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
     * Gets the value of the vendorNo property.
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
     * Sets the value of the vendorNo property.
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
     * Gets the value of the vendorItemNo property.
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
     * Sets the value of the vendorItemNo property.
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
     * Gets the value of the tariffNo property.
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
     * Sets the value of the tariffNo property.
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
     * Gets the value of the searchDescription property.
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
     * Sets the value of the searchDescription property.
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
     * Gets the value of the overheadRate property.
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
     * Sets the value of the overheadRate property.
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
     * Gets the value of the itemCategoryCode property.
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
     * Sets the value of the itemCategoryCode property.
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
     * Gets the value of the productGroupCode property.
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
     * Sets the value of the productGroupCode property.
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
     * Gets the value of the blocked property.
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
     * Sets the value of the blocked property.
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
     * Gets the value of the lastDateModified property.
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
     * Sets the value of the lastDateModified property.
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
     * Gets the value of the salesUnitOfMeasure property.
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
     * Sets the value of the salesUnitOfMeasure property.
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
     * Gets the value of the replenishmentSystem property.
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
     * Sets the value of the replenishmentSystem property.
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
     * Gets the value of the purchUnitOfMeasure property.
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
     * Sets the value of the purchUnitOfMeasure property.
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
     * Gets the value of the manufacturingPolicy property.
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
     * Sets the value of the manufacturingPolicy property.
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
     * Gets the value of the flushingMethod property.
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
     * Sets the value of the flushingMethod property.
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
     * Gets the value of the itemTrackingCode property.
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
     * Sets the value of the itemTrackingCode property.
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
