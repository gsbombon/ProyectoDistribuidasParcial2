/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Ciudad;
import prj_grupo3_server.servicios.FormaPago;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

/**
 *
 * @author haom_
 */
@ManagedBean()
@SessionScoped
public class formapago_crud {
     private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public String codigo = "";
    public String nombre = "";
    public String mensaje = "";
    public ArrayList<FormaPago> fp= (ArrayList<FormaPago>) port.listarFormaPagoS();
    public FormaPago fps;

    public formapago_crud() {
    }

    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<FormaPago> getFp() {
        return fp;
    }

    public void setFp(ArrayList<FormaPago> fp) {
        this.fp = fp;
    }
      public void limpiarForm() {
        codigo = "";
        nombre = "";
    }
    public void insertarFP() {
        int resultado;
        try {
            resultado = port.insertarFormaPagoS(codigo, nombre);
            if (resultado == 1) {
                mensaje = "Se insertó satisfactoriamente";
                this.listarFP();
                this.limpiarForm();
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }

    public void eliminarFP() {
        int resultado;
        try {
            resultado = port.eliminarFormaPagoS(codigo);
            if (resultado == 1) {
                mensaje = "Se elimino satisfactoriamente";
                this.listarFP();
                this.limpiarForm();
            } else {
                mensaje = "No se pudo eliminar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo eliminar";
        }
    }

    public void actualizarFP() {
        int resultado;
        try {
            resultado = port.actualizarFormaPagoS(codigo, nombre);
            if (resultado == 1) {
                mensaje = "Se actualizo satisfactoriamente";
                this.listarFP();
                this.limpiarForm();
            } else {
                mensaje = "No se pudo actualizar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo actualizar";
        }
    }

    public void listarFP() {
        fp = (ArrayList<FormaPago>) port.listarFormaPagoS();
    }

    public void buscarFP() {
        fps = port.buscarFormaPagoS(codigo);
        nombre = fps.getNombreFP();

    }
}
