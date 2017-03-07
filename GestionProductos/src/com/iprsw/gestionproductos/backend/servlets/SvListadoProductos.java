package com.iprsw.gestionproductos.backend.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iprsw.gestionproductos.backend.model.Producto;
import com.iprsw.gestionproductos.services.ProductoServices;
import com.iprsw.gestionproductos.services.impl.ProductoServicesImpl;


@WebServlet("/SvListadoProductos")
public class SvListadoProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ProductoServices pServices = new ProductoServicesImpl(); 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Producto> productos = pServices.getAll();
		
		request.setAttribute("productos", productos);
	
		
		RequestDispatcher rd = request.getRequestDispatcher("listado.jsp");
		rd.forward(request, response);
	}

}
