
package schemas.dynamics.microsoft.page.pedidosventa;

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
@WebServiceClient(name = "PedidosVenta_Service", targetNamespace = "urn:microsoft-dynamics-schemas/page/pedidosventa", wsdlLocation = "http://localhost:7047/DynamicsNAV/WS/Page/PedidosVenta")
public class PedidosVentaService
    extends Service
{

    private final static URL PEDIDOSVENTASERVICE_WSDL_LOCATION;
    private final static WebServiceException PEDIDOSVENTASERVICE_EXCEPTION;
    private final static QName PEDIDOSVENTASERVICE_QNAME = new QName("urn:microsoft-dynamics-schemas/page/pedidosventa", "PedidosVenta_Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7047/DynamicsNAV/WS/Page/PedidosVenta");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PEDIDOSVENTASERVICE_WSDL_LOCATION = url;
        PEDIDOSVENTASERVICE_EXCEPTION = e;
    }

    public PedidosVentaService() {
        super(__getWsdlLocation(), PEDIDOSVENTASERVICE_QNAME);
    }

    public PedidosVentaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PEDIDOSVENTASERVICE_QNAME, features);
    }

    public PedidosVentaService(URL wsdlLocation) {
        super(wsdlLocation, PEDIDOSVENTASERVICE_QNAME);
    }

    public PedidosVentaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PEDIDOSVENTASERVICE_QNAME, features);
    }

    public PedidosVentaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PedidosVentaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PedidosVentaPort
     */
    @WebEndpoint(name = "PedidosVenta_Port")
    public PedidosVentaPort getPedidosVentaPort() {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/page/pedidosventa", "PedidosVenta_Port"), PedidosVentaPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PedidosVentaPort
     */
    @WebEndpoint(name = "PedidosVenta_Port")
    public PedidosVentaPort getPedidosVentaPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/page/pedidosventa", "PedidosVenta_Port"), PedidosVentaPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PEDIDOSVENTASERVICE_EXCEPTION!= null) {
            throw PEDIDOSVENTASERVICE_EXCEPTION;
        }
        return PEDIDOSVENTASERVICE_WSDL_LOCATION;
    }

}
