<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<jsp:include page="WEB-INF/templates/menu.jsp"></jsp:include>
		<title>Listado de productos</title>
	</head>
	<body>
		<h1>Alta de productos</h1>
		<form action="SvAltaProductos" method="POST">
			<input type="number" id="codigo" name="p1" placeholder="codigo"/>
			<input type="text" id="nombre" name="p2" placeholder="nombre"/>
			<input type="text" id="precio" name="p3" placeholder="precio"/>
			<select id="familia" name="p4">
				<option value="DETERGENTES">DETERGENTES</option>
				<option value="BEBIDAS">BEBIDAS</option>
				<option value="ALIMENTACION">ALIMENTACION</option>
			</select>
			<input type="submit" value="Alta"/>
		</form>
		<c:if test="${error.equals('si') }">
			<label>Campos erróneos.</label>
		</c:if>
	</body>
</html>