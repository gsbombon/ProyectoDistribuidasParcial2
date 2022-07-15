
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarFormaPagoS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarFormaPagoS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Codigo_FP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarFormaPagoS", propOrder = {
    "codigoFP"
})
public class EliminarFormaPagoS {

    @XmlElement(name = "Codigo_FP")
    protected String codigoFP;

    /**
     * Obtiene el valor de la propiedad codigoFP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFP() {
        return codigoFP;
    }

    /**
     * Define el valor de la propiedad codigoFP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFP(String value) {
        this.codigoFP = value;
    }

}
