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
 * @author lizpu
 */
@Entity
public class CabeceraInventario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String numCabecera;
    private String rucCliente;
    private String codCiudad;
    private String fecha;
    
    
    
}
