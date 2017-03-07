package com.iprsw.cajondesastre.model;

import java.io.Serializable;

public class Collar implements Serializable{ 
	private static final long serialVersionUID = 1L;
	
	private String material;
	private String color;
	private boolean pinchos;
	
	public Collar(){
		super();
	}
	
	public Collar(String material){
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPinchos() {
		return pinchos;
	}

	public void setPinchos(boolean pinchos) {
		this.pinchos = pinchos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Collar [material=" + material + ", color=" + color + ", pinchos=" + pinchos + "]";
	}
	
}
