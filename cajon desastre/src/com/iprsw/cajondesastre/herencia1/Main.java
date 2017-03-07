package com.iprsw.cajondesastre.herencia1;

public class Main {

	public static void main(String[] args) {

		Cliente cli1 = new Cliente();
		Taxista tax1 = new Taxista();
		
		Persona p1 = new Cliente();
		Persona p2 = new Taxista();
		
		//ClassCastException!!!
		
		Cliente cliCast = (Cliente) p1;
		Taxista taxCast = (Taxista) p2;

	}

}
