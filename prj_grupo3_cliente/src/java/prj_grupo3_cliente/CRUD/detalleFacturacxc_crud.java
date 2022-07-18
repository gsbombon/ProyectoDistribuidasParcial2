/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.DetalleFacturacxc;
import prj_grupo3_server.servicios.ItemFacturacxc;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

/**
 *
 * @author haom_
 */
@ManagedBean()
@SessionScoped
public class detalleFacturacxc_crud {
    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    
    public String numCabecera = "";
    public ArrayList<ItemFacturacxc> itemsDetalle = null;
    public double precioTotal = 0;
    public DetalleFacturacxc detalleFactura;

    detalleFacturacxc_crud() {
       }

     public void buscarDetalleFacturacxc(String numFactura) {
        detalleFactura = port.buscarDetalleFacturacxcS(numFactura);
        this.itemsDetalle = (ArrayList<ItemFacturacxc>) detalleFactura.getItemsDetalle();
        this.precioTotal = detalleFactura.getPrecioTotal();
    }

    public detalleFacturacxc_crud(String numCabecera, ArrayList<ItemFacturacxc> itemsDetalle, double precioTotal, DetalleFacturacxc detalleFactura) {
       this.numCabecera = numCabecera;
        this.itemsDetalle = itemsDetalle;
        this.precioTotal = precioTotal;
        this.detalleFactura = detalleFactura;
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

    public DetalleFacturacxc getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFacturacxc detalleFactura) {
        this.detalleFactura = detalleFactura;
    }
    
    
    
}
