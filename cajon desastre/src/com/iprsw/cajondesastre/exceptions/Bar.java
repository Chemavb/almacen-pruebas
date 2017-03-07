package com.iprsw.cajondesastre.exceptions;

import java.io.FileNotFoundException;

public class Bar {
	public void metodo1(){
		try {
			metodo2();
		} catch (Exception e) {
			System.out.println("Se ha producido: " + e.getClass().getSimpleName());
		}
	}

	public void metodo2() throws FileNotFoundException {
		metodo3();
	}

	public void metodo3() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
}
