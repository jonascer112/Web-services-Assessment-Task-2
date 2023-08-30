package lt.viko.eif.jcereskaserverrenting.servicerentingservice.models;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _UserData_QNAME = new QName("http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck", "userData");

    public ObjectFactory() {
    }


    public GetUserDataCheckRequest createGetUserDataCheckRequest() {
        return new GetUserDataCheckRequest();
    }


    public UserDataType createUserDataType() {
        return new UserDataType();
    }


    public GetUserDataCheckResponse createGetUserDataCheckResponse() {
        return new GetUserDataCheckResponse();
    }


    public UserDataCheck createUserDataCheck() {
        return new UserDataCheck();
    }


    public DedicatedServersType createDedicatedServersType() {
        return new DedicatedServersType();
    }

    public UserPackageType createUserPackageType() {
        return new UserPackageType();
    }


    public CloudServersType createCloudServersType() {
        return new CloudServersType();
    }


    @XmlElementDecl(namespace = "http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck", name = "userData")
    public JAXBElement<UserDataType> createUserData(UserDataType value) {
        return new JAXBElement<UserDataType>(_UserData_QNAME, UserDataType.class, null, value);
    }

}