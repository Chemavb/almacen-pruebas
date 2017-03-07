package com.iprsw.gestionproductos.services;

import java.util.List;

import com.iprsw.gestionproductos.backend.model.Producto;

public interface ProductoServices {
	public void create(Producto p);
	public Producto read(int codigo);
	public void update(Producto p);
	public void delete(int codigo);
	
	//Obtenci�n de listas
	
	public List<Producto> getAll();
	public List<Producto> getAllByFamily(String fam);
	public List<Producto> getProductosOrderedByPrice();
	public List<Producto> getProductos(double precioMin, double precioMax);
	
	//M�todos relacionados con la l�gica de negocio
	/**
	 * 
	 * @param productos: Listado de productos sobre los que vamos a modificar el precio
	 * @param incremento:
	 * @return N�mero de productos que han cambiado de precio
	 */
	public int modificarPrecio(List<Producto> productos, double incremento);
	
	//M�todos varios...
	
	public void deleteAll();
	
	//M�todos estad�sticos
	
	public int getNumeroProductos();
	
	public int getNumeroFamilias();
}
