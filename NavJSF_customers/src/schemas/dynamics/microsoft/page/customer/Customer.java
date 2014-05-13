
package schemas.dynamics.microsoft.page.customer;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Responsibility_Center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Region_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IC_Partner_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salesperson_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gen_Bus_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VAT_Bus_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Price_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Disc_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payment_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reminder_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fin_Charge_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Search_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Credit_Limit_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Blocked" type="{urn:microsoft-dynamics-schemas/page/customer}Blocked" minOccurs="0"/>
 *         &lt;element name="Last_Date_Modified" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Application_Method" type="{urn:microsoft-dynamics-schemas/page/customer}Application_Method" minOccurs="0"/>
 *         &lt;element name="Combine_Shipments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reserve" type="{urn:microsoft-dynamics-schemas/page/customer}Reserve" minOccurs="0"/>
 *         &lt;element name="Shipping_Advice" type="{urn:microsoft-dynamics-schemas/page/customer}Shipping_Advice" minOccurs="0"/>
 *         &lt;element name="Shipping_Agent_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Base_Calendar_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "key",
    "no",
    "name",
    "responsibilityCenter",
    "locationCode",
    "postCode",
    "countryRegionCode",
    "phoneNo",
    "faxNo",
    "icPartnerCode",
    "contact",
    "salespersonCode",
    "customerPostingGroup",
    "genBusPostingGroup",
    "vatBusPostingGroup",
    "customerPriceGroup",
    "customerDiscGroup",
    "paymentTermsCode",
    "reminderTermsCode",
    "finChargeTermsCode",
    "currencyCode",
    "languageCode",
    "searchName",
    "creditLimitLCY",
    "blocked",
    "lastDateModified",
    "applicationMethod",
    "combineShipments",
    "reserve",
    "shippingAdvice",
    "shippingAgentCode",
    "baseCalendarCode"
})
public class Customer {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Responsibility_Center")
    protected String responsibilityCenter;
    @XmlElement(name = "Location_Code")
    protected String locationCode;
    @XmlElement(name = "Post_Code")
    protected String postCode;
    @XmlElement(name = "Country_Region_Code")
    protected String countryRegionCode;
    @XmlElement(name = "Phone_No")
    protected String phoneNo;
    @XmlElement(name = "Fax_No")
    protected String faxNo;
    @XmlElement(name = "IC_Partner_Code")
    protected String icPartnerCode;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "Salesperson_Code")
    protected String salespersonCode;
    @XmlElement(name = "Customer_Posting_Group")
    protected String customerPostingGroup;
    @XmlElement(name = "Gen_Bus_Posting_Group")
    protected String genBusPostingGroup;
    @XmlElement(name = "VAT_Bus_Posting_Group")
    protected String vatBusPostingGroup;
    @XmlElement(name = "Customer_Price_Group")
    protected String customerPriceGroup;
    @XmlElement(name = "Customer_Disc_Group")
    protected String customerDiscGroup;
    @XmlElement(name = "Payment_Terms_Code")
    protected String paymentTermsCode;
    @XmlElement(name = "Reminder_Terms_Code")
    protected String reminderTermsCode;
    @XmlElement(name = "Fin_Charge_Terms_Code")
    protected String finChargeTermsCode;
    @XmlElement(name = "Currency_Code")
    protected String currencyCode;
    @XmlElement(name = "Language_Code")
    protected String languageCode;
    @XmlElement(name = "Search_Name")
    protected String searchName;
    @XmlElement(name = "Credit_Limit_LCY")
    protected BigDecimal creditLimitLCY;
    @XmlElement(name = "Blocked")
    protected Blocked blocked;
    @XmlElement(name = "Last_Date_Modified")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateModified;
    @XmlElement(name = "Application_Method")
    protected ApplicationMethod applicationMethod;
    @XmlElement(name = "Combine_Shipments")
    protected Boolean combineShipments;
    @XmlElement(name = "Reserve")
    protected Reserve reserve;
    @XmlElement(name = "Shipping_Advice")
    protected ShippingAdvice shippingAdvice;
    @XmlElement(name = "Shipping_Agent_Code")
    protected String shippingAgentCode;
    @XmlElement(name = "Base_Calendar_Code")
    protected String baseCalendarCode;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the responsibilityCenter property.
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
     * Sets the value of the responsibilityCenter property.
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
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the countryRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryRegionCode() {
        return countryRegionCode;
    }

    /**
     * Sets the value of the countryRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryRegionCode(String value) {
        this.countryRegionCode = value;
    }

    /**
     * Gets the value of the phoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the faxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * Sets the value of the faxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNo(String value) {
        this.faxNo = value;
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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the salespersonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalespersonCode() {
        return salespersonCode;
    }

    /**
     * Sets the value of the salespersonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalespersonCode(String value) {
        this.salespersonCode = value;
    }

    /**
     * Gets the value of the customerPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPostingGroup() {
        return customerPostingGroup;
    }

    /**
     * Sets the value of the customerPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPostingGroup(String value) {
        this.customerPostingGroup = value;
    }

    /**
     * Gets the value of the genBusPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenBusPostingGroup() {
        return genBusPostingGroup;
    }

    /**
     * Sets the value of the genBusPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenBusPostingGroup(String value) {
        this.genBusPostingGroup = value;
    }

    /**
     * Gets the value of the vatBusPostingGroup property.
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
     * Sets the value of the vatBusPostingGroup property.
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
     * Gets the value of the customerPriceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPriceGroup() {
        return customerPriceGroup;
    }

    /**
     * Sets the value of the customerPriceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPriceGroup(String value) {
        this.customerPriceGroup = value;
    }

    /**
     * Gets the value of the customerDiscGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscGroup() {
        return customerDiscGroup;
    }

    /**
     * Sets the value of the customerDiscGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscGroup(String value) {
        this.customerDiscGroup = value;
    }

    /**
     * Gets the value of the paymentTermsCode property.
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
     * Sets the value of the paymentTermsCode property.
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
     * Gets the value of the reminderTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReminderTermsCode() {
        return reminderTermsCode;
    }

    /**
     * Sets the value of the reminderTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReminderTermsCode(String value) {
        this.reminderTermsCode = value;
    }

    /**
     * Gets the value of the finChargeTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinChargeTermsCode() {
        return finChargeTermsCode;
    }

    /**
     * Sets the value of the finChargeTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinChargeTermsCode(String value) {
        this.finChargeTermsCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
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
     * Sets the value of the currencyCode property.
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
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the searchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchName() {
        return searchName;
    }

    /**
     * Sets the value of the searchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchName(String value) {
        this.searchName = value;
    }

    /**
     * Gets the value of the creditLimitLCY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimitLCY() {
        return creditLimitLCY;
    }

    /**
     * Sets the value of the creditLimitLCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimitLCY(BigDecimal value) {
        this.creditLimitLCY = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Blocked }
     *     
     */
    public Blocked getBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocked }
     *     
     */
    public void setBlocked(Blocked value) {
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
     * Gets the value of the applicationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationMethod }
     *     
     */
    public ApplicationMethod getApplicationMethod() {
        return applicationMethod;
    }

    /**
     * Sets the value of the applicationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationMethod }
     *     
     */
    public void setApplicationMethod(ApplicationMethod value) {
        this.applicationMethod = value;
    }

    /**
     * Gets the value of the combineShipments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCombineShipments() {
        return combineShipments;
    }

    /**
     * Sets the value of the combineShipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombineShipments(Boolean value) {
        this.combineShipments = value;
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
     * Gets the value of the shippingAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAdvice }
     *     
     */
    public ShippingAdvice getShippingAdvice() {
        return shippingAdvice;
    }

    /**
     * Sets the value of the shippingAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAdvice }
     *     
     */
    public void setShippingAdvice(ShippingAdvice value) {
        this.shippingAdvice = value;
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
     * Gets the value of the baseCalendarCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCalendarCode() {
        return baseCalendarCode;
    }

    /**
     * Sets the value of the baseCalendarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCalendarCode(String value) {
        this.baseCalendarCode = value;
    }

}
