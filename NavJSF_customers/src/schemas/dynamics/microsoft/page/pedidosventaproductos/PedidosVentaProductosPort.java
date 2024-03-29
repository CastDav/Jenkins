
package schemas.dynamics.microsoft.page.pedidosventaproductos;

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
@WebService(name = "PedidosVentaProductos_Port", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PedidosVentaProductosPort {


    /**
     * 
     * @param lineNo
     * @param documentNo
     * @return
     *     returns schemas.dynamics.microsoft.page.pedidosventaproductos.PedidosVentaProductos
     */
    @WebMethod(operationName = "Read", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:Read")
    @WebResult(name = "PedidosVentaProductos", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
    @RequestWrapper(localName = "Read", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.Read")
    @ResponseWrapper(localName = "Read_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.ReadResult")
    public PedidosVentaProductos read(
        @WebParam(name = "Document_No", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
        String documentNo,
        @WebParam(name = "lineNo", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
        int lineNo);

    /**
     * 
     * @param recId
     * @return
     *     returns schemas.dynamics.microsoft.page.pedidosventaproductos.PedidosVentaProductos
     */
    @WebMethod(operationName = "ReadByRecId", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:ReadByRecId")
    @WebResult(name = "PedidosVentaProductos", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
    @RequestWrapper(localName = "ReadByRecId", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.ReadByRecId")
    @ResponseWrapper(localName = "ReadByRecId_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.ReadByRecIdResult")
    public PedidosVentaProductos readByRecId(
        @WebParam(name = "recId", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
        String recId);

    /**
     * 
     * @param setSize
     * @param bookmarkKey
     * @param filter
     * @return
     *     returns schemas.dynamics.microsoft.page.pedidosventaproductos.PedidosVentaProductosList
     */
    @WebMethod(operationName = "ReadMultiple", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:ReadMultiple")
    @WebResult(name = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
    @RequestWrapper(localName = "ReadMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.ReadMultiple")
    @ResponseWrapper(localName = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.ReadMultipleResult")
    public PedidosVentaProductosList readMultiple(
        @WebParam(name = "filter", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
        List<PedidosVentaProductosFilter> filter,
        @WebParam(name = "bookmarkKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
        String bookmarkKey,
        @WebParam(name = "setSize", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
        int setSize);

    /**
     * 
     * @param key
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IsUpdated", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:IsUpdated")
    @WebResult(name = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
    @RequestWrapper(localName = "IsUpdated", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.IsUpdated")
    @ResponseWrapper(localName = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.IsUpdatedResult")
    public boolean isUpdated(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
        String key);

    /**
     * 
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetRecIdFromKey", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:GetRecIdFromKey")
    @WebResult(name = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
    @RequestWrapper(localName = "GetRecIdFromKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.GetRecIdFromKey")
    @ResponseWrapper(localName = "GetRecIdFromKey_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.GetRecIdFromKeyResult")
    public String getRecIdFromKey(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
        String key);

    /**
     * 
     * @param pedidosVentaProductos
     */
    @WebMethod(operationName = "Create", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:Create")
    @RequestWrapper(localName = "Create", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.Create")
    @ResponseWrapper(localName = "Create_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.CreateResult")
    public void create(
        @WebParam(name = "PedidosVentaProductos", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", mode = WebParam.Mode.INOUT)
        Holder<PedidosVentaProductos> pedidosVentaProductos);

    /**
     * 
     * @param pedidosVentaProductosList
     */
    @WebMethod(operationName = "CreateMultiple", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:CreateMultiple")
    @RequestWrapper(localName = "CreateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.CreateMultiple")
    @ResponseWrapper(localName = "CreateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.CreateMultipleResult")
    public void createMultiple(
        @WebParam(name = "PedidosVentaProductos_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", mode = WebParam.Mode.INOUT)
        Holder<PedidosVentaProductosList> pedidosVentaProductosList);

    /**
     * 
     * @param pedidosVentaProductos
     */
    @WebMethod(operationName = "Update", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:Update")
    @RequestWrapper(localName = "Update", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.Update")
    @ResponseWrapper(localName = "Update_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.UpdateResult")
    public void update(
        @WebParam(name = "PedidosVentaProductos", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", mode = WebParam.Mode.INOUT)
        Holder<PedidosVentaProductos> pedidosVentaProductos);

    /**
     * 
     * @param pedidosVentaProductosList
     */
    @WebMethod(operationName = "UpdateMultiple", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:UpdateMultiple")
    @RequestWrapper(localName = "UpdateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.UpdateMultiple")
    @ResponseWrapper(localName = "UpdateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.UpdateMultipleResult")
    public void updateMultiple(
        @WebParam(name = "PedidosVentaProductos_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", mode = WebParam.Mode.INOUT)
        Holder<PedidosVentaProductosList> pedidosVentaProductosList);

    /**
     * 
     * @param key
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Delete", action = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos:Delete")
    @WebResult(name = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
    @RequestWrapper(localName = "Delete", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.Delete")
    @ResponseWrapper(localName = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", className = "schemas.dynamics.microsoft.page.pedidosventaproductos.DeleteResult")
    public boolean delete(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos")
        String key);

}
