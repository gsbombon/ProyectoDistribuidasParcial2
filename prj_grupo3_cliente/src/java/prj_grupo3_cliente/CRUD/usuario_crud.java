package prj_grupo3_cliente.CRUD;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

@ManagedBean()
@SessionScoped
public class usuario_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public String usuario = "";
    public String password = "";
    public String mensaje = "";

    public usuario_crud() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String ingresar() {
        if (port.loginS(usuario, password) == 1) {
            return "/viewMain.xhtml?faces-redirect=true";
        } else {
            mensaje = "Usuario/Contraseña Incorrectas";
            return "/viewLogin.xhtml?faces-redirect=true";
        }
    }
    
    public void limpiarForm(){
        this.password="";
        this.usuario="";
    }

    public void crearUsuario() {
        int resultado;
        try {
            resultado = port.crearUsuarioS(usuario, password);
            if (resultado == 1) {
                mensaje = "Usuario creado satisfactoriamente";
                this.limpiarForm();
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }

}
