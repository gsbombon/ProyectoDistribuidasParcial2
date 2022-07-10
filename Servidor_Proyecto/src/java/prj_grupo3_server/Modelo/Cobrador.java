/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_grupo3_server.Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author haom_
 */
@Entity
public class Cobrador  implements Serializable{
     @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String Cedula_Cobrador;
   private String Nombre_Cobrador;
   private String Direccion_Cobrador;
   
   public Cobrador() {
   }

    public Cobrador(String Nombre_Cobrador) {
        this.Nombre_Cobrador = Nombre_Cobrador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula_Cobrador() {
        return Cedula_Cobrador;
    }

    public void setCedula_Cobrador(String Cedula_Cobrador) {
        this.Cedula_Cobrador = Cedula_Cobrador;
    }

    public String getNombre_Cobrador() {
        return Nombre_Cobrador;
    }

    public void setNombre_Cobrador(String Nombre_Cobrador) {
        this.Nombre_Cobrador = Nombre_Cobrador;
    }

    public String getDireccion_Cobrador() {
        return Direccion_Cobrador;
    }

    public void setDireccion_Cobrador(String Direccion_Cobrador) {
        this.Direccion_Cobrador = Direccion_Cobrador;
    }
   
   
}
