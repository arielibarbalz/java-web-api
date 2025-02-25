<%@page import="ar.com.educacionit.repository.dto.ProductoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Datos</title>
</head>
<body>
		
		<%
		// obtiene el objeto de la sesion
		//debo castear Object: ProductoDTO+
		
		ProductoDTO producto = (ProductoDTO)session.getAttribute("PRODUCTO"); 
		
		%>
		<div>
		<form>
		<label>ID: </label> <%= producto.getId() %>
		<label>Precio: </label> <%= producto.getPrecio() %>
		<label>Titulo: </label> <%= producto.getTitulo() %> 
		</form>
		</div>
</body>
</html>