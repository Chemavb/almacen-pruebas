package com.iprsw.cajondesastre.herencia1;

public class Direccion {
	private String direccion;
	private String localidad;
	private String codigoPostal;
	private String provincia;
	private String pais;
	
	public Direccion(){
		super();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@Override
	public String toString() {
		return "Direccion [direccion=" + direccion + ", localidad=" + localidad + ", codigoPostal=" + codigoPostal
				+ ", provincia=" + provincia + ", pais=" + pais + "]";
	}
}
