
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for articulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="articulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo_Articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre_Articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio_Articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stock_Articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articulo", propOrder = {
    "codigoArticulo",
    "nombreArticulo",
    "precioArticulo",
    "stockArticulo"
})
public class Articulo {

    @XmlElement(name = "codigo_Articulo")
    protected String codigoArticulo;
    @XmlElement(name = "nombre_Articulo")
    protected String nombreArticulo;
    @XmlElement(name = "precio_Articulo")
    protected String precioArticulo;
    @XmlElement(name = "stock_Articulo")
    protected String stockArticulo;

    /**
     * Gets the value of the codigoArticulo property.
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
     * Sets the value of the codigoArticulo property.
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
     * Gets the value of the nombreArticulo property.
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
     * Sets the value of the nombreArticulo property.
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
     * Gets the value of the precioArticulo property.
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
     * Sets the value of the precioArticulo property.
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
     * Gets the value of the stockArticulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockArticulo() {
        return stockArticulo;
    }

    /**
     * Sets the value of the stockArticulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockArticulo(String value) {
        this.stockArticulo = value;
    }

}
