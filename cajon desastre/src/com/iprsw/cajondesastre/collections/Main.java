package com.iprsw.cajondesastre.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	private static Producto p1;
	private static Producto p2;
	private static Producto p3;
	private static Producto p4;
	private static Producto p5;
	
	static{
		
		//esto sólo se ejecuta una vez en el proceso de inicialización de la clase que nada tiene que ver con el proceso de construcción de una instancia
		p1 = new Producto(10,"arandela",2.4);
		p2 = new Producto(15,"tornillo",1.7);
		p3 = new Producto(6,"martillo",12.6);
		p4 = new Producto(24,"taladro",56.7);
		p5 = new Producto(12,"arandela galvanizada",2.8);
	}
	
	public static void main(String[] args) {
		
		pruebaList();
		pruebaSet();
		pruebaTreeSet();
		pruebaHashMap();
		pruebaCollections();
	}
	
	private static void pruebaList(){
		cabecera("ArrayList de Productos");
		List<Producto> productos = new ArrayList();
		productos.add(p1);
		productos.add(p3);
		productos.add(p4);
		productos.add(p1);
		productos.add(p4);
		productos.add(p2);
		productos.add(p5);
	
		//una ventaja de las colecciones es que implementan el método toString()
		
		System.out.println("Elementos de la lista: " + productos);
		System.out.println("Tamaño de la lista: " + productos.size());
		System.out.println("Elemento 4 de la lista: " + productos.get(4));
		
		System.out.println("\nVamos a iterar la colección haciendo uso del for-each:\n");
		
		for(Producto p:productos){
			System.out.println(p);
		}
		
		System.out.println("Vamos a quitar el elemento 3:");
		productos.remove(3);
		System.out.println("Nuevo tamaño de la colección: " + productos.size());
		
		//Vamos a iterar haciendo uso del Iterator
		
		System.out.println("\nVamos a iterar la colección haciendo uso del iterador:\n");
		
		Iterator<Producto> it = productos.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	private static void pruebaLinkedHashSet(){
//		la diferencia con respecto a un HashSet es que, aquí, los elementos están enlazados de forma que, al iterar, tenemos la garantía de que
//		se recuperarán siempre en el mismo orden
//		OJO!!! Sigue siendo imposible el uso del método get(index)
	}
	
	private static void pruebaSet(){
		cabecera("Set de Productos");
		Set<Producto> productos = new HashSet();
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p1);
		productos.add(p1);
		
		//System.out.println("Tamaño tras añadir el mismo 6 veces: " + lista.size());
		
		//Vamos a iterar el Set
		
		System.out.println("\nVamos a iterar el set haciendo uso del for-each:\n");
		
		for(Producto p: productos){
			System.out.println(p);
		}
	
	}
	
	public static void pruebaTreeSet(){
		cabecera("TreeSet de Productos");
		Set<Producto> productos = new TreeSet();
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		
		System.out.println("\nVamos a iterar el TreeSet con un for-each:\n");
		
		for(Producto p:productos){
			System.out.println(p);
		}
	}
	
	public static void pruebaHashMap(){
		cabecera("HashMap de Productos");
		
		Map<Integer, Producto> productos = new HashMap();
		productos.put(0, p1);
		productos.put(5, p2);
		productos.put(10, p3);
		productos.put(15, p4);
		productos.put(20, p5);
		
		//para iterar el map y recuperar los values, hay varias formas de hacerlo:
		
		//1. utilizando llaves
		
		System.out.println("\nIteración HashMap usando llaves:\n");
		
		Set<Integer> keys = productos.keySet();
		
		for(Integer key: keys){
			System.out.println(productos.get(key));			
		}
		
		//2. sin llaves
		
		System.out.println("\nIteración HashMap sin usar llaves:\n");
		
		Collection<Producto> listaProductos = productos.values();
		for(Producto p: listaProductos){
			System.out.println(p);
		}
	}
	
	private static void pruebaCollections(){
		cabecera("Ejemplos con clase Collections");
		//Vamos a invertir el orden de una lista
		
		List<Producto> productos = new ArrayList();
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		
		System.out.println(productos);
		Collections.reverse(productos);
		System.out.println(productos);
		Collections.sort(productos);
		System.out.println(productos);
		Collections.sort(productos, new Comparator<Producto>(){

			@Override
			public int compare(Producto o1, Producto o2) {
				
				Double precio1=o1.getPrecio();
				Double precio2=o2.getPrecio();
				return precio1.compareTo(precio2);
			}
			
		});
		
		System.out.println(productos);
		Collections.shuffle(productos);
		System.out.println(productos);
			
	}
	
	private static void cabecera(String texto){
		System.out.println("\n******************************************************************\n"+texto+"\n******************************************************************\n");
	}
}
