package com.iprsw.cajondesastreJ2EE.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sv3")
public class Sv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parametro = request.getParameter("parametro");
		
		System.out.println("Soy Sv3 y el parámetro es: " + parametro);
		
		//Emitir una respuesta...
		//Vamos a hacer que el navegador se vea forzado a tener que ir a buscar respuestas a otra URL
		
		response.sendRedirect("bienvenida.html");
		
	}

}
