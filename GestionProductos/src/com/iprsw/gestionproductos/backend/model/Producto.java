package com.iprsw.gestionproductos.backend.model;

import java.io.Serializable;

public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String nombre;
	private double precio;
	private String familia;
	
	public Producto(){
		
	}

	public Producto(int codigo, String nombre, double precio, String familia) {
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
		setFamilia(familia);
	}

	public int getCodigo() {
		return codigo;
	}

	
	public void setCodigo(int codigo) {
		if(String.valueOf(codigo).matches("\\d+")){
			this.codigo = codigo;
		}else{
			throw new IllegalArgumentException("ERR1");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(!nombre.isEmpty() && nombre!=null){
			this.nombre = nombre;
		}else{
			throw new IllegalArgumentException("ERR2");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Producto other = (Producto) obj;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		return true;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(String.valueOf(precio).matches("^\\d+(\\.\\d{1,2})?$")){
			this.precio = precio;
		}else{
			throw new IllegalArgumentException("ERR3");
		}
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", familia=" + familia
				+ "]";
	}
	
	
}
