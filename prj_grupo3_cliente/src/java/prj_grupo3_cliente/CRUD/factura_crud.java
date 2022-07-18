package prj_grupo3_cliente.CRUD;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import prj_grupo3_server.servicios.Articulo;
import prj_grupo3_server.servicios.CabeceraFactura;
import prj_grupo3_server.servicios.Cobrador;
import prj_grupo3_server.servicios.DetalleFacturacxc;
import prj_grupo3_server.servicios.Factura;
import prj_grupo3_server.servicios.FormaPago;
import prj_grupo3_server.servicios.ItemFactura;
import prj_grupo3_server.servicios.ItemFacturacxc;
import prj_grupo3_server.servicios.ServicioServer;
import prj_grupo3_server.servicios.ServicioWebServidor;

@ManagedBean()
@SessionScoped
public class factura_crud {

    private ServicioWebServidor service = new ServicioWebServidor();
    ServicioServer port = service.getServicioServerPort();

    public String codFactura = "";
    public String rucCliente = "";
    public String nomCiudad = "";
    public String fecha = "";
    public String totalFactura = "";
    public String mensaje = "";
    public String mensajeItem = "Esperando...";
    public String mensajeCabecera = "";
    public String mensajeFactura = "";
    public String tipoPago = "";
    
     public Factura Factura;
    public DetalleFacturacxc detalleFactura;
    public detalleFacturacxc_crud df_crud = new detalleFacturacxc_crud();
    
    public ArrayList<Factura> facturas = (ArrayList<Factura>)port.listarFacturasS();
    public ArrayList<String> listaNombreFactura = cmbNombreFactura();
    
    public ArrayList<Cobrador> cobradores = (ArrayList<Cobrador>) port.listarCobradorS();
    public ArrayList<String> listaNombreCobradores = cmbNombreCobradores();
    
    public ArrayList<FormaPago> formapagos = (ArrayList<FormaPago>) port.listarFormaPagoS();
    public ArrayList<String> listaNombreFormaPago = cmbNombreFormaPago();

    public String getMensajeItem() {
        return mensajeItem;
    }

    public void setMensajeItem(String mensajeItem) {
        this.mensajeItem = mensajeItem;
    }

    public String getMensajeCabecera() {
        return mensajeCabecera;
    }

    public void setMensajeCabecera(String mensajeCabecera) {
        this.mensajeCabecera = mensajeCabecera;
    }

    public String getMensajeFactura() {
        return mensajeFactura;
    }

