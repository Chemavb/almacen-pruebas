package com.iprsw.gestionparking.backend.model;

import java.io.Serializable;

public class Plaza implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int nPlaza;
	private double ancho;
	private double largo;
	private Planta planta;
	private String observaciones;
	private boolean bloqueada;
	
	public Plaza() {
		
	}
	
	public Plaza(int nPlaza, double ancho, double largo, Planta planta, String observaciones, boolean liberada) {
		super();
		this.nPlaza = nPlaza;
		this.ancho = ancho;
		this.largo = largo;
		this.planta = planta;
		this.observaciones = observaciones;
		this.bloqueada = liberada;
	}
	
	public int getnPlaza() {
		return nPlaza;
	}
	
	public void setnPlaza(int nPlaza) {
		this.nPlaza = nPlaza;
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	public double getLargo() {
		return largo;
	}
	
	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public Planta getPlanta() {
		return planta;
	}
	
	public void setPlanta(Planta planta) {
		this.planta = planta;
	}
	
	public String getObservaciones() {
		return observaciones;
	}
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public boolean isLiberada() {
		return bloqueada;
	}
	
	public void setLiberada(boolean liberada) {
		this.bloqueada = liberada;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nPlaza;
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
		Plaza other = (Plaza) obj;
		if (nPlaza != other.nPlaza)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plaza [nPlaza=" + nPlaza + ", ancho=" + ancho + ", largo=" + largo + ", planta=" + planta
				+ ", observaciones=" + observaciones + ", liberada=" + bloqueada + "]";
	}
	
	
}
