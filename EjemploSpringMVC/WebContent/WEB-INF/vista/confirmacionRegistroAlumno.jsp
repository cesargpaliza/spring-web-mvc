<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion de Registro</title>
</head>
<body>
	<h4>El alumno ${ alumno.apellido }, ${ alumno.nombre } se ha registrado correctamente </h4>
	<br/>
	<p> La asignatura seleccionada es: ${ alumno.optativa }
	</p>

</body>
</html>