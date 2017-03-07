package com.iprsw.cajondesastre.comparables;

public class Pasajero implements Comparable<Pasajero>{
	private int codigo;
	private String nombre;
	private String ape1;
	private String ape2;
	private String sexo;	//"H", "M"
	
	public Pasajero(){
		
	}

	
	
	public Pasajero(int codigo, String nombre, String ape1, String ape2, String sexo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.sexo = sexo;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String isSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pasajero [codigo=" + codigo + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", sexo="
				+ sexo + "]";
	}



	@Override
	public int compareTo(Pasajero p) {
		
		return this.codigo-p.codigo;
	}
	
}

