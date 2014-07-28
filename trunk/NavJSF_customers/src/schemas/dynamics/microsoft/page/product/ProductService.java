
package schemas.dynamics.microsoft.page.product;

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
@WebServiceClient(name = "Product_Service", targetNamespace = "urn:microsoft-dynamics-schemas/page/product", wsdlLocation = "http://localhost:7047/DynamicsNAV/WS/Page/Product")
public class ProductService
    extends Service
{

    private final static URL PRODUCTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTSERVICE_EXCEPTION;
    private final static QName PRODUCTSERVICE_QNAME = new QName("urn:microsoft-dynamics-schemas/page/product", "Product_Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7047/DynamicsNAV/WS/Page/Product");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTSERVICE_WSDL_LOCATION = url;
        PRODUCTSERVICE_EXCEPTION = e;
    }

    public ProductService() {
        super(__getWsdlLocation(), PRODUCTSERVICE_QNAME);
    }

    public ProductService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTSERVICE_QNAME, features);
    }

    public ProductService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTSERVICE_QNAME);
    }

    public ProductService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTSERVICE_QNAME, features);
    }

    public ProductService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductPort
     */
    @WebEndpoint(name = "Product_Port")
    public ProductPort getProductPort() {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/page/product", "Product_Port"), ProductPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductPort
     */
    @WebEndpoint(name = "Product_Port")
    public ProductPort getProductPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/page/product", "Product_Port"), ProductPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTSERVICE_EXCEPTION!= null) {
            throw PRODUCTSERVICE_EXCEPTION;
        }
        return PRODUCTSERVICE_WSDL_LOCATION;
    }

}
