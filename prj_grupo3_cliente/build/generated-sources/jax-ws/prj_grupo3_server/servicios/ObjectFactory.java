
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
    private final static QName _ActualizarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCiudadS");
    private final static QName _ActualizarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCiudadSResponse");
    private final static QName _ActualizarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarClienteS");
    private final static QName _ActualizarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarClienteSResponse");
    private final static QName _ActualizarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCobradorS");
    private final static QName _ActualizarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarCobradorSResponse");
    private final static QName _ActualizarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarFormaPagoS");
    private final static QName _ActualizarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "actualizarFormaPagoSResponse");
    private final static QName _BuscarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCiudadS");
    private final static QName _BuscarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCiudadSResponse");
    private final static QName _BuscarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarClienteS");
    private final static QName _BuscarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarClienteSResponse");
    private final static QName _BuscarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCobradorS");
    private final static QName _BuscarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarCobradorSResponse");
    private final static QName _BuscarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarFormaPagoS");
    private final static QName _BuscarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "buscarFormaPagoSResponse");
    private final static QName _EliminarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCiudadS");
    private final static QName _EliminarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCiudadSResponse");
    private final static QName _EliminarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarClienteS");
    private final static QName _EliminarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarClienteSResponse");
    private final static QName _EliminarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCobradorS");
    private final static QName _EliminarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarCobradorSResponse");
    private final static QName _EliminarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarFormaPagoS");
    private final static QName _EliminarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "eliminarFormaPagoSResponse");
    private final static QName _InsertarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarCiudadS");
    private final static QName _InsertarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarCiudadSResponse");
    private final static QName _InsertarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarClienteS");
    private final static QName _InsertarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarClienteSResponse");
    private final static QName _InsertarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarCobradorS");
    private final static QName _InsertarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarCobradorSResponse");
    private final static QName _InsertarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarFormaPagoS");
    private final static QName _InsertarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "insertarFormaPagoSResponse");
    private final static QName _ListarCiudadS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarCiudadS");
    private final static QName _ListarCiudadSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarCiudadSResponse");
    private final static QName _ListarClienteS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarClienteS");
    private final static QName _ListarClienteSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarClienteSResponse");
    private final static QName _ListarCobradorS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarCobradorS");
    private final static QName _ListarCobradorSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarCobradorSResponse");
    private final static QName _ListarFormaPagoS_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarFormaPagoS");
    private final static QName _ListarFormaPagoSResponse_QNAME = new QName("http://Servicios.prj_grupo3_server/", "listarFormaPagoSResponse");

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
     * Create an instance of {@link Cobrador }
     * 
     */
    public Cobrador createCobrador() {
        return new Cobrador();
    }

    /**
     * Create an instance of {@link Ciudad }
     * 
     */
    public Ciudad createCiudad() {
        return new Ciudad();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
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

}
