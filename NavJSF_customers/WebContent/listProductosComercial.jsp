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
<title>Lista de productos</title>
</head>
<!-- begin CSS -->
<link href="css/style.css" type="text/css" rel="stylesheet">

<!-- end CSS -->
<body>
	
		<div id="container"> <!--  div cabecera -->
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

		<h:dataTable id="productoss" value="#{productosListBean.products}"
			var="producto" border="1">
			<h:column>
		    <f:facet name="header">
		     <h:outputText  value="Nº"/>
		    </f:facet>
		    <h:outputText value="#{producto.no}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Descripción"/>
		    </f:facet>
		    <h:outputText value="#{producto.description}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Unidad Medida Base"/>
		    </f:facet>
		    <h:outputText value="#{producto.baseUnitOfMeasure}" />
		  </h:column>
		   <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Cod. Categoría Producto"/>
		    </f:facet>
		    <h:outputText value="#{producto.itemCategoryCode}" />
		  </h:column>
		   <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Cod. Grupo Producto"/>
		    </f:facet>
		    <h:outputText value="#{producto.productGroupCode}" />
		  </h:column>
		  <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Stock"/>
		    </f:facet>
		    <h:outputText value="#{producto.inventory}" />
		  </h:column>
		   <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Precio Venta"/>
		    </f:facet>
		    <h:outputText value="#{producto.unitPrice}" />
		  </h:column>
		   <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Precio Compra"/>
		    </f:facet>
		    <h:outputText value="#{producto.unitCost}" />
		  </h:column>
		   <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Unidades en Pedidos de Venta"/>
		    </f:facet>
		    <h:outputText value="#{producto.qtyOnSalesOrder}" />
		  </h:column>
		   <h:column>
		    <f:facet name="header">
		     <h:outputText  value="Unidades en Pedidos de Compra"/>
		    </f:facet>
		    <h:outputText value="#{producto.qtyOnPurchOrder}" />
		  </h:column>

			


		</h:dataTable>

	</f:view>
	
	</div><!-- fin cuerpo -->
	</div> <!-- fin container -->
</body>
</html>
