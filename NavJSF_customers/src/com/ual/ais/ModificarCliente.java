package com.ual.ais;

import java.util.ArrayList;
import java.util.List;
import java.net.*; 

import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;
import javax.xml.namespace.QName; 


import javax.xml.ws.Holder;

import schemas.dynamics.microsoft.nav.system.*; 
import schemas.dynamics.microsoft.page.customer.*; 



public class ModificarCliente {

	// ------------------------- Properties ---------------------------
	private schemas.dynamics.microsoft.page.customer.Customer customer;
	private String nocliente;
	private CustomerPort customerPort;
	// ------------------------- Getter and Setter --------------------

	public ModificarCliente(){
		//loadClienteFromNAVWS();
	}
	
	public void selectCliente(ActionEvent event){
		UIParameter component = (UIParameter) event.getComponent().findComponent("clienteNo");
		
		this.nocliente=component.getValue().toString();

		loadClienteFromNAVWS();
		
	}
	
	
	/**
	 * @return collection of customers
	 */
	public Customer getCustomers(){		
		return customer;
	}
		
	
	public final void loadClienteFromNAVWS (){
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
  		  customerPort = customerService.getCustomerPort();
  		  
  		  // Añadimos un filtro de ejemplo 
  		  List<CustomerFilter> filters = new ArrayList<CustomerFilter>();
  		  CustomerFilter filter1 = new CustomerFilter(); 
		  filter1.setField(CustomerFields.fromValue("No")); 
		  //System.out.println(this.nocliente);
		  filter1.setCriteria(this.nocliente);
		  filters.add(filter1);

		  
		  schemas.dynamics.microsoft.page.customer.CustomerList customerWSList = customerPort.readMultiple(filters, null, 0);
  		  customer = customerWSList.getCustomer().get(0);
		}
  		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void guardarCliente (ActionEvent event){
		UIParameter name = (UIParameter) event.getComponent().findComponent("nameCamb");
		UIParameter contact = (UIParameter) event.getComponent().findComponent("contactCamb");
		UIParameter tel = (UIParameter) event.getComponent().findComponent("telCamb");
		UIParameter fax = (UIParameter) event.getComponent().findComponent("faxCamb");
		UIParameter cp = (UIParameter) event.getComponent().findComponent("codpostalCamb");
		
		customer.setName(name.getValue().toString());
		customer.setContact(contact.getValue().toString());
		customer.setPhoneNo(tel.getValue().toString());
		customer.setFaxNo(fax.getValue().toString());
		customer.setPostCode(cp.getValue().toString());
		
		Holder<Customer> hc = new Holder<Customer>(customer); 
		customerPort.update(hc);
		
	}

	

}