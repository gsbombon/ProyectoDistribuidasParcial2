package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Articulo;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;




@ManagedBean()
@SessionScoped
public class articulo_crud {
    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public String codigo = "";
    public String nombre = "";
    public String precio = "";
    public String cantidad = "";
    public String mensaje = "";
    public ArrayList<Articulo> articulos = (ArrayList<Articulo>) port.listarArticuloS();
    public ArrayList<String> listaNombreArticulo = (ArrayList<String>) this.cmbNombreArticulos();
    public Articulo articulo;


    public ArrayList<String> getListaNombreArticulo() {
        return listaNombreArticulo;
    }

    public void setListaNombreArticulo(ArrayList<String> listaNombreArticulo) {
        this.listaNombreArticulo = listaNombreArticulo;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
     
     
     public void setArticulo(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    

    public articulo_crud() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    

    public void insertarArticulo()      
    {
    int resultado;
        try {
            resultado = port.insertarArticuloS(codigo, nombre, precio, cantidad);
            if (resultado == 1) {
                mensaje = "Se insertó satisfactoriamente";
                this.listarArticulo();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }
    
    public void limpiarFormulario(){
        codigo="";
        nombre="";
        precio="";
        cantidad="";
    }
    
    public void eliminarArticulo()      
    {
    int resultado;
        try {
            resultado = port.eliminarArticuloS(codigo);
            if (resultado == 1) {
                mensaje = "Se elimino satisfactoriamente";
                this.listarArticulo();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo eliminar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo eliminar";
        }
    }
    
    public void actualizarArticulo()      
    {
    int resultado;
        try {
            resultado = port.actualizarArticuloS(codigo, nombre, precio, cantidad);
            if (resultado == 1) {
                mensaje = "Se actualizo satisfactoriamente";
                this.listarArticulo();
                this.limpiarFormulario();
            } else {
                mensaje = "No se pudo actualizar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo actualizar";
        }
    }
    
    public void listarArticulo()      
    {
        articulos = (ArrayList<Articulo>) port.listarArticuloS();      
    }

    public ArrayList<String> cmbNombreArticulos() {
        ArrayList<String> nombresArticulos = new ArrayList<>();
        this.articulos.forEach((cli) -> {
            nombresArticulos.add(cli.getNombreArticulo());
        });
        return nombresArticulos;
    }

    public void buscarArticulo() {
        articulo = port.buscarArticuloS(codigo);
        nombre = articulo.getNombreArticulo();
        precio =articulo.getPrecioArticulo();
        cantidad = articulo.getStockArticulo();
    }
    public void buscarArticuloN()      
    {
        articulo = port.buscarArticuloSN(nombre);
        nombre = articulo.getNombreArticulo();
        precio =articulo.getPrecioArticulo();
        cantidad = articulo.getStockArticulo();
    }
}