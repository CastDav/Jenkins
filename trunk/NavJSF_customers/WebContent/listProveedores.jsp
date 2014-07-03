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

<title>Lista de Proveedores</title>
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
		<h:form id="proveedoresList">
		<h:dataTable id="proveedors"
			value="#{proveedorListBean.suppliers}" var="proveedor" border="1">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Nº" />
				</f:facet>
				<h:outputText value="#{proveedor.no}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Nombre" />
				</f:facet>
				<h:outputText value="#{proveedor.name}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Centro de responsabilidad" />
				</f:facet>
				<h:outputText value="#{proveedor.responsibilityCenter}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Codigo Localizacion" />
				</f:facet>
				<h:outputText value="#{proveedor.locationCode}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Contacto" />
				</f:facet>
				<h:outputText value="#{proveedor.contact}" />
			</h:column>

			<!-- Enlace para recoger a usuario -->
				<h:column>
					<f:facet name="header">
						<h:outputText value="Pedidos Compra" />
					</f:facet>
					<h:commandLink id="listList" action="listPedidosCompra"
						actionListener="#{pedidocompraproveedorList.selectProveedor}">
						<h:outputText value="Ver" />
						<f:param id="proveedorId" name="id" value="#{proveedor.no}" />
					</h:commandLink>

				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Edit" />
					</f:facet>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Delete" />
					</f:facet>
				</h:column>
		</h:dataTable>
	</h:form>
	</f:view>
	</div> <!-- fin cuerpo -->
 </div> <!-- fin container -->
</body>
</html>
