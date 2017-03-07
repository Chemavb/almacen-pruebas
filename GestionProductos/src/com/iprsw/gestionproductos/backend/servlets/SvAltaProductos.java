package com.iprsw.gestionproductos.backend.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iprsw.gestionproductos.backend.model.Producto;
import com.iprsw.gestionproductos.services.ProductoServices;
import com.iprsw.gestionproductos.services.impl.ProductoServicesImpl;

@WebServlet("/SvAltaProductos")
public class SvAltaProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProductoServices pServices = new ProductoServicesImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	
		try {
			// Recogemos los parámetros que envía el cliente

			int codigo = Integer.parseInt(request.getParameter("p1"));
			String nombre = request.getParameter("p2");
			double precio = Double.parseDouble(request.getParameter("p3"));
			String familia = request.getParameter("p4");

			Producto p = new Producto(codigo, nombre, precio, familia);
			pServices.create(p);
			request.setAttribute("produ", p);
			RequestDispatcher rd = request.getRequestDispatcher("SvListadoProductos");
			rd.forward(request, response);
		} catch (RuntimeException e) {
			request.setAttribute("error","si");
			RequestDispatcher rd = request.getRequestDispatcher("alta.jsp");
			rd.forward(request, response);
		}

	}

}
