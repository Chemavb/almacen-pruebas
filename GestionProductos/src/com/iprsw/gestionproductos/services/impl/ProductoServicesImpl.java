package com.iprsw.gestionproductos.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.iprsw.gestionproductos.backend.helper.Almacen;
import com.iprsw.gestionproductos.backend.model.Producto;
import com.iprsw.gestionproductos.services.ProductoServices;

public class ProductoServicesImpl implements ProductoServices{

	@Override
	public void create(Producto p) {
		Almacen.getProductos().put(p.getCodigo(), p);
	}

	@Override
	public Producto read(int codigo) {
		return Almacen.getProductos().get(codigo);
	}

	@Override
	public void update(Producto p) throws IllegalArgumentException {
		System.out.println("PRODUCTO EN PSImpl: " + p);
		Producto productoParaUpdate = Almacen.getProductos().get(p.getCodigo());
		System.out.println("PRODUCTO PARA UPDATE EN PSImpl: " + productoParaUpdate);
		
		productoParaUpdate.setFamilia(p.getFamilia());
		productoParaUpdate.setPrecio(p.getPrecio());
		productoParaUpdate.setNombre(p.getNombre());
	}

	@Override
	public void delete(int codigo) {
		Almacen.getProductos().remove(codigo);
	}

	@Override
	public List<Producto> getAll() {
		return new ArrayList<Producto>(Almacen.getProductos().values());
	}

	@Override
	public List<Producto> getAllByFamily(String familia) {
		List<Producto> productosPorFamilia = new ArrayList<Producto>();
		for(Producto p: Almacen.getProductos().values()){
			if(p.getFamilia().equals(familia)){
				productosPorFamilia.add(p);
			}
		}
		return productosPorFamilia;
	}

	@Override
	public List<Producto> getProductosOrderedByPrice() {
		Map<Integer, Producto> productosOrdenados = new HashMap<>();
		List<Producto> productosAlmacen = new ArrayList<Producto>(Almacen.getProductos().values());
 		for(Producto p: productosAlmacen){
			productosOrdenados.put(p.getCodigo(), p);
		}
		return new ArrayList<Producto>(productosOrdenados.values());
	}

	@Override
	public List<Producto> getProductos(double precioMin, double precioMax) {
		List<Producto> productos = new ArrayList<Producto>();
		for(Producto p: Almacen.getProductos().values()){
			if(p.getPrecio() > precioMin && p.getPrecio() < precioMax){
				productos.add(p);
			}
		}
		return productos;
	}

	@Override
	public int modificarPrecio(List<Producto> productos, double incremento) {
		List<Producto> productosAlmacen = new ArrayList<Producto>(Almacen.getProductos().values());
		for(Producto p: productos){
			for(Producto pA: productosAlmacen){
				if(pA.getCodigo()==p.getCodigo()){
					pA.setPrecio(p.getPrecio()+incremento);
					//update(pA);
				}
			}
		}
		return productos.size();
	}

	@Override
	public void deleteAll() {
		Almacen.getProductos().clear();
	}

	@Override
	public int getNumeroProductos() {
		return Almacen.getProductos().size();
	}

	@Override
	public int getNumeroFamilias() {
		Set<String> familias = new HashSet<String>();
		for(Producto p: Almacen.getProductos().values()){
			familias.add(p.getFamilia());
		}
		return familias.size();
	}
	
	
	

}
