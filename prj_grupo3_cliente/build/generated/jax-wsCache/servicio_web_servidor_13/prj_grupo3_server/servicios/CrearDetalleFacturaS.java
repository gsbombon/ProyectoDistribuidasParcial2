
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearDetalleFacturaS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearDetalleFacturaS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearDetalleFacturaS", propOrder = {
    "numFactura"
})
public class CrearDetalleFacturaS {

    protected String numFactura;

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

}
