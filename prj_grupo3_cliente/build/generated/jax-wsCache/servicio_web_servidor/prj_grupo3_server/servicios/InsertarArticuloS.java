
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertarArticuloS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertarArticuloS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarArticuloS", propOrder = {
    "codigo",
    "nombre",
    "precio",
    "cantidad"
})
public class InsertarArticuloS {

    protected String codigo;
    protected String nombre;
    protected String precio;
    protected String cantidad;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

}
