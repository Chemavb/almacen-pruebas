package com.iprws.cajondesastre.flowcontrol;

public class Main {

	public static void main(String[] args) {

		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo5();
	}

	private static void metodo1() {
		boolean aceptamos = false;
		if (aceptamos) {
			System.out.println("aceptamos");
		} else {
			System.out.println("no aceptamos");
		}
	}

	private static void metodo2() {
		String tipoCliente = null;
		double saldo = -12456;
		tipoCliente = (saldo < 0) ? "moroso" : "no moroso";
	}

	private static void metodo3() {

		// while

		while (true) {
			System.out.println("hola!");
			int numeroAleatorio = (int) (Math.random() * 10);
			System.out.println("numero aleatorio: " + numeroAleatorio);
			if (numeroAleatorio > 7) {
				break;
			}
		}

		// do while

		int contador = 0;
		do {
			System.out.println("contador del do while: " + contador++);
		} while (contador < 100);

		// while anidado

		int a = 0;
		int b = 0;
		
		outer: while (a < 100) {
			inner: while (b < 100) {
				if (b == 44) {
					break outer;
				}
			}
		}
	}
	
	private static void metodo4() {
		//switch case
		int opcionMenu = 2;
		
		switch(opcionMenu){
		case 3:
			System.out.println("Opción seleccionada: 3");
			break;
		case 2:
			System.out.println("Opción seleccionada: 2");
			break;
		default:
			System.out.println("ninguna opción...");
		}
		
	}
	
	private static void metodo5() {
		//for
		int numeros[] = {2,-5,3,7};
		
		for(int i=0; i<numeros.length; ++i){
			System.out.println("elemento " + i + " : " + numeros[i]);
		}
		
		//for extreme
		
		System.out.println("\nEjemplo --a\n");
		for(int b=5, a=5;b<--a;){
			System.out.println("a: " + a + " b:" + b);
		}
		
		System.out.println("\nEjemplo a--\n");
		for(int b=5, a=5;b<a--;){
			System.out.println("a: " + a + " b:" + b);
		}
			
	}

}
