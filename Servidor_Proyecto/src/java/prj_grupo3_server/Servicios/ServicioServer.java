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
import static prj_grupo3_server.Conexion.Conexion.actualizarCobrador;
import static prj_grupo3_server.Conexion.Conexion.buscarCobrador;
import static prj_grupo3_server.Conexion.Conexion.buscarFormaPago;
import static prj_grupo3_server.Conexion.Conexion.eliminarCobrador;
import static prj_grupo3_server.Conexion.Conexion.eliminarFormaPago;
import static prj_grupo3_server.Conexion.Conexion.insertarCobrador;
import static prj_grupo3_server.Conexion.Conexion.insertarFormaPago;
import static prj_grupo3_server.Conexion.Conexion.listarCobrador;
import static prj_grupo3_server.Conexion.Conexion.listarFormaPago;
import prj_grupo3_server.Modelo.Ciudad;
import prj_grupo3_server.Modelo.Cliente;
import prj_grupo3_server.Modelo.Cobrador;
import prj_grupo3_server.Modelo.FormaPago;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import static prj_grupo3_server.Conexion.Conexion.actualizarArticulo;
import static prj_grupo3_server.Conexion.Conexion.actualizarCabeceraFactura;
import static prj_grupo3_server.Conexion.Conexion.buscarArticulo;
import static prj_grupo3_server.Conexion.Conexion.buscarCabeceraFactura;
import static prj_grupo3_server.Conexion.Conexion.crearCabeceraFactura;
import static prj_grupo3_server.Conexion.Conexion.crearDetalleFactura;
import static prj_grupo3_server.Conexion.Conexion.eliminarArticulo;
import static prj_grupo3_server.Conexion.Conexion.eliminarCabeceraFactura;
import static prj_grupo3_server.Conexion.Conexion.eliminarDetalleFactura;
import static prj_grupo3_server.Conexion.Conexion.insertarArticulo;
import static prj_grupo3_server.Conexion.Conexion.listarArticulo;
import static prj_grupo3_server.Conexion.Conexion.singIn;
import prj_grupo3_server.Modelo.Articulo;
import prj_grupo3_server.Modelo.CabeceraFactura;

@WebService(serviceName = "servicio_web_servidor")
public class ServicioServer {

