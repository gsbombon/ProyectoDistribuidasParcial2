
package prj_grupo3_server.servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="articulosDetalle" type="{http://Servicios.prj_grupo3_server/}itemFactura" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numCabecera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleFactura", propOrder = {
    "articulosDetalle",
    "numCabecera",
    "precioTotal"
})
public class DetalleFactura {

    @XmlElement(nillable = true)
    protected List<ItemFactura> articulosDetalle;
    protected String numCabecera;
    protected double precioTotal;

    /**
     * Gets the value of the articulosDetalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articulosDetalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticulosDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemFactura }
     * 
     * 
     */
    public List<ItemFactura> getArticulosDetalle() {
        if (articulosDetalle == null) {
            articulosDetalle = new ArrayList<ItemFactura>();
        }
        return this.articulosDetalle;
    }

    /**
     * Obtiene el valor de la propiedad numCabecera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCabecera() {
        return numCabecera;
    }

    /**
     * Define el valor de la propiedad numCabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCabecera(String value) {
        this.numCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTotal.
     * 
     */
    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Define el valor de la propiedad precioTotal.
     * 
     */
    public void setPrecioTotal(double value) {
        this.precioTotal = value;
    }

}
