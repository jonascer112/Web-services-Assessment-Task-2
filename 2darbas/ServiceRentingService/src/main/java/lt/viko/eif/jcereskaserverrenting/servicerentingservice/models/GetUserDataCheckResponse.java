package lt.viko.eif.jcereskaserverrenting.servicerentingservice.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "check"
})
@XmlRootElement(name = "getUserDataCheckResponse")
public class GetUserDataCheckResponse {

    @XmlElement(name = "Check", required = true)
    protected UserDataCheck check;


    public UserDataCheck getCheck() {
        return check;
    }


    public void setCheck(UserDataCheck value) {
        this.check = value;
    }

}
