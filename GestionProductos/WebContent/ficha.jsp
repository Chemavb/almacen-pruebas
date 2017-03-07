<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="WEB-INF/templates/menu.jsp"></jsp:include>
<title>Listado de productos</title>
</head>
<body>
	<h1>Ficha del producto</h1>
	<form action="SvModificarProducto" method="POST">
		<table>
			<tr>
				<td>Código</td>
				<td>
				<div id="codigo">${producto.codigo}</div>
				<input type="hidden" name="pCodigo" value="${producto.codigo}"/></td>
				
				<td>${errores[0]}</td>
			</tr>
			<tr>
				<td>Nombre</td>
				<td><input type="text" id="nombre" name="pNombre"
					placeholder="nombre" value="${producto.nombre}" /></td>
				<td>${errores[1]}</td>
			</tr>
			<tr>
				<td>Precio</td>
				<td><input type="text" id="precio" name="pPrecio"
					placeholder="precio" value="${producto.precio}" /></td>
				<td>${errores[2]}</td>
			</tr>
			<tr>
				<td>Familia</td>
				<td><select name="pFamilia">
						<c:choose>
							<c:when test="${producto.familia.equals('DETERGENTES')}">
								<option>BEBIDAS</option>
								<option selected>DETERGENTES</option>
								<option>ALIMENTACION</option>
							</c:when>
							<c:when test="${producto.familia.equals('BEBIDAS')}">
								<option selected>BEBIDAS</option>
								<option>DETERGENTES</option>
								<option>ALIMENTACION</option>
							</c:when>
							<c:when test="${producto.familia.equals('ALIMENTACION')}">
								<option>BEBIDAS</option>
								<option>DETERGENTES</option>
								<option selected>ALIMENTACION</option>
							</c:when>
						</c:choose>
				</select> </td>
				<td>${errores[3]}</td>
			</tr>
		</table>
		<input type="submit" value="Modificar" name="modificar" /> <input
			type="submit" value="Eliminar" name="eliminar" />
	</form>
</body>
</html>