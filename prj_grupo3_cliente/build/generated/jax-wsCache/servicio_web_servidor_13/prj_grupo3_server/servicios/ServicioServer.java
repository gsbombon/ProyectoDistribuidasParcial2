
package prj_grupo3_server.servicios;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioServer", targetNamespace = "http://Servicios.prj_grupo3_server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioServer {


    /**
     * 
     * @param codigo
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarArticuloS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarArticuloS")
    @ResponseWrapper(localName = "eliminarArticuloSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarArticuloSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarArticuloSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarArticuloSResponse")
    public int eliminarArticuloS(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param direccionCobrador
     * @param cedulaCobrador
     * @param nombreCobrador
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarCobradorS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarCobradorS")
    @ResponseWrapper(localName = "insertarCobradorSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarCobradorSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/insertarCobradorSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/insertarCobradorSResponse")
    public int insertarCobradorS(
        @WebParam(name = "Cedula_Cobrador", targetNamespace = "")
        String cedulaCobrador,
        @WebParam(name = "Nombre_Cobrador", targetNamespace = "")
        String nombreCobrador,
        @WebParam(name = "Direccion_Cobrador", targetNamespace = "")
        String direccionCobrador);

    /**
     * 
     * @param nombreCliente
     * @param rucCliente
     * @param direccionCliente
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarClienteS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarClienteS")
    @ResponseWrapper(localName = "actualizarClienteSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarClienteSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarClienteSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarClienteSResponse")
    public int actualizarClienteS(
        @WebParam(name = "Ruc_Cliente", targetNamespace = "")
        String rucCliente,
        @WebParam(name = "Nombre_Cliente", targetNamespace = "")
        String nombreCliente,
        @WebParam(name = "Direccion_Cliente", targetNamespace = "")
        String direccionCliente);

    /**
     * 
     * @param codigo
     * @param precio
     * @param nombre
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarArticuloS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarArticuloS")
    @ResponseWrapper(localName = "actualizarArticuloSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarArticuloSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarArticuloSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarArticuloSResponse")
    public int actualizarArticuloS(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "precio", targetNamespace = "")
        String precio);

    /**
     * 
     * @param cedulaCobrador
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarCobradorS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarCobradorS")
    @ResponseWrapper(localName = "eliminarCobradorSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarCobradorSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarCobradorSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarCobradorSResponse")
    public int eliminarCobradorS(
        @WebParam(name = "Cedula_Cobrador", targetNamespace = "")
        String cedulaCobrador);

    /**
     * 
     * @param codigo
     * @param precio
     * @param nombre
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarArticuloS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarArticuloS")
    @ResponseWrapper(localName = "insertarArticuloSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarArticuloSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/insertarArticuloSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/insertarArticuloSResponse")
    public int insertarArticuloS(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "precio", targetNamespace = "")
        String precio);

    /**
     * 
     * @param direccionCobrador
     * @param cedulaCobrador
     * @param nombreCobrador
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarCobradorS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarCobradorS")
    @ResponseWrapper(localName = "actualizarCobradorSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarCobradorSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarCobradorSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarCobradorSResponse")
    public int actualizarCobradorS(
        @WebParam(name = "Cedula_Cobrador", targetNamespace = "")
        String cedulaCobrador,
        @WebParam(name = "Nombre_Cobrador", targetNamespace = "")
        String nombreCobrador,
        @WebParam(name = "Direccion_Cobrador", targetNamespace = "")
        String direccionCobrador);

    /**
     * 
     * @param nombreCiudad
     * @param codigoCiudad
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarCiudadS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarCiudadS")
    @ResponseWrapper(localName = "actualizarCiudadSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarCiudadSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarCiudadSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarCiudadSResponse")
    public int actualizarCiudadS(
        @WebParam(name = "Codigo_Ciudad", targetNamespace = "")
        String codigoCiudad,
        @WebParam(name = "Nombre_Ciudad", targetNamespace = "")
        String nombreCiudad);

    /**
     * 
     * @param pass
     * @param user
     * @return
     *     returns int
     */
    @WebMethod(operationName = "SingIn")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SingIn", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.SingIn")
    @ResponseWrapper(localName = "SingInResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.SingInResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/SingInRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/SingInResponse")
    public int singIn(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "pass", targetNamespace = "")
        String pass);

    /**
     * 
     * @return
     *     returns java.util.List<prj_grupo3_server.servicios.FormaPago>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarFormaPagoS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarFormaPagoS")
    @ResponseWrapper(localName = "listarFormaPagoSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarFormaPagoSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/listarFormaPagoSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/listarFormaPagoSResponse")
    public List<FormaPago> listarFormaPagoS();

    /**
     * 
     * @param codigoFP
     * @return
     *     returns prj_grupo3_server.servicios.FormaPago
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarFormaPagoS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarFormaPagoS")
    @ResponseWrapper(localName = "buscarFormaPagoSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarFormaPagoSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/buscarFormaPagoSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/buscarFormaPagoSResponse")
    public FormaPago buscarFormaPagoS(
        @WebParam(name = "Codigo_FP", targetNamespace = "")
        String codigoFP);

    /**
     * 
     * @param pass
     * @param user
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearUsuarioS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.CrearUsuarioS")
    @ResponseWrapper(localName = "crearUsuarioSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.CrearUsuarioSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/crearUsuarioSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/crearUsuarioSResponse")
    public int crearUsuarioS(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "pass", targetNamespace = "")
        String pass);

    /**
     * 
     * @param codigoFP
     * @param nombreFP
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarFormaPagoS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarFormaPagoS")
    @ResponseWrapper(localName = "insertarFormaPagoSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarFormaPagoSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/insertarFormaPagoSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/insertarFormaPagoSResponse")
    public int insertarFormaPagoS(
        @WebParam(name = "Codigo_FP", targetNamespace = "")
        String codigoFP,
        @WebParam(name = "Nombre_FP", targetNamespace = "")
        String nombreFP);

    /**
     * 
     * @param fecha
     * @param rucCliente
     * @param numFactura
     * @param codCiudad
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearCabeceraFacturaS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.CrearCabeceraFacturaS")
    @ResponseWrapper(localName = "crearCabeceraFacturaSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.CrearCabeceraFacturaSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/crearCabeceraFacturaSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/crearCabeceraFacturaSResponse")
    public int crearCabeceraFacturaS(
        @WebParam(name = "numFactura", targetNamespace = "")
        String numFactura,
        @WebParam(name = "rucCliente", targetNamespace = "")
        String rucCliente,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "codCiudad", targetNamespace = "")
        String codCiudad);

    /**
     * 
     * @param codigoFP
     * @param nombreFP
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarFormaPagoS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarFormaPagoS")
    @ResponseWrapper(localName = "actualizarFormaPagoSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarFormaPagoSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarFormaPagoSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarFormaPagoSResponse")
    public int actualizarFormaPagoS(
        @WebParam(name = "Codigo_FP", targetNamespace = "")
        String codigoFP,
        @WebParam(name = "Nombre_FP", targetNamespace = "")
        String nombreFP);

    /**
     * 
     * @param numFactura
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearDetalleFacturaS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.CrearDetalleFacturaS")
    @ResponseWrapper(localName = "crearDetalleFacturaSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.CrearDetalleFacturaSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/crearDetalleFacturaSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/crearDetalleFacturaSResponse")
    public int crearDetalleFacturaS(
        @WebParam(name = "numFactura", targetNamespace = "")
        String numFactura);

    /**
     * 
     * @param numFactura
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarDetalleFacturaS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarDetalleFacturaS")
    @ResponseWrapper(localName = "eliminarDetalleFacturaSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarDetalleFacturaSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarDetalleFacturaSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarDetalleFacturaSResponse")
    public int eliminarDetalleFacturaS(
        @WebParam(name = "numFactura", targetNamespace = "")
        String numFactura);

    /**
     * 
     * @param codigoFP
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarFormaPagoS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarFormaPagoS")
    @ResponseWrapper(localName = "eliminarFormaPagoSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarFormaPagoSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarFormaPagoSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarFormaPagoSResponse")
    public int eliminarFormaPagoS(
        @WebParam(name = "Codigo_FP", targetNamespace = "")
        String codigoFP);

    /**
     * 
     * @param fecha
     * @param rucCliente
     * @param numFactura
     * @param codCiudad
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarCabeceraFacturaS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarCabeceraFacturaS")
    @ResponseWrapper(localName = "actualizarCabeceraFacturaSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ActualizarCabeceraFacturaSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarCabeceraFacturaSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/actualizarCabeceraFacturaSResponse")
    public int actualizarCabeceraFacturaS(
        @WebParam(name = "numFactura", targetNamespace = "")
        String numFactura,
        @WebParam(name = "rucCliente", targetNamespace = "")
        String rucCliente,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "codCiudad", targetNamespace = "")
        String codCiudad);

    /**
     * 
     * @param numCabecera
     * @return
     *     returns prj_grupo3_server.servicios.CabeceraFactura
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarCabeceraFacturaS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarCabeceraFacturaS")
    @ResponseWrapper(localName = "buscarCabeceraFacturaSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarCabeceraFacturaSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/buscarCabeceraFacturaSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/buscarCabeceraFacturaSResponse")
    public CabeceraFactura buscarCabeceraFacturaS(
        @WebParam(name = "numCabecera", targetNamespace = "")
        String numCabecera);

    /**
     * 
     * @param numCabecera
     * @return
     *     returns prj_grupo3_server.servicios.DetalleFactura
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarDetalleFacturaS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarDetalleFacturaS")
    @ResponseWrapper(localName = "buscarDetalleFacturaSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarDetalleFacturaSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/buscarDetalleFacturaSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/buscarDetalleFacturaSResponse")
    public DetalleFactura buscarDetalleFacturaS(
        @WebParam(name = "numCabecera", targetNamespace = "")
        String numCabecera);

    /**
     * 
     * @param numCabecera
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarCabeceraFacturaS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarCabeceraFacturaS")
    @ResponseWrapper(localName = "eliminarCabeceraFacturaSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarCabeceraFacturaSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarCabeceraFacturaSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarCabeceraFacturaSResponse")
    public int eliminarCabeceraFacturaS(
        @WebParam(name = "numCabecera", targetNamespace = "")
        String numCabecera);

    /**
     * 
     * @param nombreCliente
     * @param rucCliente
     * @param direccionCliente
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarClienteS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarClienteS")
    @ResponseWrapper(localName = "insertarClienteSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarClienteSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/insertarClienteSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/insertarClienteSResponse")
    public int insertarClienteS(
        @WebParam(name = "Ruc_Cliente", targetNamespace = "")
        String rucCliente,
        @WebParam(name = "Nombre_Cliente", targetNamespace = "")
        String nombreCliente,
        @WebParam(name = "Direccion_Cliente", targetNamespace = "")
        String direccionCliente);

    /**
     * 
     * @return
     *     returns java.util.List<prj_grupo3_server.servicios.Cliente>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarClienteS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarClienteS")
    @ResponseWrapper(localName = "listarClienteSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarClienteSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/listarClienteSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/listarClienteSResponse")
    public List<Cliente> listarClienteS();

    /**
     * 
     * @param rucCliente
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarClienteS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarClienteS")
    @ResponseWrapper(localName = "eliminarClienteSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarClienteSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarClienteSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarClienteSResponse")
    public int eliminarClienteS(
        @WebParam(name = "Ruc_Cliente", targetNamespace = "")
        String rucCliente);

    /**
     * 
     * @param usuario
     * @param contrasena
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.LoginS")
    @ResponseWrapper(localName = "loginSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.LoginSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/loginSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/loginSResponse")
    public int loginS(
        @WebParam(name = "Usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "Contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @return
     *     returns java.util.List<prj_grupo3_server.servicios.Cobrador>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCobradorS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarCobradorS")
    @ResponseWrapper(localName = "listarCobradorSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarCobradorSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/listarCobradorSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/listarCobradorSResponse")
    public List<Cobrador> listarCobradorS();

    /**
     * 
     * @return
     *     returns java.util.List<prj_grupo3_server.servicios.Ciudad>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCiudadS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarCiudadS")
    @ResponseWrapper(localName = "listarCiudadSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarCiudadSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/listarCiudadSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/listarCiudadSResponse")
    public List<Ciudad> listarCiudadS();

    /**
     * 
     * @param codigoCiudad
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarCiudadS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarCiudadS")
    @ResponseWrapper(localName = "eliminarCiudadSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.EliminarCiudadSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarCiudadSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/eliminarCiudadSResponse")
    public int eliminarCiudadS(
        @WebParam(name = "Codigo_Ciudad", targetNamespace = "")
        String codigoCiudad);

    /**
     * 
     * @return
     *     returns java.util.List<prj_grupo3_server.servicios.Articulo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarArticuloS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarArticuloS")
    @ResponseWrapper(localName = "listarArticuloSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.ListarArticuloSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/listarArticuloSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/listarArticuloSResponse")
    public List<Articulo> listarArticuloS();

    /**
     * 
     * @param nombreCiudad
     * @param codigoCiudad
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarCiudadS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarCiudadS")
    @ResponseWrapper(localName = "insertarCiudadSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.InsertarCiudadSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/insertarCiudadSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/insertarCiudadSResponse")
    public int insertarCiudadS(
        @WebParam(name = "Codigo_Ciudad", targetNamespace = "")
        String codigoCiudad,
        @WebParam(name = "Nombre_Ciudad", targetNamespace = "")
        String nombreCiudad);

    /**
     * 
     * @param codigo
     * @return
     *     returns prj_grupo3_server.servicios.Articulo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarArticuloS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarArticuloS")
    @ResponseWrapper(localName = "buscarArticuloSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarArticuloSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/buscarArticuloSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/buscarArticuloSResponse")
    public Articulo buscarArticuloS(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param rucCliente
     * @return
     *     returns prj_grupo3_server.servicios.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarClienteS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarClienteS")
    @ResponseWrapper(localName = "buscarClienteSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarClienteSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/buscarClienteSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/buscarClienteSResponse")
    public Cliente buscarClienteS(
        @WebParam(name = "Ruc_Cliente", targetNamespace = "")
        String rucCliente);

    /**
     * 
     * @param codigoCiudad
     * @return
     *     returns prj_grupo3_server.servicios.Ciudad
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarCiudadS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarCiudadS")
    @ResponseWrapper(localName = "buscarCiudadSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarCiudadSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/buscarCiudadSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/buscarCiudadSResponse")
    public Ciudad buscarCiudadS(
        @WebParam(name = "Codigo_Ciudad", targetNamespace = "")
        String codigoCiudad);

    /**
     * 
     * @param cedulaCobrador
     * @return
     *     returns prj_grupo3_server.servicios.Cobrador
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarCobradorS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarCobradorS")
    @ResponseWrapper(localName = "buscarCobradorSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.BuscarCobradorSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/buscarCobradorSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/buscarCobradorSResponse")
    public Cobrador buscarCobradorS(
        @WebParam(name = "Cedula_Cobrador", targetNamespace = "")
        String cedulaCobrador);

    /**
     * 
     * @param precioTotalItem
     * @param nombreItem
     * @param cantidadItem
     * @param numFactura
     * @param precioItem
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarProductoS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.AgregarProductoS")
    @ResponseWrapper(localName = "agregarProductoSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.AgregarProductoSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/agregarProductoSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/agregarProductoSResponse")
    public int agregarProductoS(
        @WebParam(name = "numFactura", targetNamespace = "")
        String numFactura,
        @WebParam(name = "nombreItem", targetNamespace = "")
        String nombreItem,
        @WebParam(name = "cantidadItem", targetNamespace = "")
        String cantidadItem,
        @WebParam(name = "precioItem", targetNamespace = "")
        String precioItem,
        @WebParam(name = "precioTotalItem", targetNamespace = "")
        String precioTotalItem);

    /**
     * 
     * @param fecha
     * @param rucCliente
     * @param precioFinal
     * @param numFactura
     * @param codCiudad
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearFacturaS", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.CrearFacturaS")
    @ResponseWrapper(localName = "crearFacturaSResponse", targetNamespace = "http://Servicios.prj_grupo3_server/", className = "prj_grupo3_server.servicios.CrearFacturaSResponse")
    @Action(input = "http://Servicios.prj_grupo3_server/ServicioServer/crearFacturaSRequest", output = "http://Servicios.prj_grupo3_server/ServicioServer/crearFacturaSResponse")
    public int crearFacturaS(
        @WebParam(name = "numFactura", targetNamespace = "")
        String numFactura,
        @WebParam(name = "rucCliente", targetNamespace = "")
        String rucCliente,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "codCiudad", targetNamespace = "")
        String codCiudad,
        @WebParam(name = "precioFinal", targetNamespace = "")
        String precioFinal);

}
