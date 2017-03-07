package com.iprsw.cajondesastre.model2;

public class Main {

	public static void main(String[] args) {
		
		Producto p1 = new Producto(100, "tornillo",1.3);
		Producto p2 = new Producto(100, "tornillo",1.3);
		
		System.out.println("p1:" + p1 + "\np2:" + p2);
		
		//Concepto de identidad...
		
		System.out.println("p1 == p2 : "+(p1==p2));
		
		//Concepto de igualdad
		
		System.out.println("p1.equals(p2) : "+ p1.equals(p2));
		System.out.println("p1.equals(p1) : "+ p1.equals(p1));
		
		System.out.println("p1.hashCode() : " + p1.hashCode());
		System.out.println("p2.hashCode() : " + p2.hashCode());
		
		System.out.println("\"mermelada\".hashCode() : " + "mermelada".hashCode());
		System.out.println("\"mermelada\".hashCode() : " + "mermelada".hashCode());
		System.out.println("\"mermelado\".hashCode() : " + "mermelado".hashCode());
	
	}

}
