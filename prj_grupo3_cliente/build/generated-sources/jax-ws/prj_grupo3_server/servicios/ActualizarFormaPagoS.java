
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actualizarFormaPagoS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actualizarFormaPagoS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo_FP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre_FP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarFormaPagoS", propOrder = {
    "codigoFP",
    "nombreFP"
})
public class ActualizarFormaPagoS {

    @XmlElement(name = "Codigo_FP")
    protected String codigoFP;
    @XmlElement(name = "Nombre_FP")
    protected String nombreFP;

    /**
     * Gets the value of the codigoFP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFP() {
        return codigoFP;
    }

    /**
     * Sets the value of the codigoFP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFP(String value) {
        this.codigoFP = value;
    }

    /**
     * Gets the value of the nombreFP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFP() {
        return nombreFP;
    }

    /**
     * Sets the value of the nombreFP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFP(String value) {
        this.nombreFP = value;
    }

}
