package prj_grupo3_server.Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lizpu
 */
@Entity
public class Articulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Codigo_Articulo;
    private String Nombre_Articulo;
    private String Precio_Articulo;
    private String Stock_Articulo;

    public Articulo() {
    }

    public String getCodigo_Articulo() {
        return Codigo_Articulo;
    }

    public void setCodigo_Articulo(String Codigo_Articulo) {
        this.Codigo_Articulo = Codigo_Articulo;
    }

    public String getNombre_Articulo() {
        return Nombre_Articulo;
    }

    public void setNombre_Articulo(String Nombre_Articulo) {
        this.Nombre_Articulo = Nombre_Articulo;
    }

    public String getPrecio_Articulo() {
        return Precio_Articulo;
    }

    public void setPrecio_Articulo(String Precio_Articulo) {
        this.Precio_Articulo = Precio_Articulo;
    }

    public String getStock_Articulo() {
        return Stock_Articulo;
    }

    public void setStock_Articulo(String Stock_Articulo) {
        this.Stock_Articulo = Stock_Articulo;
    }

  

    

}