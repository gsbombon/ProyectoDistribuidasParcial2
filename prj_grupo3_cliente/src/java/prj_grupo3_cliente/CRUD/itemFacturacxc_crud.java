/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_grupo3_cliente.CRUD;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

/**
 *
 * @author haom_
 */
@ManagedBean()
@SessionScoped
public class itemFacturacxc_crud {
     private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    private String formapagoItem= "";
    private String cobradorItem= "";
    private String valorpagarItem= "";
    private String fechapagoItem= "";
    
    public itemFacturacxc_crud() {
    }

    public String getFormapagoItem() {
        return formapagoItem;
    }

    public void setFormapagoItem(String formapagoItem) {
        this.formapagoItem = formapagoItem;
    }

    public String getCobradorItem() {
        return cobradorItem;
    }

    public void setCobradorItem(String cobradorItem) {
        this.cobradorItem = cobradorItem;
    }

    public String getValorpagarItem() {
        return valorpagarItem;
    }

    public void setValorpagarItem(String valorpagarItem) {
        this.valorpagarItem = valorpagarItem;
    }

    public String getFechapagoItem() {
        return fechapagoItem;
    }

    public void setFechapagoItem(String fechapagoItem) {
        this.fechapagoItem = fechapagoItem;
    }
    
}
