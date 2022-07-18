
package prj_grupo3_server.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the prj_grupo3_server.servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SingIn_QNAME = new QName("http://Servicios.prj_grupo3_server/", "SingIn");
    private final static QName _SingInResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "SingInResponse");
    private final static QName _ActualizarArticuloS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarArticuloS");
    private final static QName _ActualizarArticuloSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarArticuloSResponse");
    private final static QName _ActualizarCabeceraFacturaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCabeceraFacturaS");
    private final static QName _ActualizarCabeceraFacturaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCabeceraFacturaSResponse");
    private final static QName _ActualizarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCiudadS");
    private final static QName _ActualizarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCiudadSResponse");
    private final static QName _ActualizarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarClienteS");
    private final static QName _ActualizarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarClienteSResponse");
    private final static QName _ActualizarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCobradorS");
    private final static QName _ActualizarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCobradorSResponse");
    private final static QName _ActualizarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarFormaPagoS");
    private final static QName _ActualizarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarFormaPagoSResponse");
    private final static QName _ActualizarMovimientoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarMovimientoS");
    private final static QName _ActualizarMovimientoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarMovimientoSResponse");
    private final static QName _ActualizarStockArticuloS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarStockArticuloS");
    private final static QName _ActualizarStockArticuloSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarStockArticuloSResponse");
    private final static QName _AgregarPagaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "agregarPagaS");
    private final static QName _AgregarPagaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "agregarPagaSResponse");
    private final static QName _AgregarProductoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "agregarProductoS");
    private final static QName _AgregarProductoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "agregarProductoSResponse");
    private final static QName _BuscarArticuloS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarArticuloS");
    private final static QName _BuscarArticuloSN_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarArticuloSN");
    private final static QName _BuscarArticuloSNResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarArticuloSNResponse");
    private final static QName _BuscarArticuloSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarArticuloSResponse");
    private final static QName _BuscarCabeceraFacturaPorRucS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCabeceraFacturaPorRucS");
    private final static QName _BuscarCabeceraFacturaPorRucSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCabeceraFacturaPorRucSResponse");
    private final static QName _BuscarCabeceraFacturaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCabeceraFacturaS");
    private final static QName _BuscarCabeceraFacturaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCabeceraFacturaSResponse");
    private final static QName _BuscarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCiudadS");
    private final static QName _BuscarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCiudadSResponse");
    private final static QName _BuscarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarClienteS");
    private final static QName _BuscarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarClienteSResponse");
    private final static QName _BuscarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCobradorS");
    private final static QName _BuscarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCobradorSResponse");
    private final static QName _BuscarDetalleFacturaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarDetalleFacturaS");
    private final static QName _BuscarDetalleFacturaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarDetalleFacturaSResponse");
    private final static QName _BuscarDetalleFacturacxcS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarDetalleFacturacxcS");
    private final static QName _BuscarDetalleFacturacxcSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarDetalleFacturacxcSResponse");
    private final static QName _BuscarFacturaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarFacturaS");
    private final static QName _BuscarFacturaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarFacturaSResponse");
    private final static QName _BuscarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarFormaPagoS");
    private final static QName _BuscarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarFormaPagoSResponse");
    private final static QName _BuscarMovimientoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarMovimientoS");
    private final static QName _BuscarMovimientoSN_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarMovimientoSN");
    private final static QName _BuscarMovimientoSNResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarMovimientoSNResponse");
    private final static QName _BuscarMovimientoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarMovimientoSResponse");
    private final static QName _CrearCabeceraFacturaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearCabeceraFacturaS");
    private final static QName _CrearCabeceraFacturaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearCabeceraFacturaSResponse");
    private final static QName _CrearDetalleFacturaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearDetalleFacturaS");
    private final static QName _CrearDetalleFacturaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearDetalleFacturaSResponse");
    private final static QName _CrearDetalleFacturacxcS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearDetalleFacturacxcS");
    private final static QName _CrearDetalleFacturacxcSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearDetalleFacturacxcSResponse");
    private final static QName _CrearFacturaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearFacturaS");
    private final static QName _CrearFacturaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearFacturaSResponse");
    private final static QName _CrearUsuarioS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearUsuarioS");
    private final static QName _CrearUsuarioSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "crearUsuarioSResponse");
    private final static QName _EliminarArticuloS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarArticuloS");
    private final static QName _EliminarArticuloSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarArticuloSResponse");
    private final static QName _EliminarCabeceraFacturaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCabeceraFacturaS");
    private final static QName _EliminarCabeceraFacturaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCabeceraFacturaSResponse");
    private final static QName _EliminarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCiudadS");
    private final static QName _EliminarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCiudadSResponse");
    private final static QName _EliminarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarClienteS");
    private final static QName _EliminarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarClienteSResponse");
    private final static QName _EliminarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCobradorS");
    private final static QName _EliminarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCobradorSResponse");
    private final static QName _EliminarDetalleFacturaS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarDetalleFacturaS");
    private final static QName _EliminarDetalleFacturaSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarDetalleFacturaSResponse");
    private final static QName _EliminarDetalleFacturacxcS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarDetalleFacturacxcS");
    private final static QName _EliminarDetalleFacturacxcSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarDetalleFacturacxcSResponse");
    private final static QName _EliminarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarFormaPagoS");
    private final static QName _EliminarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarFormaPagoSResponse");
    private final static QName _EliminarMovimientoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarMovimientoS");
    private final static QName _EliminarMovimientoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarMovimientoSResponse");
    private final static QName _InsertarArticuloS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarArticuloS");
    private final static QName _InsertarArticuloSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarArticuloSResponse");
    private final static QName _InsertarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarCiudadS");
    private final static QName _InsertarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarCiudadSResponse");
    private final static QName _InsertarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarClienteS");
    private final static QName _InsertarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarClienteSResponse");
    private final static QName _InsertarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarCobradorS");
    private final static QName _InsertarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarCobradorSResponse");
    private final static QName _InsertarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarFormaPagoS");
    private final static QName _InsertarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarFormaPagoSResponse");
    private final static QName _InsertarMovimientoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarMovimientoS");
    private final static QName _InsertarMovimientoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarMovimientoSResponse");
    private final static QName _ListarArticuloS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarArticuloS");
    private final static QName _ListarArticuloSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarArticuloSResponse");
    private final static QName _ListarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarCiudadS");
    private final static QName _ListarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarCiudadSResponse");
    private final static QName _ListarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarClienteS");
    private final static QName _ListarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarClienteSResponse");
    private final static QName _ListarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarCobradorS");
    private final static QName _ListarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarCobradorSResponse");
    private final static QName _ListarFacturasS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarFacturasS");
    private final static QName _ListarFacturasSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarFacturasSResponse");
    private final static QName _ListarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarFormaPagoS");
    private final static QName _ListarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarFormaPagoSResponse");
    private final static QName _ListarMovimientoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarMovimientoS");
    private final static QName _ListarMovimientoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarMovimientoSResponse");
    private final static QName _LoginS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "loginS");
    private final static QName _LoginSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "loginSResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: prj_grupo3_server.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SingIn }
     * 
     */
    public SingIn createSingIn() {
        return new SingIn();
    }

    /**
     * Create an instance of {@link SingInResponse }
     * 
     */
    public SingInResponse createSingInResponse() {
        return new SingInResponse();
    }

    /**
     * Create an instance of {@link ActualizarArticuloS }
     * 
     */
    public ActualizarArticuloS createActualizarArticuloS() {
        return new ActualizarArticuloS();
    }

    /**
     * Create an instance of {@link ActualizarArticuloSResponse }
     * 
     */
    public ActualizarArticuloSResponse createActualizarArticuloSResponse() {
        return new ActualizarArticuloSResponse();
    }

    /**
     * Create an instance of {@link ActualizarCabeceraFacturaS }
     * 
     */
    public ActualizarCabeceraFacturaS createActualizarCabeceraFacturaS() {
        return new ActualizarCabeceraFacturaS();
    }

    /**
     * Create an instance of {@link ActualizarCabeceraFacturaSResponse }
     * 
     */
    public ActualizarCabeceraFacturaSResponse createActualizarCabeceraFacturaSResponse() {
        return new ActualizarCabeceraFacturaSResponse();
    }

    /**
     * Create an instance of {@link ActualizarCiudadS }
     * 
     */
    public ActualizarCiudadS createActualizarCiudadS() {
        return new ActualizarCiudadS();
    }

    /**
     * Create an instance of {@link ActualizarCiudadSResponse }
     * 
     */
    public ActualizarCiudadSResponse createActualizarCiudadSResponse() {
        return new ActualizarCiudadSResponse();
    }

    /**
     * Create an instance of {@link ActualizarClienteS }
     * 
     */
    public ActualizarClienteS createActualizarClienteS() {
        return new ActualizarClienteS();
    }

    /**
     * Create an instance of {@link ActualizarClienteSResponse }
     * 
     */
    public ActualizarClienteSResponse createActualizarClienteSResponse() {
        return new ActualizarClienteSResponse();
    }

    /**
     * Create an instance of {@link ActualizarCobradorS }
     * 
     */
    public ActualizarCobradorS createActualizarCobradorS() {
        return new ActualizarCobradorS();
    }

    /**
     * Create an instance of {@link ActualizarCobradorSResponse }
     * 
     */
    public ActualizarCobradorSResponse createActualizarCobradorSResponse() {
        return new ActualizarCobradorSResponse();
    }

    /**
     * Create an instance of {@link ActualizarFormaPagoS }
     * 
     */
    public ActualizarFormaPagoS createActualizarFormaPagoS() {
        return new ActualizarFormaPagoS();
    }

    /**
     * Create an instance of {@link ActualizarFormaPagoSResponse }
     * 
     */
    public ActualizarFormaPagoSResponse createActualizarFormaPagoSResponse() {
        return new ActualizarFormaPagoSResponse();
    }

    /**
     * Create an instance of {@link ActualizarMovimientoS }
     * 
     */
    public ActualizarMovimientoS createActualizarMovimientoS() {
        return new ActualizarMovimientoS();
    }

    /**
     * Create an instance of {@link ActualizarMovimientoSResponse }
     * 
     */
    public ActualizarMovimientoSResponse createActualizarMovimientoSResponse() {
        return new ActualizarMovimientoSResponse();
    }

    /**
     * Create an instance of {@link ActualizarStockArticuloS }
     * 
     */
    public ActualizarStockArticuloS createActualizarStockArticuloS() {
        return new ActualizarStockArticuloS();
    }

    /**
     * Create an instance of {@link ActualizarStockArticuloSResponse }
     * 
     */
    public ActualizarStockArticuloSResponse createActualizarStockArticuloSResponse() {
        return new ActualizarStockArticuloSResponse();
    }

    /**
     * Create an instance of {@link AgregarPagaS }
     * 
     */
    public AgregarPagaS createAgregarPagaS() {
        return new AgregarPagaS();
    }

    /**
     * Create an instance of {@link AgregarPagaSResponse }
     * 
     */
    public AgregarPagaSResponse createAgregarPagaSResponse() {
        return new AgregarPagaSResponse();
    }

    /**
     * Create an instance of {@link AgregarProductoS }
     * 
     */
    public AgregarProductoS createAgregarProductoS() {
        return new AgregarProductoS();
    }

    /**
     * Create an instance of {@link AgregarProductoSResponse }
     * 
     */
    public AgregarProductoSResponse createAgregarProductoSResponse() {
        return new AgregarProductoSResponse();
    }

    /**
     * Create an instance of {@link BuscarArticuloS }
     * 
     */
    public BuscarArticuloS createBuscarArticuloS() {
        return new BuscarArticuloS();
    }

    /**
     * Create an instance of {@link BuscarArticuloSN }
     * 
     */
    public BuscarArticuloSN createBuscarArticuloSN() {
        return new BuscarArticuloSN();
    }

    /**
     * Create an instance of {@link BuscarArticuloSNResponse }
     * 
     */
    public BuscarArticuloSNResponse createBuscarArticuloSNResponse() {
        return new BuscarArticuloSNResponse();
    }

    /**
     * Create an instance of {@link BuscarArticuloSResponse }
     * 
     */
    public BuscarArticuloSResponse createBuscarArticuloSResponse() {
        return new BuscarArticuloSResponse();
    }

    /**
     * Create an instance of {@link BuscarCabeceraFacturaPorRucS }
     * 
     */
    public BuscarCabeceraFacturaPorRucS createBuscarCabeceraFacturaPorRucS() {
        return new BuscarCabeceraFacturaPorRucS();
    }

    /**
     * Create an instance of {@link BuscarCabeceraFacturaPorRucSResponse }
     * 
     */
    public BuscarCabeceraFacturaPorRucSResponse createBuscarCabeceraFacturaPorRucSResponse() {
        return new BuscarCabeceraFacturaPorRucSResponse();
    }

    /**
     * Create an instance of {@link BuscarCabeceraFacturaS }
     * 
     */
    public BuscarCabeceraFacturaS createBuscarCabeceraFacturaS() {
        return new BuscarCabeceraFacturaS();
    }

    /**
     * Create an instance of {@link BuscarCabeceraFacturaSResponse }
     * 
     */
    public BuscarCabeceraFacturaSResponse createBuscarCabeceraFacturaSResponse() {
        return new BuscarCabeceraFacturaSResponse();
    }

    /**
     * Create an instance of {@link BuscarCiudadS }
     * 
     */
    public BuscarCiudadS createBuscarCiudadS() {
        return new BuscarCiudadS();
    }

    /**
     * Create an instance of {@link BuscarCiudadSResponse }
     * 
     */
    public BuscarCiudadSResponse createBuscarCiudadSResponse() {
        return new BuscarCiudadSResponse();
    }

    /**
     * Create an instance of {@link BuscarClienteS }
     * 
     */
    public BuscarClienteS createBuscarClienteS() {
        return new BuscarClienteS();
    }

    /**
     * Create an instance of {@link BuscarClienteSResponse }
     * 
     */
    public BuscarClienteSResponse createBuscarClienteSResponse() {
        return new BuscarClienteSResponse();
    }

    /**
     * Create an instance of {@link BuscarCobradorS }
     * 
     */
    public BuscarCobradorS createBuscarCobradorS() {
        return new BuscarCobradorS();
    }

    /**
     * Create an instance of {@link BuscarCobradorSResponse }
     * 
     */
    public BuscarCobradorSResponse createBuscarCobradorSResponse() {
        return new BuscarCobradorSResponse();
    }

    /**
     * Create an instance of {@link BuscarDetalleFacturaS }
     * 
     */
    public BuscarDetalleFacturaS createBuscarDetalleFacturaS() {
        return new BuscarDetalleFacturaS();
    }

    /**
     * Create an instance of {@link BuscarDetalleFacturaSResponse }
     * 
     */
    public BuscarDetalleFacturaSResponse createBuscarDetalleFacturaSResponse() {
        return new BuscarDetalleFacturaSResponse();
    }

    /**
     * Create an instance of {@link BuscarDetalleFacturacxcS }
     * 
     */
    public BuscarDetalleFacturacxcS createBuscarDetalleFacturacxcS() {
        return new BuscarDetalleFacturacxcS();
    }

    /**
     * Create an instance of {@link BuscarDetalleFacturacxcSResponse }
     * 
     */
    public BuscarDetalleFacturacxcSResponse createBuscarDetalleFacturacxcSResponse() {
        return new BuscarDetalleFacturacxcSResponse();
    }

    /**
     * Create an instance of {@link BuscarFacturaS }
     * 
     */
    public BuscarFacturaS createBuscarFacturaS() {
        return new BuscarFacturaS();
    }

    /**
     * Create an instance of {@link BuscarFacturaSResponse }
     * 
     */
    public BuscarFacturaSResponse createBuscarFacturaSResponse() {
        return new BuscarFacturaSResponse();
    }

    /**
     * Create an instance of {@link BuscarFormaPagoS }
     * 
     */
    public BuscarFormaPagoS createBuscarFormaPagoS() {
        return new BuscarFormaPagoS();
    }

    /**
     * Create an instance of {@link BuscarFormaPagoSResponse }
     * 
     */
    public BuscarFormaPagoSResponse createBuscarFormaPagoSResponse() {
        return new BuscarFormaPagoSResponse();
    }

    /**
     * Create an instance of {@link BuscarMovimientoS }
     * 
     */
    public BuscarMovimientoS createBuscarMovimientoS() {
        return new BuscarMovimientoS();
    }

    /**
     * Create an instance of {@link BuscarMovimientoSN }
     * 
     */
    public BuscarMovimientoSN createBuscarMovimientoSN() {
        return new BuscarMovimientoSN();
    }

    /**
     * Create an instance of {@link BuscarMovimientoSNResponse }
     * 
     */
    public BuscarMovimientoSNResponse createBuscarMovimientoSNResponse() {
        return new BuscarMovimientoSNResponse();
    }

    /**
     * Create an instance of {@link BuscarMovimientoSResponse }
     * 
     */
    public BuscarMovimientoSResponse createBuscarMovimientoSResponse() {
        return new BuscarMovimientoSResponse();
    }

    /**
     * Create an instance of {@link CrearCabeceraFacturaS }
     * 
     */
    public CrearCabeceraFacturaS createCrearCabeceraFacturaS() {
        return new CrearCabeceraFacturaS();
    }

    /**
     * Create an instance of {@link CrearCabeceraFacturaSResponse }
     * 
     */
    public CrearCabeceraFacturaSResponse createCrearCabeceraFacturaSResponse() {
        return new CrearCabeceraFacturaSResponse();
    }

    /**
     * Create an instance of {@link CrearDetalleFacturaS }
     * 
     */
    public CrearDetalleFacturaS createCrearDetalleFacturaS() {
        return new CrearDetalleFacturaS();
    }

    /**
     * Create an instance of {@link CrearDetalleFacturaSResponse }
     * 
     */
    public CrearDetalleFacturaSResponse createCrearDetalleFacturaSResponse() {
        return new CrearDetalleFacturaSResponse();
    }

    /**
     * Create an instance of {@link CrearDetalleFacturacxcS }
     * 
     */
    public CrearDetalleFacturacxcS createCrearDetalleFacturacxcS() {
        return new CrearDetalleFacturacxcS();
    }

    /**
     * Create an instance of {@link CrearDetalleFacturacxcSResponse }
     * 
     */
    public CrearDetalleFacturacxcSResponse createCrearDetalleFacturacxcSResponse() {
        return new CrearDetalleFacturacxcSResponse();
    }

    /**
     * Create an instance of {@link CrearFacturaS }
     * 
     */
    public CrearFacturaS createCrearFacturaS() {
        return new CrearFacturaS();
    }

    /**
     * Create an instance of {@link CrearFacturaSResponse }
     * 
     */
    public CrearFacturaSResponse createCrearFacturaSResponse() {
        return new CrearFacturaSResponse();
    }

    /**
     * Create an instance of {@link CrearUsuarioS }
     * 
     */
    public CrearUsuarioS createCrearUsuarioS() {
        return new CrearUsuarioS();
    }

    /**
     * Create an instance of {@link CrearUsuarioSResponse }
     * 
     */
    public CrearUsuarioSResponse createCrearUsuarioSResponse() {
        return new CrearUsuarioSResponse();
    }

    /**
     * Create an instance of {@link EliminarArticuloS }
     * 
     */
    public EliminarArticuloS createEliminarArticuloS() {
        return new EliminarArticuloS();
    }

    /**
     * Create an instance of {@link EliminarArticuloSResponse }
     * 
     */
    public EliminarArticuloSResponse createEliminarArticuloSResponse() {
        return new EliminarArticuloSResponse();
    }

    /**
     * Create an instance of {@link EliminarCabeceraFacturaS }
     * 
     */
    public EliminarCabeceraFacturaS createEliminarCabeceraFacturaS() {
        return new EliminarCabeceraFacturaS();
    }

    /**
     * Create an instance of {@link EliminarCabeceraFacturaSResponse }
     * 
     */
    public EliminarCabeceraFacturaSResponse createEliminarCabeceraFacturaSResponse() {
        return new EliminarCabeceraFacturaSResponse();
    }

    /**
     * Create an instance of {@link EliminarCiudadS }
     * 
     */
    public EliminarCiudadS createEliminarCiudadS() {
        return new EliminarCiudadS();
    }

    /**
     * Create an instance of {@link EliminarCiudadSResponse }
     * 
     */
    public EliminarCiudadSResponse createEliminarCiudadSResponse() {
        return new EliminarCiudadSResponse();
    }

    /**
     * Create an instance of {@link EliminarClienteS }
     * 
     */
    public EliminarClienteS createEliminarClienteS() {
        return new EliminarClienteS();
    }

    /**
     * Create an instance of {@link EliminarClienteSResponse }
     * 
     */
    public EliminarClienteSResponse createEliminarClienteSResponse() {
        return new EliminarClienteSResponse();
    }

    /**
     * Create an instance of {@link EliminarCobradorS }
     * 
     */
    public EliminarCobradorS createEliminarCobradorS() {
        return new EliminarCobradorS();
    }

    /**
     * Create an instance of {@link EliminarCobradorSResponse }
     * 
     */
    public EliminarCobradorSResponse createEliminarCobradorSResponse() {
        return new EliminarCobradorSResponse();
    }

    /**
     * Create an instance of {@link EliminarDetalleFacturaS }
     * 
     */
    public EliminarDetalleFacturaS createEliminarDetalleFacturaS() {
        return new EliminarDetalleFacturaS();
    }

    /**
     * Create an instance of {@link EliminarDetalleFacturaSResponse }
     * 
     */
    public EliminarDetalleFacturaSResponse createEliminarDetalleFacturaSResponse() {
        return new EliminarDetalleFacturaSResponse();
    }

    /**
     * Create an instance of {@link EliminarDetalleFacturacxcS }
     * 
     */
    public EliminarDetalleFacturacxcS createEliminarDetalleFacturacxcS() {
        return new EliminarDetalleFacturacxcS();
    }

    /**
     * Create an instance of {@link EliminarDetalleFacturacxcSResponse }
     * 
     */
    public EliminarDetalleFacturacxcSResponse createEliminarDetalleFacturacxcSResponse() {
        return new EliminarDetalleFacturacxcSResponse();
    }

    /**
     * Create an instance of {@link EliminarFormaPagoS }
     * 
     */
    public EliminarFormaPagoS createEliminarFormaPagoS() {
        return new EliminarFormaPagoS();
    }

    /**
     * Create an instance of {@link EliminarFormaPagoSResponse }
     * 
     */
    public EliminarFormaPagoSResponse createEliminarFormaPagoSResponse() {
        return new EliminarFormaPagoSResponse();
    }

    /**
     * Create an instance of {@link EliminarMovimientoS }
     * 
     */
    public EliminarMovimientoS createEliminarMovimientoS() {
        return new EliminarMovimientoS();
    }

    /**
     * Create an instance of {@link EliminarMovimientoSResponse }
     * 
     */
    public EliminarMovimientoSResponse createEliminarMovimientoSResponse() {
        return new EliminarMovimientoSResponse();
    }

    /**
     * Create an instance of {@link InsertarArticuloS }
     * 
     */
    public InsertarArticuloS createInsertarArticuloS() {
        return new InsertarArticuloS();
    }

    /**
     * Create an instance of {@link InsertarArticuloSResponse }
     * 
     */
    public InsertarArticuloSResponse createInsertarArticuloSResponse() {
        return new InsertarArticuloSResponse();
    }

    /**
     * Create an instance of {@link InsertarCiudadS }
     * 
     */
    public InsertarCiudadS createInsertarCiudadS() {
        return new InsertarCiudadS();
    }

    /**
     * Create an instance of {@link InsertarCiudadSResponse }
     * 
     */
    public InsertarCiudadSResponse createInsertarCiudadSResponse() {
        return new InsertarCiudadSResponse();
    }

    /**
     * Create an instance of {@link InsertarClienteS }
     * 
     */
    public InsertarClienteS createInsertarClienteS() {
        return new InsertarClienteS();
    }

    /**
     * Create an instance of {@link InsertarClienteSResponse }
     * 
     */
    public InsertarClienteSResponse createInsertarClienteSResponse() {
        return new InsertarClienteSResponse();
    }

    /**
     * Create an instance of {@link InsertarCobradorS }
     * 
     */
    public InsertarCobradorS createInsertarCobradorS() {
        return new InsertarCobradorS();
    }

    /**
     * Create an instance of {@link InsertarCobradorSResponse }
     * 
     */
    public InsertarCobradorSResponse createInsertarCobradorSResponse() {
        return new InsertarCobradorSResponse();
    }

    /**
     * Create an instance of {@link InsertarFormaPagoS }
     * 
     */
    public InsertarFormaPagoS createInsertarFormaPagoS() {
        return new InsertarFormaPagoS();
    }

    /**
     * Create an instance of {@link InsertarFormaPagoSResponse }
     * 
     */
    public InsertarFormaPagoSResponse createInsertarFormaPagoSResponse() {
        return new InsertarFormaPagoSResponse();
    }

    /**
     * Create an instance of {@link InsertarMovimientoS }
     * 
     */
    public InsertarMovimientoS createInsertarMovimientoS() {
        return new InsertarMovimientoS();
    }

    /**
     * Create an instance of {@link InsertarMovimientoSResponse }
     * 
     */
    public InsertarMovimientoSResponse createInsertarMovimientoSResponse() {
        return new InsertarMovimientoSResponse();
    }

    /**
     * Create an instance of {@link ListarArticuloS }
     * 
     */
    public ListarArticuloS createListarArticuloS() {
        return new ListarArticuloS();
    }

    /**
     * Create an instance of {@link ListarArticuloSResponse }
     * 
     */
    public ListarArticuloSResponse createListarArticuloSResponse() {
        return new ListarArticuloSResponse();
    }

    /**
     * Create an instance of {@link ListarCiudadS }
     * 
     */
    public ListarCiudadS createListarCiudadS() {
        return new ListarCiudadS();
    }

    /**
     * Create an instance of {@link ListarCiudadSResponse }
     * 
     */
    public ListarCiudadSResponse createListarCiudadSResponse() {
        return new ListarCiudadSResponse();
    }

    /**
     * Create an instance of {@link ListarClienteS }
     * 
     */
    public ListarClienteS createListarClienteS() {
        return new ListarClienteS();
    }

    /**
     * Create an instance of {@link ListarClienteSResponse }
     * 
     */
    public ListarClienteSResponse createListarClienteSResponse() {
        return new ListarClienteSResponse();
    }

    /**
     * Create an instance of {@link ListarCobradorS }
     * 
     */
    public ListarCobradorS createListarCobradorS() {
        return new ListarCobradorS();
    }

    /**
     * Create an instance of {@link ListarCobradorSResponse }
     * 
     */
    public ListarCobradorSResponse createListarCobradorSResponse() {
        return new ListarCobradorSResponse();
    }

    /**
     * Create an instance of {@link ListarFacturasS }
     * 
     */
    public ListarFacturasS createListarFacturasS() {
        return new ListarFacturasS();
    }

    /**
     * Create an instance of {@link ListarFacturasSResponse }
     * 
     */
    public ListarFacturasSResponse createListarFacturasSResponse() {
        return new ListarFacturasSResponse();
    }

    /**
     * Create an instance of {@link ListarFormaPagoS }
     * 
     */
    public ListarFormaPagoS createListarFormaPagoS() {
        return new ListarFormaPagoS();
    }

    /**
     * Create an instance of {@link ListarFormaPagoSResponse }
     * 
     */
    public ListarFormaPagoSResponse createListarFormaPagoSResponse() {
        return new ListarFormaPagoSResponse();
    }

    /**
     * Create an instance of {@link ListarMovimientoS }
     * 
     */
    public ListarMovimientoS createListarMovimientoS() {
        return new ListarMovimientoS();
    }

    /**
     * Create an instance of {@link ListarMovimientoSResponse }
     * 
     */
    public ListarMovimientoSResponse createListarMovimientoSResponse() {
        return new ListarMovimientoSResponse();
    }

    /**
     * Create an instance of {@link LoginS }
     * 
     */
    public LoginS createLoginS() {
        return new LoginS();
    }

    /**
     * Create an instance of {@link LoginSResponse }
     * 
     */
    public LoginSResponse createLoginSResponse() {
        return new LoginSResponse();
    }

    /**
     * Create an instance of {@link Cobrador }
     * 
     */
    public Cobrador createCobrador() {
        return new Cobrador();
    }

    /**
     * Create an instance of {@link Articulo }
     * 
     */
    public Articulo createArticulo() {
        return new Articulo();
    }

    /**
     * Create an instance of {@link DetalleFactura }
     * 
     */
    public DetalleFactura createDetalleFactura() {
        return new DetalleFactura();
    }

    /**
     * Create an instance of {@link ItemFactura }
     * 
     */
    public ItemFactura createItemFactura() {
        return new ItemFactura();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link CabeceraFactura }
     * 
     */
    public CabeceraFactura createCabeceraFactura() {
        return new CabeceraFactura();
    }

    /**
     * Create an instance of {@link Ciudad }
     * 
     */
    public Ciudad createCiudad() {
        return new Ciudad();
    }

    /**
     * Create an instance of {@link Movimiento }
     * 
     */
    public Movimiento createMovimiento() {
        return new Movimiento();
    }

    /**
     * Create an instance of {@link DetalleFacturacxc }
     * 
     */
    public DetalleFacturacxc createDetalleFacturacxc() {
        return new DetalleFacturacxc();
    }

    /**
     * Create an instance of {@link ItemFacturacxc }
     * 
     */
    public ItemFacturacxc createItemFacturacxc() {
        return new ItemFacturacxc();
    }

    /**
     * Create an instance of {@link FormaPago }
     * 
     */
    public FormaPago createFormaPago() {
        return new FormaPago();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "SingIn")
    public JAXBElement<SingIn> createSingIn(SingIn value) {
        return new JAXBElement<SingIn>(_SingIn_QNAME, SingIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingInResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "SingInResponse")
    public JAXBElement<SingInResponse> createSingInResponse(SingInResponse value) {
        return new JAXBElement<SingInResponse>(_SingInResponse_QNAME, SingInResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarArticuloS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarArticuloS")
    public JAXBElement<ActualizarArticuloS> createActualizarArticuloS(ActualizarArticuloS value) {
        return new JAXBElement<ActualizarArticuloS>(_ActualizarArticuloS_QNAME, ActualizarArticuloS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarArticuloSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarArticuloSResponse")
    public JAXBElement<ActualizarArticuloSResponse> createActualizarArticuloSResponse(ActualizarArticuloSResponse value) {
        return new JAXBElement<ActualizarArticuloSResponse>(_ActualizarArticuloSResponse_QNAME, ActualizarArticuloSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCabeceraFacturaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarCabeceraFacturaS")
    public JAXBElement<ActualizarCabeceraFacturaS> createActualizarCabeceraFacturaS(ActualizarCabeceraFacturaS value) {
        return new JAXBElement<ActualizarCabeceraFacturaS>(_ActualizarCabeceraFacturaS_QNAME, ActualizarCabeceraFacturaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCabeceraFacturaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarCabeceraFacturaSResponse")
    public JAXBElement<ActualizarCabeceraFacturaSResponse> createActualizarCabeceraFacturaSResponse(ActualizarCabeceraFacturaSResponse value) {
        return new JAXBElement<ActualizarCabeceraFacturaSResponse>(_ActualizarCabeceraFacturaSResponse_QNAME, ActualizarCabeceraFacturaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCiudadS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarCiudadS")
    public JAXBElement<ActualizarCiudadS> createActualizarCiudadS(ActualizarCiudadS value) {
        return new JAXBElement<ActualizarCiudadS>(_ActualizarCiudadS_QNAME, ActualizarCiudadS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCiudadSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarCiudadSResponse")
    public JAXBElement<ActualizarCiudadSResponse> createActualizarCiudadSResponse(ActualizarCiudadSResponse value) {
        return new JAXBElement<ActualizarCiudadSResponse>(_ActualizarCiudadSResponse_QNAME, ActualizarCiudadSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarClienteS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarClienteS")
    public JAXBElement<ActualizarClienteS> createActualizarClienteS(ActualizarClienteS value) {
        return new JAXBElement<ActualizarClienteS>(_ActualizarClienteS_QNAME, ActualizarClienteS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarClienteSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarClienteSResponse")
    public JAXBElement<ActualizarClienteSResponse> createActualizarClienteSResponse(ActualizarClienteSResponse value) {
        return new JAXBElement<ActualizarClienteSResponse>(_ActualizarClienteSResponse_QNAME, ActualizarClienteSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCobradorS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarCobradorS")
    public JAXBElement<ActualizarCobradorS> createActualizarCobradorS(ActualizarCobradorS value) {
        return new JAXBElement<ActualizarCobradorS>(_ActualizarCobradorS_QNAME, ActualizarCobradorS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCobradorSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarCobradorSResponse")
    public JAXBElement<ActualizarCobradorSResponse> createActualizarCobradorSResponse(ActualizarCobradorSResponse value) {
        return new JAXBElement<ActualizarCobradorSResponse>(_ActualizarCobradorSResponse_QNAME, ActualizarCobradorSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarFormaPagoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarFormaPagoS")
    public JAXBElement<ActualizarFormaPagoS> createActualizarFormaPagoS(ActualizarFormaPagoS value) {
        return new JAXBElement<ActualizarFormaPagoS>(_ActualizarFormaPagoS_QNAME, ActualizarFormaPagoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarFormaPagoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarFormaPagoSResponse")
    public JAXBElement<ActualizarFormaPagoSResponse> createActualizarFormaPagoSResponse(ActualizarFormaPagoSResponse value) {
        return new JAXBElement<ActualizarFormaPagoSResponse>(_ActualizarFormaPagoSResponse_QNAME, ActualizarFormaPagoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarMovimientoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarMovimientoS")
    public JAXBElement<ActualizarMovimientoS> createActualizarMovimientoS(ActualizarMovimientoS value) {
        return new JAXBElement<ActualizarMovimientoS>(_ActualizarMovimientoS_QNAME, ActualizarMovimientoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarMovimientoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarMovimientoSResponse")
    public JAXBElement<ActualizarMovimientoSResponse> createActualizarMovimientoSResponse(ActualizarMovimientoSResponse value) {
        return new JAXBElement<ActualizarMovimientoSResponse>(_ActualizarMovimientoSResponse_QNAME, ActualizarMovimientoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStockArticuloS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarStockArticuloS")
    public JAXBElement<ActualizarStockArticuloS> createActualizarStockArticuloS(ActualizarStockArticuloS value) {
        return new JAXBElement<ActualizarStockArticuloS>(_ActualizarStockArticuloS_QNAME, ActualizarStockArticuloS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStockArticuloSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "actualizarStockArticuloSResponse")
    public JAXBElement<ActualizarStockArticuloSResponse> createActualizarStockArticuloSResponse(ActualizarStockArticuloSResponse value) {
        return new JAXBElement<ActualizarStockArticuloSResponse>(_ActualizarStockArticuloSResponse_QNAME, ActualizarStockArticuloSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarPagaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "agregarPagaS")
    public JAXBElement<AgregarPagaS> createAgregarPagaS(AgregarPagaS value) {
        return new JAXBElement<AgregarPagaS>(_AgregarPagaS_QNAME, AgregarPagaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarPagaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "agregarPagaSResponse")
    public JAXBElement<AgregarPagaSResponse> createAgregarPagaSResponse(AgregarPagaSResponse value) {
        return new JAXBElement<AgregarPagaSResponse>(_AgregarPagaSResponse_QNAME, AgregarPagaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProductoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "agregarProductoS")
    public JAXBElement<AgregarProductoS> createAgregarProductoS(AgregarProductoS value) {
        return new JAXBElement<AgregarProductoS>(_AgregarProductoS_QNAME, AgregarProductoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProductoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "agregarProductoSResponse")
    public JAXBElement<AgregarProductoSResponse> createAgregarProductoSResponse(AgregarProductoSResponse value) {
        return new JAXBElement<AgregarProductoSResponse>(_AgregarProductoSResponse_QNAME, AgregarProductoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarArticuloS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarArticuloS")
    public JAXBElement<BuscarArticuloS> createBuscarArticuloS(BuscarArticuloS value) {
        return new JAXBElement<BuscarArticuloS>(_BuscarArticuloS_QNAME, BuscarArticuloS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarArticuloSN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarArticuloSN")
    public JAXBElement<BuscarArticuloSN> createBuscarArticuloSN(BuscarArticuloSN value) {
        return new JAXBElement<BuscarArticuloSN>(_BuscarArticuloSN_QNAME, BuscarArticuloSN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarArticuloSNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarArticuloSNResponse")
    public JAXBElement<BuscarArticuloSNResponse> createBuscarArticuloSNResponse(BuscarArticuloSNResponse value) {
        return new JAXBElement<BuscarArticuloSNResponse>(_BuscarArticuloSNResponse_QNAME, BuscarArticuloSNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarArticuloSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarArticuloSResponse")
    public JAXBElement<BuscarArticuloSResponse> createBuscarArticuloSResponse(BuscarArticuloSResponse value) {
        return new JAXBElement<BuscarArticuloSResponse>(_BuscarArticuloSResponse_QNAME, BuscarArticuloSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCabeceraFacturaPorRucS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarCabeceraFacturaPorRucS")
    public JAXBElement<BuscarCabeceraFacturaPorRucS> createBuscarCabeceraFacturaPorRucS(BuscarCabeceraFacturaPorRucS value) {
        return new JAXBElement<BuscarCabeceraFacturaPorRucS>(_BuscarCabeceraFacturaPorRucS_QNAME, BuscarCabeceraFacturaPorRucS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCabeceraFacturaPorRucSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarCabeceraFacturaPorRucSResponse")
    public JAXBElement<BuscarCabeceraFacturaPorRucSResponse> createBuscarCabeceraFacturaPorRucSResponse(BuscarCabeceraFacturaPorRucSResponse value) {
        return new JAXBElement<BuscarCabeceraFacturaPorRucSResponse>(_BuscarCabeceraFacturaPorRucSResponse_QNAME, BuscarCabeceraFacturaPorRucSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCabeceraFacturaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarCabeceraFacturaS")
    public JAXBElement<BuscarCabeceraFacturaS> createBuscarCabeceraFacturaS(BuscarCabeceraFacturaS value) {
        return new JAXBElement<BuscarCabeceraFacturaS>(_BuscarCabeceraFacturaS_QNAME, BuscarCabeceraFacturaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCabeceraFacturaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarCabeceraFacturaSResponse")
    public JAXBElement<BuscarCabeceraFacturaSResponse> createBuscarCabeceraFacturaSResponse(BuscarCabeceraFacturaSResponse value) {
        return new JAXBElement<BuscarCabeceraFacturaSResponse>(_BuscarCabeceraFacturaSResponse_QNAME, BuscarCabeceraFacturaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCiudadS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarCiudadS")
    public JAXBElement<BuscarCiudadS> createBuscarCiudadS(BuscarCiudadS value) {
        return new JAXBElement<BuscarCiudadS>(_BuscarCiudadS_QNAME, BuscarCiudadS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCiudadSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarCiudadSResponse")
    public JAXBElement<BuscarCiudadSResponse> createBuscarCiudadSResponse(BuscarCiudadSResponse value) {
        return new JAXBElement<BuscarCiudadSResponse>(_BuscarCiudadSResponse_QNAME, BuscarCiudadSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarClienteS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarClienteS")
    public JAXBElement<BuscarClienteS> createBuscarClienteS(BuscarClienteS value) {
        return new JAXBElement<BuscarClienteS>(_BuscarClienteS_QNAME, BuscarClienteS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarClienteSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarClienteSResponse")
    public JAXBElement<BuscarClienteSResponse> createBuscarClienteSResponse(BuscarClienteSResponse value) {
        return new JAXBElement<BuscarClienteSResponse>(_BuscarClienteSResponse_QNAME, BuscarClienteSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCobradorS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarCobradorS")
    public JAXBElement<BuscarCobradorS> createBuscarCobradorS(BuscarCobradorS value) {
        return new JAXBElement<BuscarCobradorS>(_BuscarCobradorS_QNAME, BuscarCobradorS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCobradorSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarCobradorSResponse")
    public JAXBElement<BuscarCobradorSResponse> createBuscarCobradorSResponse(BuscarCobradorSResponse value) {
        return new JAXBElement<BuscarCobradorSResponse>(_BuscarCobradorSResponse_QNAME, BuscarCobradorSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDetalleFacturaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarDetalleFacturaS")
    public JAXBElement<BuscarDetalleFacturaS> createBuscarDetalleFacturaS(BuscarDetalleFacturaS value) {
        return new JAXBElement<BuscarDetalleFacturaS>(_BuscarDetalleFacturaS_QNAME, BuscarDetalleFacturaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDetalleFacturaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarDetalleFacturaSResponse")
    public JAXBElement<BuscarDetalleFacturaSResponse> createBuscarDetalleFacturaSResponse(BuscarDetalleFacturaSResponse value) {
        return new JAXBElement<BuscarDetalleFacturaSResponse>(_BuscarDetalleFacturaSResponse_QNAME, BuscarDetalleFacturaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDetalleFacturacxcS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarDetalleFacturacxcS")
    public JAXBElement<BuscarDetalleFacturacxcS> createBuscarDetalleFacturacxcS(BuscarDetalleFacturacxcS value) {
        return new JAXBElement<BuscarDetalleFacturacxcS>(_BuscarDetalleFacturacxcS_QNAME, BuscarDetalleFacturacxcS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDetalleFacturacxcSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarDetalleFacturacxcSResponse")
    public JAXBElement<BuscarDetalleFacturacxcSResponse> createBuscarDetalleFacturacxcSResponse(BuscarDetalleFacturacxcSResponse value) {
        return new JAXBElement<BuscarDetalleFacturacxcSResponse>(_BuscarDetalleFacturacxcSResponse_QNAME, BuscarDetalleFacturacxcSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFacturaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarFacturaS")
    public JAXBElement<BuscarFacturaS> createBuscarFacturaS(BuscarFacturaS value) {
        return new JAXBElement<BuscarFacturaS>(_BuscarFacturaS_QNAME, BuscarFacturaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFacturaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarFacturaSResponse")
    public JAXBElement<BuscarFacturaSResponse> createBuscarFacturaSResponse(BuscarFacturaSResponse value) {
        return new JAXBElement<BuscarFacturaSResponse>(_BuscarFacturaSResponse_QNAME, BuscarFacturaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFormaPagoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarFormaPagoS")
    public JAXBElement<BuscarFormaPagoS> createBuscarFormaPagoS(BuscarFormaPagoS value) {
        return new JAXBElement<BuscarFormaPagoS>(_BuscarFormaPagoS_QNAME, BuscarFormaPagoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFormaPagoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarFormaPagoSResponse")
    public JAXBElement<BuscarFormaPagoSResponse> createBuscarFormaPagoSResponse(BuscarFormaPagoSResponse value) {
        return new JAXBElement<BuscarFormaPagoSResponse>(_BuscarFormaPagoSResponse_QNAME, BuscarFormaPagoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMovimientoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarMovimientoS")
    public JAXBElement<BuscarMovimientoS> createBuscarMovimientoS(BuscarMovimientoS value) {
        return new JAXBElement<BuscarMovimientoS>(_BuscarMovimientoS_QNAME, BuscarMovimientoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMovimientoSN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarMovimientoSN")
    public JAXBElement<BuscarMovimientoSN> createBuscarMovimientoSN(BuscarMovimientoSN value) {
        return new JAXBElement<BuscarMovimientoSN>(_BuscarMovimientoSN_QNAME, BuscarMovimientoSN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMovimientoSNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarMovimientoSNResponse")
    public JAXBElement<BuscarMovimientoSNResponse> createBuscarMovimientoSNResponse(BuscarMovimientoSNResponse value) {
        return new JAXBElement<BuscarMovimientoSNResponse>(_BuscarMovimientoSNResponse_QNAME, BuscarMovimientoSNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMovimientoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "buscarMovimientoSResponse")
    public JAXBElement<BuscarMovimientoSResponse> createBuscarMovimientoSResponse(BuscarMovimientoSResponse value) {
        return new JAXBElement<BuscarMovimientoSResponse>(_BuscarMovimientoSResponse_QNAME, BuscarMovimientoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCabeceraFacturaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearCabeceraFacturaS")
    public JAXBElement<CrearCabeceraFacturaS> createCrearCabeceraFacturaS(CrearCabeceraFacturaS value) {
        return new JAXBElement<CrearCabeceraFacturaS>(_CrearCabeceraFacturaS_QNAME, CrearCabeceraFacturaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCabeceraFacturaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearCabeceraFacturaSResponse")
    public JAXBElement<CrearCabeceraFacturaSResponse> createCrearCabeceraFacturaSResponse(CrearCabeceraFacturaSResponse value) {
        return new JAXBElement<CrearCabeceraFacturaSResponse>(_CrearCabeceraFacturaSResponse_QNAME, CrearCabeceraFacturaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDetalleFacturaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearDetalleFacturaS")
    public JAXBElement<CrearDetalleFacturaS> createCrearDetalleFacturaS(CrearDetalleFacturaS value) {
        return new JAXBElement<CrearDetalleFacturaS>(_CrearDetalleFacturaS_QNAME, CrearDetalleFacturaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDetalleFacturaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearDetalleFacturaSResponse")
    public JAXBElement<CrearDetalleFacturaSResponse> createCrearDetalleFacturaSResponse(CrearDetalleFacturaSResponse value) {
        return new JAXBElement<CrearDetalleFacturaSResponse>(_CrearDetalleFacturaSResponse_QNAME, CrearDetalleFacturaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDetalleFacturacxcS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearDetalleFacturacxcS")
    public JAXBElement<CrearDetalleFacturacxcS> createCrearDetalleFacturacxcS(CrearDetalleFacturacxcS value) {
        return new JAXBElement<CrearDetalleFacturacxcS>(_CrearDetalleFacturacxcS_QNAME, CrearDetalleFacturacxcS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDetalleFacturacxcSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearDetalleFacturacxcSResponse")
    public JAXBElement<CrearDetalleFacturacxcSResponse> createCrearDetalleFacturacxcSResponse(CrearDetalleFacturacxcSResponse value) {
        return new JAXBElement<CrearDetalleFacturacxcSResponse>(_CrearDetalleFacturacxcSResponse_QNAME, CrearDetalleFacturacxcSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearFacturaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearFacturaS")
    public JAXBElement<CrearFacturaS> createCrearFacturaS(CrearFacturaS value) {
        return new JAXBElement<CrearFacturaS>(_CrearFacturaS_QNAME, CrearFacturaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearFacturaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearFacturaSResponse")
    public JAXBElement<CrearFacturaSResponse> createCrearFacturaSResponse(CrearFacturaSResponse value) {
        return new JAXBElement<CrearFacturaSResponse>(_CrearFacturaSResponse_QNAME, CrearFacturaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuarioS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearUsuarioS")
    public JAXBElement<CrearUsuarioS> createCrearUsuarioS(CrearUsuarioS value) {
        return new JAXBElement<CrearUsuarioS>(_CrearUsuarioS_QNAME, CrearUsuarioS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuarioSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "crearUsuarioSResponse")
    public JAXBElement<CrearUsuarioSResponse> createCrearUsuarioSResponse(CrearUsuarioSResponse value) {
        return new JAXBElement<CrearUsuarioSResponse>(_CrearUsuarioSResponse_QNAME, CrearUsuarioSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarArticuloS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarArticuloS")
    public JAXBElement<EliminarArticuloS> createEliminarArticuloS(EliminarArticuloS value) {
        return new JAXBElement<EliminarArticuloS>(_EliminarArticuloS_QNAME, EliminarArticuloS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarArticuloSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarArticuloSResponse")
    public JAXBElement<EliminarArticuloSResponse> createEliminarArticuloSResponse(EliminarArticuloSResponse value) {
        return new JAXBElement<EliminarArticuloSResponse>(_EliminarArticuloSResponse_QNAME, EliminarArticuloSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCabeceraFacturaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarCabeceraFacturaS")
    public JAXBElement<EliminarCabeceraFacturaS> createEliminarCabeceraFacturaS(EliminarCabeceraFacturaS value) {
        return new JAXBElement<EliminarCabeceraFacturaS>(_EliminarCabeceraFacturaS_QNAME, EliminarCabeceraFacturaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCabeceraFacturaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarCabeceraFacturaSResponse")
    public JAXBElement<EliminarCabeceraFacturaSResponse> createEliminarCabeceraFacturaSResponse(EliminarCabeceraFacturaSResponse value) {
        return new JAXBElement<EliminarCabeceraFacturaSResponse>(_EliminarCabeceraFacturaSResponse_QNAME, EliminarCabeceraFacturaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCiudadS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarCiudadS")
    public JAXBElement<EliminarCiudadS> createEliminarCiudadS(EliminarCiudadS value) {
        return new JAXBElement<EliminarCiudadS>(_EliminarCiudadS_QNAME, EliminarCiudadS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCiudadSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarCiudadSResponse")
    public JAXBElement<EliminarCiudadSResponse> createEliminarCiudadSResponse(EliminarCiudadSResponse value) {
        return new JAXBElement<EliminarCiudadSResponse>(_EliminarCiudadSResponse_QNAME, EliminarCiudadSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarClienteS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarClienteS")
    public JAXBElement<EliminarClienteS> createEliminarClienteS(EliminarClienteS value) {
        return new JAXBElement<EliminarClienteS>(_EliminarClienteS_QNAME, EliminarClienteS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarClienteSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarClienteSResponse")
    public JAXBElement<EliminarClienteSResponse> createEliminarClienteSResponse(EliminarClienteSResponse value) {
        return new JAXBElement<EliminarClienteSResponse>(_EliminarClienteSResponse_QNAME, EliminarClienteSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCobradorS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarCobradorS")
    public JAXBElement<EliminarCobradorS> createEliminarCobradorS(EliminarCobradorS value) {
        return new JAXBElement<EliminarCobradorS>(_EliminarCobradorS_QNAME, EliminarCobradorS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCobradorSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarCobradorSResponse")
    public JAXBElement<EliminarCobradorSResponse> createEliminarCobradorSResponse(EliminarCobradorSResponse value) {
        return new JAXBElement<EliminarCobradorSResponse>(_EliminarCobradorSResponse_QNAME, EliminarCobradorSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleFacturaS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarDetalleFacturaS")
    public JAXBElement<EliminarDetalleFacturaS> createEliminarDetalleFacturaS(EliminarDetalleFacturaS value) {
        return new JAXBElement<EliminarDetalleFacturaS>(_EliminarDetalleFacturaS_QNAME, EliminarDetalleFacturaS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleFacturaSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarDetalleFacturaSResponse")
    public JAXBElement<EliminarDetalleFacturaSResponse> createEliminarDetalleFacturaSResponse(EliminarDetalleFacturaSResponse value) {
        return new JAXBElement<EliminarDetalleFacturaSResponse>(_EliminarDetalleFacturaSResponse_QNAME, EliminarDetalleFacturaSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleFacturacxcS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarDetalleFacturacxcS")
    public JAXBElement<EliminarDetalleFacturacxcS> createEliminarDetalleFacturacxcS(EliminarDetalleFacturacxcS value) {
        return new JAXBElement<EliminarDetalleFacturacxcS>(_EliminarDetalleFacturacxcS_QNAME, EliminarDetalleFacturacxcS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleFacturacxcSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarDetalleFacturacxcSResponse")
    public JAXBElement<EliminarDetalleFacturacxcSResponse> createEliminarDetalleFacturacxcSResponse(EliminarDetalleFacturacxcSResponse value) {
        return new JAXBElement<EliminarDetalleFacturacxcSResponse>(_EliminarDetalleFacturacxcSResponse_QNAME, EliminarDetalleFacturacxcSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarFormaPagoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarFormaPagoS")
    public JAXBElement<EliminarFormaPagoS> createEliminarFormaPagoS(EliminarFormaPagoS value) {
        return new JAXBElement<EliminarFormaPagoS>(_EliminarFormaPagoS_QNAME, EliminarFormaPagoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarFormaPagoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarFormaPagoSResponse")
    public JAXBElement<EliminarFormaPagoSResponse> createEliminarFormaPagoSResponse(EliminarFormaPagoSResponse value) {
        return new JAXBElement<EliminarFormaPagoSResponse>(_EliminarFormaPagoSResponse_QNAME, EliminarFormaPagoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarMovimientoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarMovimientoS")
    public JAXBElement<EliminarMovimientoS> createEliminarMovimientoS(EliminarMovimientoS value) {
        return new JAXBElement<EliminarMovimientoS>(_EliminarMovimientoS_QNAME, EliminarMovimientoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarMovimientoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "eliminarMovimientoSResponse")
    public JAXBElement<EliminarMovimientoSResponse> createEliminarMovimientoSResponse(EliminarMovimientoSResponse value) {
        return new JAXBElement<EliminarMovimientoSResponse>(_EliminarMovimientoSResponse_QNAME, EliminarMovimientoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarArticuloS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarArticuloS")
    public JAXBElement<InsertarArticuloS> createInsertarArticuloS(InsertarArticuloS value) {
        return new JAXBElement<InsertarArticuloS>(_InsertarArticuloS_QNAME, InsertarArticuloS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarArticuloSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarArticuloSResponse")
    public JAXBElement<InsertarArticuloSResponse> createInsertarArticuloSResponse(InsertarArticuloSResponse value) {
        return new JAXBElement<InsertarArticuloSResponse>(_InsertarArticuloSResponse_QNAME, InsertarArticuloSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCiudadS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarCiudadS")
    public JAXBElement<InsertarCiudadS> createInsertarCiudadS(InsertarCiudadS value) {
        return new JAXBElement<InsertarCiudadS>(_InsertarCiudadS_QNAME, InsertarCiudadS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCiudadSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarCiudadSResponse")
    public JAXBElement<InsertarCiudadSResponse> createInsertarCiudadSResponse(InsertarCiudadSResponse value) {
        return new JAXBElement<InsertarCiudadSResponse>(_InsertarCiudadSResponse_QNAME, InsertarCiudadSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarClienteS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarClienteS")
    public JAXBElement<InsertarClienteS> createInsertarClienteS(InsertarClienteS value) {
        return new JAXBElement<InsertarClienteS>(_InsertarClienteS_QNAME, InsertarClienteS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarClienteSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarClienteSResponse")
    public JAXBElement<InsertarClienteSResponse> createInsertarClienteSResponse(InsertarClienteSResponse value) {
        return new JAXBElement<InsertarClienteSResponse>(_InsertarClienteSResponse_QNAME, InsertarClienteSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCobradorS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarCobradorS")
    public JAXBElement<InsertarCobradorS> createInsertarCobradorS(InsertarCobradorS value) {
        return new JAXBElement<InsertarCobradorS>(_InsertarCobradorS_QNAME, InsertarCobradorS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCobradorSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarCobradorSResponse")
    public JAXBElement<InsertarCobradorSResponse> createInsertarCobradorSResponse(InsertarCobradorSResponse value) {
        return new JAXBElement<InsertarCobradorSResponse>(_InsertarCobradorSResponse_QNAME, InsertarCobradorSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarFormaPagoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarFormaPagoS")
    public JAXBElement<InsertarFormaPagoS> createInsertarFormaPagoS(InsertarFormaPagoS value) {
        return new JAXBElement<InsertarFormaPagoS>(_InsertarFormaPagoS_QNAME, InsertarFormaPagoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarFormaPagoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarFormaPagoSResponse")
    public JAXBElement<InsertarFormaPagoSResponse> createInsertarFormaPagoSResponse(InsertarFormaPagoSResponse value) {
        return new JAXBElement<InsertarFormaPagoSResponse>(_InsertarFormaPagoSResponse_QNAME, InsertarFormaPagoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarMovimientoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarMovimientoS")
    public JAXBElement<InsertarMovimientoS> createInsertarMovimientoS(InsertarMovimientoS value) {
        return new JAXBElement<InsertarMovimientoS>(_InsertarMovimientoS_QNAME, InsertarMovimientoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarMovimientoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "insertarMovimientoSResponse")
    public JAXBElement<InsertarMovimientoSResponse> createInsertarMovimientoSResponse(InsertarMovimientoSResponse value) {
        return new JAXBElement<InsertarMovimientoSResponse>(_InsertarMovimientoSResponse_QNAME, InsertarMovimientoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarArticuloS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarArticuloS")
    public JAXBElement<ListarArticuloS> createListarArticuloS(ListarArticuloS value) {
        return new JAXBElement<ListarArticuloS>(_ListarArticuloS_QNAME, ListarArticuloS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarArticuloSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarArticuloSResponse")
    public JAXBElement<ListarArticuloSResponse> createListarArticuloSResponse(ListarArticuloSResponse value) {
        return new JAXBElement<ListarArticuloSResponse>(_ListarArticuloSResponse_QNAME, ListarArticuloSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCiudadS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarCiudadS")
    public JAXBElement<ListarCiudadS> createListarCiudadS(ListarCiudadS value) {
        return new JAXBElement<ListarCiudadS>(_ListarCiudadS_QNAME, ListarCiudadS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCiudadSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarCiudadSResponse")
    public JAXBElement<ListarCiudadSResponse> createListarCiudadSResponse(ListarCiudadSResponse value) {
        return new JAXBElement<ListarCiudadSResponse>(_ListarCiudadSResponse_QNAME, ListarCiudadSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClienteS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarClienteS")
    public JAXBElement<ListarClienteS> createListarClienteS(ListarClienteS value) {
        return new JAXBElement<ListarClienteS>(_ListarClienteS_QNAME, ListarClienteS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClienteSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarClienteSResponse")
    public JAXBElement<ListarClienteSResponse> createListarClienteSResponse(ListarClienteSResponse value) {
        return new JAXBElement<ListarClienteSResponse>(_ListarClienteSResponse_QNAME, ListarClienteSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCobradorS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarCobradorS")
    public JAXBElement<ListarCobradorS> createListarCobradorS(ListarCobradorS value) {
        return new JAXBElement<ListarCobradorS>(_ListarCobradorS_QNAME, ListarCobradorS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCobradorSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarCobradorSResponse")
    public JAXBElement<ListarCobradorSResponse> createListarCobradorSResponse(ListarCobradorSResponse value) {
        return new JAXBElement<ListarCobradorSResponse>(_ListarCobradorSResponse_QNAME, ListarCobradorSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFacturasS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarFacturasS")
    public JAXBElement<ListarFacturasS> createListarFacturasS(ListarFacturasS value) {
        return new JAXBElement<ListarFacturasS>(_ListarFacturasS_QNAME, ListarFacturasS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFacturasSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarFacturasSResponse")
    public JAXBElement<ListarFacturasSResponse> createListarFacturasSResponse(ListarFacturasSResponse value) {
        return new JAXBElement<ListarFacturasSResponse>(_ListarFacturasSResponse_QNAME, ListarFacturasSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormaPagoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarFormaPagoS")
    public JAXBElement<ListarFormaPagoS> createListarFormaPagoS(ListarFormaPagoS value) {
        return new JAXBElement<ListarFormaPagoS>(_ListarFormaPagoS_QNAME, ListarFormaPagoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFormaPagoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarFormaPagoSResponse")
    public JAXBElement<ListarFormaPagoSResponse> createListarFormaPagoSResponse(ListarFormaPagoSResponse value) {
        return new JAXBElement<ListarFormaPagoSResponse>(_ListarFormaPagoSResponse_QNAME, ListarFormaPagoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarMovimientoS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarMovimientoS")
    public JAXBElement<ListarMovimientoS> createListarMovimientoS(ListarMovimientoS value) {
        return new JAXBElement<ListarMovimientoS>(_ListarMovimientoS_QNAME, ListarMovimientoS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarMovimientoSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "listarMovimientoSResponse")
    public JAXBElement<ListarMovimientoSResponse> createListarMovimientoSResponse(ListarMovimientoSResponse value) {
        return new JAXBElement<ListarMovimientoSResponse>(_ListarMovimientoSResponse_QNAME, ListarMovimientoSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "loginS")
    public JAXBElement<LoginS> createLoginS(LoginS value) {
        return new JAXBElement<LoginS>(_LoginS_QNAME, LoginS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios.prj_grupo3_server/", name = "loginSResponse")
    public JAXBElement<LoginSResponse> createLoginSResponse(LoginSResponse value) {
        return new JAXBElement<LoginSResponse>(_LoginSResponse_QNAME, LoginSResponse.class, null, value);
    }

}
