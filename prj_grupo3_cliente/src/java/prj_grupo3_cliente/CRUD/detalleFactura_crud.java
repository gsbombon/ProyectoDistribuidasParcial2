package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.DetalleFactura;
import prj_grupo3_server.servicios.ItemFactura;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

@ManagedBean()
@SessionScoped
public class detalleFactura_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();

    public String numCabecera = "";
    public ArrayList<ItemFactura> itemsDetalle = null;
    public double precioTotal = 0;
    public DetalleFactura detalleFactura;
   
    public void buscarDetalleFactura(String numFactura) {
        detalleFactura = port.buscarDetalleFacturaS(numFactura);
        this.itemsDetalle = (ArrayList<ItemFactura>) detalleFactura.getItemsDetalle();
        this.precioTotal = detalleFactura.getPrecioTotal();
    }

    public detalleFactura_crud(String numCabecera, ArrayList<ItemFactura> itemsDetalle, double precioTotal, DetalleFactura detalleFactura) {
        this.numCabecera = numCabecera;
        this.itemsDetalle = itemsDetalle;
        this.precioTotal = precioTotal;
        this.detalleFactura = detalleFactura;
    }

    public ArrayList<ItemFactura> getItemsDetalle() {
        return itemsDetalle;
    }

    public void setItemsDetalle(ArrayList<ItemFactura> itemsDetalle) {
        this.itemsDetalle = itemsDetalle;
    }

    public detalleFactura_crud() {
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
