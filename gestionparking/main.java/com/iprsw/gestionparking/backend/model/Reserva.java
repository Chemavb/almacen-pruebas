package com.iprsw.gestionparking.backend.model;

import java.io.Serializable;
import java.util.Date;

public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private Plaza plaza;
	private Propietario usuario;
	private Date fechaIni;
	private Date fechaFin;
	private String observaciones;
	
	public Reserva() {
		super();
	}

	public Reserva(int codigo, Plaza plaza, Propietario usuario, Date fechaIni, Date fechaFin, String observaciones) {
		super();
		this.codigo = codigo;
		this.plaza = plaza;
		this.usuario = usuario;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.observaciones = observaciones;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int nReverva) {
		this.codigo = nReverva;
	}

	public Plaza getPlaza() {
		return plaza;
	}

	public void setPlaza(Plaza plaza) {
		this.plaza = plaza;
	}

	public Propietario getUsuario() {
		return usuario;
	}

	public void setUsuario(Propietario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		Reserva other = (Reserva) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reserva [nReverva=" + codigo + ", plaza=" + plaza + ", usuario=" + usuario + ", fechaIni=" + fechaIni
				+ ", fechaFin=" + fechaFin + "]";
	}
	
	
}
