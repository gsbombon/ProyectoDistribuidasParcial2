package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Articulo;
import prj_grupo3_server.servicios.CabeceraFactura;
import prj_grupo3_server.servicios.Cliente;
import prj_grupo3_server.servicios.DetalleFactura;
import prj_grupo3_server.servicios.ItemFactura;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

@ManagedBean()
@SessionScoped
public class reporte2_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    public ArrayList<Articulo> articulos = (ArrayList<Articulo>) port.listarArticuloS();
    public ArrayList<String> listaNombreArticulo = cmbNombreArticulos();
    public ArrayList<Cliente> clientes = (ArrayList<Cliente>) port.listarClienteS();
    public DetalleFactura detalleFactura;
    public detalleFactura_crud df_crud = new detalleFactura_crud();

    public ArrayList<PrecioReporte> precioResult = new ArrayList<>();
    public ArrayList<String> precioResultString = new ArrayList<>();

    public ArrayList<String> cmbNombreArticulos() {
        ArrayList<String> nombresArticulos = new ArrayList<>();
        this.articulos.forEach((cli) -> {
            nombresArticulos.add(cli.getNombreArticulo());
        });
        return nombresArticulos;
    }

    public ArrayList<String> getListaNombreArticulo() {
        return listaNombreArticulo;
    }

    public void setListaNombreArticulo(ArrayList<String> listaNombreArticulo) {
        this.listaNombreArticulo = listaNombreArticulo;
    }

    public ArrayList<PrecioReporte> getPrecioResult() {
        return precioResult;
    }

    public void setPrecioResult(ArrayList<PrecioReporte> precioResult) {
        this.precioResult = precioResult;
    }

    /*
    public void precioGastadoArticuloCliente(String nomCliente) {
        ArrayList<String> resultArray = new ArrayList<>();
        String result = "0";
        String rucCliente = this.obtenerRucCliente(nomCliente);
        //System.out.println("RUC CLIENTE: " + rucCliente);
        String numFactura = this.obtenerNumFactura(rucCliente);
        //System.out.println("Num Factura: " + numFactura);
        try {
            this.buscarDetalleFactura(numFactura);
            for (Articulo art : this.articulos) {
                for (ItemFactura id : this.df_crud.itemsDetalle) {
                    if (id.getNombreItem().equals(art.getNombre())) {
                        PrecioReporte pr = new PrecioReporte();
                        System.out.println("BUSCADO :" + art.getNombre());
                        System.out.println("TRAIDO: " + id.getNombreItem());
                        result = id.getPrecioTotalItem();
                        //pr.setPrecio(result);
                        System.out.println("RESULT: " + result);
                        //resultArray.add(pr);
                        resultArray.add(result);
                    } else {
                        result = "0";
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("null");
            result = "0";
        }
        //this.precioResult = resultArray;
        this.precioResultString = resultArray;
        for (String p : this.precioResultString) {
            System.out.println("" + p);
        }
        //return resultArray;
    } */
    public void precioGastadoArticuloCliente(String nomCliente) {
        ArrayList<String> resultArray = new ArrayList<>();
        String result = "0";
        String rucCliente = this.obtenerRucCliente(nomCliente);
        //System.out.println("RUC CLIENTE: " + rucCliente);
        String numFactura = this.obtenerNumFactura(rucCliente);
        //System.out.println("Num Factura: " + numFactura);
        try {
            this.buscarDetalleFactura(numFactura);
            for (Articulo art : this.articulos) {
                for (ItemFactura id : this.df_crud.itemsDetalle) {
                    if (id.getNombreItem().equals(art.getNombreArticulo())) {
                        PrecioReporte pr = new PrecioReporte();
                        System.out.println("BUSCADO :" + art.getNombreArticulo());
                        System.out.println("TRAIDO: " + id.getNombreItem());
                        result = id.getPrecioTotalItem();
                        //pr.setPrecio(result);
                        System.out.println("RESULT: " + result);
                        //resultArray.add(pr);
                        resultArray.add(result);

                    } else {
                        result = "0";
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("null");
            result = "0";

        }
        //this.precioResult = resultArray;
        this.precioResultString = resultArray;
        for (String p : this.precioResultString) {
            System.out.println("" + p);
        }
    }

    public String precioArticuloCliente(String nomArticulo, String nomCliente) {
        //ArrayList<String> resultArray = new ArrayList<>();
        String result = "0";
        String rucCliente = this.obtenerRucCliente(nomCliente);
        //System.out.println("RUC CLIENTE: " + rucCliente);
        String numFactura = this.obtenerNumFactura(rucCliente);
        //System.out.println("Num Factura: " + numFactura);
        try {
            this.buscarDetalleFactura(numFactura);
            for (ItemFactura id : this.df_crud.itemsDetalle) {
                if (id.getNombreItem().equals(nomArticulo)) {
                    //PrecioReporte pr = new PrecioReporte();
                    System.out.println("BUSCADO :" + nomArticulo);
                    System.out.println("TRAIDO: " + id.getNombreItem());
                    result = id.getPrecioTotalItem()+"  ";
                    //pr.setPrecio(result);
                    System.out.println("RESULT: " + result);
                    break;
                    //resultArray.add(pr);
                    //resultArray.add(result);

                } else {
                    result = "0";
                }
            }

        } catch (Exception e) {
            System.out.println("null");
            result = "0";

        }
        return result;
    }

    public ArrayList<String> getPrecioResultString() {
        return precioResultString;
    }

    public void setPrecioResultString(ArrayList<String> precioResultString) {
        this.precioResultString = precioResultString;
    }

    public void listarCliente() {
        clientes = (ArrayList<Cliente>) port.listarClienteS();
    }

    public void listarArticulo() {
        articulos = (ArrayList<Articulo>) port.listarArticuloS();
    }

    public void buscarDetalleFactura(String numFactura) {
        detalleFactura = port.buscarDetalleFacturaS(numFactura);
        this.df_crud.numCabecera = numFactura;
        this.df_crud.itemsDetalle = (ArrayList<ItemFactura>) detalleFactura.getItemsDetalle();
        this.df_crud.precioTotal = this.precioTotalFactura(this.df_crud.itemsDetalle);
    }

    public double precioTotalFactura(ArrayList<ItemFactura> items) {
        double sum = 0;
        for (ItemFactura i : items) {
            sum += Double.parseDouble(i.getPrecioTotalItem());
        }
        return sum;
    }

    public String obtenerNumFactura(String rucCliente) {
        String numFactura = "";
        CabeceraFactura cf = new CabeceraFactura();
        cf = port.buscarCabeceraFacturaPorRucS(rucCliente);
        numFactura = cf.getNumCabecera();
        return numFactura;
    }

    public String obtenerRucCliente(String nomCliente) {
        String rucCliente = "";
        for (Cliente c : clientes) {
            if (c.getNombreCliente().equals(nomCliente)) {
                rucCliente = c.getRucCliente();
            }
        }
        return rucCliente;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public reporte2_crud() {
    }

}
