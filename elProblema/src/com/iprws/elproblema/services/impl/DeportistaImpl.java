package com.iprws.elproblema.services.impl;

import com.iprws.elproblema.services.Deportista;

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
