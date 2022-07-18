
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actualizarClienteS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actualizarClienteS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ruc_Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre_Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion_Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarClienteS", propOrder = {
    "rucCliente",
    "nombreCliente",
    "direccionCliente"
})
public class ActualizarClienteS {

    @XmlElement(name = "Ruc_Cliente")
    protected String rucCliente;
    @XmlElement(name = "Nombre_Cliente")
    protected String nombreCliente;
    @XmlElement(name = "Direccion_Cliente")
    protected String direccionCliente;

    /**
     * Gets the value of the rucCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucCliente() {
        return rucCliente;
    }

    /**
     * Sets the value of the rucCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucCliente(String value) {
        this.rucCliente = value;
    }

    /**
     * Gets the value of the nombreCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Sets the value of the nombreCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Gets the value of the direccionCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionCliente() {
        return direccionCliente;
    }

    /**
     * Sets the value of the direccionCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionCliente(String value) {
        this.direccionCliente = value;
    }

}
