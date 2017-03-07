package com.iprsw.cajondesastre.model;

import java.io.Serializable;

public class Perro implements Serializable{
	private static final long serialVersionUID = 1L;
	public static final int VIDA_MEDIA = 15;
	
	private int id;
	private String raza;
	private String nombre;
	private Collar collar;
	
	public Perro() {
		super();
	}
	
	public Perro(int id, String raza, String nombre) {
		super();
		this.id = id;
		this.raza = raza;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}

	@Override
	public String toString() {
		return "Perro [id=" + id + ", raza=" + raza + ", nombre=" + nombre + ", collar=" + collar + "]";
	}
	
	
	
}
