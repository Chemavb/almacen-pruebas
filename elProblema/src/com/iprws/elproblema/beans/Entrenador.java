package com.iprws.elproblema.beans;

import com.iprws.elproblema.services.Deportista;
import com.iprws.elproblema.services.impl.DeportistaImpl;

public class Entrenador {
	
	//Problema, clase no compila si no hay import...
	
	private Deportista deportista = new DeportistaImpl();
	
	public void entrenar(){
		deportista.descansa();
		deportista.descansa();
		deportista.estira();
		deportista.corre();
		deportista.estira();
	}
	
}
