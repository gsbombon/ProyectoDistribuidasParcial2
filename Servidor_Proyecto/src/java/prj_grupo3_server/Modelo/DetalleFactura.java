package prj_grupo3_server.Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetalleFactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String numCabecera;
    private ArrayList<ItemFactura> itemsDetalle;
    private double precioTotal;

    public DetalleFactura() {
    }

    public DetalleFactura(String numCabecera, ArrayList<ItemFactura> itemsDetalle, double precioTotal) {
        this.numCabecera = numCabecera;
        this.itemsDetalle = itemsDetalle;
        this.precioTotal = precioTotal;
    }

    public ArrayList<ItemFactura> getItemsDetalle() {
        return itemsDetalle;
    }

    public void setItemsDetalle(ArrayList<ItemFactura> itemsDetalle) {
        this.itemsDetalle = itemsDetalle;
    }

    public String getNumCabecera() {
        return numCabecera;
    }

    public void setNumCabecera(String numCabecera) {
        this.numCabecera = numCabecera;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

}
