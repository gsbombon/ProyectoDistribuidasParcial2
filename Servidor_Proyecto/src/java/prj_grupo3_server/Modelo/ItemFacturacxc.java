/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_grupo3_server.Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author haom_
 */
public class ItemFacturacxc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String formapagoItem;
    private String cobradorItem;
    private String valorpagarItem;
    private String fechapagoItem;

    public ItemFacturacxc(String formapagoItem, String cobradorItem, String valorpagarItem, String fechapagoItem) {
        this.formapagoItem = formapagoItem;
        this.cobradorItem = cobradorItem;
        this.valorpagarItem = valorpagarItem;
        this.fechapagoItem = fechapagoItem;
    }

    public ItemFacturacxc() {
    }

    public String getFormapagoItem() {
        return formapagoItem;
    }

    public void setFormapagoItem(String formapagoItem) {
        this.formapagoItem = formapagoItem;
    }

    public String getCobradorItem() {
        return cobradorItem;
    }

    public void setCobradorItem(String cobradorItem) {
        this.cobradorItem = cobradorItem;
    }

    public String getValorpagarItem() {
        return valorpagarItem;
    }

    public void setValorpagarItem(String valorpagarItem) {
        this.valorpagarItem = valorpagarItem;
    }

    public String getFechapagoItem() {
        return fechapagoItem;
    }

    public void setFechapagoItem(String fechapagoItem) {
        this.fechapagoItem = fechapagoItem;
    }
    
    public void makePojoFromBson(DBObject bson) {
        BasicDBObject b = (BasicDBObject) bson;
        this.cobradorItem = (String) b.get("Cobrador_Item");
        this.fechapagoItem = (String) b.get("Fechapago_Item");
        this.formapagoItem = (String) b.get("Formapago_Item");
        this.valorpagarItem = (String)b.get("Valorpago_Item");
    }
    
}
