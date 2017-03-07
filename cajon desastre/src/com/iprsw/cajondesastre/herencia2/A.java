package com.iprsw.cajondesastre.herencia2;

public class A {
	
	public A(){
		this(100,"texto cualquiera");
		System.out.println("Constructor A");		
	}
	
	public A(int n, String txt){
		super();
		System.out.println("Constructor A que recibe : " + n + " y " + txt);
	}
	
	public void metodo1A(){};
	public void metodo2A(){};
}
