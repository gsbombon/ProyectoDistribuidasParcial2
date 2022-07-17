package prj_grupo3_cliente.CRUD;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

@ManagedBean()
@SessionScoped
public class itemFactura_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public String nombreItem = "";
    public String precioItem = "";
    public String cantidadItem = "";
    public String precioTotalItem = "";

    public itemFactura_crud() {
    }  
    
    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getPrecioItem() {
        return precioItem;
    }

    public void setPrecioItem(String precioItem) {
        this.precioItem = precioItem;
    }

    public String getCantidadItem() {
        return cantidadItem;
    }

    public void setCantidadItem(String cantidadItem) {
        this.cantidadItem = cantidadItem;
    }

    public String getPrecioTotalItem() {
        return precioTotalItem;
    }

    public void setPrecioTotalItem(String precioTotalItem) {
        this.precioTotalItem = precioTotalItem;
    }
    
    

}
