package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.CabeceraFactura;
import prj_grupo3_server.servicios.Ciudad;
import prj_grupo3_server.servicios.ServicioWebServidor;
import prj_grupo3_server.servicios.ServicioServer;

@ManagedBean()
@SessionScoped
public class cabeceraFactura_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public String numCabecera;
    public String rucCliente;
    public String codCiudad;
    public String fecha;
    public String mensaje = "";
    public CabeceraFactura cabeceraFactura;

    public cabeceraFactura_crud() {
    }

    public cabeceraFactura_crud(String numCabecera, String rucCliente, String codCiudad, String fecha) {
        this.numCabecera = numCabecera;
        this.rucCliente = rucCliente;
        this.codCiudad = codCiudad;
        this.fecha = fecha;
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

    public String getNumCabecera() {
        return numCabecera;
    }

    public void setNumCabecera(String numCabecera) {
        this.numCabecera = numCabecera;
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void limpiarForm() {
        this.codCiudad = "";
        this.fecha = "";
        this.rucCliente = "";
        this.numCabecera = "";
    }

    public void crearCabeceraFactura() {
        int resultado;
        try {
            resultado = port.crearCabeceraFacturaS(numCabecera, rucCliente, fecha, codCiudad);
            if (resultado == 1) {
                this.limpiarForm();
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }

    public void crearCabeceraFactura2(String numCabecera, String rucCliente, String fecha, String codCiudad) {
        int resultado;
        try {
            resultado = port.crearCabeceraFacturaS(numCabecera, rucCliente, fecha, codCiudad);
            if (resultado == 1) {
                this.limpiarForm();
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }

    public void eliminarCabeceraFactura() {
        int resultado;
        try {
            resultado = port.eliminarCabeceraFacturaS(numCabecera);
            if (resultado == 1) {
                mensaje = "Se elimino satisfactoriamente";
                this.limpiarForm();
            } else {
                mensaje = "No se pudo eliminar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo eliminar";
        }
    }

    public void actualizarCabeceraFactura() {
        int resultado;
        try {
            resultado = port.actualizarCabeceraFacturaS(numCabecera, rucCliente, fecha, codCiudad);
            if (resultado == 1) {
                mensaje = "Se actualizo satisfactoriamente";
                this.limpiarForm();
            } else {
                mensaje = "No se pudo actualizar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo actualizar";
        }
    }

    public void buscarCabeceraFactura() {
        cabeceraFactura = port.buscarCabeceraFacturaS(numCabecera);
        rucCliente = cabeceraFactura.getRucCliente();
        codCiudad = cabeceraFactura.getCodCiudad();
        fecha = cabeceraFactura.getFecha();
    }

}
