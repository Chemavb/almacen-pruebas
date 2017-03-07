package com.iprsw.gestionparking.backend.model;

import java.io.Serializable;

public class Propietario implements Serializable{
	private static final long serialVersionUID = 1L;

	private String DNI;
	private String nombre;
	private String ape1;
	private String ape2;
	private Plaza plaza;
	private String tlfFijo;
	private String tlfMovil;
	private String email;
	private String direccion;
	private String numero;
	private String planta;
	private String piso;
	
	
	public Propietario(String dNI, String nombre, String ape1, String ape2) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
	}

	public Propietario(String dNI, String nombre, String ape1, String ape2, Plaza plaza) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.plaza = plaza;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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

	public Plaza getPlaza() {
		return plaza;
	}

	public void setPlaza(Plaza plaza) {
		this.plaza = plaza;
	}

	public String getTlfFijo() {
		return tlfFijo;
	}

	public void setTlfFijo(String tlfFijo) {
		this.tlfFijo = tlfFijo;
	}

	public String getTlfMovil() {
		return tlfMovil;
	}

	public void setTlfMovil(String tlfMovil) {
		this.tlfMovil = tlfMovil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	
	public Propietario() {
		super();
	
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propietario other = (Propietario) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Propietario [DNI=" + DNI + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", plaza="
				+ plaza + ", tlfFijo=" + tlfFijo + ", tlfMovil=" + tlfMovil + ", email=" + email + ", direccion="
				+ direccion + ", numero=" + numero + ", planta=" + planta + ", piso=" + piso + "]";
	}
	
	
}
