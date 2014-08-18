<%@ page language="java" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
	<base href="<%=basePath%>">

	<title>Lista Pedidos Venta</title>
</head>
 <!-- begin CSS -->
<link href="css/style.css" type="text/css" rel="stylesheet">

<!-- end CSS -->
<body>
	
		<div id="container">
	
	<header>
			

<!-- begin navigation -->
			
						<nav id="navigationCliente">
				<ul>
					<li><a href="#">Inicio</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/listProductos.jsf">Lista De Productos</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/carrito.jsf">Carrito</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/listPedidosVentaCliente2.jsf">Consultar Pedidos Ventas</a></li>
					</ul>
			
			</nav>
			<!-- end navigation -->
		 </header><!-- div cabecera -->
	 <div class="cuerpo"><!-- inicio cuerpo -->
	<f:view>
	
	
	<h:dataTable id="pedidosventa" 
					 value="#{pedidosVentaListBean.pedidosVentas}" 
					 var="pedidoventa" 
					 styleClass="order-table"
    			headerClass="order-table-header"
    			rowClasses="order-table-odd-row,order-table-even-row"
    			cellpadding="10" border="1">   
			
 	 
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Nº"/>
		    </f:facet>
		    <h:outputText value="#{pedidoventa.no}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Direccion venta"/>
		    </f:facet>
		    <h:outputText value="#{pedidoventa.sellToAddress}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Ciudad venta"/>
		    </f:facet>
		    <h:outputText value="#{pedidoventa.sellToCity}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Fecha de envio"/>
		    </f:facet>
		    <h:outputText value="#{pedidoventa.shipmentDate}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Estado"/>
		    </f:facet>
		    <h:outputText value="#{pedidoventa.status}" />
		  </h:column>
		</h:dataTable>	
		
	</f:view>
	</div><!-- fin cuerpo -->
  </div><!-- fin container -->
</body>

</html>
