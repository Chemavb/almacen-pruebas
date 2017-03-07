package com.iprsw.cajondesastre.comparables;

import java.util.Comparator;

public class Main {
	public static void main(String[] args){
		
		metodo1();
		metodo2();
	}
	
	private static void metodo1(){
		
	}
	
	private static void metodo2(){
		Pasajero p1 = new Pasajero(100,"Juan Ignacio","Machado","Pelayo","H");
		Pasajero p2 = new Pasajero(100,"Javier","García","Ibáñez","H");
		Pasajero p3 = new Pasajero(100,"Maite","Núñez","Sagasta","M");
		Pasajero p4 = new Pasajero(100,"Julia","Páez","Real","M");
		Pasajero p5 = new Pasajero(100,"Kevin","Galván","Martín","H");
		
		//comparable
		
		System.out.println(p2.compareTo(p3));
		System.out.println(p3.compareTo(p2));
		System.out.println(p3.compareTo(p3));
		
		//comparator
		
		Comparator<Pasajero> pcbn = new PasajeroComparatorByName();
		
		System.out.println(pcbn.compare(p2, p3));
		System.out.println(pcbn.compare(p2, p4));
		
		//Vamos a crear una nueva implementción de Comparator<Pasajero>
		//Esa implementación va a ser de usar y tirar
		
		Comparator<Pasajero> pcbn2 = new Comparator<Pasajero>(){

			@Override
			public int compare(Pasajero o1, Pasajero o2) {
				return o2.getCodigo()-o1.getCodigo();
			}
			
		};
	}
}
