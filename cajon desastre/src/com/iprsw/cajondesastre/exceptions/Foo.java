package com.iprsw.cajondesastre.exceptions;

public class Foo {
	
	public void metodo1() {
		System.out.println("metodo 1 antes de invocar a 2");
		metodo2();
		System.out.println("metodo 1 después de invocar a 2");
	}

	public void metodo2() {
		System.out.println("metodo 2 antes de invocar a 3");
		metodo3();
		System.out.println("metodo 2 después de invocar a 3");
	}

	public void metodo3() {
		System.out.println("metodo 3");
		int a = 10/0;
	}
}
