package com.ual.ais;

import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;
import javax.xml.namespace.QName;

import schemas.dynamics.microsoft.nav.system.SystemService;
import schemas.dynamics.microsoft.nav.system.SystemServicePort;
import schemas.dynamics.microsoft.page.pedidoscompra.PedidosCompra;
import schemas.dynamics.microsoft.page.pedidoscompra.PedidosCompraFields;
import schemas.dynamics.microsoft.page.pedidoscompra.PedidosCompraFilter;
import schemas.dynamics.microsoft.page.pedidoscompra.PedidosCompraPort;
import schemas.dynamics.microsoft.page.pedidoscompra.PedidosCompraService;


public class PedidocompraproveedorList {

	// ------------------------- Properties ---------------------------
	private Collection<schemas.dynamics.microsoft.page.pedidoscompra.PedidosCompra> pedidoscompra;

	// ------------------------- Getter and Setter --------------------
	public String noproveedor;
	public PedidocompraproveedorList(){
		loadPedidoscompraFromNAVWS();
	}
	
	public void selectProveedor(ActionEvent event){
		UIParameter component = (UIParameter) event.getComponent().findComponent("proveedorId");
		
		this.noproveedor=component.getValue().toString();
		
		loadPedidoscompraFromNAVWS();
		
	}
	
	public String getNoProveedor(){
		return this.noproveedor;
	}
	
	/**
	 * @return collection of pedidoscompra
	 */
	public Collection<PedidosCompra> getPedidoscompra(){		
		return pedidoscompra;
	}
	
	public final void loadPedidoscompraFromNAVWS (){
		try { 
			 String baseURL = "http://localhost:7047/DynamicsNAV/WS/";
	  		  URL systemServiceURL = new URL(baseURL + "SystemService"); 
	  		  QName systemServiceQName = new QName("urn:microsoft-dynamics-schemas/nav/system/", "SystemService"); 
	  		  SystemService systemService = new SystemService(systemServiceURL, systemServiceQName); 
	  		  SystemServicePort systemPort = systemService.getSystemServicePort(); 
	  		  List<String> companies = systemPort.companies(); 
	  		  
	  		  String cur = companies.get(0); 
	  		  URL pedidoscompraPageURL = new URL(baseURL+URLEncoder.encode(cur,"UTF-8").replace("+","%20")+"/Page/PedidosCompra"); 
	  		  QName pedidoscompraPageQName = new QName("urn:microsoft-dynamics-schemas/page/pedidoscompra", "PedidosCompra_Service"); 

	  		  
	  		  PedidosCompraService pedidoscompraService = new PedidosCompraService(pedidoscompraPageURL, pedidoscompraPageQName); 
	  		  PedidosCompraPort pedidoscompraPort = pedidoscompraService.getPedidosCompraPort();

  		  
  		  
  		  // Añadimos un filtro de ejemplo 
	  		  List<PedidosCompraFilter> filters = new ArrayList<PedidosCompraFilter>();
	  		  PedidosCompraFilter filter1 = new PedidosCompraFilter(); 
	  		  filter1.setField(PedidosCompraFields.fromValue("Buy_from_Vendor_No")); 
	  		  filter1.setCriteria(this.noproveedor);
	  		  filters.add(filter1);
		  
		  

		  
		  schemas.dynamics.microsoft.page.pedidoscompra.PedidosCompraList pedidoscompraWSList = pedidoscompraPort.readMultiple(filters, null, 0);
		  pedidoscompra = pedidoscompraWSList.getPedidosCompra();
		}
  		catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
