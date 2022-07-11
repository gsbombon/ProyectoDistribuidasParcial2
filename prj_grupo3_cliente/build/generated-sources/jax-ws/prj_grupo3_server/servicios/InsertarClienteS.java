
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarClienteS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarClienteS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ruc_Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre_Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direccion_Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarClienteS", propOrder = {
    "rucCliente",
    "nombreCliente",
    "direccionCliente"
})
public class InsertarClienteS {

    @XmlElement(name = "Ruc_Cliente")
    protected String rucCliente;
    @XmlElement(name = "Nombre_Cliente")
    protected String nombreCliente;
    @XmlElement(name = "Direccion_Cliente")
    protected String direccionCliente;

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

    /**
     * Obtiene el valor de la propiedad nombreCliente.
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
     * Define el valor de la propiedad nombreCliente.
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
     * Obtiene el valor de la propiedad direccionCliente.
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
     * Define el valor de la propiedad direccionCliente.
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
