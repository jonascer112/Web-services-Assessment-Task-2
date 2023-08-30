package lt.viko.eif.jcereska.serverrenting.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;




@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id"
})
@XmlRootElement(name = "getUserDataCheckRequest")
public class GetUserDataCheckRequest {

    protected int id;


    public int getId() {
        return id;
    }


    public void setId(int value) {
        this.id = value;
    }

}
