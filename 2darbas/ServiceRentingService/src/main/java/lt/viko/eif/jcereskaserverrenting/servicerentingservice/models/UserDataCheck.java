package lt.viko.eif.jcereskaserverrenting.servicerentingservice.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDataCheck", propOrder = {
        "hasDedicatedServers",
        "hasCloudServers",
        "price",
        "amountOfDedicatedServers",
        "amountOfCloudServers"
})
public class UserDataCheck {

    @XmlElement(defaultValue = "false")
    protected boolean hasDedicatedServers;
    @XmlElement(defaultValue = "false")
    protected boolean hasCloudServers;
    protected float price;
    @XmlElement(defaultValue = "0")
    protected int amountOfDedicatedServers;
    @XmlElement(defaultValue = "0")
    protected int amountOfCloudServers;


    public boolean isHasDedicatedServers() {
        return hasDedicatedServers;
    }


    public void setHasDedicatedServers(boolean value) {
        this.hasDedicatedServers = value;
    }


    public boolean isHasCloudServers() {
        return hasCloudServers;
    }


    public void setHasCloudServers(boolean value) {
        this.hasCloudServers = value;
    }


    public float getPrice() {
        return price;
    }


    public void setPrice(float value) {
        this.price = value;
    }


    public int getAmountOfDedicatedServers() {
        return amountOfDedicatedServers;
    }


    public void setAmountOfDedicatedServers(int value) {
        this.amountOfDedicatedServers = value;
    }

    public int getAmountOfCloudServers() {
        return amountOfCloudServers;
    }


    public void setAmountOfCloudServers(int value) {
        this.amountOfCloudServers = value;
    }

}
