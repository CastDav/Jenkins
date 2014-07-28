package com.ual.ais;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.net.*; 

import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;
import javax.xml.namespace.QName; 

import schemas.dynamics.microsoft.nav.system.*; 
import schemas.dynamics.microsoft.page.product.*; 



public class NuevoPedido {

// ------------------------- Properties ---------------------------
private Collection<schemas.dynamics.microsoft.page.product.Product> productos;
private String clienteNo;
private String numUnidades;
// ------------------------- Getter and Setter --------------------
public NuevoPedido(){
loadProductosFromNAVWS();
}
/**
* @return collection of productos
*/
public void selectCliente(ActionEvent event){
UIParameter component = (UIParameter) event.getComponent().findComponent("clienteIds");
this.clienteNo=component.getValue().toString();
}

public String getNumUnidades(){
return numUnidades;
}
public String getClienteNo(){
	System.out.println("cliente"+clienteNo);
return clienteNo;
}
public void setNumUnidades(String newValue){
this.numUnidades=newValue;
}
public Collection<Product> getProductos(){	
return productos;
}
public void borrarUnidades(){
for(Product prod:productos){
//prod.setNumUnidades("");
}
}
public final void loadProductosFromNAVWS (){
try { 
   String baseURL = "http://localhost:7047/DynamicsNAV/WS/";
   URL systemServiceURL = new URL(baseURL + "SystemService"); 
   QName systemServiceQName = new QName("urn:microsoft-dynamics-schemas/nav/system/", "SystemService"); 
   SystemService systemService = new SystemService(systemServiceURL, systemServiceQName); 
   SystemServicePort systemPort = systemService.getSystemServicePort(); 
   List<String> companies = systemPort.companies(); 
   
   String cur = companies.get(0); 
   URL productosPageURL = new URL(baseURL+URLEncoder.encode(cur,"UTF-8").replace("+","%20")+"/Page/Product"); 
   QName productosPageQName = new QName("urn:microsoft-dynamics-schemas/page/product", "Product_Service"); 

   
   ProductService productosService = new ProductService(productosPageURL, productosPageQName); 
   ProductPort productPort = productosService.getProductPort();
   
   // Añadimos un filtro de ejemplo 
   List<ProductFilter> filters = new ArrayList<ProductFilter>();

   schemas.dynamics.microsoft.page.product.ProductList productWSList = productPort.readMultiple(filters, null, 0);
   productos = productWSList.getProduct();
}
  catch (Exception e) {
// TODO: handle exception
}
}

}

