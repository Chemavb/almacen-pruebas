package com.iprsw.cajondesastre.herencia2;

public class Main {

	public static void main(String[] args) {
		//metodo1();
		metodo2();

	}

	private static void metodo1(){

		C c = new C();
		
		A a = new C();
		
		B b = (C) a;
		
		c = (C) b;
	}
	
	private static void metodo2(){
		new C();
	}
}
