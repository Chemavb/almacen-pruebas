package com.iprws.lasolucion.services.impl;

import com.iprws.lasolucion.services.Deportista;

public class DeportistaImpl implements Deportista {

	@Override
	public void corre() {
		System.out.println("Corro");
	}

	@Override
	public void descansa() {
		System.out.println("Descanso");
	}

	@Override
	public void estira() {
		System.out.println("Estiro");
	}

}
