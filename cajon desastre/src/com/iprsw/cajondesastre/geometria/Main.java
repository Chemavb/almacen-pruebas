package com.iprsw.cajondesastre.geometria;

public class Main {

	public static void main(String[] args) {
		
		Punto v1 = new Punto(1.0,2.0);
		Punto v2 = new Punto(1.0,2.0);
		Punto v3 = new Punto(1.0,2.0);
		Punto v4 = new Punto(1.0,2.0);
		Punto v5 = new Punto(1.0,2.0);
		
		Figura circulo = new Circulo(0,0,10.0);
		
		Figura pol = new Poligono(v1,v2,v3,v4,v5);
		
		Figura cuad = new Cuadrado(v1,v2,v3,v4);
		
		System.out.println("Círculo:\n(A) " + circulo.area() + "\nCuadrado:\n(A) " + cuad.area() + "\nPolígono:\n(A) "+pol.area());

		System.out.println("Círculo:\n(P) " + circulo.perimetro() + "\nCuadrado:\n(P) " + cuad.perimetro() + "\nPolígono:\n(P) "+pol.perimetro());
	}

}
