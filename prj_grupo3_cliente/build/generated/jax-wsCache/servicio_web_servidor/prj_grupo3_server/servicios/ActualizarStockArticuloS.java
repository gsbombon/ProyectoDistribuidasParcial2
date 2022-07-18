
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarStockArticuloS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarStockArticuloS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomArticulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarStockArticuloS", propOrder = {
    "nomArticulo",
    "nuevoStock"
})
public class ActualizarStockArticuloS {

    protected String nomArticulo;
    protected String nuevoStock;

    /**
     * Obtiene el valor de la propiedad nomArticulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomArticulo() {
        return nomArticulo;
    }

    /**
     * Define el valor de la propiedad nomArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomArticulo(String value) {
        this.nomArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoStock.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoStock() {
        return nuevoStock;
    }

    /**
     * Define el valor de la propiedad nuevoStock.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoStock(String value) {
        this.nuevoStock = value;
    }

}
