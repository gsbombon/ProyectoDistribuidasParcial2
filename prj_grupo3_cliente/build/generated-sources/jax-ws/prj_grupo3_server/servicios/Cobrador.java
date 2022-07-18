
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cobrador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cobrador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cedula_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cobrador", propOrder = {
    "cedulaCobrador",
    "direccionCobrador",
    "id",
    "nombreCobrador"
})
public class Cobrador {

    @XmlElement(name = "cedula_Cobrador")
    protected String cedulaCobrador;
    @XmlElement(name = "direccion_Cobrador")
    protected String direccionCobrador;
    protected int id;
    @XmlElement(name = "nombre_Cobrador")
    protected String nombreCobrador;

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

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
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

}
