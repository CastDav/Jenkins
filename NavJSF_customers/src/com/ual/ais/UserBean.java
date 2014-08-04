package com.ual.ais;

import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.namespace.QName;

import schemas.dynamics.microsoft.nav.system.SystemService;
import schemas.dynamics.microsoft.nav.system.SystemServicePort;
import schemas.dynamics.microsoft.page.loginweblist.*;

import java.util.Iterator;


public class UserBean {
	  private String name;
	   private String password;
	   private boolean loggedIn;
	   private String role;
	   private String contact;
	   private String no;
	   private Integer clienteNo;

   public String getName() { return name; }
   public void setName(String newValue) { name = newValue; }
   public Integer getClienteNo() { 
	   return clienteNo; }
   public void setClienteNo(Integer newValue) { clienteNo = newValue; }
   public void setNo(String newValue) { no = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }
   public String getNo() { return no; }


   /**
 * @return the role
 */
public String getRole() {
	return role;
}
/**
 * @param role the role to set
 */
public void setRole(String role) {
	this.role = role;
}
/**
 * @return the contact
 */
public String getContact() {
	return contact;
}
/**
 * @param contact the contact to set
 */
public void setContact(String contact) {
	this.contact = contact;
}
public String login() {
    try {
       doLogin();
     
    }
    catch (Exception ex) {
       return "internalError";
    }

    if (loggedIn && role.equals("_Cliente")){
    	
       return "loginSuccessCliente";
    }else{ 
  	  if (loggedIn && role.equals("_Comercial")){
  		  return "loginSuccessComercial";
  	  }else{ 
  		
  		  return "loginFailure";
  	  }
    }
 }

   public String logout() { 
      loggedIn = false;
      return "login";
   }

   public void doLogin() {
	   	Collection<schemas.dynamics.microsoft.page.loginweblist.LoginWebList> loginWebList;
		try { 
			  
	  		  String baseURL = "http://localhost:7047/DynamicsNAV/WS/";
	  		  URL systemServiceURL = new URL(baseURL + "SystemService"); 
	  		  QName systemServiceQName = new QName("urn:microsoft-dynamics-schemas/nav/system/", "SystemService"); 
	  		  SystemService systemService = new SystemService(systemServiceURL, systemServiceQName); 
	  		  SystemServicePort systemPort = systemService.getSystemServicePort(); 
	  		  List<String> companies = systemPort.companies(); 
	  		  
	  		  String cur = companies.get(0); 
	  		  URL loginWebListPageURL = new URL(baseURL+URLEncoder.encode(cur,"UTF-8").replace("+","%20")+"/Page/LoginWebList"); 
	  		  QName loginWebListPageQName = new QName("urn:microsoft-dynamics-schemas/page/loginweblist", "LoginWebList_Service"); 

	  		  
	  		  LoginWebListService loginWebListService = new LoginWebListService(loginWebListPageURL, loginWebListPageQName); 
	  		  LoginWebListPort loginWebListPort = loginWebListService.getLoginWebListPort();
	  		  
	  		  // Añadimos un filtro de ejemplo 
	  		  List<LoginWebListFilter> filters = new ArrayList<LoginWebListFilter>();
	  		LoginWebListFilter filter1 = new LoginWebListFilter(); 
			  filter1.setField(LoginWebListFields.fromValue("username")); 
			  filter1.setCriteria(name);
			  filters.add(filter1);
			
			  
			  
			  schemas.dynamics.microsoft.page.loginweblist.LoginWebListList loginWebListWSList = loginWebListPort.readMultiple(filters, null, 0);
			  loginWebList = loginWebListWSList.getLoginWebList();
			
		      if (!loginWebList.isEmpty()) {
		    	
		    	  Iterator<schemas.dynamics.microsoft.page.loginweblist.LoginWebList> itr = loginWebList.iterator();
		    	  while(itr.hasNext()){
		    		  schemas.dynamics.microsoft.page.loginweblist.LoginWebList login = itr.next();
		    		  String storedPassword = login.getPassword();                
		          loggedIn = password.equals(storedPassword.trim());
		          this.contact = login.getName();
		          this.role = login.getRole().value();
		          this.clienteNo = login.getClienteNo();
		          this.no = login.getNo();
		    	  }
		      }
		}
	  		catch (Exception e) {
				// TODO: handle exception
	    		e.printStackTrace();
			}
   }
}
