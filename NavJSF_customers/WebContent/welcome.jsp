<html>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
	<head>
<f:loadBundle basename="com.ual.ais.messages" var="msgs" />
<title><h:outputText value="#{msgs.title}" /></title>
<!-- begin meta -->
<meta charset="utf-8">

<!-- end meta -->

<!-- begin CSS -->
<link href="css/style.css" type="text/css" rel="stylesheet">
<link href="css/html5-reset.css" type="text/css" rel="stylesheet">
<!-- end CSS -->

<!-- begin JS -->
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/modernizr-2.0.6.min.js" type="text/javascript"></script>
<!-- end JS -->
	</head>
	<body style="background: url(images/bgnoise_lg.png) repeat left top;">
		<h:form>
			<p>
				<h:outputText value="#{msgs.welcome}" />
				<h:outputText value="#{user.name}" />
				! [
				<h:outputText value="#{user.contact}" />
				] (<i><h:outputText value="#{user.role}" /></i>)
			</p>
			<p>
				<h:commandButton value="#{msgs.logout}" action="#{user.logout}" />
			</p>
		</h:form>

		<div id="container" style="width: 1300px; margin: 150px auto 0;">

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
						href="http://localhost:8080/NavJSF_customers/listPedidosVenta.jsf">Lista
							De Pedidos Ventas</a></li>
					<li><a
						href="http://localhost:8080/NavJSF_customers/listPedidosVentaAbierto.jsf">Lista
							De Pedidos Ventas Abiertos</a></li>

				</ul>
			
			</nav>
			<!-- end navigation -->

		</div>
	</body>
</f:view>
</html>