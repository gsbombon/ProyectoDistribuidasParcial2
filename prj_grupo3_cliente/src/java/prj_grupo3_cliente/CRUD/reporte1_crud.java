package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Ciudad;
import prj_grupo3_server.servicios.Factura;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

@ManagedBean()
@SessionScoped
public class reporte1_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();

    public ArrayList<Factura> facturas = (ArrayList<Factura>) port.listarFacturasS();
    public ArrayList<Ciudad> ciudades = (ArrayList<Ciudad>) port.listarCiudadS();
    public ArrayList<String> listaNombreCiudades = (ArrayList<String>) this.cmbNombreCiudades();

    public String nomCiudad = "";
    public double precioReporte = 0;

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
        cmbNombreCiudades();
    }

    public void listarCiudades() {
        listaNombreCiudades = this.cmbNombreCiudades();
        cmbNombreCiudades();
    }

    public void listarFacturas() {
        facturas = (ArrayList<Factura>) port.listarFacturasS();
        cmbNombreCiudades();
    }
    
    public void precioTotalReporte() {
        for (Factura f : facturas) {
            if (f.getNomCiudad().equals(nomCiudad)) {
                double pFac = Double.parseDouble(f.getTotalFactura().toString());
                precioReporte += pFac;
            }
        }
    }

    public void limpiarForm() {
        this.nomCiudad = "";
        this.precioReporte = 0;
        listarCiudades();
        listarFacturas();  
    }

    public ArrayList<String> cmbNombreCiudades() {
        ArrayList<String> nombresCiudades = new ArrayList<>();
        this.ciudades.forEach((cli) -> {
            nombresCiudades.add(cli.getNombreCiudad());
        });
        return nombresCiudades;
    }

    public reporte1_crud() {
    }

    public ArrayList<String> getListaNombreCiudades() {
        return listaNombreCiudades;
    }

    public void setListaNombreCiudades(ArrayList<String> listaNombreCiudades) {
        this.listaNombreCiudades = listaNombreCiudades;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public double getPrecioReporte() {
        return precioReporte;
    }

    public void setPrecioReporte(double precioReporte) {
        this.precioReporte = precioReporte;
    }

}
