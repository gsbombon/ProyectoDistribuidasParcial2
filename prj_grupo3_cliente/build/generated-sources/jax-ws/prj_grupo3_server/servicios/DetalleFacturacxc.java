
package prj_grupo3_server.servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detalleFacturacxc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detalleFacturacxc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemsDetalle" type="{http://Servicios.prj_grupo3_server/}itemFacturacxc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numCabecera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleFacturacxc", propOrder = {
    "itemsDetalle",
    "numCabecera",
    "precioTotal"
})
public class DetalleFacturacxc {

    @XmlElement(nillable = true)
    protected List<ItemFacturacxc> itemsDetalle;
    protected String numCabecera;
    protected double precioTotal;

    /**
     * Gets the value of the itemsDetalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemsDetalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemsDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemFacturacxc }
     * 
     * 
     */
    public List<ItemFacturacxc> getItemsDetalle() {
        if (itemsDetalle == null) {
            itemsDetalle = new ArrayList<ItemFacturacxc>();
        }
        return this.itemsDetalle;
    }

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

    /**
     * Gets the value of the precioTotal property.
     * 
     */
    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Sets the value of the precioTotal property.
     * 
     */
    public void setPrecioTotal(double value) {
        this.precioTotal = value;
    }

}
