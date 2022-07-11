
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actualizarCobradorS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actualizarCobradorS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cedula_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarCobradorS", propOrder = {
    "cedulaCobrador",
    "nombreCobrador",
    "direccionCobrador"
})
public class ActualizarCobradorS {

    @XmlElement(name = "Cedula_Cobrador")
    protected String cedulaCobrador;
    @XmlElement(name = "Nombre_Cobrador")
    protected String nombreCobrador;
    @XmlElement(name = "Direccion_Cobrador")
    protected String direccionCobrador;

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

    /**
     * Gets the value of the nombreCobrador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCobrador() {
        return nombreCobrador;
    }

    /**
     * Sets the value of the nombreCobrador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCobrador(String value) {
        this.nombreCobrador = value;
    }

    /**
     * Gets the value of the direccionCobrador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionCobrador() {
        return direccionCobrador;
    }

    /**
     * Sets the value of the direccionCobrador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionCobrador(String value) {
        this.direccionCobrador = value;
    }

}
