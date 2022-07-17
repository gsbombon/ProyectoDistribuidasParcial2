
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarFormaPagoS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarFormaPagoS"&gt;
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
@XmlType(name = "buscarFormaPagoS", propOrder = {
    "codigoFP"
})
public class BuscarFormaPagoS {

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
