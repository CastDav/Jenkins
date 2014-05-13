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
import schemas.dynamics.microsoft.page.customer.*; 


import javax.faces.context.FacesContext;

/**
 * @author Joaquin Cañadas
 */
public class CustomerList {

	// ------------------------- Properties ---------------------------
	Collection<schemas.dynamics.microsoft.page.customer.Customer> customers;

	// ------------------------- Getter and Setter --------------------
	
	public CustomerList(){
		loadCustomersFromNAVWS();
	}
	
	/**
	 * @return collection of customers
	 */
	public Collection<Customer> getCustomers(){		
		return customers;
	}
		
	
	public void loadCustomersFromNAVWS (){
		try { 
  		  String baseURL = "http://localhost:7047/DynamicsNAV/WS/";
  		  URL systemServiceURL = new URL(baseURL + "SystemService"); 
  		  QName systemServiceQName = new QName("urn:microsoft-dynamics-schemas/nav/system/", "SystemService"); 
  		  SystemService systemService = new SystemService(systemServiceURL, systemServiceQName); 
  		  SystemServicePort systemPort = systemService.getSystemServicePort(); 
  		  List<String> companies = systemPort.companies(); 
  		  
  		  String cur = companies.get(0); 
  		  URL customerPageURL = new URL(baseURL+URLEncoder.encode(cur,"UTF-8").replace("+","%20")+"/Page/Customer"); 
  		  QName customerPageQName = new QName("urn:microsoft-dynamics-schemas/page/customer", "Customer_Service"); 

  		  
  		  CustomerService customerService = new CustomerService(customerPageURL, customerPageQName); 
  		  CustomerPort customerPort = customerService.getCustomerPort();
  		  
  		  // Añadimos un filtro de ejemplo 
  		  List<CustomerFilter> filters = new ArrayList<CustomerFilter>();
  		 // CustomerFilter filter1 = new CustomerFilter(); 
		 // filter1.setField(CustomerFields.fromValue("Country_Region_Code")); 
		  // filter1.setCriteria("ES|MY");
		  //filters.add(filter1);

		  
		  schemas.dynamics.microsoft.page.customer.CustomerList customerWSList = customerPort.readMultiple(filters, null, 0);
  		  customers = customerWSList.getCustomer();
		}
  		catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
	}
	

}
