package lt.viko.eif.jcereska.serverrenting.client;

import jakarta.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;




@WebServiceClient(name = "UserDataCheckService", targetNamespace = "http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck", wsdlLocation = "http://localhost:8080/ws/userDataCheck.wsdl")
public class UserDataCheckService
        extends Service
{

    private final static URL USERDATACHECKSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERDATACHECKSERVICE_EXCEPTION;
    private final static QName USERDATACHECKSERVICE_QNAME = new QName("http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck", "UserDataCheckService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/userDataCheck.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERDATACHECKSERVICE_WSDL_LOCATION = url;
        USERDATACHECKSERVICE_EXCEPTION = e;
    }

    public UserDataCheckService() {
        super(__getWsdlLocation(), USERDATACHECKSERVICE_QNAME);
    }

    public UserDataCheckService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERDATACHECKSERVICE_QNAME, features);
    }

    public UserDataCheckService(URL wsdlLocation) {
        super(wsdlLocation, USERDATACHECKSERVICE_QNAME);
    }

    public UserDataCheckService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERDATACHECKSERVICE_QNAME, features);
    }

    public UserDataCheckService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserDataCheckService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }


    @WebEndpoint(name = "UserDataCheckSoap11")
    public UserDataCheck getUserDataCheckSoap11() {
        return super.getPort(new QName("http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck", "UserDataCheckSoap11"), UserDataCheck.class);
    }

    @WebEndpoint(name = "UserDataCheckSoap11")
    public UserDataCheck getUserDataCheckSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck", "UserDataCheckSoap11"), UserDataCheck.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERDATACHECKSERVICE_EXCEPTION!= null) {
            throw USERDATACHECKSERVICE_EXCEPTION;
        }
        return USERDATACHECKSERVICE_WSDL_LOCATION;
    }

}
