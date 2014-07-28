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

<title>Lista de Productos - Práctica 2 - AIS</title>
</head>
  
<body>
</br>
<f:view>
        
<h:form>
<h:dataTable id="productosventa" 
value="#{prodVentaBean.pedidosventaproductos}" 
var="producto" 
styleClass="order-table"
    headerClass="order-table-header"
    rowClasses="order-table-odd-row,order-table-even-row"
    cellpadding="10">   
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
	<h:commandButton id="botStock" value="ComprobarStock" onclick="return alert('Si muestra -1, todos los productos tienen stock, sino indica del que faltan unidades \n '+#{prodVentaBean.comprobarStock()})"/>
	<h:commandButton id="botCancelar" action="salir" value="Cancelar" actionListener="#{prodVentaBean.salir()}">
  	<f:actionListener binding="#{nuevoPedidoBean.borrarUnidades()}"/>
	</h:commandButton>
		</h:form>
		</f:view>
	</body>
</html>