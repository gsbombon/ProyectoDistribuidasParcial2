package prj_grupo3_server.Conexion;

import java.util.ArrayList;
import java.util.Scanner;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;
import org.json.*;
import prj_grupo3_server.Modelo.Ciudad;
import prj_grupo3_server.Modelo.Cliente;

public class Conexion {

    static MongoClient mongo = null;
    static DB db;
    static DBCollection col;

    public static void main(String[] args) throws JSONException {
        Conectar();
        listarCiudad();
        listarCliente();
    }

    public static void Conectar() {
        mongo = new MongoClient("localhost", 27017);
        db = mongo.getDB("distribuidas");
    }

    public static void singIn(String user,String pass){
        
    }
    
    public static void insertarCiudad(String codigo, String nombre) throws JSONException {
        col = db.getCollection("Ciudad");
        JSONObject persona;
        persona = new JSONObject();
        persona.put("Codigo_Ciudad", codigo);
        persona.put("Nombre_Ciudad", nombre);
        col.insert((DBObject) JSON.parse(persona.toString()));

    }

    public static void insertarCliente(String ruc, String nombre, String dir) throws JSONException {
        col = db.getCollection("Cliente");

        JSONObject persona;

        persona = new JSONObject();
        persona.put("Ruc_Cliente", ruc);
        persona.put("Nombre_Cliente", nombre);
        persona.put("Direccion_Cliente", dir);
        col.insert((DBObject) JSON.parse(persona.toString()));

    }

    public static void actualizarCiudad(String codigo, String nombre) {

        BasicDBObject query = new BasicDBObject();
        query.put("Codigo_Ciudad", codigo);

        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("Nombre_Ciudad", nombre); // (2)

        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument); // (3)
        db.getCollection("Ciudad").update(query, updateObject);
    }

    public static void actualizarCliente(String ruc, String nombre, String dir) {

        BasicDBObject query = new BasicDBObject();
        query.put("Ruc_Cliente", ruc);

        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("Nombre_Cliente", nombre); // (2)
        newDocument.put("Direccion_Cliente", dir); // (2)

        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument); // (3)
        db.getCollection("Cliente").update(query, updateObject);
    }

    public static void eliminarCiudad(String codigo) {
        col = db.getCollection("Ciudad");
        col.remove(new BasicDBObject().append("Codigo_Ciudad", codigo));
    }

    public static void eliminarCliente(String ruc) {
        col = db.getCollection("Cliente");
        col.remove(new BasicDBObject().append("Ruc_Cliente", ruc));
    }

    public static ArrayList<Ciudad> listarCiudad() {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        col = db.getCollection("Ciudad");
        //BasicDBObject filtro = new BasicDBObject();
        //filtro.getString("Nombre_Cobrador");
        DBCursor cur = col.find();
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";
            n1 = cur.next().get("Codigo_Ciudad") + "";
            n2 = cur.curr().get("Nombre_Ciudad") + "";
            Ciudad ciudad = new Ciudad();
            ciudad.setCodigo_Ciudad(n1);
            ciudad.setNombre_Ciudad(n2);
            System.out.println(ciudad.getCodigo_Ciudad() + "-" + ciudad.getNombre_Ciudad());
            ciudades.add(ciudad);
        }
        return ciudades;
    }

    public static ArrayList<Cliente> listarCliente() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        col = db.getCollection("Cliente");
        DBCursor cur = col.find();
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";
            String n3 = "";
            n1 = cur.next().get("Ruc_Cliente") + "";
            n2 = cur.curr().get("Nombre_Cliente") + "";
            n3 = cur.curr().get("Direccion_Cliente") + "";
            Cliente cli = new Cliente();
            cli.setRuc_Cliente(n1);
            cli.setNombre_Cliente(n2);
            cli.setDireccion_Cliente(n3);
            System.out.println(cli.getRuc_Cliente() + "-" + cli.getNombre_Cliente() + "-" + cli.getDireccion_Cliente());
            clientes.add(cli);
        }
        return clientes;
    }

    public static Ciudad buscarCiudad(String codigo) {
        Ciudad ciudad = new Ciudad();
        col = db.getCollection("Ciudad");
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Codigo_Ciudad", codigo);
        DBCursor cur = col.find(filtro);
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";
            n1 = cur.next().get("Codigo_Ciudad") + "";
            n2 = cur.curr().get("Nombre_Ciudad") + "";
            ciudad.setCodigo_Ciudad(n1);
            ciudad.setNombre_Ciudad(n2);
            System.out.println(ciudad.getCodigo_Ciudad() + "-" + ciudad.getNombre_Ciudad());

        }
        return ciudad;
    }

    public static Cliente buscarCliente(String ruc) {
        Cliente cli = new Cliente();
        col = db.getCollection("Cliente");
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Ruc_Cliente", ruc);
        DBCursor cur = col.find(filtro);
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";
            String n3 = "";
            n1 = cur.next().get("Ruc_Cliente") + "";
            n2 = cur.curr().get("Nombre_Cliente") + "";
            n3 = cur.curr().get("Direccion_Cliente") + "";
            cli.setRuc_Cliente(n1);
            cli.setNombre_Cliente(n2);
            cli.setDireccion_Cliente(n3);
            System.out.println(cli.getRuc_Cliente() + "-" + cli.getNombre_Cliente() + "-" + cli.getDireccion_Cliente());
        }
        return cli;
    }

}
