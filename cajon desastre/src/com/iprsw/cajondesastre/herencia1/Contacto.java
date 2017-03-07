package com.iprsw.cajondesastre.herencia1;

public class Contacto {
	private String email;
	private String telefonoFijo;
	private String telefonoMovil;
	
	public Contacto(){
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	@Override
	public String toString() {
		return "Contacto [email=" + email + ", telefonoFijo=" + telefonoFijo + ", telefonoMovil=" + telefonoMovil + "]";
	}
}
