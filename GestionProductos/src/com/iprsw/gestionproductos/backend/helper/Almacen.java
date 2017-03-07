package com.iprsw.gestionproductos.backend.helper;

import java.util.HashMap;
import java.util.Map;

import com.iprsw.gestionproductos.backend.model.Producto;

public class Almacen {
	
	private static Map<Integer, Producto> PRODUCTOS = new HashMap<Integer, Producto>();

//	static{
//		Producto p1 = new Producto(100, "MISTOL PLUS", 2.7, "DETERGENTES");
//		Producto p2 = new Producto(120, "LIMPIACRISTALES", 1.6, "DETERGENTES");
//		Producto p3 = new Producto(156, "GALLETAS PRINCIPE DOBLE CHOCO", 2.4, "ALIMENTACION");
//		Producto p4 = new Producto(170, "BOMBAY SAPPHIRE", 18.4, "BEBIDAS");
//		
//		PRODUCTOS.put(p1.getCodigo(), p1);
//		PRODUCTOS.put(p2.getCodigo(), p2);
//		PRODUCTOS.put(p3.getCodigo(), p3);
//		PRODUCTOS.put(p4.getCodigo(), p4);
//	}
	
	private Almacen(){
		
	}
	
	//Único método public que deberán utilizar los diferentes métodos de la implementación de ProductosServices para "hacer sus cosas"
	
	public static Map<Integer,Producto> getProductos(){
		return PRODUCTOS;
	}
	
	
	
}
