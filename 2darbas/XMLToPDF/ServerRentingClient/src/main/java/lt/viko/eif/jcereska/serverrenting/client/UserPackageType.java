package lt.viko.eif.jcereska.serverrenting.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;




@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userPackageType", propOrder = {
        "id",
        "name",
        "price",
        "dedicatedServers",
        "cloudServers"
})
public class UserPackageType {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    protected float price;
    @XmlElement(required = true)
    protected List<DedicatedServersType> dedicatedServers;
    @XmlElement(required = true)
    protected List<CloudServerType> cloudServers;


    public int getId() {
        return id;
    }


    public void setId(int value) {
        this.id = value;
    }


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public float getPrice() {
        return price;
    }


    public void setPrice(float value) {
        this.price = value;
    }


    public List<DedicatedServersType> getDedicatedServers() {
        if (dedicatedServers == null) {
            dedicatedServers = new ArrayList<DedicatedServersType>();
        }
        return this.dedicatedServers;
    }


    public List<CloudServerType> getCloudServers() {
        if (cloudServers == null) {
            cloudServers = new ArrayList<CloudServerType>();
        }
        return this.cloudServers;
    }

}