
package schemas.dynamics.microsoft.codeunit.serienextid;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "serieNextId", targetNamespace = "urn:microsoft-dynamics-schemas/codeunit/serieNextId", wsdlLocation = "http://localhost:7047/DynamicsNAV/WS/Codeunit/serieNextId")
public class SerieNextId
    extends Service
{

    private final static URL SERIENEXTID_WSDL_LOCATION;
    private final static WebServiceException SERIENEXTID_EXCEPTION;
    private final static QName SERIENEXTID_QNAME = new QName("urn:microsoft-dynamics-schemas/codeunit/serieNextId", "serieNextId");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7047/DynamicsNAV/WS/Codeunit/serieNextId");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERIENEXTID_WSDL_LOCATION = url;
        SERIENEXTID_EXCEPTION = e;
    }

    public SerieNextId() {
        super(__getWsdlLocation(), SERIENEXTID_QNAME);
    }

    public SerieNextId(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERIENEXTID_QNAME, features);
    }

    public SerieNextId(URL wsdlLocation) {
        super(wsdlLocation, SERIENEXTID_QNAME);
    }

    public SerieNextId(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERIENEXTID_QNAME, features);
    }

    public SerieNextId(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SerieNextId(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SerieNextIdPort
     */
    @WebEndpoint(name = "serieNextId_Port")
    public SerieNextIdPort getSerieNextIdPort() {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/codeunit/serieNextId", "serieNextId_Port"), SerieNextIdPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SerieNextIdPort
     */
    @WebEndpoint(name = "serieNextId_Port")
    public SerieNextIdPort getSerieNextIdPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:microsoft-dynamics-schemas/codeunit/serieNextId", "serieNextId_Port"), SerieNextIdPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERIENEXTID_EXCEPTION!= null) {
            throw SERIENEXTID_EXCEPTION;
        }
        return SERIENEXTID_WSDL_LOCATION;
    }

}
