
package schemas.dynamics.microsoft.page.pedidoscompra;

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
@WebServiceClient(name = "PedidosCompra_Service", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidoscompra", wsdlLocation = "http://localhost:7047/DynamicsNAV/WS/Page/PedidosCompra")
public class PedidosCompraService
    extends Service
{

    private final static URL PEDIDOSCOMPRASERVICE_WSDL_LOCATION;
    private final static WebServiceException PEDIDOSCOMPRASERVICE_EXCEPTION;
    private final static QName PEDIDOSCOMPRASERVICE_QNAME = new QName("urn:microsoft-dynamics-schemas/page/pedidoscompra", "PedidosCompra_Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7047/DynamicsNAV/WS/Page/PedidosCompra");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PEDIDOSCOMPRASERVICE_WSDL_LOCATION = url;
        PEDIDOSCOMPRASERVICE_EXCEPTION = e;
    }

    public PedidosCompraService() {
        super(__getWsdlLocation(), PEDIDOSCOMPRASERVICE_QNAME);
    }

    public PedidosCompraService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PEDIDOSCOMPRASERVICE_QNAME, features);
    }

    public PedidosCompraService(URL wsdlLocation) {
        super(wsdlLocation, PEDIDOSCOMPRASERVICE_QNAME);
    }

    public PedidosCompraService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PEDIDOSCOMPRASERVICE_QNAME, features);
    }

    public PedidosCompraService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PedidosCompraService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PedidosCompraPort
     */
    @WebEndpoint(name = "PedidosCompra_Port")
    public PedidosCompraPort getPedidosCompraPort() {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/page/pedidoscompra", "PedidosCompra_Port"), PedidosCompraPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PedidosCompraPort
     */
    @WebEndpoint(name = "PedidosCompra_Port")
    public PedidosCompraPort getPedidosCompraPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/page/pedidoscompra", "PedidosCompra_Port"), PedidosCompraPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PEDIDOSCOMPRASERVICE_EXCEPTION!= null) {
            throw PEDIDOSCOMPRASERVICE_EXCEPTION;
        }
        return PEDIDOSCOMPRASERVICE_WSDL_LOCATION;
    }

}