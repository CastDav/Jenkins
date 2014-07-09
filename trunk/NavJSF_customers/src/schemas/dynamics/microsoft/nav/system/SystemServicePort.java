
package schemas.dynamics.microsoft.nav.system;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SystemService_Port", targetNamespace = "urn:microsoft-dynamics-schemas/nav/system/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SystemServicePort {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "Companies", action = "urn:microsoft-dynamics-schemas/nav/system/:Companies")
    @WebResult(name = "return_value", targetNamespace = "urn:microsoft-dynamics-schemas/nav/system/")
    @RequestWrapper(localName = "Companies", targetNamespace = "urn:microsoft-dynamics-schemas/nav/system/", className = "schemas.dynamics.microsoft.nav.system.Companies")
    @ResponseWrapper(localName = "Companies_Result", targetNamespace = "urn:microsoft-dynamics-schemas/nav/system/", className = "schemas.dynamics.microsoft.nav.system.CompaniesResult")
    public List<String> companies();

}
