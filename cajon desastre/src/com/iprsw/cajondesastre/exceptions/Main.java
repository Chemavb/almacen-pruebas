package com.iprsw.cajondesastre.exceptions;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		
		try{
			new Foo().metodo1();
		}catch(Exception ex){
			String clase = ex.getClass().getSimpleName();
			System.out.println("Se ha producido: " + clase + "... Pero no pasa nada, la vida continúa");
		}finally{
			
		}
		
		new Bar().metodo1();
	}

}
