package com.iprsw.gestionproductos.backend.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.iprsw.gestionproductos.backend.model.Producto;
import com.iprsw.gestionproductos.services.ProductoServices;
import com.iprsw.gestionproductos.services.impl.ProductoServicesImpl;

/**
 * Application Lifecycle Listener implementation class ListenerInitializeProductos
 *
 */
@WebListener
public class ListenerInitializeProductos implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenerInitializeProductos() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 

    	ProductoServices pServices = new ProductoServicesImpl();
    	Integer contAltas=0;
    	Integer contListados=0;
    	sce.getServletContext().setAttribute("contAltas",contAltas);
    	sce.getServletContext().setAttribute("contListados",contListados);
    	
    	
    	Producto p1 = new Producto(100, "MISTOL PLUS", 2.7, "DETERGENTES");
		Producto p2 = new Producto(120, "LIMPIACRISTALES", 1.6, "DETERGENTES");
		Producto p3 = new Producto(156, "GALLETAS PRINCIPE DOBLE CHOCO", 2.4, "ALIMENTACION");
		Producto p4 = new Producto(170, "BOMBAY SAPPHIRE", 18.4, "BEBIDAS");
		
		pServices.create(p1);
		pServices.create(p2);
		pServices.create(p3);
		pServices.create(p4);
		
		//CONTAR REGISTRO DE VISITAS A ALTA Y LISTADO
		
    }
	
}
