<html>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
	<head>
<f:loadBundle basename="com.ual.ais.messages" var="msgs" />
<title><h:outputText value="#{msgs.title}" /></title>
<!-- begin meta -->
<meta charset="utf-8">
<meta name="description"
	content="This is a simple and elegant navigation menu built with HTML5 and CSS3.">
<meta name="keywords"
	content="HTML5, CSS3, navigation, navigation menu, gray">
<meta name="author" content="Ixtendo">
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
		<div id="container">
		<h:form> 
			<p>
				<h:outputText value="#{msgs.welcome}" />
				<h:outputText value="#{user.name}" />
				! [
				<h:outputText value="#{user.contact}" />
				] (<i><h:outputText value="#{user.role}" /></i>) <h:commandButton value="#{msgs.logout}" action="#{user.logout}" />
			</p>
			
		</h:form>

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
			</header>
		<div class="cuerpo">
		<h:form id="formCliente">
		<h:inputHidden id="id"/>
		<h:panelGrid columns="2" border="0" cellpadding="10" cellspacing="1">
			
			<h:outputText value="Nombre:" />
			<h:inputText id="name" 
						 value="#{nuevoClienteBean.customers.name}">
			</h:inputText>
			<h:outputText value="Contacto:" />
			<h:inputText id="contact" 
						 value="#{nuevoClienteBean.customers.contact}">
			</h:inputText>
			<h:outputText value="Tel�fono:" />
			<h:inputText id="telephone" 
						 value="#{nuevoClienteBean.customers.phoneNo}">
			</h:inputText>
			<h:outputText value="Fax:" />
			<h:inputText id="fax" 
						 value="#{nuevoClienteBean.customers.faxNo}">
			</h:inputText>
			<h:outputText value="C�digo Postal:" />
			<h:inputText id="codPostal" 
						 value="#{nuevoClienteBean.customers.postCode}">
			</h:inputText>
		    
		</h:panelGrid>
		
		<h:messages id="errors" 
					style="color:red;font-weight:bold" 
					layout="table" />
					
		<h:commandButton id="listListNuevo" 
						 value="Guardar"
		    			   action="nada" 
		    			   actionListener="#{nuevoClienteBean.guardarCliente}">
		    			   
		    	<f:param id="nameCamb" value="#{nuevoClienteBean.customers.name}" />
		    	<f:param id="contactCamb" value="#{nuevoClienteBean.customers.contact}" />
		    	<f:param id="telCamb" value="#{nuevoClienteBean.customers.phoneNo}" />
		    	<f:param id="faxCamb" value="#{nuevoClienteBean.customers.faxNo}" />
		    	<f:param id="codpostalCamb" value="#{nuevoClienteBean.customers.postCode}" />
		    
		    	
		    </h:commandButton>
		</h:form>
		
		</div>	<!-- end cuerpo -->
	</div><!-- end container -->
</body>
</f:view>
</html>