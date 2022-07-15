package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Ciudad;
import prj_grupo3_server.servicios.ServicioWebServidor;
import prj_grupo3_server.servicios.ServicioServer;

@ManagedBean()
@SessionScoped

public class ciudad_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public String codigo = "";
    public String nombre = "";
    public String mensaje = "";
    public ArrayList<Ciudad> ciudades = (ArrayList<Ciudad>) port.listarCiudadS();
    public ArrayList<String> listaNombreCiudades = (ArrayList<String>) this.cmbNombreCiudades();
    public Ciudad ciudad;

    public ciudad_crud() {

    }

    public ArrayList<String> getListaNombreCiudades() {
        return listaNombreCiudades;
    }

    public void setListaNombreCiudades(ArrayList<String> listaNombreCiudades) {
        this.listaNombreCiudades = listaNombreCiudades;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
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

    public void limpiarForm() {
        codigo = "";
        nombre = "";
    }

    public ArrayList<String> cmbNombreCiudades() {
        ArrayList<String> nombresClientes = new ArrayList<>();
        this.ciudades.forEach((cli) -> {
            nombresClientes.add(cli.getNombreCiudad());
        });
        return nombresClientes;
    }

    public void insertarCiudad() {
        int resultado;
        try {
            resultado = port.insertarCiudadS(codigo, nombre);
            if (resultado == 1) {
                mensaje = "Se insertó satisfactoriamente";
                this.listarCiudad();
                this.limpiarForm();
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }

    public void eliminarCiudad() {
        int resultado;
        try {
            resultado = port.eliminarCiudadS(codigo);
            if (resultado == 1) {
                mensaje = "Se elimino satisfactoriamente";
                this.listarCiudad();
                this.limpiarForm();
            } else {
                mensaje = "No se pudo eliminar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo eliminar";
        }
    }

    public void actualizarCiudad() {
        int resultado;
        try {
            resultado = port.actualizarCiudadS(codigo, nombre);
            if (resultado == 1) {
                mensaje = "Se actualizo satisfactoriamente";
                this.listarCiudad();
                this.limpiarForm();
            } else {
                mensaje = "No se pudo actualizar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo actualizar";
        }
    }

    public void listarCiudad() {
        ciudades = (ArrayList<Ciudad>) port.listarCiudadS();
    }

    public void buscarCiudad() {
        ciudad = port.buscarCiudadS(codigo);
        nombre = ciudad.getNombreCiudad();

    }
}
