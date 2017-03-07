package com.iprsw.cajondesastre.geometria;

public class Circulo implements Figura{
	
	private int i;
	private int j;
	private double radio;


	public Circulo(int i, int j, double radio) {
		this.i = i;
		this.j = j;
		this.radio = radio;
	}

	public double area() {
		return Math.PI*(Math.pow(this.radio, 2));
	}

	@Override
	public double perimetro() {
		return 2*Math.PI*this.radio;
	}
	

}