    @WebMethod(operationName = "SingIn")
    public int SingIn(@WebParam(name = "user") String user, @WebParam(name = "pass") String pass) {
        System.out.println("1");
        try {
            Conectar();

            singIn(user, pass);
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
//***********COBRADOR************

    @WebMethod(operationName = "insertarCobradorS")
    public int insertarCobradorS(@WebParam(name = "Cedula_Cobrador") String Cedula_Cobrador, @WebParam(name = "Nombre_Cobrador") String Nombre_Cobrador, @WebParam(name = "Direccion_Cobrador") String Direccion_Cobrador) {
        System.out.println("1");
        try {
            Conectar();
            insertarCobrador(Cedula_Cobrador, Nombre_Cobrador, Direccion_Cobrador);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "actualizarCobradorS")
    public int actualizarCobradorS(@WebParam(name = "Cedula_Cobrador") String Cedula_Cobrador, @WebParam(name = "Nombre_Cobrador") String Nombre_Cobrador, @WebParam(name = "Direccion_Cobrador") String Direccion_Cobrador) {
        try {
            Conectar();
            actualizarCobrador(Cedula_Cobrador, Nombre_Cobrador, Direccion_Cobrador);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "eliminarCobradorS")
    public int eliminarCobradorS(@WebParam(name = "Cedula_Cobrador") String Cedula_Cobrador) {
        try {
            Conectar();
            eliminarCobrador(Cedula_Cobrador);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "listarCobradorS")
    public ArrayList<Cobrador> listarCobradorS() {

        Conectar();
        ArrayList<Cobrador> cobradorr = new ArrayList<>();
        cobradorr = listarCobrador();
        return cobradorr;
    }

    @WebMethod(operationName = "buscarCobradorS")
    public Cobrador buscarCobradorS(@WebParam(name = "Cedula_Cobrador") String Cedula_Cobrador) {

        Conectar();
        Cobrador cobradorr = new Cobrador();
        cobradorr = buscarCobrador(Cedula_Cobrador);
        return cobradorr;
    }

    //***********FORMA PAGO************
    @WebMethod(operationName = "insertarFormaPagoS")
    public int insertarFormaPagoS(@WebParam(name = "Codigo_FP") String Codigo_FP, @WebParam(name = "Nombre_FP") String Nombre_FP) {
        System.out.println("1");
        try {
            Conectar();
            insertarFormaPago(Codigo_FP, Nombre_FP);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "actualizarFormaPagoS")
    public int actualizarFormaPagoS(@WebParam(name = "Codigo_FP") String Codigo_FP, @WebParam(name = "Nombre_FP") String Nombre_FP) {
        try {
            Conectar();
            actualizarFormaPago(Codigo_FP, Nombre_FP);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "eliminarFormaPagoS")
    public int eliminarFormaPagoS(@WebParam(name = "Codigo_FP") String Codigo_FP) {
        try {
            Conectar();
            eliminarFormaPago(Codigo_FP);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "listarFormaPagoS")
    public ArrayList<FormaPago> listarFormaPagoS() {

        Conectar();
        ArrayList<FormaPago> formapago = new ArrayList<>();
        formapago = listarFormaPago();
        return formapago;
    }

    @WebMethod(operationName = "buscarFormaPagoS")
    public FormaPago buscarFormaPagoS(@WebParam(name = "Codigo_FP") String Codigo_FP) {

        Conectar();
        FormaPago formapago = new FormaPago();
        formapago = buscarFormaPago(Codigo_FP);
        return formapago;
    }

    private void actualizarFormaPago(String Codigo_FP, String Nombre_FP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*----------CRUD ARTICULOS------------*/
    @WebMethod(operationName = "insertarArticuloS")
    public int insertarArticuloS(@WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "precio") String precio) {
        System.out.println("1");
        try {
            Conectar();
            insertarArticulo(codigo, nombre, precio);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "actualizarArticuloS")
    public int actualizarArticuloS(@WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "precio") String precio) {
        try {
            Conectar();
            actualizarArticulo(codigo, nombre, precio);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "eliminarArticuloS")
    public int eliminarArticuloS(@WebParam(name = "codigo") String codigo) {
        try {
            Conectar();
            eliminarArticulo(codigo);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "listarArticuloS")
    public ArrayList<Articulo> listarArticuloS() {

        Conectar();
        ArrayList<Articulo> art = new ArrayList<>();
        art = listarArticulo();
        return art;
    }

    @WebMethod(operationName = "buscarArticuloS")
    public Articulo buscarArticuloS(@WebParam(name = "codigo") String codigo) {
        Conectar();
        Articulo art = new Articulo();
        art = buscarArticulo(codigo);
        return art;
    }

    @WebMethod(operationName = "crearCabeceraFacturaS")
    public int crearCabeceraFacturaS(@WebParam(name = "numFactura") String numFactura, @WebParam(name = "rucCliente") String rucCliente,
            @WebParam(name = "fecha") String fecha, @WebParam(name = "codCiudad") String codCiudad) {
        try {
            Conectar();
            crearCabeceraFactura(numFactura, rucCliente, codCiudad, fecha);
            crearDetalleFactura(numFactura);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    
    @WebMethod(operationName = "crearDetalleFacturaS")
    public int crearDetalleFacturaS(@WebParam(name = "numFactura") String numFactura) {
        try {
            Conectar();
            crearDetalleFactura(numFactura);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    
    @WebMethod(operationName = "eliminarDetalleFacturaS")
    public int eliminarDetalleFacturaS(@WebParam(name = "numFactura") String numFactura) {
        try {
            Conectar();
            eliminarDetalleFactura(numFactura);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "actualizarCabeceraFacturaS")
    public int actualizarCabeceraFacturaS(@WebParam(name = "numFactura") String numFactura, @WebParam(name = "rucCliente") String rucCliente,
            @WebParam(name = "fecha") String fecha, @WebParam(name = "codCiudad") String codCiudad) {
        try {
            Conectar();
            actualizarCabeceraFactura(numFactura, rucCliente, codCiudad, fecha);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "eliminarCabeceraFacturaS")
    public int eliminarCabeceraFacturaS(@WebParam(name = "numCabecera") String numCabecera) {
        try {
            Conectar();
            eliminarCabeceraFactura(numCabecera);
            eliminarDetalleFactura(numCabecera);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    
    @WebMethod(operationName = "buscarCabeceraFacturaS")
    public CabeceraFactura buscarCabeceraFacturaS(@WebParam(name = "numCabecera") String numCabecera) {
        Conectar();
        CabeceraFactura cf = new CabeceraFactura();
        cf = buscarCabeceraFactura(numCabecera);
        return cf;
    }
    

}
