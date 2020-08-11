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
        Nombre: <form:input path="nombre" /><br>
        <form:errors path="nombre" style="color:red"/>       
        <br><br>  
        Apellido: <form:input path="apellido" /><br>
        <form:errors path="apellido" style="color:red"/>       
        <br><br>  
        Asignatura optativa <br><form:select path="optativa" multiple="true">
        	<form:option value="diseño" label="Diseño"/>
        	<form:option value="analisis" label="Analisis"/>
        	<form:option value="programacion" label="Programacion"/>
        </form:select>
        <br><br>
        <u>Provincia:</u><br>
        Tucuman <form:radiobutton path="provincia" value="tucuman"/><br>
        Salta   <form:radiobutton path="provincia" value="salta"/><br>
        Jujuy   <form:radiobutton path="provincia" value="jujuy"/><br>
        <br>     
        
        
        <input type="submit" value="Submit" />      
    </form:form>
	
</body>
</html>