    public void setMensajeFactura(String mensajeFactura) {
        this.mensajeFactura = mensajeFactura;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

   



    public detalleFacturacxc_crud getDf_crud() {
        return df_crud;
    }

    public void setDf_crud(detalleFacturacxc_crud df_crud) {
        this.df_crud = df_crud;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public ArrayList<String> getListaNombreFactura() {
        return listaNombreFactura;
    }

    public void setListaNombreFactura(ArrayList<String> listaNombreFactura) {
        this.listaNombreFactura = listaNombreFactura;
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

    public ArrayList<FormaPago> getFormapagos() {
        return formapagos;
    }

    public void setFormapagos(ArrayList<FormaPago> formapagos) {
        this.formapagos = formapagos;
    }

    public ArrayList<String> getListaNombreFormaPago() {
        return listaNombreFormaPago;
    }

    public void setListaNombreFormaPago(ArrayList<String> listaNombreFormaPago) {
        this.listaNombreFormaPago = listaNombreFormaPago;
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
    
    public cobrador_crud cob_crud = new cobrador_crud();
    public formapago_crud fp_crud = new formapago_crud();
    
    private String formapagoItem;
    private String cobradorItem;
    private String valorpagarItem;
    private String fechapagoItem;
   
    
     public void listarCobrador() {
         cob_crud.cobrador = (ArrayList<Cobrador>) port.listarCobradorS();
      
    }

    public void listarFormaPago() {
        fp_crud.fp =(ArrayList<FormaPago>) port.listarFormaPagoS();
        }

    public void listarFactura() {
        facturas = (ArrayList<Factura>) port.listarFacturasS();
    }
    
     public cobrador_crud getCob_crud() {
        return cob_crud;
    }

    public void setCob_crud(cobrador_crud cob_crud) {
        this.cob_crud = cob_crud;
    }

    public formapago_crud getFp_crud() {
        return fp_crud;
    }

    public void setFp_crud(formapago_crud fp_crud) {
        this.fp_crud = fp_crud;
    }
    
    public ArrayList<String> cmbNombreFactura() {
        ArrayList<String> nombresFactura = new ArrayList<>();
        this.facturas.forEach((cli) -> {
            nombresFactura.add(cli.getCodFactura());
        });
        return nombresFactura;
    }
    public ArrayList<String> cmbNombreCobradores() {
        ArrayList<String> nombresCobradores = new ArrayList<>();
        this.cobradores.forEach((cli) -> {
            nombresCobradores.add(cli.getNombreCobrador());
        });
        return nombresCobradores;
    }
    public ArrayList<String> cmbNombreFormaPago() {
        ArrayList<String> nombresFP = new ArrayList<>();
        this.formapagos.forEach((cli) -> {
            nombresFP.add(cli.getNombreFP());
        });
        return nombresFP;
    }
    
    
    public void crearFactura() {
        int resultado;
        try {
            double sumatoria=0.0;
            detalleFactura_crud dtf = new detalleFactura_crud();
            for(ItemFactura item: dtf.itemsDetalle){
                sumatoria += Double.parseDouble(item.getPrecioTotalItem());
            }
            this.totalFactura = String.valueOf(sumatoria);
            resultado = port.crearFacturaS(codFactura, rucCliente, fecha, nomCiudad, totalFactura);
            if (resultado == 1) {
            } else {
                mensaje = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensaje = "No se pudo insertar";
        }
    }
    
    public void agregarItem() {
        int resultado;
        try {
           
            
            resultado = port.agregarPagaS(codFactura, cobradorItem, fechapagoItem, formapagoItem, valorpagarItem);
            if (resultado == 1) {
                mensajeItem = "Articulo insertado correctamente";
            } else {
                mensajeItem = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensajeItem = "No se pudo insertar";
        }
    }
        public void crearDetalleFacturacxc() {
        int resultado;
        try {
            resultado = port.crearDetalleFacturacxcS(codFactura);
            if (resultado == 1) {
               
                mensajeCabecera = "Creada correctamente";
            } else {
                mensajeCabecera = "No se pudo insertar";
            }
        } catch (Exception ex) {
            mensajeCabecera = "No se pudo insertar";
        }
    }
    
   
     public void buscarFactura() {
        Factura = port.buscarFacturaS(codFactura);
        rucCliente = Factura.getRucCliente();
        nomCiudad = Factura.getNomCiudad();
        fecha = Factura.getFecha();
        totalFactura = String.valueOf(Factura.getTotalFactura());
       try {
            this.buscarDetalleFactura(codFactura);
            mensajeCabecera = " Factura Cargada";
        } catch (Exception e) {
            mensajeCabecera = " No se encontro factura";
            System.out.println("ERROR NULL");
        }
    }
      public void buscarDetalleFactura(String numFactura) {
        detalleFactura = port.buscarDetalleFacturacxcS(numFactura);
        df_crud.numCabecera = numFactura;
        df_crud.itemsDetalle = (ArrayList<ItemFacturacxc>) detalleFactura.getItemsDetalle();
        df_crud.precioTotal = this.precioTotalFactura(df_crud.itemsDetalle);
        
    }
 public double precioTotalFactura(ArrayList<ItemFacturacxc> items) {
        double sum = 0;
        for (ItemFacturacxc i : items) {
           
                sum += Double.parseDouble(i.getCobradorItem());
            
           
        }
        return sum;
    }
 
 public double valorPagar() {
        double total= 0;
        total=Double.parseDouble(totalFactura)-df_crud.precioTotal;
        return total;
    }
    public factura_crud() {
         this.listarCobrador();
         this.listarFormaPago();
         this.listarFactura();
    }

    public factura_crud(String codFactura, String rucCliente, String nomCiudad, String fecha, String totalFactura) {
        this.codFactura = codFactura;
        this.rucCliente = rucCliente;
        this.nomCiudad = nomCiudad;
        this.fecha = fecha;
        this.totalFactura = totalFactura;
         this.listarCobrador();
          this.listarFormaPago();
         this.listarFactura();
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

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(String totalFactura) {
        this.totalFactura = totalFactura;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    

}
