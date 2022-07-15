
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarCiudadS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarCiudadS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Codigo_Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarCiudadS", propOrder = {
    "codigoCiudad"
})
public class BuscarCiudadS {

    @XmlElement(name = "Codigo_Ciudad")
    protected String codigoCiudad;

    /**
     * Obtiene el valor de la propiedad codigoCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    /**
     * Define el valor de la propiedad codigoCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCiudad(String value) {
        this.codigoCiudad = value;
    }

}
