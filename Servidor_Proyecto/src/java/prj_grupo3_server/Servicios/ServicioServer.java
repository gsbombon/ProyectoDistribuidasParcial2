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
import static prj_grupo3_server.Conexion.Conexion.actualizarMovimiento;
import static prj_grupo3_server.Conexion.Conexion.actualizarStockArticulo;
import static prj_grupo3_server.Conexion.Conexion.agregarPaga;
import static prj_grupo3_server.Conexion.Conexion.agregarProducto;
import static prj_grupo3_server.Conexion.Conexion.buscarArticulo;
import static prj_grupo3_server.Conexion.Conexion.buscarArticuloN;
import static prj_grupo3_server.Conexion.Conexion.buscarCabeceraFactura;
import static prj_grupo3_server.Conexion.Conexion.buscarCabeceraFacturaPorRuc;
import static prj_grupo3_server.Conexion.Conexion.buscarDetalleFactura;
import static prj_grupo3_server.Conexion.Conexion.buscarDetalleFacturacxc;
import static prj_grupo3_server.Conexion.Conexion.buscarFactura;
import static prj_grupo3_server.Conexion.Conexion.buscarMovimiento;
import static prj_grupo3_server.Conexion.Conexion.buscarMovimientoN;
import static prj_grupo3_server.Conexion.Conexion.crearCabeceraFactura;
import static prj_grupo3_server.Conexion.Conexion.crearDetalleFactura;
import static prj_grupo3_server.Conexion.Conexion.crearDetalleFacturacxc;
import static prj_grupo3_server.Conexion.Conexion.crearFactura;
import static prj_grupo3_server.Conexion.Conexion.eliminarArticulo;
import static prj_grupo3_server.Conexion.Conexion.eliminarCabeceraFactura;
import static prj_grupo3_server.Conexion.Conexion.eliminarDetalleFactura;
import static prj_grupo3_server.Conexion.Conexion.eliminarDetalleFacturacxc;
import static prj_grupo3_server.Conexion.Conexion.eliminarFactura;
import static prj_grupo3_server.Conexion.Conexion.eliminarMovimiento;
import static prj_grupo3_server.Conexion.Conexion.insertarArticulo;
import static prj_grupo3_server.Conexion.Conexion.insertarMovimiento;
import static prj_grupo3_server.Conexion.Conexion.insertarUsuario;
import static prj_grupo3_server.Conexion.Conexion.listarArticulo;
import static prj_grupo3_server.Conexion.Conexion.listarFactura;
import static prj_grupo3_server.Conexion.Conexion.listarMovimiento;
import static prj_grupo3_server.Conexion.Conexion.login;
import static prj_grupo3_server.Conexion.Conexion.singIn;
import prj_grupo3_server.Modelo.Articulo;
import prj_grupo3_server.Modelo.CabeceraFactura;
import prj_grupo3_server.Modelo.DetalleFactura;
import prj_grupo3_server.Modelo.DetalleFacturacxc;
import prj_grupo3_server.Modelo.Factura;
import prj_grupo3_server.Modelo.ItemFactura;
import prj_grupo3_server.Modelo.ItemFacturacxc;
import prj_grupo3_server.Modelo.Movimiento;

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
    public int insertarArticuloS(@WebParam(name = "Codigo_Articulo") String codigo, @WebParam(name = "Nombre_Articulo") String nombre, @WebParam(name = "Precio_Articulo") String precio, @WebParam(name = "Stock_Articulo") String cantidad) {
        System.out.println("1");
        try {
            Conectar();
            insertarArticulo(codigo, nombre, precio, cantidad);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "actualizarArticuloS")
    public int actualizarArticuloS(@WebParam(name = "Codigo_Articulo") String codigo, @WebParam(name = "Nombre_Articulo") String nombre, @WebParam(name = "Precio_Articulo") String precio, @WebParam(name = "PStock_Articulo") String cantidad){
        try {
            Conectar();
            actualizarArticulo(codigo, nombre, precio, cantidad);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "eliminarArticuloS")
    public int eliminarArticuloS(@WebParam(name = "Codigo_Articulo") String codigo) {
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
    public Articulo buscarArticuloS(@WebParam(name = "Codigo_Articulo") String codigo) {

        Conectar();
        Articulo art = new Articulo();
        art = buscarArticulo(codigo);
        return art;
    }
    
    @WebMethod(operationName = "buscarArticuloSN")
    public Articulo buscarArticuloSN(@WebParam(name = "Nombre_Articulo") String nombre) {

        Conectar();
        Articulo art = new Articulo();
        art = buscarArticuloN(nombre);
        return art;
    }
    
    /*----------CRUD TIPO MOVIMIENTO------------*/
    @WebMethod(operationName = "insertarMovimientoS")
    public int insertarMovimientoS(@WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "signo") String signo) {
        System.out.println("1");
        try {
            Conectar();
            insertarMovimiento(codigo, nombre, signo);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "actualizarMovimientoS")
    public int actualizarMovimientoS(@WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "signo") String signo) {
        try {
            Conectar();
            actualizarMovimiento(codigo, nombre, signo);

            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "eliminarMovimientoS")
    public int eliminarMovimientoS(@WebParam(name = "codigo") String codigo) {
        try {
            Conectar();
            eliminarMovimiento(codigo);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "listarMovimientoS")
    public ArrayList<Movimiento> listarMovimientoS() {

        Conectar();
        ArrayList<Movimiento> mov = new ArrayList<>();
        mov = listarMovimiento();
        return mov;
    }

    @WebMethod(operationName = "buscarMovimientoS")
    public Movimiento buscarMovimientoS(@WebParam(name = "codigo") String codigo) {

        Conectar();
        Movimiento mov = new Movimiento();
        mov = buscarMovimiento(codigo);
        return mov;
    }
    
    @WebMethod(operationName = "buscarMovimientoSN")
    public Movimiento buscarMovimientoSN(@WebParam(name = "nombre") String nombre) {

        Conectar();
        Movimiento mov = new Movimiento();
        mov = buscarMovimientoN(nombre);
        return mov;
    }

    @WebMethod(operationName = "crearCabeceraFacturaS")
    public int crearCabeceraFacturaS(@WebParam(name = "numFactura") String numFactura,
            @WebParam(name = "rucCliente") String rucCliente,
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
    @WebMethod(operationName = "crearDetalleFacturacxcS")
    public int crearDetalleFacturacxcS(@WebParam(name = "numFactura") String numFactura) {
        try {
            Conectar();
            crearDetalleFacturacxc(numFactura);
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
     @WebMethod(operationName = "eliminarDetalleFacturacxcS")
    public int eliminarDetalleFacturacxcS(@WebParam(name = "numFactura") String numFactura) {
        try {
            Conectar();
            eliminarDetalleFacturacxc(numFactura);
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
            eliminarFactura(numCabecera);
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
    
    @WebMethod(operationName = "buscarFacturaS")
    public Factura buscarFacturaS(@WebParam(name = "numCabecera") String numCabecera) {
        Conectar();
        Factura cf = new Factura();
        cf = buscarFactura(numCabecera);
        return cf;
    }
    
    
    @WebMethod(operationName = "buscarCabeceraFacturaPorRucS")
    public CabeceraFactura buscarCabeceraFacturaPorRucS(@WebParam(name = "rucCliente") String rucCliente) {
        Conectar();
        CabeceraFactura cf = new CabeceraFactura();
        cf = buscarCabeceraFacturaPorRuc(rucCliente);
        return cf;
    }

    @WebMethod(operationName = "buscarDetalleFacturaS")
    public DetalleFactura buscarDetalleFacturaS(@WebParam(name = "numCabecera") String numCabecera) {
        Conectar();
        DetalleFactura detalleFac = new DetalleFactura();
        detalleFac = buscarDetalleFactura(numCabecera);
        return detalleFac;
    }
     @WebMethod(operationName = "buscarDetalleFacturacxcS")
    public DetalleFacturacxc buscarDetalleFacturacxcS(@WebParam(name = "numCabecera") String numCabecera) {
        Conectar();
        DetalleFacturacxc detalleFac = new DetalleFacturacxc();
        detalleFac = buscarDetalleFacturacxc(numCabecera);
        return detalleFac;
    }

    @WebMethod(operationName = "crearFacturaS")
    public int crearFacturaS(@WebParam(name = "numFactura") String numFactura, @WebParam(name = "rucCliente") String rucCliente,
            @WebParam(name = "fecha") String fecha,
            @WebParam(name = "codCiudad") String codCiudad,
            @WebParam(name = "precioFinal") String precioFinal) {
        try {
            Conectar();
            crearFactura(numFactura, rucCliente, codCiudad, fecha, precioFinal);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }

    @WebMethod(operationName = "agregarProductoS")
    public int agregarProductoS(@WebParam(name = "numFactura") String numFactura,
            @WebParam(name = "nombreItem") String nombreItem,
            @WebParam(name = "cantidadItem") String cantidadItem,
            @WebParam(name = "precioItem") String precioItem,
            @WebParam(name = "precioTotalItem") String precioTotalItem) {
        try {
            Conectar();
            ItemFactura item = new ItemFactura(nombreItem, precioItem, cantidadItem, precioTotalItem);
            agregarProducto(numFactura, item);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    
    @WebMethod(operationName = "agregarPagaS")
    public int agregarPagaS(@WebParam(name = "numFactura") String numFactura,
            @WebParam(name = "fechapagoItem") String fechapagoItem,
            @WebParam(name = "formapagoItem") String formapagoItem,
            @WebParam(name = "valorpagarItem") String valorpagarItem,
            @WebParam(name = "cobradorItem") String cobradorItem) {
        try {
            Conectar();
            ItemFacturacxc item = new ItemFacturacxc(formapagoItem, cobradorItem, valorpagarItem, fechapagoItem);
            agregarPaga(numFactura, item);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    

    @WebMethod(operationName = "loginS")
    public int loginS(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrasena") String Contrasena) {
        Conectar();
        int op = login(Usuario, Contrasena);
        return op;
    }
    
    @WebMethod(operationName = "crearUsuarioS")
    public int crearUsuarioS(@WebParam(name = "user") String user,
            @WebParam(name = "pass") String pass) {
        try {
            Conectar();
            insertarUsuario(user,pass);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    
    @WebMethod(operationName = "listarFacturasS")
    public ArrayList<Factura> listarFacturasS() {

        Conectar();
        ArrayList<Factura> art = new ArrayList<>();
        art = listarFactura();
        return art;
    }
    
    
    @WebMethod(operationName = "actualizarStockArticuloS")
    public int actualizarStockArticuloS(@WebParam(name = "nomArticulo") String nomArticulo, 
            @WebParam(name = "nuevoStock") String nuevoStock) {
        try {
            Conectar();
            actualizarStockArticulo(nomArticulo,nuevoStock);
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    

}
