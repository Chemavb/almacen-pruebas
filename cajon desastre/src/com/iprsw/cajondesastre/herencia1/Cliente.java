package com.iprsw.cajondesastre.herencia1;

public class Cliente extends Persona{
	
	private boolean tarjetaGold;

	public Cliente() {
		super();
	}

	public boolean isTarjetaGold() {
		return tarjetaGold;
	}

	public void setTarjetaGold(boolean tarjetaGold) {
		this.tarjetaGold = tarjetaGold;
	}

	@Override
	public String toString() {
		return "Cliente [tarjetaGold=" + tarjetaGold + super.toString() + "]";
	}
	
}
