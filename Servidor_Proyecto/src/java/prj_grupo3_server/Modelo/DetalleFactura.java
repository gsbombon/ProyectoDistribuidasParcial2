package prj_grupo3_server.Modelo;

import java.util.ArrayList;

public class DetalleFactura {
    
    private String numCabecera;
    private ArrayList<Articulo> articulos;
    private double precioTotal;

    public DetalleFactura() {
    }

    public DetalleFactura(String numCabecera, ArrayList<Articulo> articulos, double precioTotal) {
        this.numCabecera = numCabecera;
        this.articulos = articulos;
        this.precioTotal = precioTotal;
    }
    
    
    public String getNumCabecera() {
        return numCabecera;
    }

    public void setNumCabecera(String numCabecera) {
        this.numCabecera = numCabecera;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
    
}
