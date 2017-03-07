package com.iprws.elproblema.main;

import com.iprws.elproblema.beans.Entrenador;

public class TestClass {

	private Entrenador trainer = new Entrenador();
	
	public void init(){
		trainer.entrenar();
	}
	
	public static void main(String[] args) {
		new TestClass().init();
	}

	
}
