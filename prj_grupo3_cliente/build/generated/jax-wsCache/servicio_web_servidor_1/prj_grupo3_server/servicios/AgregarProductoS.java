
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agregarProductoS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agregarProductoS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioTotalItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarProductoS", propOrder = {
    "numFactura",
    "nombreItem",
    "cantidadItem",
    "precioItem",
    "precioTotalItem"
})
public class AgregarProductoS {

    protected String numFactura;
    protected String nombreItem;
    protected String cantidadItem;
    protected String precioItem;
    protected String precioTotalItem;

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
     * Gets the value of the nombreItem property.
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
     * Sets the value of the nombreItem property.
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
     * Gets the value of the cantidadItem property.
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
     * Sets the value of the cantidadItem property.
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
     * Gets the value of the precioItem property.
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
     * Sets the value of the precioItem property.
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
     * Gets the value of the precioTotalItem property.
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
     * Sets the value of the precioTotalItem property.
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
