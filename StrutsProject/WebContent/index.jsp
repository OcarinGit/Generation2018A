<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts 2 App</title>
</head>
<body>
<h2>P�gina principal de la App</h2>
<s:form action="tortilla.action">
	<s:textfield name="mensaje" label="Escribe un Mensaje"></s:textfield>
	<s:submit value="Click"></s:submit>
</s:form>
</body>
</html>