
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rucCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalFactura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factura", propOrder = {
    "codFactura",
    "fecha",
    "nomCiudad",
    "rucCliente",
    "tipoPago",
    "totalFactura"
})
public class Factura {

    protected String codFactura;
    protected String fecha;
    protected String nomCiudad;
    protected String rucCliente;
    protected String tipoPago;
    protected Double totalFactura;

    /**
     * Obtiene el valor de la propiedad codFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFactura() {
        return codFactura;
    }

    /**
     * Define el valor de la propiedad codFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFactura(String value) {
        this.codFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCiudad() {
        return nomCiudad;
    }

    /**
     * Define el valor de la propiedad nomCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCiudad(String value) {
        this.nomCiudad = value;
    }

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
     * Obtiene el valor de la propiedad tipoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Define el valor de la propiedad tipoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPago(String value) {
        this.tipoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFactura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFactura() {
        return totalFactura;
    }

    /**
     * Define el valor de la propiedad totalFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFactura(Double value) {
        this.totalFactura = value;
    }

}
