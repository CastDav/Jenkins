<html>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
	<head>
<f:loadBundle basename="com.ual.ais.messages" var="msgs" />
<title><h:outputText value="#{msgs.title}" /></title>
	</head>
	<body>
		<h:form>
			<h1>
				<h:outputText value="#{msgs.authError}" />
			</h1>
			<p>
				<h:outputText value="#{msgs.authError_detail}" />
				!
			</p>
			<p>
				<h:commandButton value="#{msgs.back}" action="login" />
			</p>
		</h:form>
	</body>
</f:view>
</html>

