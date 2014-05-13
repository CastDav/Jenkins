/*
 * Created on 21.11.2012
 * Universidad de Almería
 * Ampliación de Ingeniería del Software
 */
package com.ual.ais;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.net.*; 
import java.util.*; 
import javax.xml.namespace.QName; 
import schemas.dynamics.microsoft.nav.system.*; 
import schemas.dynamics.microsoft.page.pedidoscompra.*; 


import javax.faces.context.FacesContext;

/**
 * @author Joaquin Cañadas
 */
public class PedidosCompraList {

	// ------------------------- Properties ---------------------------
	Collection<schemas.dynamics.microsoft.page.pedidoscompra.PedidosCompra> pedidoscompras;

	// ------------------------- Getter and Setter --------------------
	
	public PedidosCompraList(){
		loadPedidosComprasFromNAVWS();
	}
	
	/**
	 * @return collection of pedidoscompras
	 */
	public Collection getPedidosCompras(){		
		return pedidoscompras;
	}
		
	/**
	 * @param pedidoscompras The pedidoscompras to set.
	 */
	public void setBooks(Collection pedidoscompras) {
		this.pedidoscompras = pedidoscompras;
	}	
	
	public void loadPedidosComprasFromNAVWS (){
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
		  //filter1.setField(PedidosCompraFields.fromValue("Country_Region_Code")); 
		  //filter1.setCriteria("ES|MY");
		  //filters.add(filter1);

		  
		  schemas.dynamics.microsoft.page.pedidoscompra.PedidosCompraList pedidoscompraWSList = pedidoscompraPort.readMultiple(filters, null, 0);
  		  pedidoscompras = pedidoscompraWSList.getPedidosCompra();
		}
  		catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
	}
	

}

