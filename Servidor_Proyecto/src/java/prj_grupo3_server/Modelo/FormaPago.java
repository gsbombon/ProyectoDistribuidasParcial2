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
public class FormaPago implements Serializable  {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String Codigo;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
   private String Nombre_FP;

    public FormaPago() {
    }

    public FormaPago(String Nombre_FP) {
        this.Nombre_FP = Nombre_FP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_FP() {
        return Nombre_FP;
    }

    public void setNombre_FP(String Nombre_FP) {
        this.Nombre_FP = Nombre_FP;
    }
   
}
