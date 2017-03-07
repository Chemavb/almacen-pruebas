package com.iprsw.cajondesastre.exceptions2;

public class Main {
	public static void main(String[] args){
		
		try {
			new Foo().metodo1();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("Me ejecuto sí o sí");
		}
		
		int result = new Foo().metodo2();
		System.out.println("Resultado: " + result);
	}
	
	private static void metodo1(){
		
	}
	
	private static void metodo2(){
		
	}
}
