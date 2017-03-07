package com.iprsw.gestionproductos.backend.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FilterCountVisits
 */
@WebFilter("/*")
public class FilterCountVisits implements Filter {

	
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		ServletContext sc=req.getServletContext();
		
		Integer contAltas=(Integer) sc.getAttribute("contAltas");
		Integer contListados=(Integer) sc.getAttribute("contListados");
		
		System.out.println("ALTAS: " + contAltas);
		System.out.println("LISTADOS: " + contListados);
		
		String requestURL = req.getRequestURL().toString(); 
		if(requestURL.equals("http://localhost:8080/GestionProductos/SvListadoProductos")){
			contListados++;
			sc.setAttribute("contListados",contListados);
			System.out.println("Visitas a 'Listados': " + contListados);
		}else if(requestURL.equals("http://localhost:8080/GestionProductos/SvAltaProductos")){
			contAltas++;
			sc.setAttribute("contAltas",contAltas);
			System.out.println("Visitas a 'Altas': " + contAltas);
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
