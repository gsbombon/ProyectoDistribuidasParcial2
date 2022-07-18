
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarCobradorS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarCobradorS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cedula_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direccion_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarCobradorS", propOrder = {
    "cedulaCobrador",
    "nombreCobrador",
    "direccionCobrador"
})
public class InsertarCobradorS {

    @XmlElement(name = "Cedula_Cobrador")
    protected String cedulaCobrador;
    @XmlElement(name = "Nombre_Cobrador")
    protected String nombreCobrador;
    @XmlElement(name = "Direccion_Cobrador")
    protected String direccionCobrador;

    /**
     * Obtiene el valor de la propiedad cedulaCobrador.
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
     * Define el valor de la propiedad cedulaCobrador.
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
     * Obtiene el valor de la propiedad nombreCobrador.
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
     * Define el valor de la propiedad nombreCobrador.
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
     * Obtiene el valor de la propiedad direccionCobrador.
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
     * Define el valor de la propiedad direccionCobrador.
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
