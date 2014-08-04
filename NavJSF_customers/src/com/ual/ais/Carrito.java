package com.ual.ais;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.math.BigDecimal;
import java.net.*; 

import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;
import javax.xml.namespace.QName; 
import javax.xml.ws.Holder;

import schemas.dynamics.microsoft.codeunit.serienextid.SerieNextId;
import schemas.dynamics.microsoft.codeunit.serienextid.SerieNextIdPort;
import schemas.dynamics.microsoft.nav.system.*; 
import schemas.dynamics.microsoft.page.pedidosventa.*;
import schemas.dynamics.microsoft.page.pedidosventaproductos.*;
import schemas.dynamics.microsoft.page.pedidosventaproductos.Type;
import schemas.dynamics.microsoft.page.product.ProductFields;
import schemas.dynamics.microsoft.page.product.ProductFilter;
import schemas.dynamics.microsoft.page.product.ProductPort;
import schemas.dynamics.microsoft.page.product.ProductService;



public class Carrito {

// ------------------------- Properties ---------------------------
private List<schemas.dynamics.microsoft.page.pedidosventaproductos.PedidosVentaProductos> pedidosventaproductos;
private String numeroCliente;
// ------------------------- Getter and Setter --------------------

public Carrito(){
loadProductosPedidosFromNAVWS();
pedidosventaproductos= new ArrayList<PedidosVentaProductos>();
}
/**
* @return collection of customers
*/
public Collection<PedidosVentaProductos> getPedidosVentaProductos(){	
return pedidosventaproductos;
}
public float obtenerTotal(){
float total=0;
if(pedidosventaproductos!=null){
for(PedidosVentaProductos prod: pedidosventaproductos){
total+=(prod.getQuantity().multiply(prod.getUnitPrice())).floatValue();
}
}
return total;
}

public void nuevoProductoCarrito(ActionEvent event){
UIParameter component = (UIParameter) event.getComponent().findComponent("numUnidadess");
UIParameter component1 = (UIParameter) event.getComponent().findComponent("noProducto");
UIParameter component2 = (UIParameter) event.getComponent().findComponent("descProducto");
UIParameter component3 = (UIParameter) event.getComponent().findComponent("precioUnidad");

Boolean yaEstaba = false;
if(pedidosventaproductos==null){
pedidosventaproductos=new ArrayList<PedidosVentaProductos>();
}
for(PedidosVentaProductos prod:pedidosventaproductos){
if(prod.getNo().equals(component1.getValue().toString())){
prod.setQuantity(prod.getQuantity().add(BigDecimal.valueOf(Integer.valueOf(component.getValue().toString()))));
yaEstaba=true;
}
}
if(!yaEstaba){
PedidosVentaProductos nuevoProducto = new PedidosVentaProductos();
nuevoProducto.setDescription(component2.getValue().toString());
nuevoProducto.setNo(component1.getValue().toString());
System.out.println(component.getValue().toString());
nuevoProducto.setQuantity(BigDecimal.valueOf(Integer.valueOf(component.getValue().toString())));
nuevoProducto.setUnitPrice(BigDecimal.valueOf(Integer.valueOf(component3.getValue().toString())));
pedidosventaproductos.add(nuevoProducto);
}
}

public void eliminarProducto(ActionEvent event){
UIParameter component = (UIParameter) event.getComponent().findComponent("noProd");
List<schemas.dynamics.microsoft.page.pedidosventaproductos.PedidosVentaProductos> pedidosventaproductosProv=new ArrayList<PedidosVentaProductos>();
for(PedidosVentaProductos prod:pedidosventaproductos){
if(!prod.getNo().equals(component.getValue().toString())){
pedidosventaproductosProv.add(prod);
}
}
pedidosventaproductos=pedidosventaproductosProv;
}
public void salir(){
pedidosventaproductos=null;
}
public void setCliente(ActionEvent event){
UIParameter component = (UIParameter) event.getComponent().findComponent("clienteIds");
numeroCliente=component.getValue().toString();
}
public int comprobarStock(){
if(pedidosventaproductos.size()==0){
return -1;
}
try{
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
 ProductPort productosPort = productosService.getProductPort();
 
 // Añadimos un filtro de ejemplo 
 List<ProductFilter> filters = new ArrayList<ProductFilter>();
 ProductFilter filter1 = new ProductFilter(); 
 filter1.setField(ProductFields.fromValue("No")); 
 
 
 int i=0;
 boolean fin=false;
while(i<pedidosventaproductos.size() && !fin){
PedidosVentaProductos prod = pedidosventaproductos.get(i);
filters = new ArrayList<ProductFilter>();
filter1 = new ProductFilter(); 
filter1.setField(ProductFields.fromValue("No")); 
filter1.setCriteria(prod.getNo());
   filters.add(filter1);
 
   schemas.dynamics.microsoft.page.product.ProductList productosWSList = productosPort.readMultiple(filters, null, 0);
   if(productosWSList.getProduct().get(0).getInventory().compareTo(prod.getQuantity())==-1){
   	fin=true;
   	return Integer.valueOf(prod.getNo());
   }
   i++;
}
return -1;
}
  catch (Exception e) {
// TODO: handle exception
  System.out.println(e.getMessage());
}
return -1;
}
public boolean hayStock(){
if(pedidosventaproductos.size()==0){
return true;
}
try{
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
 ProductPort productosPort = productosService.getProductPort();
 
 // Añadimos un filtro de ejemplo 
 List<ProductFilter> filters = new ArrayList<ProductFilter>();
 ProductFilter filter1 = new ProductFilter(); 
 filter1.setField(ProductFields.fromValue("No")); 
 
 
 int i=0;
 boolean fin=false;
while(i<pedidosventaproductos.size() && !fin){
PedidosVentaProductos prod = pedidosventaproductos.get(i);
filters = new ArrayList<ProductFilter>();
filter1 = new ProductFilter(); 
filter1.setField(ProductFields.fromValue("No")); 
filter1.setCriteria(prod.getNo());
   filters.add(filter1);
 
   schemas.dynamics.microsoft.page.product.ProductList productosWSList = productosPort.readMultiple(filters, null, 0);
   if(productosWSList.getProduct().get(0).getInventory().compareTo(prod.getQuantity())==-1){
   	fin=true;
   	return true;
   }
   i++;
}
return false;
}
  catch (Exception e) {
// TODO: handle exception
  System.out.println(e.getMessage());
}
return false;
}
public void guardarPedido(){	
try { 
String baseURL = "http://localhost:7047/DynamicsNAV/WS/";
 	 URL systemServiceURL = new URL(baseURL + "SystemService"); 
 	 QName systemServiceQName = new QName("urn:microsoft-dynamics-schemas/nav/system/", "SystemService"); 
 	 SystemService systemService = new SystemService(systemServiceURL, systemServiceQName); 
 	 SystemServicePort systemPort = systemService.getSystemServicePort(); 
 	 List<String> companies = systemPort.companies(); 
 	 
 	 String cur = companies.get(0); 
 	 URL pedidosventaPageURL = new URL(baseURL+URLEncoder.encode(cur,"UTF-8").replace("+","%20")+"/Page/Pedidosventa"); 
 	 QName pedidosventaPageQName = new QName("urn:microsoft-dynamics-schemas/page/pedidosventa", "Pedidosventa_Service"); 

 	 PedidosVentaService pedidosventaService = new  PedidosVentaService(pedidosventaPageURL, pedidosventaPageQName); 
 	 PedidosVentaPort pedidosventaPort = pedidosventaService.getPedidosVentaPort();
 
 	 URL pedidosventaproductosPageURL = new URL(baseURL+URLEncoder.encode(cur,"UTF-8").replace("+","%20")+"/Page/PedidosVentaProductos"); 
 	 QName pedidosventaproductosPageQName = new QName("urn:microsoft-dynamics-schemas/page/pedidosventaproductos", "PedidosVentaProductos_Service"); 

 	 PedidosVentaProductosService pedidosventaproductosService = new PedidosVentaProductosService(pedidosventaproductosPageURL, pedidosventaproductosPageQName); 
 	 PedidosVentaProductosPort pedidosventaproductosPort = pedidosventaproductosService.getPedidosVentaProductosPort();
 	 
 	 URL codeunitURL = new URL( baseURL+URLEncoder.encode(cur,"UTF8").replace("+","%20") +"/Codeunit/serieNextId");
 	 QName codeunitQName = new QName("urn:microsoft-dynamics-schemas/codeunit/serieNextId", "serieNextId");
 	 SerieNextId serieService = new SerieNextId (codeunitURL, codeunitQName); 
 	 SerieNextIdPort nextIdPort = serieService.getSerieNextIdPort();
 	 
 String serieName = "V-PED-1";
 String siguiente = nextIdPort.getNextNoSerie(serieName);
 
PedidosVenta pedids=new PedidosVenta();
pedids.setSellToCustomerNo(numeroCliente);
pedids.setDocumentType(schemas.dynamics.microsoft.page.pedidosventa.DocumentType.ORDER);
Holder<PedidosVenta> hce = new Holder<PedidosVenta>(pedids); 
pedidosventaPort.create(hce);	

 
int linea=10000;
 for(PedidosVentaProductos prod: pedidosventaproductos){
 //prod.setSellToCustomerNo(numeroCliente);
 prod.setLineNo(linea);
 prod.setDocumentNo(siguiente);
 prod.setType(Type.ITEM);
 Holder<PedidosVentaProductos> hcee = new Holder<PedidosVentaProductos>(prod); 
 pedidosventaproductosPort.create(hcee);
 linea+=10000;
 } 
 
}
 	catch (Exception e) {
// TODO: handle exception
 	System.out.println(e.getMessage());

}
}
public final void loadProductosPedidosFromNAVWS (){
}

}