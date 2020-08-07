<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Agregar Alumno</title>
</head>
<body>

	<!-- modelAttribute esta binded con el atributo de Model de Spring-->
	<form:form action="processFormAlumno" modelAttribute="alumno">  	
		<!-- path hace referencia a los getter y setters del objeto de Model de Spring -->
        Nombre: <form:input path="nombre" />         
        <br><br>  
        Apellido: <form:input path="apellido" />  
        <br><br>  
        Asignatura optativa <form:select path="optativa" multiple="true">
        	<form:option value="diseño" label="Diseño"/>
        	<form:option value="analisis" label="Analisis"/>
        	<form:option value="programacion" label="Programacion"/>
        </form:select>
        <input type="submit" value="Submit" />      
    </form:form>
	
</body>
</html>