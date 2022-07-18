
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarPagaS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarPagaS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechapagoItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formapagoItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorpagarItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cobradorItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Obtiene el valor de la propiedad numFactura.
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
     * Define el valor de la propiedad numFactura.
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
     * Obtiene el valor de la propiedad fechapagoItem.
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
     * Define el valor de la propiedad fechapagoItem.
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
     * Obtiene el valor de la propiedad formapagoItem.
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
     * Define el valor de la propiedad formapagoItem.
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
     * Obtiene el valor de la propiedad valorpagarItem.
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
     * Define el valor de la propiedad valorpagarItem.
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
     * Obtiene el valor de la propiedad cobradorItem.
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
     * Define el valor de la propiedad cobradorItem.
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
