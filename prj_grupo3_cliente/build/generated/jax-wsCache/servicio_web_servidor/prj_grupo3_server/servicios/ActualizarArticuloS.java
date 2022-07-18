
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarArticuloS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarArticuloS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Codigo_Articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre_Articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Precio_Articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PStock_Articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarArticuloS", propOrder = {
    "codigoArticulo",
    "nombreArticulo",
    "precioArticulo",
    "pStockArticulo"
})
public class ActualizarArticuloS {

    @XmlElement(name = "Codigo_Articulo")
    protected String codigoArticulo;
    @XmlElement(name = "Nombre_Articulo")
    protected String nombreArticulo;
    @XmlElement(name = "Precio_Articulo")
    protected String precioArticulo;
    @XmlElement(name = "PStock_Articulo")
    protected String pStockArticulo;

    /**
     * Obtiene el valor de la propiedad codigoArticulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    /**
     * Define el valor de la propiedad codigoArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoArticulo(String value) {
        this.codigoArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArticulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    /**
     * Define el valor de la propiedad nombreArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArticulo(String value) {
        this.nombreArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad precioArticulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioArticulo() {
        return precioArticulo;
    }

    /**
     * Define el valor de la propiedad precioArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioArticulo(String value) {
        this.precioArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad pStockArticulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPStockArticulo() {
        return pStockArticulo;
    }

    /**
     * Define el valor de la propiedad pStockArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPStockArticulo(String value) {
        this.pStockArticulo = value;
    }

}
