/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Cobrador;
import prj_grupo3_server.servicios.DetalleFacturacxc;
import prj_grupo3_server.servicios.Factura;
import prj_grupo3_server.servicios.FormaPago;
import prj_grupo3_server.servicios.ItemFacturacxc;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

/**
 *
 * @author haom_
 */
@ManagedBean()
@SessionScoped
public class hreporte2_crud {
    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();
    
    public ArrayList<Cobrador> cobradores = (ArrayList<Cobrador>) port.listarCobradorS();
    public ArrayList<String> listaNombreCobradores = cmbNombreCobraodres();
    public ArrayList<FormaPago> formapago = (ArrayList<FormaPago>) port.listarFormaPagoS();
    public DetalleFacturacxc detalleFactura;
    public detalleFacturacxc_crud df_crud = new detalleFacturacxc_crud();
    public Factura Factura;
      public ArrayList<String> precioResultString = new ArrayList<>();
    
       public ArrayList<String> cmbNombreCobraodres() {
        ArrayList<String> nombresCobradores = new ArrayList<>();
        this.cobradores.forEach((cli) -> {
            nombresCobradores.add(cli.getNombreCobrador());
        });
        return nombresCobradores;
    }
        public void precioGastadoArticuloCliente(String nomCliente) {
        ArrayList<String> resultArray = new ArrayList<>();
        String result = "0";
        String rucCliente = this.obtenerRucCliente(nomCliente);
        //System.out.println("RUC CLIENTE: " + rucCliente);
        String numFactura = this.obtenerNumFactura(rucCliente);
        //System.out.println("Num Factura: " + numFactura);
        try {
            this.buscarDetalleFactura(numFactura);
            for (Cobrador art : this.cobradores) {
                for (ItemFacturacxc id : this.df_crud.itemsDetalle) {
                    if (id.getCobradorItem().equals(art.getNombreCobrador())) {
                        PrecioReporte pr = new PrecioReporte();
                        System.out.println("BUSCADO :" + art.getNombreCobrador());
                        System.out.println("TRAIDO: " + id.getCobradorItem());
                        result = id.getValorpagarItem();
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
            for (ItemFacturacxc id : this.df_crud.itemsDetalle) {
                if (id.getCobradorItem().equals(nomArticulo)) {
                    //PrecioReporte pr = new PrecioReporte();
                    System.out.println("BUSCADO :" + nomArticulo);
                    System.out.println("TRAIDO: " + id.getCobradorItem());
                    result = id.getValorpagarItem()+"  ";
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
         public void buscarDetalleFactura(String numFactura) {
        detalleFactura = port.buscarDetalleFacturacxcS(numFactura);
        this.df_crud.numCabecera = numFactura;
        this.df_crud.itemsDetalle = (ArrayList<ItemFacturacxc>) detalleFactura.getItemsDetalle();
        this.df_crud.precioTotal = this.precioTotalFactura(this.df_crud.itemsDetalle);
    }
           public double precioTotalFactura(ArrayList<ItemFacturacxc> items) {
        double sum = 0;
        for (ItemFacturacxc i : items) {
            sum += Double.parseDouble(i.getValorpagarItem());
        }
        return sum;
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

    public ArrayList<Cobrador> getCobradores() {
        return cobradores;
    }

    public void setCobradores(ArrayList<Cobrador> cobradores) {
        this.cobradores = cobradores;
    }

    public ArrayList<String> getListaNombreCobradores() {
        return listaNombreCobradores;
    }

    public void setListaNombreCobradores(ArrayList<String> listaNombreCobradores) {
        this.listaNombreCobradores = listaNombreCobradores;
    }

    public ArrayList<FormaPago> getFormapago() {
        return formapago;
    }

    public void setFormapago(ArrayList<FormaPago> formapago) {
        this.formapago = formapago;
    }

    public DetalleFacturacxc getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFacturacxc detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public detalleFacturacxc_crud getDf_crud() {
        return df_crud;
    }

    public void setDf_crud(detalleFacturacxc_crud df_crud) {
        this.df_crud = df_crud;
    }

    public Factura getFactura() {
        return Factura;
    }

    public void setFactura(Factura Factura) {
        this.Factura = Factura;
    }

    public ArrayList<String> getPrecioResultString() {
        return precioResultString;
    }

    public void setPrecioResultString(ArrayList<String> precioResultString) {
        this.precioResultString = precioResultString;
    }
           public String obtenerNumFactura(String rucCliente) {
        String numFactura = "";
        Factura = port.buscarFacturaS(rucCliente);
        numFactura = Factura.getCodFactura();
        return numFactura;
    }

    public String obtenerRucCliente(String nomCliente) {
        String rucCliente = "";
        for (Cobrador c : cobradores) {
            if (c.getNombreCobrador().equals(nomCliente)) {
                rucCliente = c.getCedulaCobrador();
            }
        }
        return rucCliente;
    }
}
