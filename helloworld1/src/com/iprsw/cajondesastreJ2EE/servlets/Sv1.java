package com.iprsw.cajondesastreJ2EE.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sv1") // Para registrar el Servlet en Tomcat
					// También se pueden registrar Servlets de forma declarativa
					// en el web.xml
public class Sv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Esto se ejecutará para cada hilo que se abra

		// Recogemos parámetros que sabemos positivamente que llegan
		// En caso de no llegar, tendremos un problema, porque no nos vamos a
		// dedicar a validar parámetros

		String parametroNombre = request.getParameter("nombre");
		String parametroApe1 = request.getParameter("apellido1");
		String parametroApe2 = request.getParameter("apellido2");

		System.out.println(parametroApe1 + "  " + parametroApe2 + ", " + parametroNombre);

		// Vamos a construir y enviar una respuesta en forma de fichero html que
		// vamos a construir programáticamente

		PrintWriter pw = response.getWriter();

		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset\"ISO-8859-1\">");
		pw.println("<title>Insert title here</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Datos recopilados a partir de parámetros</h1>");
		pw.println("<h1>Bienvenido <b>" + parametroNombre + " " + parametroApe1 + " " + parametroApe2 + "</b></h1>");
		pw.println("</body>");
		pw.println("</html>");
		
		pw.close();//ALTAMENTE RECOMENDABLE
		
	}

}
