package prj_grupo3_server.Conexion;

import com.mongodb.BasicDBList;
import java.util.ArrayList;
import java.util.Scanner;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;
import org.json.*;
import prj_grupo3_server.Modelo.Articulo;
import prj_grupo3_server.Modelo.CabeceraFactura;
import prj_grupo3_server.Modelo.Ciudad;
import prj_grupo3_server.Modelo.Cliente;
import prj_grupo3_server.Modelo.Cobrador;
import prj_grupo3_server.Modelo.DetalleFactura;
import prj_grupo3_server.Modelo.FormaPago;
import prj_grupo3_server.Modelo.ItemFactura;

public class Conexion {

    static MongoClient mongo = null;
    static DB db;
    static DBCollection col;

    public static void main(String[] args) throws JSONException {
        Conectar();
        listarCiudad();
        listarCliente();
        listarCobrador();
    }

    public static void Conectar() {
        mongo = new MongoClient("localhost", 27017);
        db = mongo.getDB("distribuidas");
    }

    public static void singIn(String user, String pass) {
        col = db.getCollection("User");

        JSONObject persona;

        persona = new JSONObject();
        persona.put("User", user);
        persona.put("Pass", pass);
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

    public static void insertarCiudad(String codigo, String nombre) throws JSONException {
        col = db.getCollection("Ciudad");
        JSONObject persona;
        persona = new JSONObject();
        persona.put("Codigo_Ciudad", codigo);
        persona.put("Nombre_Ciudad", nombre);
        col.insert((DBObject) JSON.parse(persona.toString()));

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
    //------------COBRADOR
    //-------INSERTAR----COBRADOR

    public static void insertarCobrador(String cedula, String nombre, String dir) throws JSONException {
        col = db.getCollection("Cobrador");

        JSONObject persona;

        persona = new JSONObject();
        persona.put("Cedula_Cobrador", cedula);
        persona.put("Nombre_Cobrador", nombre);
        persona.put("Direccion_Cobrador", dir);
        col.insert((DBObject) JSON.parse(persona.toString()));

    }
    //-----ACTUALIZAR----COBRADOR

    public static void actualizarCobrador(String cedula, String nombre, String dir) {

        BasicDBObject query = new BasicDBObject();
        query.put("Cedula_Cobrador", cedula);

        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("Nombre_Cobrador", nombre); // (2)
        newDocument.put("Direccion_Cobrador", dir); // (2)

        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument); // (3)
        db.getCollection("Cobrador").update(query, updateObject);
    }
    //------ ELIMINAR----COBRADOR

    public static void eliminarCobrador(String cedula) {
        col = db.getCollection("Cobrador");
        col.remove(new BasicDBObject().append("Cedula_Cobrador", cedula));
    }

    //------- LISTAR----COBRADOR
    public static ArrayList<Cobrador> listarCobrador() {
        ArrayList<Cobrador> cobradores = new ArrayList<>();
        col = db.getCollection("Cobrador");
        //BasicDBObject filtro = new BasicDBObject();
        //filtro.getString("Nombre_Cobrador");
        DBCursor cur = col.find();
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";
            String n3 = "";
            n1 = cur.next().get("Cedula_Cobrador") + "";
            n2 = cur.curr().get("Nombre_Cobrador") + "";
            n3 = cur.curr().get("Direccion_Cobrador") + "";
            Cobrador cobrador = new Cobrador();
            cobrador.setCedula_Cobrador(n1);
            cobrador.setNombre_Cobrador(n2);
            cobrador.setDireccion_Cobrador(n3);
            System.out.println(cobrador.getCedula_Cobrador() + "-" + cobrador.getNombre_Cobrador() + "-" + cobrador.getDireccion_Cobrador());
            cobradores.add(cobrador);
        }
        return cobradores;
    }

