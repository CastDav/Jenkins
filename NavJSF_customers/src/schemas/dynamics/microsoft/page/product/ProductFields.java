
package schemas.dynamics.microsoft.page.product;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Product_Fields.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Product_Fields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Description"/>
 *     &lt;enumeration value="Created_From_Nonstock_Item"/>
 *     &lt;enumeration value="Substitutes_Exist"/>
 *     &lt;enumeration value="Stockkeeping_Unit_Exists"/>
 *     &lt;enumeration value="Bill_of_Materials"/>
 *     &lt;enumeration value="Production_BOM_No"/>
 *     &lt;enumeration value="Routing_No"/>
 *     &lt;enumeration value="Base_Unit_of_Measure"/>
 *     &lt;enumeration value="Shelf_Bin_No"/>
 *     &lt;enumeration value="Costing_Method"/>
 *     &lt;enumeration value="Cost_is_Adjusted"/>
 *     &lt;enumeration value="Standard_Cost"/>
 *     &lt;enumeration value="Unit_Cost"/>
 *     &lt;enumeration value="Last_Direct_Cost"/>
 *     &lt;enumeration value="Price_Profit_Calculation"/>
 *     &lt;enumeration value="Profit_Percent"/>
 *     &lt;enumeration value="Unit_Price"/>
 *     &lt;enumeration value="Inventory_Posting_Group"/>
 *     &lt;enumeration value="Gen_Prod_Posting_Group"/>
 *     &lt;enumeration value="VAT_Prod_Posting_Group"/>
 *     &lt;enumeration value="Item_Disc_Group"/>
 *     &lt;enumeration value="Vendor_No"/>
 *     &lt;enumeration value="Vendor_Item_No"/>
 *     &lt;enumeration value="Tariff_No"/>
 *     &lt;enumeration value="Search_Description"/>
 *     &lt;enumeration value="Overhead_Rate"/>
 *     &lt;enumeration value="Indirect_Cost_Percent"/>
 *     &lt;enumeration value="Item_Category_Code"/>
 *     &lt;enumeration value="Product_Group_Code"/>
 *     &lt;enumeration value="Blocked"/>
 *     &lt;enumeration value="Last_Date_Modified"/>
 *     &lt;enumeration value="Sales_Unit_of_Measure"/>
 *     &lt;enumeration value="Replenishment_System"/>
 *     &lt;enumeration value="Purch_Unit_of_Measure"/>
 *     &lt;enumeration value="Lead_Time_Calculation"/>
 *     &lt;enumeration value="Manufacturing_Policy"/>
 *     &lt;enumeration value="Flushing_Method"/>
 *     &lt;enumeration value="qtyOnPurchOrder"/>
 *     &lt;enumeration value="Inventory"/>
 *     &lt;enumeration value="qtyOnSalesOrder"/>
 *     &lt;enumeration value="numUnidades"/>
 *     &lt;enumeration value="Item_Tracking_Code"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Product_Fields")
