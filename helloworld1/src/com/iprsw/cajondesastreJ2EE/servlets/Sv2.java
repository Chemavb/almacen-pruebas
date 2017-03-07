package com.iprsw.cajondesastreJ2EE.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sv2")
public class Sv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("parametro"));
		
		
		//NOVEDAD!!!
		//Vamos a derivar a otro servlet!
		//Para ello necesitamos un aparato...
		
		RequestDispatcher reqDisp = request.getRequestDispatcher("Sv3");
		reqDisp.forward(request, response);
		
		//A partir de aquí ya no tiene sentido emitir una respuesta, nos daría una excepción
		
		//Probaremos como efectivamente se siguen ejecutando líneas de código después del forward
		
		System.out.println("Soy Sv2 una vez hecho el forward");
		
	}

}
