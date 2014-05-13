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
import schemas.dynamics.microsoft.page.product.*; 


import javax.faces.context.FacesContext;

/**
 * @author Joaquin Cañadas
 */
public class ProductList {

	// ------------------------- Properties ---------------------------
	Collection<schemas.dynamics.microsoft.page.product.Product> products;

	// ------------------------- Getter and Setter --------------------
	
	public ProductList(){
		loadProductsFromNAVWS();
	}
	
	/**
	 * @return collection of products
	 */
	public Collection getProducts(){		
		return products;
	}
		
	/**
	 * @param products The products to set.
	 */
	public void setBooks(Collection products) {
		this.products = products;
	}	
	
	public void loadProductsFromNAVWS (){
		try { 
  		  String baseURL = "http://localhost:7047/DynamicsNAV/WS/";
  		  URL systemServiceURL = new URL(baseURL + "SystemService"); 
  		  QName systemServiceQName = new QName("urn:microsoft-dynamics-schemas/nav/system/", "SystemService"); 
  		  SystemService systemService = new SystemService(systemServiceURL, systemServiceQName); 
  		  SystemServicePort systemPort = systemService.getSystemServicePort(); 
  		  List<String> companies = systemPort.companies(); 
  		  
  		  String cur = companies.get(0); 
  		  URL productPageURL = new URL(baseURL+URLEncoder.encode(cur,"UTF-8").replace("+","%20")+"/Page/Product"); 
  		  QName productPageQName = new QName("urn:microsoft-dynamics-schemas/page/product", "Product_Service"); 

  		  
  		  ProductService productService = new ProductService(productPageURL, productPageQName); 
  		  ProductPort productPort = productService.getProductPort();
  		  
  		  // Añadimos un filtro de ejemplo 
  		  List<ProductFilter> filters = new ArrayList<ProductFilter>();
  		  ProductFilter filter1 = new ProductFilter(); 
		  //filter1.setField(ProductFields.fromValue("Country_Region_Code")); 
		  //filter1.setCriteria("ES|MY");
		  //filters.add(filter1);

		  
		  schemas.dynamics.microsoft.page.product.ProductList productWSList = productPort.readMultiple(filters, null, 0);
  		  products = productWSList.getProduct();
		}
  		catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
	}
	

}
