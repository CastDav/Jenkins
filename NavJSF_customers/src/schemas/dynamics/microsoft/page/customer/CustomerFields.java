
package schemas.dynamics.microsoft.page.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer_Fields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Customer_Fields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Responsibility_Center"/>
 *     &lt;enumeration value="Location_Code"/>
 *     &lt;enumeration value="Post_Code"/>
 *     &lt;enumeration value="Country_Region_Code"/>
 *     &lt;enumeration value="Phone_No"/>
 *     &lt;enumeration value="Fax_No"/>
 *     &lt;enumeration value="IC_Partner_Code"/>
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="Salesperson_Code"/>
 *     &lt;enumeration value="Customer_Posting_Group"/>
 *     &lt;enumeration value="Gen_Bus_Posting_Group"/>
 *     &lt;enumeration value="VAT_Bus_Posting_Group"/>
 *     &lt;enumeration value="Customer_Price_Group"/>
 *     &lt;enumeration value="Customer_Disc_Group"/>
 *     &lt;enumeration value="Payment_Terms_Code"/>
 *     &lt;enumeration value="Reminder_Terms_Code"/>
 *     &lt;enumeration value="Fin_Charge_Terms_Code"/>
 *     &lt;enumeration value="Currency_Code"/>
 *     &lt;enumeration value="Language_Code"/>
 *     &lt;enumeration value="Search_Name"/>
 *     &lt;enumeration value="Credit_Limit_LCY"/>
 *     &lt;enumeration value="Blocked"/>
 *     &lt;enumeration value="Last_Date_Modified"/>
 *     &lt;enumeration value="Application_Method"/>
 *     &lt;enumeration value="Combine_Shipments"/>
 *     &lt;enumeration value="Reserve"/>
 *     &lt;enumeration value="Shipping_Advice"/>
 *     &lt;enumeration value="Shipping_Agent_Code"/>
 *     &lt;enumeration value="salesLCY"/>
 *     &lt;enumeration value="address"/>
 *     &lt;enumeration value="creditAmount"/>
 *     &lt;enumeration value="city"/>
 *     &lt;enumeration value="eMail"/>
 *     &lt;enumeration value="Base_Calendar_Code"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Customer_Fields")
@XmlEnum
public enum CustomerFields {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Responsibility_Center")
    RESPONSIBILITY_CENTER("Responsibility_Center"),
    @XmlEnumValue("Location_Code")
    LOCATION_CODE("Location_Code"),
    @XmlEnumValue("Post_Code")
    POST_CODE("Post_Code"),
    @XmlEnumValue("Country_Region_Code")
    COUNTRY_REGION_CODE("Country_Region_Code"),
    @XmlEnumValue("Phone_No")
    PHONE_NO("Phone_No"),
    @XmlEnumValue("Fax_No")
    FAX_NO("Fax_No"),
    @XmlEnumValue("IC_Partner_Code")
    IC_PARTNER_CODE("IC_Partner_Code"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("Salesperson_Code")
    SALESPERSON_CODE("Salesperson_Code"),
    @XmlEnumValue("Customer_Posting_Group")
    CUSTOMER_POSTING_GROUP("Customer_Posting_Group"),
    @XmlEnumValue("Gen_Bus_Posting_Group")
    GEN_BUS_POSTING_GROUP("Gen_Bus_Posting_Group"),
    @XmlEnumValue("VAT_Bus_Posting_Group")
    VAT_BUS_POSTING_GROUP("VAT_Bus_Posting_Group"),
    @XmlEnumValue("Customer_Price_Group")
    CUSTOMER_PRICE_GROUP("Customer_Price_Group"),
    @XmlEnumValue("Customer_Disc_Group")
    CUSTOMER_DISC_GROUP("Customer_Disc_Group"),
    @XmlEnumValue("Payment_Terms_Code")
    PAYMENT_TERMS_CODE("Payment_Terms_Code"),
    @XmlEnumValue("Reminder_Terms_Code")
    REMINDER_TERMS_CODE("Reminder_Terms_Code"),
    @XmlEnumValue("Fin_Charge_Terms_Code")
    FIN_CHARGE_TERMS_CODE("Fin_Charge_Terms_Code"),
    @XmlEnumValue("Currency_Code")
    CURRENCY_CODE("Currency_Code"),
    @XmlEnumValue("Language_Code")
    LANGUAGE_CODE("Language_Code"),
    @XmlEnumValue("Search_Name")
    SEARCH_NAME("Search_Name"),
    @XmlEnumValue("Credit_Limit_LCY")
    CREDIT_LIMIT_LCY("Credit_Limit_LCY"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Last_Date_Modified")
    LAST_DATE_MODIFIED("Last_Date_Modified"),
    @XmlEnumValue("Application_Method")
    APPLICATION_METHOD("Application_Method"),
    @XmlEnumValue("Combine_Shipments")
    COMBINE_SHIPMENTS("Combine_Shipments"),
    @XmlEnumValue("Reserve")
    RESERVE("Reserve"),
    @XmlEnumValue("Shipping_Advice")
    SHIPPING_ADVICE("Shipping_Advice"),
    @XmlEnumValue("Shipping_Agent_Code")
    SHIPPING_AGENT_CODE("Shipping_Agent_Code"),
    @XmlEnumValue("salesLCY")
    SALES_LCY("salesLCY"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("creditAmount")
    CREDIT_AMOUNT("creditAmount"),
    @XmlEnumValue("city")
    CITY("city"),
    @XmlEnumValue("eMail")
    E_MAIL("eMail"),
    @XmlEnumValue("Base_Calendar_Code")
    BASE_CALENDAR_CODE("Base_Calendar_Code");
    private final String value;

    CustomerFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerFields fromValue(String v) {
        for (CustomerFields c: CustomerFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
