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

@WebServlet("/SvFicha")
public class SvFicha extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoServices pServices = new ProductoServicesImpl(); 
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codigo= Integer.parseInt(request.getParameter("codigo"));
		
		System.out.println("CÓDIGO (En SvFicha): " + codigo);
		
		// TODO
		
		Producto producto = null;
		
		producto = pServices.read(codigo);
		
		request.setAttribute("producto", producto);
		
		request.getRequestDispatcher("ficha.jsp").forward(request, response);
	}

}
