
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidadItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioTotalItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemFactura", propOrder = {
    "cantidadItem",
    "nombreItem",
    "precioItem",
    "precioTotalItem"
})
public class ItemFactura {

    protected String cantidadItem;
    protected String nombreItem;
    protected String precioItem;
    protected String precioTotalItem;

    /**
     * Obtiene el valor de la propiedad cantidadItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadItem() {
        return cantidadItem;
    }

    /**
     * Define el valor de la propiedad cantidadItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadItem(String value) {
        this.cantidadItem = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreItem() {
        return nombreItem;
    }

    /**
     * Define el valor de la propiedad nombreItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreItem(String value) {
        this.nombreItem = value;
    }

    /**
     * Obtiene el valor de la propiedad precioItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioItem() {
        return precioItem;
    }

    /**
     * Define el valor de la propiedad precioItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioItem(String value) {
        this.precioItem = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTotalItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioTotalItem() {
        return precioTotalItem;
    }

    /**
     * Define el valor de la propiedad precioTotalItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioTotalItem(String value) {
        this.precioTotalItem = value;
    }

}
