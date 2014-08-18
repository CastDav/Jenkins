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
<link type="text/css" rel="stylesheet" href="css/style.css" />
<f:loadBundle basename="com.ual.ais.messages" var="msgs" />
<base href="<%=basePath%>">

<title>Carrito </title>
</head>
  
<body>
<div id="container">
<f:view>
        
<h:form>

<h:form>
			
				<h:outputText value="#{msgs.welcome}" />
				<h:outputText value="#{user.name}" />
				! [
				<h:outputText value="#{user.contact}" />
				] (<i><h:outputText value="#{user.role}" /></i>)
			
			<p>
				<h:commandButton value="#{msgs.logout}" action="#{user.logout}" />
			</p>
		</h:form>

	<nav id="navigationCliente">
				<ul>
					<li><a href="#">Inicio</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/listProductos.jsf">Lista De Productos</a></li>
					<li><a href="http://localhost:8080/NavJSF_customers/carrito.jsf">Carrito</a></li>
					
					<li><h:commandLink id="listPedidosVentaCliente" 
						 value="Consultar Pedidos Venta"
		    			   action="listPedidosVentaCliente" 
		    			   actionListener="#{pedidosVentaListBean.selectCliente}">
		    			   
		    	<f:param id="clienteIdss" 
		    			 name="id" 
		    			 value="#{user.clienteNo}" />
		    	</h:commandLink>
					
				</ul>
	
			</nav>
<h:dataTable id="productosventa" 
value="#{prodVentaBean.pedidosVentaProductos}" 
var="producto">   
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
    <h:outputText  value="Precio Venta"/>
   </f:facet>
   <h:outputText value="#{producto.unitPrice}" />
 </h:column>
 <h:column>
   <f:facet name="header">
    <h:outputText  value="Unidades"/>
   </f:facet>
   <h:inputText value="#{producto.quantity}" />
 </h:column>
 <h:column>
 	<h:commandLink
 	id="listListEliminar"
 	   	action="carrito" 
   	  actionListener="#{prodVentaBean.eliminarProducto}"
   	  onclick="return confirm('¿Seguro que desea eliminarlo?')">
   <f:param id="noProd" name="noProducto" value="#{producto.no}" />
   		<h:outputText value="Eliminar del Carrito" />
   	 
   			</h:commandLink>
 		</h:column>
	</h:dataTable> 
	<br/>
	Total del pedido:
	<h:outputText id="totalText" value="#{prodVentaBean.obtenerTotal()}"></h:outputText>
	<h:commandButton id="botAct" value="Actualizar Total">
	<script type="text/javascript">
	document.getElementById('totalText').setAttribute("value", prodVentaBean.obtenerTotal());	
	</script>
	</h:commandButton>
<br/>
	<h:commandButton id="botVolver" action="volver" value="Añadir Nuevos Productos" 
	actionListener="#{nuevoPedidoBean.borrarUnidades()}"/>
	<h:commandButton id="botPagar" value="Proceder al Pago" action="salir" onclick="#{prodVentaBean.guardarPedido()}" disabled="#{prodVentaBean.hayStock()}">
	</h:commandButton>
	<h:commandButton id="botStock" value="ComprobarStock" onclick="return alert('Si muestra -1, todos los productos tienen stock, sino indica del que faltan unidades \n Respuesta:  '+#{prodVentaBean.comprobarStock()})"/>
	<h:commandButton id="botCancelar" action="salir" value="Cancelar" actionListener="#{prodVentaBean.salir()}">
  	<f:actionListener binding="#{nuevoPedidoBean.borrarUnidades()}"/>
	</h:commandButton>
		</h:form>
		</div>
		</f:view>
	</body>
</html>