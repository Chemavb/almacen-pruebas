package com.iprws.lasolucion.main;

import com.iprws.lasolucion.beans.Entrenador;

public class TestClass {

	private Entrenador trainer = new Entrenador();
	
	public void init(){
		trainer.entrenar();
	}
	
	public static void main(String[] args) {
		new TestClass().init();
	}

	
}
