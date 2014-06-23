package com.ual.ais;

import java.util.List;
import java.net.*; 

import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;
import javax.xml.namespace.QName; 


import javax.xml.ws.Holder;

import schemas.dynamics.microsoft.codeunit.serienextid.SerieNextId;
import schemas.dynamics.microsoft.codeunit.serienextid.SerieNextIdPort;
import schemas.dynamics.microsoft.nav.system.*; 
import schemas.dynamics.microsoft.page.customer.*; 



public class NuevoCliente {

	// ------------------------- Properties ---------------------------
	private schemas.dynamics.microsoft.page.customer.Customer customer;
	private CustomerPort customerPort;
	private SerieNextIdPort nextIdPort;
	SerieNextId serieService;
	// ------------------------- Getter and Setter --------------------

	public NuevoCliente(){
		loadClienteFromNAVWS();
		customer= new Customer();
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
		  
		  
  		  URL codeunitURL = new URL( baseURL+URLEncoder.encode(cur,"UTF8").replace("+","%20") +"/Codeunit/serieNextId");
  		  QName codeunitQName = new QName("urn:microsoft-dynamics-schemas/codeunit/serieNextId", "serieNextId");
  		  serieService = new SerieNextId (codeunitURL, codeunitQName); 
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
		UIParameter dir = (UIParameter) event.getComponent().findComponent("dirCamb");
		UIParameter ciu = (UIParameter) event.getComponent().findComponent("ciudadCamb");
		UIParameter cp = (UIParameter) event.getComponent().findComponent("codpostalCamb");
		
		nextIdPort = serieService.getSerieNextIdPort();
		String serieName = "CLIE"; // nombre de la serie de Cliente
		String siguiente = nextIdPort.getNextNoSerie(serieName); 
		System.out.println("Siguiente: ");
		System.out.println(siguiente);
		
		Customer custom=new Customer();
		custom.setName(name.getValue().toString());
		/*custom.setContact(contact.getValue().toString());
		custom.setPhoneNo(tel.getValue().toString());
		custom.setFaxNo(fax.getValue().toString());
		//custom.setAddress(dir.getValue().toString());
		//custom.setCity(ciu.getValue().toString());
		custom.setPostCode(cp.getValue().toString());*/
		Holder<Customer> hce = new Holder<Customer>(custom); 
		customerPort.create(hce);
		
	}

	

}

