package com.iprsw.gestionproductos.backend.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iprsw.gestionproductos.backend.model.Producto;
import com.iprsw.gestionproductos.services.ProductoServices;
import com.iprsw.gestionproductos.services.impl.ProductoServicesImpl;

@WebServlet("/SvModificarProducto")
public class SvModificarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoServices pServices = new ProductoServicesImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int codigo = 0;
		String[] errores = new String[4];
		if (!request.getParameter("pCodigo").matches("\\d+")) {
			errores[0] = "Código erróneo";
			request.setAttribute("errores", errores);
			request.getRequestDispatcher("ficha.jsp").forward(request, response);
		} else {
			codigo = Integer.parseInt(request.getParameter("pCodigo"));

			String modificar = request.getParameter("modificar");

			

			Producto producto = pServices.read(codigo);

			if (modificar != null) {

				try {
					int codigoNuevo = Integer.parseInt(request.getParameter("pCodigo"));

					producto.setCodigo(codigoNuevo);
				} catch (RuntimeException ex) {
					errores[0] = "Código erróneo";
				}

				try {
					String nombreNuevo = request.getParameter("pNombre");
					producto.setNombre(nombreNuevo);
				} catch (RuntimeException ex) {
					errores[1] = "Nombre erróneo";
				}

				try {
					double precioNuevo = Double.parseDouble(request.getParameter("pPrecio"));
			
					producto.setPrecio(precioNuevo);
					
				} catch (RuntimeException ex) {
					errores[2] = "Precio erróneo";
				}

				String familiaNueva = request.getParameter("pFamilia");

				producto.setFamilia(familiaNueva);
				try {
					pServices.update(producto);
					System.out.println("DATOS CORRECTOS");
					request.setAttribute("producto", producto);
					request.getRequestDispatcher("SvListadoProductos").forward(request, response);
				} catch (RuntimeException e) {

					request.setAttribute("producto", producto);

					request.setAttribute("errores", errores);
					request.getRequestDispatcher("ficha.jsp").forward(request, response);
				}

			} else {
				pServices.delete(codigo);
				request.getRequestDispatcher("SvListadoProductos").forward(request, response);
			}
		}

	}

}
