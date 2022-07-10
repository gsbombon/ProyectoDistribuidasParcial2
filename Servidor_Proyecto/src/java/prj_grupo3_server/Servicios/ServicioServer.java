package prj_grupo3_server.Servicios;

import prj_grupo3_server.Conexion.Conexion;
import static prj_grupo3_server.Conexion.Conexion.Conectar;
import static prj_grupo3_server.Conexion.Conexion.actualizarCiudad;
import static prj_grupo3_server.Conexion.Conexion.actualizarCliente;
import static prj_grupo3_server.Conexion.Conexion.buscarCiudad;
import static prj_grupo3_server.Conexion.Conexion.buscarCliente;
import static prj_grupo3_server.Conexion.Conexion.eliminarCiudad;
import static prj_grupo3_server.Conexion.Conexion.eliminarCliente;
import static prj_grupo3_server.Conexion.Conexion.insertarCiudad;
import static prj_grupo3_server.Conexion.Conexion.insertarCliente;
import static prj_grupo3_server.Conexion.Conexion.listarCiudad;
import static prj_grupo3_server.Conexion.Conexion.listarCliente;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import prj_grupo3_server.Modelo.Ciudad;
import prj_grupo3_server.Modelo.Cliente;

@WebService(serviceName = "servicio_web_servidor")
public class ServicioServer {

    @WebMethod(operationName = "SingIn")
    public int SingIn(@WebParam(name = "user") String user, @WebParam(name = "pass") String pass) {
        System.out.println("1");
        try {
            Conectar();
            

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    
    @WebMethod(operationName = "insertarCiudadS")
    public int insertarCiudadS(@WebParam(name = "Codigo_Ciudad") String Codigo_Ciudad, @WebParam(name = "Nombre_Ciudad") String Nombre_Ciudad) {
        System.out.println("1");
        try {
            Conectar();
            insertarCiudad(Codigo_Ciudad, Nombre_Ciudad);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "insertarClienteS")
    public int insertarClienteS(@WebParam(name = "Ruc_Cliente") String Ruc_Cliente, @WebParam(name = "Nombre_Cliente") String Nombre_Cliente, @WebParam(name = "Direccion_Cliente") String Direccion_Cliente) {
        System.out.println("1");
        try {
            Conectar();
            insertarCliente(Ruc_Cliente, Nombre_Cliente, Direccion_Cliente);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "actualizarCiudadS")
    public int actualizarCiudadS(@WebParam(name = "Codigo_Ciudad") String Codigo_Ciudad, @WebParam(name = "Nombre_Ciudad") String Nombre_Ciudad) {
        try {
            Conectar();
            actualizarCiudad(Codigo_Ciudad, Nombre_Ciudad);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "actualizarClienteS")
    public int actualizarClienteS(@WebParam(name = "Ruc_Cliente") String Ruc_Cliente, @WebParam(name = "Nombre_Cliente") String Nombre_Cliente, @WebParam(name = "Direccion_Cliente") String Direccion_Cliente) {
        try {
            Conectar();
            actualizarCliente(Ruc_Cliente, Nombre_Cliente, Direccion_Cliente);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "eliminarCiudadS")
    public int eliminarCiudadS(@WebParam(name = "Codigo_Ciudad") String Codigo_Ciudad) {
        try {
            Conectar();
            eliminarCiudad(Codigo_Ciudad);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "eliminarClienteS")
    public int eliminarClienteS(@WebParam(name = "Ruc_Cliente") String Ruc_Cliente) {
        try {
            Conectar();
            eliminarCliente(Ruc_Cliente);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "listarCiudadS")
    public ArrayList<Ciudad> listarCiudadS() {

        Conectar();
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ciudades = listarCiudad();
        return ciudades;
    }

    @WebMethod(operationName = "listarClienteS")
    public ArrayList<Cliente> listarClienteS() {

        Conectar();
        ArrayList<Cliente> clientess = new ArrayList<>();
        clientess = listarCliente();
        return clientess;
    }

    @WebMethod(operationName = "buscarCiudadS")
    public Ciudad buscarCiudadS(@WebParam(name = "Codigo_Ciudad") String Codigo_Ciudad) {

        Conectar();
        Ciudad ciudadB = new Ciudad();
        ciudadB = buscarCiudad(Codigo_Ciudad);
        return ciudadB;
    }

    @WebMethod(operationName = "buscarClienteS")
    public Cliente buscarClienteS(@WebParam(name = "Ruc_Cliente") String Ruc_Cliente) {

        Conectar();
        Cliente cli = new Cliente();
        cli = buscarCliente(Ruc_Cliente);
        return cli;
    }

}
