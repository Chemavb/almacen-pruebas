package com.iprsw.cajondesastre.geometria;

public class Cuadrado extends Poligono{

	public Cuadrado(Punto v1, Punto v2, Punto v3, Punto v4) {
		super(v1,v3,v4);
	}

	@Override
	public double area() {
		return -50;
	}

	@Override
	public double perimetro() {
		return -12;
	}

}
