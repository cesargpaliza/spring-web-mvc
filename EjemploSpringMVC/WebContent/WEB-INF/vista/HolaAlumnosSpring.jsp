<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<h2>Hola ${ param.nombre } bienvenido</h2>
	<h2>Atributo Enviado ${ nombreMayusculas } </h2>	
	<img alt="foto" src="${pageContext.request.contextPath }/recursos/imgs/foto.jpg">
</body>
</html>