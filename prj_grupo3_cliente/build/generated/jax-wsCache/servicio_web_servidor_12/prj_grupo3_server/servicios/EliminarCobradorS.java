
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarCobradorS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarCobradorS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cedula_Cobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarCobradorS", propOrder = {
    "cedulaCobrador"
})
public class EliminarCobradorS {

    @XmlElement(name = "Cedula_Cobrador")
    protected String cedulaCobrador;

    /**
     * Obtiene el valor de la propiedad cedulaCobrador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaCobrador() {
        return cedulaCobrador;
    }

    /**
     * Define el valor de la propiedad cedulaCobrador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaCobrador(String value) {
        this.cedulaCobrador = value;
    }

}
