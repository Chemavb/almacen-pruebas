package com.iprsw.gestionproductos.services;

import java.util.List;

import com.iprsw.gestionproductos.backend.model.Producto;

public interface ProductoServices {
	public void create(Producto p);
	public Producto read(int codigo);
	public void update(Producto p);
	public void delete(int codigo);
	
	//Obtención de listas
	
	public List<Producto> getAll();
	public List<Producto> getAllByFamily(String fam);
	public List<Producto> getProductosOrderedByPrice();
	public List<Producto> getProductos(double precioMin, double precioMax);
	
	//Métodos relacionados con la lógica de negocio
	/**
	 * 
	 * @param productos: Listado de productos sobre los que vamos a modificar el precio
	 * @param incremento:
	 * @return Número de productos que han cambiado de precio
	 */
	public int modificarPrecio(List<Producto> productos, double incremento);
	
	//Métodos varios...
	
	public void deleteAll();
	
	//Métodos estadísticos
	
	public int getNumeroProductos();
	
	public int getNumeroFamilias();
}
