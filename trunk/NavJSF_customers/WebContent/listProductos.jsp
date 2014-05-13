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

<title>List de productos</title>
</head>
<!-- begin CSS -->
<link href="css/style.css" type="text/css" rel="stylesheet">

<!-- end CSS -->
<body>
	
		<div id="container"> <!--  div cabecera -->
			<header>
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
		 
		 <div class="cuerpo"><!-- inicio cuerpo -->
	<f:view>

		<h:dataTable id="productoss" value="#{productosListBean.products}"
			var="Productos" border="1">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Nº" />
				</f:facet>
				<h:outputText value="#{Productos.no}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Descripción" />
				</f:facet>
				<h:outputText value="#{Productos.description}" />
			</h:column>



			<h:column>
				<f:facet name="header">
					<h:outputText value="base de Unidad de Medida" />
				</f:facet>
				<h:outputText value="#{Productos.baseUnitOfMeasure}" />
			</h:column>




			<h:column>
				<f:facet name="header">
					<h:outputText value="unidad Costo" />
				</f:facet>
				<h:outputText value="#{Productos.unitCost}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Precio unidad" />
				</f:facet>
				<h:outputText value="#{Productos.unitPrice}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Nº Proveedor" />
				</f:facet>
				<h:outputText value="#{Productos.vendorNo}" />
			</h:column>


			


		</h:dataTable>

	</f:view>
	
	</div><!-- fin cuerpo -->
	</div> <!-- fin container -->
</body>
</html>
