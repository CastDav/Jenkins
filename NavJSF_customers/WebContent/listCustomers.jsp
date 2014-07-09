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

<title>List of Customers</title>
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

		<h:form id="customerList">
			<h:dataTable id="customers" value="#{customerListBean.customers}"
				var="customer" border="1">
				 <h:column>
		    <f:facet name="header">
		     <h:outputText  value="N�"/>
		    </f:facet>
		    <h:outputText value="#{customer.no}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Nombre"/>
		    </f:facet>
		    <h:outputText value="#{customer.name}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Direcci�n"/>
		    </f:facet>
		    <h:outputText value="#{customer.address}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="C�d. Pa�s/Regi�n"/>
		    </f:facet>
		    <h:outputText value="#{customer.countryRegionCode}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="Ciudad"/>
		    </f:facet>
		    <h:outputText value="#{customer.city}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="C.P."/>
		    </f:facet>
				<h:outputText value="#{customer.postCode}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="Grupo Contable Negocio"/>
		    </f:facet>
				<h:outputText value="#{customer.genBusPostingGroup}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="Grupo Contable Cliente"/>
		    </f:facet>
				<h:outputText value="#{customer.customerPostingGroup}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="C�d. T�rminos Pago"/>
		    </f:facet>
		    <h:outputText value="#{customer.paymentTermsCode}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="C�d. Divisa"/>
		    </f:facet>
				<h:outputText value="#{customer.currencyCode}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="Cr�dito"/>
		    </f:facet>
		    <h:outputText value="#{customer.creditAmount}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="Totales en Pedidos Venta"/>
		    </f:facet>
		    <h:outputText value="#{customer.salesLCY}" />
		  </h:column>  

				<!-- Enlace para recoger a usuario -->
				<h:column>
					<f:facet name="header">
						<h:outputText value="Pedidos Venta" />
					</f:facet>
					<h:commandLink id="listList" action="listPedidosVenta"
						actionListener="#{pedidosVentaListBean.selectCliente}">
						<h:outputText id="listlist2" value="Ver" />
						<f:param id="clienteIdss" name="id" value="#{customer.no}" />
					</h:commandLink>

				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Edit" />
					</f:facet>
				 <h:commandLink id="editareditar" 
		    			   action="modificarCliente" 
		    			   actionListener="#{modificarClienteBean.selectCliente}">
		    	<h:outputText value="Editar" />
		    	<f:param id="clienteNo" 
		    			 name="id" 
		    			 value="#{customer.no}" />
		    </h:commandLink>
		  </h:column>
				
			</h:dataTable>
		</h:form>
	</f:view>
	</div> <!-- end cuerpo -->
</div>	<!-- end container -->
</body>
</html>
