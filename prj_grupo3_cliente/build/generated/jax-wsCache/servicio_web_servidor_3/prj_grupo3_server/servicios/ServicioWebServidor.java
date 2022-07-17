
package prj_grupo3_server.servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "servicio_web_servidor", targetNamespace = "http://Servicios.prj_grupo3_server/", wsdlLocation = "http://localhost:8080/prj_grupo3_server/servicio_web_servidor?wsdl")
public class ServicioWebServidor
    extends Service
{

    private final static URL SERVICIOWEBSERVIDOR_WSDL_LOCATION;
    private final static WebServiceException SERVICIOWEBSERVIDOR_EXCEPTION;
    private final static QName SERVICIOWEBSERVIDOR_QNAME = new QName("http://Servicios.prj_grupo3_server/", "servicio_web_servidor");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/prj_grupo3_server/servicio_web_servidor?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOWEBSERVIDOR_WSDL_LOCATION = url;
        SERVICIOWEBSERVIDOR_EXCEPTION = e;
    }

    public ServicioWebServidor() {
        super(__getWsdlLocation(), SERVICIOWEBSERVIDOR_QNAME);
    }

    public ServicioWebServidor(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOWEBSERVIDOR_QNAME, features);
    }

    public ServicioWebServidor(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOWEBSERVIDOR_QNAME);
    }

    public ServicioWebServidor(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOWEBSERVIDOR_QNAME, features);
    }

    public ServicioWebServidor(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioWebServidor(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioServer
     */
    @WebEndpoint(name = "ServicioServerPort")
    public ServicioServer getServicioServerPort() {
        return super.getPort(new QName("http://Servicios.prj_grupo3_server/", "ServicioServerPort"), ServicioServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioServer
     */
    @WebEndpoint(name = "ServicioServerPort")
    public ServicioServer getServicioServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios.prj_grupo3_server/", "ServicioServerPort"), ServicioServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOWEBSERVIDOR_EXCEPTION!= null) {
            throw SERVICIOWEBSERVIDOR_EXCEPTION;
        }
        return SERVICIOWEBSERVIDOR_WSDL_LOCATION;
    }

}