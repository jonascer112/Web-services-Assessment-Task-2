package lt.viko.eif.jcereska.serverrenting.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;




@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dedicatedServersType", propOrder = {
        "id",
        "gpu",
        "cpu",
        "ram",
        "os"
})
public class DedicatedServersType {

    protected int id;
    protected String gpu;
    @XmlElement(required = true)
    protected String cpu;
    @XmlElement(required = true)
    protected String ram;
    @XmlElement(required = true)
    protected String os;


    public int getId() {
        return id;
    }


    public void setId(int value) {
        this.id = value;
    }


    public String getGpu() {
        return gpu;
    }


    public void setGpu(String  value) {
        this.gpu = value;
    }


    public String getCpu() {
        return cpu;
    }


    public void setCpu(String value) {
        this.cpu = value;
    }


    public String getRam() {
        return ram;
    }


    public void setRam(String value) {
        this.ram = value;
    }


    public String getOs() {
        return os;
    }


    public void setOs(String value) {
        this.os = value;
    }

}
