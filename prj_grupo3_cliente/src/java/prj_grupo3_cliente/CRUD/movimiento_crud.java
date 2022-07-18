package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Movimiento;

import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;




@ManagedBean()
@SessionScoped
public class movimiento_crud {
    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public String codigo = "";
    public String nombre = "";
    public String signo = "";
    public String mensaje = "";
    public ArrayList<Movimiento> movimientos = (ArrayList<Movimiento>) port.listarMovimientoS();
    public Movimiento movimiento;
    
     public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }
     
     
     public void setMovimiento(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    

    public movimiento_crud() {
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

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    

    public void insertarMovimiento()      
    {
    int resultado;
        try {
            resultado = port.insertarMovimientoS(codigo, nombre, signo);
            if (resultado == 1) {
                mensaje = "Se insertó satisfactoriamente";
                this.listarMovimiento();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }
    
    public void limpiarFormulario(){
        codigo="";
        nombre="";
        signo="";
    }
    
    public void eliminarMovimiento()      
    {
    int resultado;
        try {
            resultado = port.eliminarMovimientoS(codigo);
            if (resultado == 1) {
                mensaje = "Se elimino satisfactoriamente";
                this.listarMovimiento();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo eliminar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo eliminar";
        }
    }
    
    public void actualizarMovimiento()      
    {
    int resultado;
        try {
            resultado = port.actualizarMovimientoS(codigo, nombre, signo);
            if (resultado == 1) {
                mensaje = "Se actualizo satisfactoriamente";
                this.listarMovimiento();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo actualizar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo actualizar";
        }
    }
    
    public void listarMovimiento()      
    {
        movimientos = (ArrayList<Movimiento>) port.listarMovimientoS();      
    }
    
    public void buscarMovimiento()      
    {
        movimiento = port.buscarMovimientoS(codigo);
        nombre = movimiento.getNombre();
        signo =movimiento.getSigno();
    }
    public void buscarMovimientoN()      
    {
        movimiento= port.buscarMovimientoSN(nombre);
        codigo = movimiento.getCodigo();
        signo =movimiento.getSigno();
    }
}