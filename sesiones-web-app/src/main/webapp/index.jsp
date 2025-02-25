<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clase 2 Java Web API</title>
</head>
<body>
	<form
	method="get"
	action= "<%= request.getContextPath()%>/api/producto">
	<input type="hidden" name="id" value="1"/> 
	<button>Consultar</button>
	</form>
</body>
</html>