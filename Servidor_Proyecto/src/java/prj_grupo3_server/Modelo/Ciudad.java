package prj_grupo3_server.Modelo;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ciudad implements Serializable  {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String Codigo_Ciudad;
   private String Nombre_Ciudad;


   public Ciudad() {
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo_Ciudad() {
        return Codigo_Ciudad;
    }

    public void setCodigo_Ciudad(String Codigo_Ciudad) {
        this.Codigo_Ciudad = Codigo_Ciudad;
    }

    public String getNombre_Ciudad() {
        return Nombre_Ciudad;
    }

    public void setNombre_Ciudad(String Nombre_Ciudad) {
        this.Nombre_Ciudad = Nombre_Ciudad;
    }

   
    
  
}
