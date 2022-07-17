package prj_grupo3_server.Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemFactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombreItem;
    private String precioItem;
    private String cantidadItem;
    private String precioTotalItem;

    public ItemFactura(String nombreItem, String precioItem, String cantidadItem, String precioTotalItem) {
        this.nombreItem = nombreItem;
        this.precioItem = precioItem;
        this.cantidadItem = cantidadItem;
        this.precioTotalItem = precioTotalItem;
    }

    public ItemFactura() {
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getPrecioItem() {
        return precioItem;
    }

    public void setPrecioItem(String precioItem) {
        this.precioItem = precioItem;
    }

    public String getCantidadItem() {
        return cantidadItem;
    }

    public void setCantidadItem(String cantidadItem) {
        this.cantidadItem = cantidadItem;
    }

    public String getPrecioTotalItem() {
        return precioTotalItem;
    }

    public void setPrecioTotalItem(String precioTotalItem) {
        this.precioTotalItem = precioTotalItem;
    }

    public void makePojoFromBson(DBObject bson) {
        BasicDBObject b = (BasicDBObject) bson;
        this.cantidadItem = (String) b.get("Cantidad_Item");
        this.nombreItem = (String) b.get("Nombre_Item");
        this.precioItem = (String) b.get("Precio_Item");
        this.precioTotalItem = (String)b.get("Precio_Total_Item");
    }
}
