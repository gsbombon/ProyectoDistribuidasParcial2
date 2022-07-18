
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscarCabeceraFacturaPorRucSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buscarCabeceraFacturaPorRucSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Servicios.prj_grupo3_server/}cabeceraFactura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarCabeceraFacturaPorRucSResponse", propOrder = {
    "_return"
})
public class BuscarCabeceraFacturaPorRucSResponse {

    @XmlElement(name = "return")
    protected CabeceraFactura _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraFactura }
     *     
     */
    public CabeceraFactura getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraFactura }
     *     
     */
    public void setReturn(CabeceraFactura value) {
        this._return = value;
    }

}