@XmlEnum
public enum ProductFields {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("Created_From_Nonstock_Item")
    CREATED_FROM_NONSTOCK_ITEM("Created_From_Nonstock_Item"),
    @XmlEnumValue("Substitutes_Exist")
    SUBSTITUTES_EXIST("Substitutes_Exist"),
    @XmlEnumValue("Stockkeeping_Unit_Exists")
    STOCKKEEPING_UNIT_EXISTS("Stockkeeping_Unit_Exists"),
    @XmlEnumValue("Bill_of_Materials")
    BILL_OF_MATERIALS("Bill_of_Materials"),
    @XmlEnumValue("Production_BOM_No")
    PRODUCTION_BOM_NO("Production_BOM_No"),
    @XmlEnumValue("Routing_No")
    ROUTING_NO("Routing_No"),
    @XmlEnumValue("Base_Unit_of_Measure")
    BASE_UNIT_OF_MEASURE("Base_Unit_of_Measure"),
    @XmlEnumValue("Shelf_Bin_No")
    SHELF_BIN_NO("Shelf_Bin_No"),
    @XmlEnumValue("Costing_Method")
    COSTING_METHOD("Costing_Method"),
    @XmlEnumValue("Cost_is_Adjusted")
    COST_IS_ADJUSTED("Cost_is_Adjusted"),
    @XmlEnumValue("Standard_Cost")
    STANDARD_COST("Standard_Cost"),
    @XmlEnumValue("Unit_Cost")
    UNIT_COST("Unit_Cost"),
    @XmlEnumValue("Last_Direct_Cost")
    LAST_DIRECT_COST("Last_Direct_Cost"),
    @XmlEnumValue("Price_Profit_Calculation")
    PRICE_PROFIT_CALCULATION("Price_Profit_Calculation"),
    @XmlEnumValue("Profit_Percent")
    PROFIT_PERCENT("Profit_Percent"),
    @XmlEnumValue("Unit_Price")
    UNIT_PRICE("Unit_Price"),
    @XmlEnumValue("Inventory_Posting_Group")
    INVENTORY_POSTING_GROUP("Inventory_Posting_Group"),
    @XmlEnumValue("Gen_Prod_Posting_Group")
    GEN_PROD_POSTING_GROUP("Gen_Prod_Posting_Group"),
    @XmlEnumValue("VAT_Prod_Posting_Group")
    VAT_PROD_POSTING_GROUP("VAT_Prod_Posting_Group"),
    @XmlEnumValue("Item_Disc_Group")
    ITEM_DISC_GROUP("Item_Disc_Group"),
    @XmlEnumValue("Vendor_No")
    VENDOR_NO("Vendor_No"),
    @XmlEnumValue("Vendor_Item_No")
    VENDOR_ITEM_NO("Vendor_Item_No"),
    @XmlEnumValue("Tariff_No")
    TARIFF_NO("Tariff_No"),
    @XmlEnumValue("Search_Description")
    SEARCH_DESCRIPTION("Search_Description"),
    @XmlEnumValue("Overhead_Rate")
    OVERHEAD_RATE("Overhead_Rate"),
    @XmlEnumValue("Indirect_Cost_Percent")
    INDIRECT_COST_PERCENT("Indirect_Cost_Percent"),
    @XmlEnumValue("Item_Category_Code")
    ITEM_CATEGORY_CODE("Item_Category_Code"),
    @XmlEnumValue("Product_Group_Code")
    PRODUCT_GROUP_CODE("Product_Group_Code"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Last_Date_Modified")
    LAST_DATE_MODIFIED("Last_Date_Modified"),
    @XmlEnumValue("Sales_Unit_of_Measure")
    SALES_UNIT_OF_MEASURE("Sales_Unit_of_Measure"),
    @XmlEnumValue("Replenishment_System")
    REPLENISHMENT_SYSTEM("Replenishment_System"),
    @XmlEnumValue("Purch_Unit_of_Measure")
    PURCH_UNIT_OF_MEASURE("Purch_Unit_of_Measure"),
    @XmlEnumValue("Lead_Time_Calculation")
    LEAD_TIME_CALCULATION("Lead_Time_Calculation"),
    @XmlEnumValue("Manufacturing_Policy")
    MANUFACTURING_POLICY("Manufacturing_Policy"),
    @XmlEnumValue("Flushing_Method")
    FLUSHING_METHOD("Flushing_Method"),
    @XmlEnumValue("qtyOnPurchOrder")
    QTY_ON_PURCH_ORDER("qtyOnPurchOrder"),
    @XmlEnumValue("Inventory")
    INVENTORY("Inventory"),
    @XmlEnumValue("qtyOnSalesOrder")
    QTY_ON_SALES_ORDER("qtyOnSalesOrder"),
    @XmlEnumValue("numUnidades")
    NUM_UNIDADES("numUnidades"),
    @XmlEnumValue("Item_Tracking_Code")
    ITEM_TRACKING_CODE("Item_Tracking_Code");
    private final String value;

    ProductFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductFields fromValue(String v) {
        for (ProductFields c: ProductFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
