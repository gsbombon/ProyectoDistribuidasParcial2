
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agregarPagaS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agregarPagaS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechapagoItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formapagoItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorpagarItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cobradorItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarPagaS", propOrder = {
    "numFactura",
    "fechapagoItem",
    "formapagoItem",
    "valorpagarItem",
    "cobradorItem"
})
public class AgregarPagaS {

    protected String numFactura;
    protected String fechapagoItem;
    protected String formapagoItem;
    protected String valorpagarItem;
    protected String cobradorItem;

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
     * Gets the value of the fechapagoItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechapagoItem() {
        return fechapagoItem;
    }

    /**
     * Sets the value of the fechapagoItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechapagoItem(String value) {
        this.fechapagoItem = value;
    }

    /**
     * Gets the value of the formapagoItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormapagoItem() {
        return formapagoItem;
    }

    /**
     * Sets the value of the formapagoItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormapagoItem(String value) {
        this.formapagoItem = value;
    }

    /**
     * Gets the value of the valorpagarItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorpagarItem() {
        return valorpagarItem;
    }

    /**
     * Sets the value of the valorpagarItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorpagarItem(String value) {
        this.valorpagarItem = value;
    }

    /**
     * Gets the value of the cobradorItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobradorItem() {
        return cobradorItem;
    }

    /**
     * Sets the value of the cobradorItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobradorItem(String value) {
        this.cobradorItem = value;
    }

}
