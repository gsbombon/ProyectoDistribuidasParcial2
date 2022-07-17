
package prj_grupo3_server.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscarCabeceraFacturaS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buscarCabeceraFacturaS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numCabecera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarCabeceraFacturaS", propOrder = {
    "numCabecera"
})
public class BuscarCabeceraFacturaS {

    protected String numCabecera;

    /**
     * Gets the value of the numCabecera property.
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
     * Sets the value of the numCabecera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCabecera(String value) {
        this.numCabecera = value;
    }

}