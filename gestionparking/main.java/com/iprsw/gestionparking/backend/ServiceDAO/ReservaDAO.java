package com.iprsw.gestionparking.backend.ServiceDAO;

import java.util.List;

import com.iprsw.gestionparking.backend.model.Reserva;

public interface ReservaDAO {

	public void create(Reserva reserva);
	
	public Reserva read(int numero);
	
	public void update(Reserva propietario);
	
	public void delete(int numero);
	
	//Obtención de listas
	
	public List<Reserva> getAll();
}
