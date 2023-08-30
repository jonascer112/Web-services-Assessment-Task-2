package lt.viko.eif.jcereska.serverrenting.client;

import jakarta.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "check"
})
@XmlRootElement(name = "getUserDataCheckResponse")
public class GetUserDataCheckResponse {

    @XmlElement(name = "Check", required = true)
    protected UserDataCheck_Type check;


    public UserDataCheck_Type getCheck() {
        return check;
    }


    public void setCheck(UserDataCheck_Type value) {
        this.check = value;
    }

}
