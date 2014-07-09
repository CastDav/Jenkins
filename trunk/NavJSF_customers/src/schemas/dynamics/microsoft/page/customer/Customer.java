
package schemas.dynamics.microsoft.page.customer;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Customer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *         &lt;element name="salesLCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "salesLCY",
    "address",
    "creditAmount",
    "eMail",
    "city",
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
    @XmlSchemaType(name = "string")
    protected Blocked blocked;
    @XmlElement(name = "Last_Date_Modified")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateModified;
    @XmlElement(name = "Application_Method")
    @XmlSchemaType(name = "string")
    protected ApplicationMethod applicationMethod;
    @XmlElement(name = "Combine_Shipments")
    protected Boolean combineShipments;
    @XmlElement(name = "Reserve")
    @XmlSchemaType(name = "string")
    protected Reserve reserve;
    @XmlElement(name = "Shipping_Advice")
    @XmlSchemaType(name = "string")
    protected ShippingAdvice shippingAdvice;
    @XmlElement(name = "Shipping_Agent_Code")
    protected String shippingAgentCode;
    protected BigDecimal salesLCY;
    protected String address;
    protected BigDecimal creditAmount;
    protected String eMail;
    protected String city;
    @XmlElement(name = "Base_Calendar_Code")
    protected String baseCalendarCode;

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
     * Obtiene el valor de la propiedad name.
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
     * Define el valor de la propiedad name.
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
     * Obtiene el valor de la propiedad responsibilityCenter.
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
     * Define el valor de la propiedad responsibilityCenter.
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
     * Obtiene el valor de la propiedad postCode.
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
     * Define el valor de la propiedad postCode.
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
     * Obtiene el valor de la propiedad countryRegionCode.
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
     * Define el valor de la propiedad countryRegionCode.
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
     * Obtiene el valor de la propiedad phoneNo.
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
     * Define el valor de la propiedad phoneNo.
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
     * Obtiene el valor de la propiedad faxNo.
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
     * Define el valor de la propiedad faxNo.
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
     * Obtiene el valor de la propiedad contact.
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
     * Define el valor de la propiedad contact.
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
     * Obtiene el valor de la propiedad salespersonCode.
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
     * Define el valor de la propiedad salespersonCode.
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
     * Obtiene el valor de la propiedad customerPostingGroup.
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
     * Define el valor de la propiedad customerPostingGroup.
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
     * Obtiene el valor de la propiedad genBusPostingGroup.
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
     * Define el valor de la propiedad genBusPostingGroup.
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
     * Obtiene el valor de la propiedad vatBusPostingGroup.
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
     * Define el valor de la propiedad vatBusPostingGroup.
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
     * Obtiene el valor de la propiedad customerPriceGroup.
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
     * Define el valor de la propiedad customerPriceGroup.
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
     * Obtiene el valor de la propiedad customerDiscGroup.
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
     * Define el valor de la propiedad customerDiscGroup.
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
     * Obtiene el valor de la propiedad paymentTermsCode.
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
     * Define el valor de la propiedad paymentTermsCode.
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
     * Obtiene el valor de la propiedad reminderTermsCode.
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
     * Define el valor de la propiedad reminderTermsCode.
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
     * Obtiene el valor de la propiedad finChargeTermsCode.
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
     * Define el valor de la propiedad finChargeTermsCode.
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
     * Obtiene el valor de la propiedad currencyCode.
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
     * Define el valor de la propiedad currencyCode.
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
     * Obtiene el valor de la propiedad languageCode.
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
     * Define el valor de la propiedad languageCode.
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
     * Obtiene el valor de la propiedad searchName.
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
     * Define el valor de la propiedad searchName.
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
     * Obtiene el valor de la propiedad creditLimitLCY.
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
     * Define el valor de la propiedad creditLimitLCY.
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
     * Obtiene el valor de la propiedad blocked.
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
     * Define el valor de la propiedad blocked.
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
     * Obtiene el valor de la propiedad applicationMethod.
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
     * Define el valor de la propiedad applicationMethod.
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
     * Obtiene el valor de la propiedad combineShipments.
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
     * Define el valor de la propiedad combineShipments.
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
     * Obtiene el valor de la propiedad shippingAdvice.
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
     * Define el valor de la propiedad shippingAdvice.
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
     * Obtiene el valor de la propiedad salesLCY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesLCY() {
        return salesLCY;
    }

    /**
     * Define el valor de la propiedad salesLCY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesLCY(BigDecimal value) {
        this.salesLCY = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad creditAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * Define el valor de la propiedad creditAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditAmount(BigDecimal value) {
        this.creditAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad eMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Define el valor de la propiedad eMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad baseCalendarCode.
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
     * Define el valor de la propiedad baseCalendarCode.
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
