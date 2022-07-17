
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cabeceraFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cabeceraFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numCabecera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rucCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabeceraFactura", propOrder = {
    "codCiudad",
    "fecha",
    "numCabecera",
    "rucCliente"
})
public class CabeceraFactura {

    protected String codCiudad;
    protected String fecha;
    protected String numCabecera;
    protected String rucCliente;

    /**
     * Obtiene el valor de la propiedad codCiudad.
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
     * Define el valor de la propiedad codCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCiudad(String value) {
        this.codCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
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
     * Define el valor de la propiedad fecha.
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
     * Obtiene el valor de la propiedad numCabecera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCabecera() {
        return numCabecera;
    }

    /**
     * Define el valor de la propiedad numCabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCabecera(String value) {
        this.numCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad rucCliente.
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
     * Define el valor de la propiedad rucCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucCliente(String value) {
        this.rucCliente = value;
    }

}
