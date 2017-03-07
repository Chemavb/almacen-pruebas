package com.iprsw.gestionproductos.backend.services.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.iprsw.gestionproductos.backend.helper.Almacen;
import com.iprsw.gestionproductos.backend.model.Producto;
import com.iprsw.gestionproductos.services.ProductoServices;
import com.iprsw.gestionproductos.services.impl.ProductoServicesImpl;

public class ProductoServicesTest {
	
	private ProductoServices pService = new ProductoServicesImpl();
	
	@Test
	public void testCreate() {
		int sizeIni = Almacen.getProductos().size();
		pService.create(new Producto(180,"KIT KAT",3.40,"ALIMENTACION"));
		
		assertEquals(sizeIni+1,Almacen.getProductos().size());
	}

	@Test
	public void testRead() {
		Producto p = pService.read(170);
		assertEquals(p.getNombre(), "BOMBAY SAPPHIRE");
	}

	@Test
	public void testUpdate() {
		
	}

	@Test
	public void testDelete() {
		int sizeIni = Almacen.getProductos().size();
		pService.delete(156);
		assertEquals(sizeIni-1, Almacen.getProductos().size());
	}

	@Test
	public void testGetAll() {
		int sizeIni = Almacen.getProductos().size();
		List<Producto> productos = pService.getAll();
		assertEquals(sizeIni, productos.size());
	}

	@Test
	public void testGetAllByFamily() {
		List<Producto> productosPorFamilia = pService.getAllByFamily("DETERGENTES");
		for(Producto p: productosPorFamilia){
			assertEquals(p.getFamilia(), "DETERGENTES");
			
		}
		assertEquals(productosPorFamilia.size(), 2);
	}

	@Test
	public void testGetProductosOrderedByPrice() {
		List<Producto> productosOrdenados = pService.getProductosOrderedByPrice();
		System.out.println(productosOrdenados);
		assertTrue(productosOrdenados.get(0).getPrecio()<productosOrdenados.get(1).getPrecio());
		assertTrue(productosOrdenados.get(1).getPrecio()<productosOrdenados.get(2).getPrecio());
		assertTrue(productosOrdenados.get(2).getPrecio()<productosOrdenados.get(3).getPrecio());
	}

	@Test
	public void testGetProductos() {
		
	}

	@Test
	public void testModificarPrecio() {
		
	}

	@Test
	public void testDeleteAll() {
		
	}

	@Test
	public void testGetNumeroProductos() {
		
	}

	@Test
	public void testGetNumeroFamilias() {
		
	}

}
