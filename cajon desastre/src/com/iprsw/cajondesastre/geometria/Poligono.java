package com.iprsw.cajondesastre.geometria;

public class Poligono implements Figura{
	
	private Punto[] vertices;

	public Poligono(Punto... vertices){
		this.vertices = vertices;
	}
	
	@Override
	public double area() {
		return 100;
	}

	@Override
	public double perimetro() {
		return 77;
	}

}
