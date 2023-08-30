package lt.viko.eif.jcereska.serverrenting.client;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;




@WebService(name = "UserDataCheck", targetNamespace = "http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface UserDataCheck {


    @WebMethod
    @WebResult(name = "getUserDataCheckResponse", targetNamespace = "http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck", partName = "getUserDataCheckResponse")
    public GetUserDataCheckResponse getUserDataCheck(
            @WebParam(name = "getUserDataCheckRequest", targetNamespace = "http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck", partName = "getUserDataCheckRequest")
            GetUserDataCheckRequest getUserDataCheckRequest);

}