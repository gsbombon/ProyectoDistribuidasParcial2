/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Cliente;
import prj_grupo3_server.servicios.Cobrador;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

/**
 *
 * @author haom_
 */
@ManagedBean()
@SessionScoped
public class cobrador_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    private String Cedula_Cobrador = "";
    private String Nombre_Cobrador = "";
    private String Direccion_Cobrador = "";
    public String mensaje = "";
    public ArrayList<Cobrador> cobrador = (ArrayList<Cobrador>) port.listarCobradorS();
    public ArrayList<String> listaRucCobrador = (ArrayList<String>)this.cmbRucCobrador();
    public ArrayList<String> listaNombreCobrador = (ArrayList<String>)this.cmbNombreCobrador();
   
    public Cobrador cobradores;

    public ArrayList<Cobrador> getCobrador() {
        return cobrador;
    }

    public void setCobrador(ArrayList<Cobrador> cobrador) {
        this.cobrador = cobrador;
    }

    public String getCedula_Cobrador() {
        return Cedula_Cobrador;
    }

    public void setCedula_Cobrador(String Cedula_Cobrador) {
        this.Cedula_Cobrador = Cedula_Cobrador;
    }

    public String getNombre_Cobrador() {
        return Nombre_Cobrador;
    }

    public void setNombre_Cobrador(String Nombre_Cobrador) {
        this.Nombre_Cobrador = Nombre_Cobrador;
    }

    public String getDireccion_Cobrador() {
        return Direccion_Cobrador;
    }

    public void setDireccion_Cobrador(String Direccion_Cobrador) {
        this.Direccion_Cobrador = Direccion_Cobrador;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void insertarCobrador() {
        int resultado;
        try {
            resultado = port.insertarCobradorS(Cedula_Cobrador, Nombre_Cobrador, Direccion_Cobrador);
            if (resultado == 1) {
                mensaje = "Se insertó satisfactoriamente";
                this.listarCobrador();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }

    public void limpiarFormulario() {
        Cedula_Cobrador = "";
        Nombre_Cobrador = "";
        Direccion_Cobrador = "";
    }

    public void eliminarCobrador() {
        int resultado;
        try {
            resultado = port.eliminarCobradorS(Cedula_Cobrador);
            if (resultado == 1) {
                mensaje = "Se elimino satisfactoriamente";
                this.listarCobrador();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo eliminar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo eliminar";
        }
    }

    public void actualizarCobrador() {
        int resultado;
        try {
            resultado = port.actualizarCobradorS(Cedula_Cobrador, Nombre_Cobrador, Direccion_Cobrador);
            if (resultado == 1) {
                mensaje = "Se actualizo satisfactoriamente";
                this.listarCobrador();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo actualizar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo actualizar";
        }
    }

    public void listarCobrador() {
        cobrador = (ArrayList<Cobrador>) port.listarCobradorS();
    }

    public void buscarCobrador() {
        cobradores = port.buscarCobradorS(Cedula_Cobrador);
        Nombre_Cobrador = cobradores.getNombreCobrador();
        Direccion_Cobrador = cobradores.getDireccionCobrador();
    }
 public ArrayList<String> cmbNombreCobrador() {
        ArrayList<String> nombresCobrador = new ArrayList<>();
        this.cobrador.forEach((cli) -> {
            nombresCobrador.add(cli.getNombreCobrador());
        });
        return nombresCobrador;
    }

    public ArrayList<String> cmbRucCobrador() {
        ArrayList<String> rucCobrador = new ArrayList<>();
        this.cobrador.forEach((cli) -> {
            rucCobrador.add(cli.getCedulaCobrador());
        });
        return rucCobrador;
    }
}
