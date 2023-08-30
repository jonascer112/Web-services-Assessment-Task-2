package lt.viko.eif.jcereskaserverrenting.servicerentingservice.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloudServersType", propOrder = {
        "id",
        "vCores",
        "vram",
        "ram"
})
public class CloudServersType {

        protected int id;
        protected int vCores;
        protected int vram;
        @XmlElement(required = true)
        protected String ram;


        public int getId() {
                return id;
        }

        public void setId(int value) {
                this.id = value;
        }


        public int getVCores() {
                return vCores;
        }


        public void setVCores(int value) {
                this.vCores = value;
        }


        public int getVram() {
                return vram;
        }


        public void setVram(int value) {
                this.vram = value;
        }


        public String getRam() {
                return ram;
        }


        public void setRam(String value) {
                this.ram = value;
        }

}
