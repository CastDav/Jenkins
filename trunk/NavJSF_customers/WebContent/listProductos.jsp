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
<link type="text/css" rel="stylesheet" href="estilo.css" />

<base href="<%=basePath%>">

</head>
  
<body>

<div id="navbar">
<f:view>

<h:form>


<nav id="navigationCliente">
				<ul>
					<li><a href="#">Inicio</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/listProductos.jsf">Lista De Productos</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/carrito.jsf">Carrito</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/consultarCompras.jsf">Consultar Compras</a></li>
					<li><h:commandLink id="listPedidosVentaClientesss" value="Consultar Pedidos Venta" action="listPedidosVentaCliente" actionListener="#{pvListBean.selectCliente}">
					
				</ul>
	
			</nav>
   	  <h:form>
			<p>
				<h:outputText value="#{msgs.welcome}" />
				<h:outputText value="#{user.numero}" />
				! [
				<h:outputText value="#{user.contact}" />
				] (<i><h:outputText value="#{user.role}" /></i>)
			</p>
			<p>
				<h:commandButton value="#{msgs.logout}" action="#{user.logout}" />
			</p>
		</h:form>
   	<f:param id="clienteIdss" 
   	name="id" 
   	value="#{nuevoPedidoBean.getClienteNo()}" />
   	</h:commandLink>
   	</li>
<li><a href="index.jsf">Salir</a></li>
</ul>
</div>
</br>
       
<h:commandButton id="botCarr" action="carrito" value="Ver Carrito" actionListener="#{prodVentaBean.setCliente}">
<f:param id="clienteIds" 
   	name="id" 
   	value="#{nuevoPedidoBean.getClienteNo()}" />
</h:commandButton>
<h:dataTable id="productoss" 
value="#{nuevoPedidoBean.productos}" 
var="productos" > 
 <h:column>
   <f:facet name="header">
    <h:outputText  value="Nº"/>
   </f:facet>
   <h:outputText value="#{productos.no}" />
 </h:column>
 <h:column>
   <f:facet name="header">
    <h:outputText  value="Descripción"/>
   </f:facet>
   <h:outputText value="#{productos.description}" />
 </h:column>
  <h:column>
   <f:facet name="header">
    <h:outputText  value="Precio Venta"/>
   </f:facet>
   <h:outputText value="#{productos.unitPrice}" />
 </h:column>
 <h:column>
   <f:facet name="header">
    <h:outputText  value="Unidades a añadir"/>
   </f:facet>
 </h:column>
 <h:column>
 <h:commandLink id="listListCarrito"
 	   	action="pedidoNuevo" 
   	  actionListener="#{prodVentaBean.nuevoProductoCarrito}"
   	  onclick="return alert('Añadido al carrito')">
   	<h:outputText value="Añadir al Carrito" />
   	<f:param id="noProducto" 
   	name="noProd" 
   	value="#{productos.no}" />
   	<f:param id="descProducto" 
   	name="descProd" 
   	value="#{productos.description}" />
   	<f:param id="precioUnidad" 
   	name="precioUni" 
   	value="#{productos.unitPrice}" />
 
   </h:commandLink>
   </h:column>
</h:dataTable> 
</h:form>
</f:view>
</body>
</html>