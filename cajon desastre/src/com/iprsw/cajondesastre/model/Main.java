package com.iprsw.cajondesastre.model;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Vida media de los perros : " + Perro.VIDA_MEDIA);
	
		Collar c1 = new Collar();
		c1.setColor("verde");
		c1.setPinchos(false);
		
		Collar c2 = new Collar("plastico");
		c2.setColor("rosa");
		c2.setPinchos(true);
		
		Perro p1 = new Perro(100, "tekkel", "Rufus");
		
		
		Perro p2 = new Perro(150, "foxterrier","Jesús");
		
		
		Perro p3 = new Perro(120, "pastor alemán", "Rex");
		
		
		Perro p4 = null;
		
		
		Perro p5 = p2;
		
		p2.setCollar(c1);
		
		p5.getCollar().setMaterial("madera");
		
		p3.setCollar(c2);		
		c2 = c1;
		c1 = null;
		p1.setCollar(c1);		
		p5.setCollar(p2.getCollar());
		p2.setCollar(null);
		p3.setCollar(p2.getCollar());
		
		
	}

}
