package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import prj_grupo3_server.servicios.Cliente;
import prj_grupo3_server.servicios.ServicioWebServidor;
import prj_grupo3_server.servicios.ServicioServer;

@ManagedBean()
@SessionScoped

public class cliente_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public String ruc = "";
    public String nombre = "";
    public String direccion = "";
    public String mensaje = "";
    public ArrayList<Cliente> clientes = (ArrayList<Cliente>) port.listarClienteS();
    public ArrayList<String> listaRucClientes = (ArrayList<String>)this.cmbRucCliente();
    public ArrayList<String> listaNombreClientes = (ArrayList<String>)this.cmbNombreCliente();
    public Cliente cliente;

    public ArrayList<String> getListaRucClientes() {
        return listaRucClientes;
    }

    public void setListaRucClientes(ArrayList<String> listaRucClientes) {
        this.listaRucClientes = listaRucClientes;
    }

    public ArrayList<String> getListaNombreClientes() {
        return listaNombreClientes;
    }

    public void setListaNombreClientes(ArrayList<String> listaNombreClientes) {
        this.listaNombreClientes = listaNombreClientes;
    }
    
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setCobradores(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public cliente_crud() {
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String codigo) {
        this.ruc = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<String> cmbNombreCliente() {
        ArrayList<String> nombresClientes = new ArrayList<>();
        this.clientes.forEach((cli) -> {
            nombresClientes.add(cli.getNombreCliente());
        });
        return nombresClientes;
    }

    public ArrayList<String> cmbRucCliente() {
        ArrayList<String> rucClientes = new ArrayList<>();
        this.clientes.forEach((cli) -> {
            rucClientes.add(cli.getRucCliente());
        });
        return rucClientes;
    }

    public void insertarCliente() {
        int resultado;
        try {
            resultado = port.insertarClienteS(ruc, nombre, direccion);
            if (resultado == 1) {
                this.listarCliente();
                this.limpiarFormulario();
                mensaje = "Se insertó satisfactoriamente";
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }

    public void limpiarFormulario() {
        ruc = "";
        nombre = "";
        direccion = "";
    }

    public void eliminarCliente() {
        int resultado;
        try {
            resultado = port.eliminarClienteS(ruc);
            if (resultado == 1) {
                mensaje = "Se elimino satisfactoriamente";
                this.listarCliente();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo eliminar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo eliminar";
        }
    }

    public void actualizarCliente() {
        int resultado;
        try {
            resultado = port.actualizarClienteS(ruc, nombre, direccion);
            if (resultado == 1) {
                mensaje = "Se actualizo satisfactoriamente";
                this.listarCliente();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo actualizar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo actualizar";
        }
    }

    public void listarCliente() {
        clientes = (ArrayList<Cliente>) port.listarClienteS();
    }

    public void buscarCliente() {
        cliente = port.buscarClienteS(ruc);
        nombre = cliente.getNombreCliente();
        direccion = cliente.getDireccionCliente();
    }
}

