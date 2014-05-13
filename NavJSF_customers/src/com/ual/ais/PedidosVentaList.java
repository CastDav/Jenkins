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
import schemas.dynamics.microsoft.page.pedidosventa.*; 

import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 * @author Joaquin Cañadas
 */
public class PedidosVentaList {

	// ------------------------- Properties ---------------------------
private Collection<schemas.dynamics.microsoft.page.pedidosventa.PedidosVenta> pedidosventas;

	// ------------------------- Getter and Setter --------------------
	private String clienteBusqueda;
	
		
	public PedidosVentaList(){
		loadPedidosVentasFromNAVWS();
	}
	
	/**
	 * @return collection of pedidosventas
	 */
	public Collection<PedidosVenta> getPedidosVentas(){		
		return pedidosventas;
	}
	public ArrayList getLista(){
		return null;
		
		
	}
		

	
	public void selectCliente(ActionEvent event){
		UIParameter component = (UIParameter) event.getComponent().findComponent("clienteIdss");
		
		this.clienteBusqueda=component.getValue().toString();

		loadPedidosVentasFromNAVWS();
		
	}
	
	public void loadPedidosVentasFromNAVWS (){
		try { 
  		  String baseURL = "http://localhost:7047/DynamicsNAV/WS/";
  		  URL systemServiceURL = new URL(baseURL + "SystemService"); 
  		  QName systemServiceQName = new QName("urn:microsoft-dynamics-schemas/nav/system/", "SystemService"); 
  		  SystemService systemService = new SystemService(systemServiceURL, systemServiceQName); 
  		  SystemServicePort systemPort = systemService.getSystemServicePort(); 
  		  List<String> companies = systemPort.companies(); 
  		  
  		  String cur = companies.get(0); 
  		  URL pedidosventaPageURL = new URL(baseURL+URLEncoder.encode(cur,"UTF-8").replace("+","%20")+"/Page/PedidosVenta"); 
  		  QName pedidosventaPageQName = new QName("urn:microsoft-dynamics-schemas/page/pedidosventa", "PedidosVenta_Service"); 

  		  
  		  PedidosVentaService pedidosventaService = new PedidosVentaService(pedidosventaPageURL, pedidosventaPageQName); 
  		  PedidosVentaPort pedidosventaPort = pedidosventaService.getPedidosVentaPort();
  		  
  		  // Añadimos un filtro de ejemplo 
  		  List<PedidosVentaFilter> filters = new ArrayList<PedidosVentaFilter>();
  		  PedidosVentaFilter filter1 = new PedidosVentaFilter(); 
  		  filter1.setField(PedidosVentaFields.fromValue("Sell_to_Customer_No")); 
		  filter1.setCriteria(this.clienteBusqueda);
		  filters.add(filter1);
  		  
  		  
  		 

		  
		  schemas.dynamics.microsoft.page.pedidosventa.PedidosVentaList pedidosventaWSList = pedidosventaPort.readMultiple(filters, null, 0);
  		  pedidosventas = pedidosventaWSList.getPedidosVenta();
		}
  		catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
	}
	
	
	
	//** copiado de schemas 
	
	 
}
