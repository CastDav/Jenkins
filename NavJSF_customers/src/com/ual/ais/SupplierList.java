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
import schemas.dynamics.microsoft.page.supplier.*; 

import javax.faces.context.FacesContext;

/**
 * @author Joaquin Cañadas
 */
public class SupplierList {

	// ------------------------- Properties ---------------------------
	Collection<schemas.dynamics.microsoft.page.supplier.Supplier> suppliers;

	// ------------------------- Getter and Setter --------------------
	
	public SupplierList(){
		loadSuppliersFromNAVWS();
	}
	
	/**
	 * @return collection of suppliers
	 */
	public Collection getSuppliers(){		
		return suppliers;
	}
		
	/**
	 * @param suppliers The suppliers to set.
	 */
	public void setBooks(Collection suppliers) {
		this.suppliers = suppliers;
	}	
	
	public void loadSuppliersFromNAVWS (){
		try { 
  		  String baseURL = "http://localhost:7047/DynamicsNAV/WS/";
  		  URL systemServiceURL = new URL(baseURL + "SystemService"); 
  		  QName systemServiceQName = new QName("urn:microsoft-dynamics-schemas/nav/system/", "SystemService"); 
  		  SystemService systemService = new SystemService(systemServiceURL, systemServiceQName); 
  		  SystemServicePort systemPort = systemService.getSystemServicePort(); 
  		  List<String> companies = systemPort.companies(); 
  		  
  		  String cur = companies.get(0); 
  		  URL supplierPageURL = new URL(baseURL+URLEncoder.encode(cur,"UTF-8").replace("+","%20")+"/Page/Supplier"); 
  		  QName supplierPageQName = new QName("urn:microsoft-dynamics-schemas/page/supplier", "Supplier_Service"); 

  		  
  		  SupplierService supplierService = new SupplierService(supplierPageURL, supplierPageQName); 
  		  SupplierPort supplierPort = supplierService.getSupplierPort();
  		  
  		  // Añadimos un filtro de ejemplo 
  		  List<SupplierFilter> filters = new ArrayList<SupplierFilter>();
  		  SupplierFilter filter1 = new SupplierFilter(); 
		  filter1.setField(SupplierFields.fromValue("Search_Name")); 
		  filter1.setCriteria("");
		  filters.add(filter1);

		  
		  schemas.dynamics.microsoft.page.supplier.SupplierList supplierWSList = supplierPort.readMultiple(filters, null, 0);
  		  suppliers = supplierWSList.getSupplier();
		}
  		catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
	}
	

}
