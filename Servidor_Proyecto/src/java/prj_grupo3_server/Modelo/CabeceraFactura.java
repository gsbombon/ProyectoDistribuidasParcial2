
package prj_grupo3_server.Modelo;



public class CabeceraFactura {
    private String numCabecera;
    private String rucCliente;
    private String codCiudad;
    private String fecha;

    public CabeceraFactura() {
    }

    public CabeceraFactura(String numCabecera, String rucCliente, String codCiudad, String fecha) {
        this.numCabecera = numCabecera;
        this.rucCliente = rucCliente;
        this.codCiudad = codCiudad;
        this.fecha = fecha;
    }

    public String getNumCabecera() {
        return numCabecera;
    }

    public void setNumCabecera(String numCabecera) {
        this.numCabecera = numCabecera;
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
