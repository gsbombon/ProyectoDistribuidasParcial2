package prj_grupo3_cliente.CRUD;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.ItemFactura;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

@ManagedBean()
@SessionScoped
public class factura_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();

    public String codFactura = "";
    public String rucCliente = "";
    public String nomCiudad = "";
    public String fecha = "";
    public String totalFactura = "";
    public String mensaje = "";

    public void crearFactura() {
        int resultado;
        try {
            double sumatoria=0.0;
            detalleFactura_crud dtf = new detalleFactura_crud();
            for(ItemFactura item: dtf.itemsDetalle){
                sumatoria += Double.parseDouble(item.getPrecioTotalItem());
            }
            this.totalFactura = String.valueOf(sumatoria);
            resultado = port.crearFacturaS(codFactura, rucCliente, fecha, nomCiudad, totalFactura);
            if (resultado == 1) {
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }

    public factura_crud() {
    }

    public factura_crud(String codFactura, String rucCliente, String nomCiudad, String fecha, String totalFactura) {
        this.codFactura = codFactura;
        this.rucCliente = rucCliente;
        this.nomCiudad = nomCiudad;
        this.fecha = fecha;
        this.totalFactura = totalFactura;
    }

    public ServicioWebServidor getService() {
        return service;
    }

    public void setService(ServicioWebServidor service) {
        this.service = service;
    }

    public ServicioServer getPort() {
        return port;
    }

    public void setPort(ServicioServer port) {
        this.port = port;
    }

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(String totalFactura) {
        this.totalFactura = totalFactura;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    

}
