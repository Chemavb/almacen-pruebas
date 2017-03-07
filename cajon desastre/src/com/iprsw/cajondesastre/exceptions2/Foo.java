package com.iprsw.cajondesastre.exceptions2;

public class Foo {
	public void metodo1() throws Exception{
		throw new Exception();
	}
	public int metodo2(){
		
		int resultado=100;
		
		int numAleatorio = (int)(Math.random()*10);
		
		try{
			if(numAleatorio<5)throw new Exception();
		}catch(Exception ex){
			System.out.println("Ha habido un problema");
			return resultado; 
		}finally{
			System.out.println("Soy el try que siempre se ejecuta");
			resultado+=10;
			return 666;
		}
//		return resultado-=10;
	}
}
