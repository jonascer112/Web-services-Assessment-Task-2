package lt.viko.eif.jcereska.serverrenting.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;




@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDataType", propOrder = {
        "id",
        "username",
        "password",
        "userPackage"
})
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
