
package schemas.dynamics.microsoft.page.pedidosventaproductos;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PedidosVentaProductos_Service", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventaproductos", wsdlLocation = "http://localhost:7047/DynamicsNAV/WS/Page/PedidosVentaProductos")
public class PedidosVentaProductosService
    extends Service
{

    private final static URL PEDIDOSVENTAPRODUCTOSSERVICE_WSDL_LOCATION;
    private final static WebServiceException PEDIDOSVENTAPRODUCTOSSERVICE_EXCEPTION;
    private final static QName PEDIDOSVENTAPRODUCTOSSERVICE_QNAME = new QName("urn:microsoft-dynamics-schemas/page/pedidosventaproductos", "PedidosVentaProductos_Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7047/DynamicsNAV/WS/Page/PedidosVentaProductos");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PEDIDOSVENTAPRODUCTOSSERVICE_WSDL_LOCATION = url;
        PEDIDOSVENTAPRODUCTOSSERVICE_EXCEPTION = e;
    }

    public PedidosVentaProductosService() {
        super(__getWsdlLocation(), PEDIDOSVENTAPRODUCTOSSERVICE_QNAME);
    }

    public PedidosVentaProductosService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PEDIDOSVENTAPRODUCTOSSERVICE_QNAME, features);
    }

    public PedidosVentaProductosService(URL wsdlLocation) {
        super(wsdlLocation, PEDIDOSVENTAPRODUCTOSSERVICE_QNAME);
    }

    public PedidosVentaProductosService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PEDIDOSVENTAPRODUCTOSSERVICE_QNAME, features);
    }

    public PedidosVentaProductosService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PedidosVentaProductosService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PedidosVentaProductosPort
     */
    @WebEndpoint(name = "PedidosVentaProductos_Port")
    public PedidosVentaProductosPort getPedidosVentaProductosPort() {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/page/pedidosventaproductos", "PedidosVentaProductos_Port"), PedidosVentaProductosPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PedidosVentaProductosPort
     */
    @WebEndpoint(name = "PedidosVentaProductos_Port")
    public PedidosVentaProductosPort getPedidosVentaProductosPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/page/pedidosventaproductos", "PedidosVentaProductos_Port"), PedidosVentaProductosPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PEDIDOSVENTAPRODUCTOSSERVICE_EXCEPTION!= null) {
            throw PEDIDOSVENTAPRODUCTOSSERVICE_EXCEPTION;
        }
        return PEDIDOSVENTAPRODUCTOSSERVICE_WSDL_LOCATION;
    }

}
