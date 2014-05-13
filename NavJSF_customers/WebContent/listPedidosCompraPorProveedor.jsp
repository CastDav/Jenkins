<%@ page language="java"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Lista de Pedidos Compra</title>
</head>
<!-- begin CSS -->
<link href="css/style.css" type="text/css" rel="stylesheet">

<!-- end CSS -->
<body>
	
		<div id="container"> <!--  div container -->
			<header><!--  di
			<!-- begin navigation -->
			<nav id="navigation">
				<ul>
					<li><a href="#">Inicio</a></li>
					<li><a
						href="listCustomers.jsf">Lista
							De Clientes</a></li>
					<li><a
						href="http://localhost:8080/NavJSF_customers/listProductos.jsf">Lista
							De Productos</a></li>
					<li><a
						href="http://localhost:8080/NavJSF_customers/listProveedores.jsf">Lista
							De Proveedores</a></li>
					<li><a
						href="http://localhost:8080/NavJSF_customers/listPedidosCompra.jsf">Lista
							De Pedidos Compra</a></li>
				
					<li><a
						href="http://localhost:8080/NavJSF_customers/listPedidosVentaAbierto.jsf">Lista
							De Pedidos Ventas Abiertos</a></li>

				</ul>
			
			</nav>
			<!-- end navigation -->
		 </header><!-- div cabecera -->
		 
		  <div class="cuerpo"> <!-- inicio cuerpo --> 
		  
	<f:view>

		<h:dataTable id="pedidoscompras"
			value="#{pedidocompraproveedorList.pedidoscompra}" var="pedidoscompra"
			border="1">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Nº" />
				</f:facet>
				<h:outputText value="#{pedidoscompra.no}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Nombre" />
				</f:facet>
				<h:outputText value="#{pedidoscompra.buyFromContact}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Codigo Localizacion" />
				</f:facet>
				<h:outputText value="#{pedidoscompra.buyFromAddress}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="C.P" />
				</f:facet>
				<h:outputText value="#{pedidoscompra.buyFromCity}" />
			</h:column>

		</h:dataTable>

	</f:view>
	</div><!-- fin cuerpo -->
	
</div><!-- fin contenedor -->
	
</body>
</html>