    //---------- BUSCAR----COBRADOR
    public static Cobrador buscarCobrador(String codigo) {
        Cobrador cobrador = new Cobrador();
        col = db.getCollection("Cobrador");
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Cedula_Cobrador", codigo);
        DBCursor cur = col.find(filtro);
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";
            String n3 = "";
            n1 = cur.next().get("Cedula_Cobrador") + "";
            n2 = cur.curr().get("Nombre_Cobrador") + "";
            n3 = cur.curr().get("Direccion_Cobrador") + "";
            cobrador.setCedula_Cobrador(n1);
            cobrador.setNombre_Cobrador(n2);
            cobrador.setDireccion_Cobrador(n3);
            System.out.println(cobrador.getCedula_Cobrador() + "-" + cobrador.getNombre_Cobrador() + "-" + cobrador.getDireccion_Cobrador());

        }
        return cobrador;
    }

    //------------FORMA PAGO
    //-------INSERTAR------FORMA PAGO
    public static void insertarFormaPago(String codigo, String nombre) throws JSONException {
        col = db.getCollection("Forma_Pago");
        JSONObject persona;
        persona = new JSONObject();
        persona.put("Codigo_FP", codigo);
        persona.put("Nombre_FP", nombre);
        col.insert((DBObject) JSON.parse(persona.toString()));

    }
    //-----ACTUALIZAR------FORMA PAGO

    public static void actualizarFormaPago(String codigo, String nombre) {

        BasicDBObject query = new BasicDBObject();
        query.put("Codigo_FP", codigo);

        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("Nombre_FP", nombre); // (2)

        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument); // (3)
        db.getCollection("Forma_Pago").update(query, updateObject);
    }
    //------ ELIMINAR------FORMA PAGO

    public static void eliminarFormaPago(String codigo) {
        col = db.getCollection("Forma_Pago");
        col.remove(new BasicDBObject().append("Codigo_FP", codigo));
    }

    //------- LISTAR------FORMA PAGO
    public static ArrayList<FormaPago> listarFormaPago() {
        ArrayList<FormaPago> formapago = new ArrayList<>();
        col = db.getCollection("Forma_Pago");
        //BasicDBObject filtro = new BasicDBObject();
        //filtro.getString("Nombre_Cobrador");
        DBCursor cur = col.find();
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";

            n1 = cur.next().get("Codigo_FP") + "";
            n2 = cur.curr().get("Nombre_FP") + "";

            FormaPago FP = new FormaPago();
            FP.setCodigo(n1);
            FP.setNombre_FP(n2);

            System.out.println(FP.getCodigo() + "-" + FP.getNombre_FP());
            formapago.add(FP);
        }
        return formapago;
    }

    //---------- BUSCAR------FORMA PAGO
    public static FormaPago buscarFormaPago(String codigo) {
        FormaPago FP = new FormaPago();
        col = db.getCollection("Forma_Pago");
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Codigo_FP", codigo);
        DBCursor cur = col.find(filtro);
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";

            n1 = cur.next().get("Codigo_FP") + "";
            n2 = cur.curr().get("Nombre_FP") + "";

            FP.setCodigo(n1);
            FP.setNombre_FP(n2);

            System.out.println(FP.getCodigo() + "-" + FP.getNombre_FP());

        }
        return FP;
    }

    /**
     * **********ARTICULO***********
     */
    public static void insertarArticulo(String codigo, String nombre, String precio) throws JSONException {
        col = db.getCollection("articulo");

        JSONObject articulo;

        articulo = new JSONObject();
        articulo.put("codigo", codigo);
        articulo.put("nombre", nombre);
        articulo.put("precio", precio);
        col.insert((DBObject) JSON.parse(articulo.toString()));

    }

    public static void actualizarArticulo(String codigo, String nombre, String precio) {

        BasicDBObject query = new BasicDBObject();
        query.put("codigo", codigo);

        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("nombre", nombre); // (2)
        newDocument.put("precio", precio); // (2)

        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument); // (3)
        db.getCollection("articulo").update(query, updateObject);
    }

    public static void eliminarArticulo(String codigo) {
        col = db.getCollection("articulo");
        col.remove(new BasicDBObject().append("codigo", codigo));
    }

    public static Articulo buscarArticulo(String codigo) {
        Articulo art = new Articulo();
        col = db.getCollection("articulo");
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("codigo", codigo);
        DBCursor cur = col.find(filtro);
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";
            String n3 = "";
            n1 = cur.next().get("codigo") + "";
            n2 = cur.curr().get("nombre") + "";
            n3 = cur.curr().get("precio") + "";
            art.setCodigo(n1);
            art.setNombre(n2);
            art.setPrecio(n3);
            System.out.println(art.getCodigo() + "-" + art.getNombre() + "-" + art.getPrecio());
        }
        return art;
    }

    public static ArrayList<Articulo> listarArticulo() {
        ArrayList<Articulo> articulo = new ArrayList<>();
        col = db.getCollection("Articulo");
        DBCursor cur = col.find();
        while (cur.hasNext()) {
            String n1 = "";
            String n2 = "";
            String n3 = "";
            n1 = cur.next().get("Precio_Articulo") + "";
            n2 = cur.curr().get("Nombre_Articulo") + "";
            n3 = cur.curr().get("Precio_Articulo") + "";
            Articulo art = new Articulo();
            art.setCodigo(n1);
            art.setNombre(n2);
            art.setPrecio(n3);
            articulo.add(art);
        }
        return articulo;
    }

    /// CREAR NUEVA DETALLE FACTURA 
    public static void crearDetalleFactura(String numCabecera) throws JSONException {
        col = db.getCollection("DetalleFactura");
        JSONObject cabFactura = new JSONObject();
        cabFactura.put("Numero_Cabecera", numCabecera);
        col.insert((DBObject) JSON.parse(cabFactura.toString()));
    }

    // ELIMINAR CABECERA DETALLE FACTURA
    public static void eliminarDetalleFactura(String numCabecera) {
        col = db.getCollection("DetalleFactura");
        col.remove(new BasicDBObject().append("Numero_Cabecera", numCabecera));
        // ELIMINAR DETALLE CON ESE NUMERO DE CABECERA
    }

    // BUSCAR DETALLE DE LA FACTURA
    public static DetalleFactura buscarDetalleFactura(String numFactura) {

        DetalleFactura detalleFac = new DetalleFactura();
        ItemFactura itFac = new ItemFactura();
        ArrayList<ItemFactura> itemsArray = new ArrayList<>();
        //String items;
        col = db.getCollection("DetalleFactura");
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Numero_Cabecera", numFactura);
        DBCursor cur = col.find(filtro);
        BasicDBObject account = null;
        
        String precioTotalDetalle ="";
        while(cur.hasNext()){
            account = ( BasicDBObject ) cur.next();
            BasicDBList items = ( BasicDBList ) account.get( "Items_Detalle" );
            
            for( Iterator< Object > it = items.iterator(); it.hasNext(); ){
                BasicDBObject dbo = ( BasicDBObject ) it.next();
                ItemFactura item = new ItemFactura();
                item.makePojoFromBson( dbo );
                itemsArray.add(item);
                System.out.println(item.toString());
            }  
            precioTotalDetalle = ""+cur.curr().get("Precio_Total_Detalle");
        }
        
        detalleFac.setNumCabecera(numFactura);
        detalleFac.setItemsDetalle(itemsArray);
        detalleFac.setPrecioTotal(Double.parseDouble(precioTotalDetalle));

        return detalleFac;
    }

    /// CREAR NUEVA CABECERA FACTURA 
    public static void crearCabeceraFactura(String numCabecera, String rucCliente, String nomCiudad, String fecha) throws JSONException {
        col = db.getCollection("CabeceraFactura");
        JSONObject cabFactura = new JSONObject();
        cabFactura.put("Numero_Cabecera", numCabecera);
        cabFactura.put("Ruc_Cliente", rucCliente);
        cabFactura.put("Fecha_Cabecera", fecha);
        cabFactura.put("Nombre_Ciudad", nomCiudad);
        col.insert((DBObject) JSON.parse(cabFactura.toString()));
    }

    // ACTUALIZAR CABECERA FACTURA
    public static void actualizarCabeceraFactura(String numCabecera, String rucCliente, String nomCiudad, String fecha) throws JSONException {
        BasicDBObject query = new BasicDBObject();
        query.put("Numero_Cabecera", numCabecera);

        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("Ruc_Cliente", rucCliente);
        newDocument.put("Nombre_Ciudad", nomCiudad);
        newDocument.put("Fecha_Cabecera", fecha);

        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument); // (3)
        db.getCollection("CabeceraFactura").update(query, updateObject);
    }

    // ELIMINAR CABECERA FACTURA
    public static void eliminarCabeceraFactura(String numCabecera) {
        col = db.getCollection("CabeceraFactura");
        col.remove(new BasicDBObject().append("Numero_Cabecera", numCabecera));
        // ELIMINAR DETALLE CON ESE NUMERO DE CABECERA
    }

    /// BUSCAR FACTURA 
    public static CabeceraFactura buscarCabeceraFactura(String numFactura) {
        CabeceraFactura cabFac = new CabeceraFactura();
        col = db.getCollection("CabeceraFactura");
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Numero_Cabecera", numFactura);
        DBCursor cur = col.find(filtro);
        while (cur.hasNext()) {
            String nFactura = cur.next().get("Numero_Factura") + "";
            String rCliente = cur.curr().get("Ruc_Cliente") + "";
            String fecha = cur.curr().get("Fecha_Cabecera") + "";
            String cCiudad = cur.curr().get("Nombre_Ciudad") + "";

            cabFac.setCodCiudad(cCiudad);
            cabFac.setRucCliente(rCliente);
            cabFac.setFecha(fecha);
            cabFac.setCodCiudad(cCiudad);
        }
        return cabFac;
    }

    // --- CRUD FACTURAS ----- 
    /// CREAR NUEVA FACTURA 
    public static void crearFactura(String numCabecera, String rucCliente,
            String nomCiudad, String fecha, String precioFinal) throws JSONException {
        col = db.getCollection("Factura");
        JSONObject cabFactura = new JSONObject();
        cabFactura.put("Codigo_Factura", numCabecera);
        cabFactura.put("Cliente_Factura", rucCliente);
        cabFactura.put("Fecha_Factura", fecha);
        cabFactura.put("Total_Factura", precioFinal);
        cabFactura.put("Ciudad_Factura", nomCiudad);
        col.insert((DBObject) JSON.parse(cabFactura.toString()));
    }

}
