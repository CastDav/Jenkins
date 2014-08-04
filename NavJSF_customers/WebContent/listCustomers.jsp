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
<f:loadBundle basename="com.ual.ais.messages" var="msgs" />
<title>List of Customers</title>
</head>
<!-- begin CSS -->
<link href="css/style.css" type="text/css" rel="stylesheet">

<!-- end CSS -->
<body>

	
		<div id="container">
	
			<header>
		
			<!-- begin navigation -->
			
						<nav id="navigationComercial">
				<ul>
					<li><a href="#">Inicio </a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/listProductosComercial.jsf">Consultar productos</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/listCustomers.jsf">Consultar clientes</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/nuevoCliente.jsf">Crear cliente</a></li>
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
		     <h:outputText  value="Nº"/>
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
		     <h:outputText  value="Dirección"/>
		    </f:facet>
		    <h:outputText value="#{customer.address}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="Cód. País/Región"/>
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
		      <h:outputText  value="Cód. Términos Pago"/>
		    </f:facet>
		    <h:outputText value="#{customer.paymentTermsCode}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="Cód. Divisa"/>
		    </f:facet>
				<h:outputText value="#{customer.currencyCode}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		      <h:outputText  value="Crédito"/>
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
