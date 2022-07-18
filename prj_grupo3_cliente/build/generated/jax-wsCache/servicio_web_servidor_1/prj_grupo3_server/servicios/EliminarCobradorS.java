
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eliminarCobradorS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eliminarCobradorS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cedula_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarCobradorS", propOrder = {
    "cedulaCobrador"
})
public class EliminarCobradorS {

    @XmlElement(name = "Cedula_Cobrador")
    protected String cedulaCobrador;

    /**
     * Gets the value of the cedulaCobrador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaCobrador() {
        return cedulaCobrador;
    }

    /**
     * Sets the value of the cedulaCobrador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaCobrador(String value) {
        this.cedulaCobrador = value;
    }

}
