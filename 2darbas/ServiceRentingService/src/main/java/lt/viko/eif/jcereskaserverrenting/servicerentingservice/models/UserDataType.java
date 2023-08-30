package lt.viko.eif.jcereskaserverrenting.servicerentingservice.models;

import jakarta.xml.bind.annotation.*;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDataType", propOrder = {
        "id",
        "username",
        "password",
        "userPackage"
})
@XmlRootElement(name = "userData", namespace = "http://www.ServerRenting.lt/viko/eif/jcereska/serverrenting/api/userDataCheck")
public class UserDataType {

    protected int id;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected UserPackageType userPackage;


    public int getId() {
        return id;
    }


    public void setId(int value) {
        this.id = value;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String value) {
        this.password = value;
    }


    public UserPackageType getUserPackage() {
        return userPackage;
    }


    public void setUserPackage(UserPackageType value) {
        this.userPackage = value;
    }

}