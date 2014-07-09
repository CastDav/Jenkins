
package schemas.dynamics.microsoft.page.customer;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Customer_Port", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerPort {


    /**
     * 
     * @param no
     * @return
     *     returns schemas.dynamics.microsoft.page.customer.Customer
     */
    @WebMethod(operationName = "Read", action = "urn:microsoft-dynamics-schemas/page/customer:Read")
    @WebResult(name = "Customer", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
    @RequestWrapper(localName = "Read", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.Read")
    @ResponseWrapper(localName = "Read_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.ReadResult")
    public Customer read(
        @WebParam(name = "No", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
        String no);

    /**
     * 
     * @param recId
     * @return
     *     returns schemas.dynamics.microsoft.page.customer.Customer
     */
    @WebMethod(operationName = "ReadByRecId", action = "urn:microsoft-dynamics-schemas/page/customer:ReadByRecId")
    @WebResult(name = "Customer", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
    @RequestWrapper(localName = "ReadByRecId", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.ReadByRecId")
    @ResponseWrapper(localName = "ReadByRecId_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.ReadByRecIdResult")
    public Customer readByRecId(
        @WebParam(name = "recId", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
        String recId);

    /**
     * 
     * @param filter
     * @param setSize
     * @param bookmarkKey
     * @return
     *     returns schemas.dynamics.microsoft.page.customer.CustomerList
     */
    @WebMethod(operationName = "ReadMultiple", action = "urn:microsoft-dynamics-schemas/page/customer:ReadMultiple")
    @WebResult(name = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
    @RequestWrapper(localName = "ReadMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.ReadMultiple")
    @ResponseWrapper(localName = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.ReadMultipleResult")
    public CustomerList readMultiple(
        @WebParam(name = "filter", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
        List<CustomerFilter> filter,
        @WebParam(name = "bookmarkKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
        String bookmarkKey,
        @WebParam(name = "setSize", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
        int setSize);

    /**
     * 
     * @param key
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IsUpdated", action = "urn:microsoft-dynamics-schemas/page/customer:IsUpdated")
    @WebResult(name = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
    @RequestWrapper(localName = "IsUpdated", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.IsUpdated")
    @ResponseWrapper(localName = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.IsUpdatedResult")
    public boolean isUpdated(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
        String key);

    /**
     * 
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetRecIdFromKey", action = "urn:microsoft-dynamics-schemas/page/customer:GetRecIdFromKey")
    @WebResult(name = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
    @RequestWrapper(localName = "GetRecIdFromKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.GetRecIdFromKey")
    @ResponseWrapper(localName = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.GetRecIdFromKeyResult")
    public String getRecIdFromKey(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
        String key);

    /**
     * 
     * @param customer
     */
    @WebMethod(operationName = "Create", action = "urn:microsoft-dynamics-schemas/page/customer:Create")
    @RequestWrapper(localName = "Create", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.Create")
    @ResponseWrapper(localName = "Create_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.CreateResult")
    public void create(
        @WebParam(name = "Customer", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", mode = WebParam.Mode.INOUT)
        Holder<Customer> customer);

    /**
     * 
     * @param customerList
     */
    @WebMethod(operationName = "CreateMultiple", action = "urn:microsoft-dynamics-schemas/page/customer:CreateMultiple")
    @RequestWrapper(localName = "CreateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.CreateMultiple")
    @ResponseWrapper(localName = "CreateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.CreateMultipleResult")
    public void createMultiple(
        @WebParam(name = "Customer_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", mode = WebParam.Mode.INOUT)
        Holder<CustomerList> customerList);

    /**
     * 
     * @param customer
     */
    @WebMethod(operationName = "Update", action = "urn:microsoft-dynamics-schemas/page/customer:Update")
    @RequestWrapper(localName = "Update", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.Update")
    @ResponseWrapper(localName = "Update_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.UpdateResult")
    public void update(
        @WebParam(name = "Customer", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", mode = WebParam.Mode.INOUT)
        Holder<Customer> customer);

    /**
     * 
     * @param customerList
     */
    @WebMethod(operationName = "UpdateMultiple", action = "urn:microsoft-dynamics-schemas/page/customer:UpdateMultiple")
    @RequestWrapper(localName = "UpdateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.UpdateMultiple")
    @ResponseWrapper(localName = "UpdateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.UpdateMultipleResult")
    public void updateMultiple(
        @WebParam(name = "Customer_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", mode = WebParam.Mode.INOUT)
        Holder<CustomerList> customerList);

    /**
     * 
     * @param key
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Delete", action = "urn:microsoft-dynamics-schemas/page/customer:Delete")
    @WebResult(name = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
    @RequestWrapper(localName = "Delete", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.Delete")
    @ResponseWrapper(localName = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer", className = "schemas.dynamics.microsoft.page.customer.DeleteResult")
    public boolean delete(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/customer")
        String key);

}
