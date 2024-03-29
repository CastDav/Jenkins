
package schemas.dynamics.microsoft.page.pedidosventa;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PedidosVenta_Port", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PedidosVentaPort {


    /**
     * 
     * @param documentType
     * @param no
     * @return
     *     returns schemas.dynamics.microsoft.page.pedidosventa.PedidosVenta
     */
    @WebMethod(operationName = "Read", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:Read")
    @WebResult(name = "PedidosVenta", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
    @RequestWrapper(localName = "Read", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.Read")
    @ResponseWrapper(localName = "Read_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.ReadResult")
    public PedidosVenta read(
        @WebParam(name = "DocumentType", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        String documentType,
        @WebParam(name = "No", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        String no);

    /**
     * 
     * @param recId
     * @return
     *     returns schemas.dynamics.microsoft.page.pedidosventa.PedidosVenta
     */
    @WebMethod(operationName = "ReadByRecId", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:ReadByRecId")
    @WebResult(name = "PedidosVenta", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
    @RequestWrapper(localName = "ReadByRecId", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.ReadByRecId")
    @ResponseWrapper(localName = "ReadByRecId_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.ReadByRecIdResult")
    public PedidosVenta readByRecId(
        @WebParam(name = "recId", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        String recId);

    /**
     * 
     * @param setSize
     * @param bookmarkKey
     * @param filter
     * @return
     *     returns schemas.dynamics.microsoft.page.pedidosventa.PedidosVentaList
     */
    @WebMethod(operationName = "ReadMultiple", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:ReadMultiple")
    @WebResult(name = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
    @RequestWrapper(localName = "ReadMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.ReadMultiple")
    @ResponseWrapper(localName = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.ReadMultipleResult")
    public PedidosVentaList readMultiple(
        @WebParam(name = "filter", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        List<PedidosVentaFilter> filter,
        @WebParam(name = "bookmarkKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        String bookmarkKey,
        @WebParam(name = "setSize", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        int setSize);

    /**
     * 
     * @param key
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IsUpdated", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:IsUpdated")
    @WebResult(name = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
    @RequestWrapper(localName = "IsUpdated", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.IsUpdated")
    @ResponseWrapper(localName = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.IsUpdatedResult")
    public boolean isUpdated(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        String key);

    /**
     * 
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetRecIdFromKey", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:GetRecIdFromKey")
    @WebResult(name = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
    @RequestWrapper(localName = "GetRecIdFromKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.GetRecIdFromKey")
    @ResponseWrapper(localName = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.GetRecIdFromKeyResult")
    public String getRecIdFromKey(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        String key);

    /**
     * 
     * @param pedidosVenta
     */
    @WebMethod(operationName = "Create", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:Create")
    @RequestWrapper(localName = "Create", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.Create")
    @ResponseWrapper(localName = "Create_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.CreateResult")
    public void create(
        @WebParam(name = "PedidosVenta", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", mode = WebParam.Mode.INOUT)
        Holder<PedidosVenta> pedidosVenta);

    /**
     * 
     * @param pedidosVentaList
     */
    @WebMethod(operationName = "CreateMultiple", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:CreateMultiple")
    @RequestWrapper(localName = "CreateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.CreateMultiple")
    @ResponseWrapper(localName = "CreateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.CreateMultipleResult")
    public void createMultiple(
        @WebParam(name = "PedidosVenta_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", mode = WebParam.Mode.INOUT)
        Holder<PedidosVentaList> pedidosVentaList);

    /**
     * 
     * @param pedidosVenta
     */
    @WebMethod(operationName = "Update", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:Update")
    @RequestWrapper(localName = "Update", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.Update")
    @ResponseWrapper(localName = "Update_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.UpdateResult")
    public void update(
        @WebParam(name = "PedidosVenta", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", mode = WebParam.Mode.INOUT)
        Holder<PedidosVenta> pedidosVenta);

    /**
     * 
     * @param pedidosVentaList
     */
    @WebMethod(operationName = "UpdateMultiple", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:UpdateMultiple")
    @RequestWrapper(localName = "UpdateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.UpdateMultiple")
    @ResponseWrapper(localName = "UpdateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.UpdateMultipleResult")
    public void updateMultiple(
        @WebParam(name = "PedidosVenta_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", mode = WebParam.Mode.INOUT)
        Holder<PedidosVentaList> pedidosVentaList);

    /**
     * 
     * @param key
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Delete", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:Delete")
    @WebResult(name = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
    @RequestWrapper(localName = "Delete", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.Delete")
    @ResponseWrapper(localName = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.DeleteResult")
    public boolean delete(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        String key);

    /**
     * 
     * @param salesLinesKey
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Delete_SalesLines", action = "urn:microsoft-dynamics-schemas/page/pedidosventa:Delete_SalesLines")
    @WebResult(name = "Delete_SalesLines_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
    @RequestWrapper(localName = "Delete_SalesLines", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.DeleteSalesLines")
    @ResponseWrapper(localName = "Delete_SalesLines_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", className = "schemas.dynamics.microsoft.page.pedidosventa.DeleteSalesLinesResult")
    public boolean deleteSalesLines(
        @WebParam(name = "SalesLines_Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa")
        String salesLinesKey);

}
