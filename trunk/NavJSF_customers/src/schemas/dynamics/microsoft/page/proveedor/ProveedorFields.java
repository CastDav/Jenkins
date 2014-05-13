
package schemas.dynamics.microsoft.page.proveedor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proveedor_Fields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Proveedor_Fields">
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
 *     &lt;enumeration value="Purchaser_Code"/>
 *     &lt;enumeration value="Vendor_Posting_Group"/>
 *     &lt;enumeration value="Gen_Bus_Posting_Group"/>
 *     &lt;enumeration value="VAT_Bus_Posting_Group"/>
 *     &lt;enumeration value="Payment_Terms_Code"/>
 *     &lt;enumeration value="Fin_Charge_Terms_Code"/>
 *     &lt;enumeration value="Currency_Code"/>
 *     &lt;enumeration value="Language_Code"/>
 *     &lt;enumeration value="Search_Name"/>
 *     &lt;enumeration value="Blocked"/>
 *     &lt;enumeration value="Last_Date_Modified"/>
 *     &lt;enumeration value="Application_Method"/>
 *     &lt;enumeration value="Shipment_Method_Code"/>
 *     &lt;enumeration value="Lead_Time_Calculation"/>
 *     &lt;enumeration value="Base_Calendar_Code"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Proveedor_Fields")
@XmlEnum
public enum ProveedorFields {

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
    @XmlEnumValue("Purchaser_Code")
    PURCHASER_CODE("Purchaser_Code"),
    @XmlEnumValue("Vendor_Posting_Group")
    VENDOR_POSTING_GROUP("Vendor_Posting_Group"),
    @XmlEnumValue("Gen_Bus_Posting_Group")
    GEN_BUS_POSTING_GROUP("Gen_Bus_Posting_Group"),
    @XmlEnumValue("VAT_Bus_Posting_Group")
    VAT_BUS_POSTING_GROUP("VAT_Bus_Posting_Group"),
    @XmlEnumValue("Payment_Terms_Code")
    PAYMENT_TERMS_CODE("Payment_Terms_Code"),
    @XmlEnumValue("Fin_Charge_Terms_Code")
    FIN_CHARGE_TERMS_CODE("Fin_Charge_Terms_Code"),
    @XmlEnumValue("Currency_Code")
    CURRENCY_CODE("Currency_Code"),
    @XmlEnumValue("Language_Code")
    LANGUAGE_CODE("Language_Code"),
    @XmlEnumValue("Search_Name")
    SEARCH_NAME("Search_Name"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Last_Date_Modified")
    LAST_DATE_MODIFIED("Last_Date_Modified"),
    @XmlEnumValue("Application_Method")
    APPLICATION_METHOD("Application_Method"),
    @XmlEnumValue("Shipment_Method_Code")
    SHIPMENT_METHOD_CODE("Shipment_Method_Code"),
    @XmlEnumValue("Lead_Time_Calculation")
    LEAD_TIME_CALCULATION("Lead_Time_Calculation"),
    @XmlEnumValue("Base_Calendar_Code")
    BASE_CALENDAR_CODE("Base_Calendar_Code");
    private final String value;

    ProveedorFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProveedorFields fromValue(String v) {
        for (ProveedorFields c: ProveedorFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
