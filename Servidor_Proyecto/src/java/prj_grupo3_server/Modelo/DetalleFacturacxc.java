/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_grupo3_server.Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author haom_
 */
public class DetalleFacturacxc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String numCabecera;
    private ArrayList<ItemFacturacxc> itemsDetalle;
    private double precioTotal;

    public DetalleFacturacxc() {
    }

    public DetalleFacturacxc(String numCabecera, ArrayList<ItemFacturacxc> itemsDetalle, double precioTotal) {
        this.numCabecera = numCabecera;
        this.itemsDetalle = itemsDetalle;
        this.precioTotal = precioTotal;
    }

    public String getNumCabecera() {
        return numCabecera;
    }

    public void setNumCabecera(String numCabecera) {
        this.numCabecera = numCabecera;
    }

    public ArrayList<ItemFacturacxc> getItemsDetalle() {
        return itemsDetalle;
    }

    public void setItemsDetalle(ArrayList<ItemFacturacxc> itemsDetalle) {
        this.itemsDetalle = itemsDetalle;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
}
