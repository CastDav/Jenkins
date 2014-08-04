
package schemas.dynamics.microsoft.page.proveedor;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Proveedor_Port", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProveedorPort {


    /**
     * 
     * @param no
     * @return
     *     returns schemas.dynamics.microsoft.page.proveedor.Proveedor
     */
    @WebMethod(operationName = "Read", action = "urn:microsoft-dynamics-schemas/page/proveedor:Read")
    @WebResult(name = "Proveedor", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
    @RequestWrapper(localName = "Read", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.Read")
    @ResponseWrapper(localName = "Read_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.ReadResult")
    public Proveedor read(
        @WebParam(name = "No", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
        String no);

    /**
     * 
     * @param recId
     * @return
     *     returns schemas.dynamics.microsoft.page.proveedor.Proveedor
     */
    @WebMethod(operationName = "ReadByRecId", action = "urn:microsoft-dynamics-schemas/page/proveedor:ReadByRecId")
    @WebResult(name = "Proveedor", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
    @RequestWrapper(localName = "ReadByRecId", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.ReadByRecId")
    @ResponseWrapper(localName = "ReadByRecId_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.ReadByRecIdResult")
    public Proveedor readByRecId(
        @WebParam(name = "recId", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
        String recId);

    /**
     * 
     * @param setSize
     * @param bookmarkKey
     * @param filter
     * @return
     *     returns schemas.dynamics.microsoft.page.proveedor.ProveedorList
     */
    @WebMethod(operationName = "ReadMultiple", action = "urn:microsoft-dynamics-schemas/page/proveedor:ReadMultiple")
    @WebResult(name = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
    @RequestWrapper(localName = "ReadMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.ReadMultiple")
    @ResponseWrapper(localName = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.ReadMultipleResult")
    public ProveedorList readMultiple(
        @WebParam(name = "filter", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
        List<ProveedorFilter> filter,
        @WebParam(name = "bookmarkKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
        String bookmarkKey,
        @WebParam(name = "setSize", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
        int setSize);

    /**
     * 
     * @param key
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IsUpdated", action = "urn:microsoft-dynamics-schemas/page/proveedor:IsUpdated")
    @WebResult(name = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
    @RequestWrapper(localName = "IsUpdated", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.IsUpdated")
    @ResponseWrapper(localName = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.IsUpdatedResult")
    public boolean isUpdated(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
        String key);

    /**
     * 
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetRecIdFromKey", action = "urn:microsoft-dynamics-schemas/page/proveedor:GetRecIdFromKey")
    @WebResult(name = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
    @RequestWrapper(localName = "GetRecIdFromKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.GetRecIdFromKey")
    @ResponseWrapper(localName = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor", className = "schemas.dynamics.microsoft.page.proveedor.GetRecIdFromKeyResult")
    public String getRecIdFromKey(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/proveedor")
        String key);

}