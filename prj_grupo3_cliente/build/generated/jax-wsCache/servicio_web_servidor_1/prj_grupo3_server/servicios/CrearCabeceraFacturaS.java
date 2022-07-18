
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crearCabeceraFacturaS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crearCabeceraFacturaS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearCabeceraFacturaS", propOrder = {
    "numFactura",
    "rucCliente",
    "fecha",
    "codCiudad"
})
public class CrearCabeceraFacturaS {

    protected String numFactura;
    protected String rucCliente;
    protected String fecha;
    protected String codCiudad;

    /**
     * Gets the value of the numFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFactura() {
        return numFactura;
    }

    /**
     * Sets the value of the numFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFactura(String value) {
        this.numFactura = value;
    }

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
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the codCiudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCiudad() {
        return codCiudad;
    }

    /**
     * Sets the value of the codCiudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCiudad(String value) {
        this.codCiudad = value;
    }

}
