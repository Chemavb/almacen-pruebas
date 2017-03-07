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
	<h1>Listado de productos</h1>
		<table>
			<tr>
				<th>CÓDIGO</th>
				<th>NOMBRE</th>
				<th>PRECIO</th>
				<th>FAMILIA</th>
			</tr>
			<c:forEach items="${productos}" var="producto">
				<tr>
					<td>${producto.codigo }</td>
					<td>${producto.nombre }</td>
					<td>${producto.precio}</td>
					<td>${producto.familia }</td>
					<td>
						<form action="SvFicha?codigo=${producto.codigo}" method="POST">
							<input type="submit" value="Ficha" />
						</form>
					</td>		
				</tr>
			</c:forEach>
		</table>
</body>
</html>