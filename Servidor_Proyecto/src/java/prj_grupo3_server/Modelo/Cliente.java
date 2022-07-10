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
public class Cliente implements Serializable  {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String Ruc_Cliente;
   private String Nombre_Cliente;
   private String Direccion_Cliente;


   public Cliente() {
   }

    public Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuc_Cliente() {
        return Ruc_Cliente;
    }

    public void setRuc_Cliente(String Ruc_Cliente) {
        this.Ruc_Cliente = Ruc_Cliente;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public String getDireccion_Cliente() {
        return Direccion_Cliente;
    }

    public void setDireccion_Cliente(String Direccion_Cliente) {
        this.Direccion_Cliente = Direccion_Cliente;
    }

   

    
  
}
