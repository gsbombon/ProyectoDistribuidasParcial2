package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Articulo;
import prj_grupo3_server.servicios.CabeceraFactura;
import prj_grupo3_server.servicios.Ciudad;
import prj_grupo3_server.servicios.Cliente;
import prj_grupo3_server.servicios.DetalleFactura;
import prj_grupo3_server.servicios.ItemFactura;
import prj_grupo3_server.servicios.ServicioWebServidor;
import prj_grupo3_server.servicios.ServicioServer;

@ManagedBean()
@SessionScoped
public class cabeceraFactura_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public String numCabecera = "";
    public String rucCliente = "";
    public String cfCiudad = "";
    public String fecha = "";
    public String mensajeItem = "Esperando...";
    public String mensajeCabecera = "";
    public String mensajeFactura = "";
    public CabeceraFactura cabeceraFactura;
    public DetalleFactura detalleFactura;
    public detalleFactura_crud df_crud = new detalleFactura_crud();
    //public itemFactura_crud if_crud = new itemFactura_crud();
    //public articulo_crud art_crud = new articulo_crud();
    public ArrayList<Articulo> articulos = (ArrayList<Articulo>) port.listarArticuloS();
    public ArrayList<String> listaNombreArticulo = cmbNombreArticulos();

    public cliente_crud cli_crud = new cliente_crud();
    public ciudad_crud ciu_crud = new ciudad_crud();

    public String nombreItem = "";
    public String cantidadItem = "0";
    public String precioItem = "0";
    public String precioTotalItem = "0";

    public void listarCiudad() {
        ciu_crud.ciudades = (ArrayList<Ciudad>) port.listarCiudadS();
    }

    public void listarCliente() {
        cli_crud.clientes = (ArrayList<Cliente>) port.listarClienteS();
    }

    public void listarArticulo() {
        articulos = (ArrayList<Articulo>) port.listarArticuloS();
    }

    public boolean validaCantidadItem() {
        boolean res = false;
        for (Articulo a : articulos) {
            if (a.getNombre().equals(this.nombreItem)) {
                int cantidadDB = Integer.parseInt(a.getCantidad()) ;
                int cantidadSelec = Integer.parseInt(this.cantidadItem) ;
                if (cantidadSelec > cantidadDB) {
                    res = false;
                } else {
                    res = true;
                }
            }
        }
        return res;
    }

    public void crearFactura() {
        int resultado;
        try {
            String precioTotalFactura = String.valueOf(this.precioTotalFactura(df_crud.itemsDetalle));
            resultado = port.crearFacturaS(numCabecera, rucCliente, fecha, cfCiudad, precioTotalFactura);
            if (resultado == 1) {
                this.limpiarForm();
                mensajeFactura = "Factura registrada";
            } else {
                mensajeFactura = "Factura no se puede registrar";
            }
        } catch (Exception ex) {
            mensajeFactura = "No se pudo registrar";
        }
    }

    public String nuevaCantidadItem() {
        int result = 0;
        String resultString = "0";
        for (Articulo a : articulos) {
            if (a.getNombre().equals(this.nombreItem)) {
                int cantidadDB = Integer.parseInt(a.getPrecio());
                int cantidadSelec = Integer.parseInt(this.cantidadItem);
                result = cantidadDB - cantidadSelec;
            }
        }
        resultString = String.valueOf(result);
        return resultString;
    }

    public void actualizarArticulo() {
        try {
            port.actualizarStockArticuloS(nombreItem, this.nuevaCantidadItem());
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

    public ArrayList<String> cmbNombreArticulos() {
        ArrayList<String> nombresArticulos = new ArrayList<>();
        this.articulos.forEach((cli) -> {
            nombresArticulos.add(cli.getNombreArticulo());
        });
        return nombresArticulos;
    }

    public void agregarItem() {
        int resultado;
        try {
            precioItem = String.valueOf(this.obtenerPrecioItem());
            precioTotalItem = String.valueOf(this.ObtenerPrecioTotalItem());

            resultado = port.agregarProductoS(numCabecera, nombreItem, cantidadItem, precioItem, precioTotalItem);
            if (resultado == 1) {
                mensajeItem = "Articulo insertado correctamente";
            } else {
                mensajeItem = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensajeItem = "No se pudo insertar";
        }
    }

    public double obtenerPrecioItem() {
        double result = 0;
        for (Articulo a : articulos) {
            if (a.getNombre().equals(this.nombreItem)) {
                result = Double.parseDouble(a.getPrecio());
            }
        }
        return result;
    }

    public double ObtenerPrecioTotalItem() {
        double precio = Double.parseDouble(this.precioItem);
        double cantidad = Double.parseDouble(this.cantidadItem),
                precioTotal = 0;
        precioTotal = precio * cantidad;

        return precioTotal;
    }

    public void limpiarForm() {
        this.listarArticulo();
        this.listarCiudad();
        this.listarCliente();
        this.cfCiudad = "";
        this.fecha = "";
        this.rucCliente = "";
        this.numCabecera = "";
        this.df_crud.numCabecera = "";
        this.df_crud.precioTotal = 0;
        this.df_crud.itemsDetalle = new ArrayList<>();
        this.nombreItem = "";
        this.cantidadItem = "";
        this.precioItem = "";
        this.precioTotalItem = "";
        this.mensajeCabecera = "";
        this.mensajeFactura = "";
        this.mensajeItem = "";
    }

    public void crearCabeceraFactura() {
        int resultado;
        try {
            resultado = port.crearCabeceraFacturaS(numCabecera, rucCliente, fecha, cfCiudad);
            if (resultado == 1) {
                this.limpiarForm();
                mensajeCabecera = "Creada correctamente";
            } else {
                mensajeCabecera = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensajeCabecera = "No se pudo insertar";
        }
    }

    public void eliminarCabeceraFactura() {
        int resultado;
        try {
            resultado = port.eliminarCabeceraFacturaS(numCabecera);
            if (resultado == 1) {
                this.limpiarForm();
                mensajeCabecera = "Se elimino satisfactoriamente";
            } else {
                mensajeCabecera = "No se pudo eliminar";
            }
        } catch (Exception ex) {
            mensajeCabecera = "No se pudo eliminar";
        }
    }

    public void actualizarCabeceraFactura() {
        int resultado;
        try {
            resultado = port.actualizarCabeceraFacturaS(numCabecera, rucCliente, fecha, cfCiudad);
            if (resultado == 1) {
                this.limpiarForm();
                mensajeCabecera = "Se actualizo satisfactoriamente";
            } else {
                mensajeCabecera = "No se pudo actualizar";
            }
        } catch (Exception ex) {
            mensajeCabecera = "No se pudo actualizar";
        }
    }

    public void buscarCabeceraFactura() {
        cabeceraFactura = port.buscarCabeceraFacturaS(numCabecera);
        rucCliente = cabeceraFactura.getRucCliente();
        cfCiudad = cabeceraFactura.getCodCiudad();
        fecha = cabeceraFactura.getFecha();
        try {
            this.buscarDetalleFactura(numCabecera);
            mensajeCabecera = " Factura Cargada";
        } catch (Exception e) {
            mensajeCabecera = " No se encontro factura";
            System.out.println("ERROR NULL");
        }
    }

    public void buscarDetalleFactura(String numFactura) {
        detalleFactura = port.buscarDetalleFacturaS(numFactura);
        df_crud.numCabecera = numFactura;
        df_crud.itemsDetalle = (ArrayList<ItemFactura>) detalleFactura.getItemsDetalle();
        df_crud.precioTotal = this.precioTotalFactura(df_crud.itemsDetalle);
    }

    public double precioTotalFactura(ArrayList<ItemFactura> items) {
        double sum = 0;
        for (ItemFactura i : items) {
            sum += Double.parseDouble(i.getPrecioTotalItem());
        }
        return sum;
    }

    public ciudad_crud getCiu_crud() {
        return ciu_crud;
    }

    public void setCiu_crud(ciudad_crud ciu_crud) {
        this.ciu_crud = ciu_crud;
    }

    public cliente_crud getCli_crud() {
        return cli_crud;
    }

    public void setCli_crud(cliente_crud cli_crud) {
        this.cli_crud = cli_crud;
    }

    public String getMensajeCabecera() {
        return mensajeCabecera;
    }

    public void setMensajeCabecera(String mensajeCabecera) {
        this.mensajeCabecera = mensajeCabecera;
    }

    public detalleFactura_crud getDf_crud() {
        return df_crud;
    }

    public String getMensajeItem() {
        return mensajeItem;
    }

    public void setMensajeItem(String mensajeItem) {
        this.mensajeItem = mensajeItem;
    }

    public void setDf_crud(detalleFactura_crud df_crud) {
        this.df_crud = df_crud;
    }

    public cabeceraFactura_crud() {
    }

    public cabeceraFactura_crud(String numCabecera, String rucCliente, String codCiudad, String fecha) {
        this.numCabecera = numCabecera;
        this.rucCliente = rucCliente;
        this.cfCiudad = codCiudad;
        this.fecha = fecha;
    }

    public ServicioWebServidor getService() {
        return service;
    }

    public void setService(ServicioWebServidor service) {
        this.service = service;
    }

    public ServicioServer getPort() {
        return port;
    }

    public void setPort(ServicioServer port) {
        this.port = port;
    }

    public String getNumCabecera() {
        return numCabecera;
    }

    public void setNumCabecera(String numCabecera) {
        this.numCabecera = numCabecera;
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    public String getCfCiudad() {
        return cfCiudad;
    }

    public void setCfCiudad(String cfCiudad) {
        this.cfCiudad = cfCiudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getCantidadItem() {
        return cantidadItem;
    }

    public void setCantidadItem(String cantidadItem) {
        this.cantidadItem = cantidadItem;
    }

    public String getPrecioItem() {
        return precioItem;
    }

    public void setPrecioItem(String precioItem) {
        this.precioItem = precioItem;
    }

    public String getPrecioTotalItem() {
        return precioTotalItem;
    }

    public void setPrecioTotalItem(String precioTotalItem) {
        this.precioTotalItem = precioTotalItem;
    }

    public String getMensajeFactura() {
        return mensajeFactura;
    }

    public void setMensajeFactura(String mensajeFactura) {
        this.mensajeFactura = mensajeFactura;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public ArrayList<String> getListaNombreArticulo() {
        return listaNombreArticulo;
    }

    public void setListaNombreArticulo(ArrayList<String> listaNombreArticulo) {
        this.listaNombreArticulo = listaNombreArticulo;
    }

}
