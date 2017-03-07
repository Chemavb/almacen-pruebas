package com.iprsw.gestionparking.backend.ServiceDAO.impl;

import java.util.ArrayList;
import java.util.List;

import com.iprsw.gestionparking.backend.ServiceDAO.ReservaDAO;
import com.iprsw.gestionparking.backend.helper.Repository;
import com.iprsw.gestionparking.backend.helper.RepositoryImpl;
import com.iprsw.gestionparking.backend.model.Reserva;

public class ReservaDAOImpl implements ReservaDAO{
	
	private Repository repository = new RepositoryImpl();

	@Override
	public void create(Reserva reserva) {
		repository.getReservas().put(reserva.getCodigo(), reserva);
	}

	@Override
	public Reserva read(int numero) {
		return repository.getReservas().get(numero);
	}

	@Override
	public void update(Reserva reserva) {
		Reserva r = repository.getReservas().get(reserva.getCodigo());
		r.setFechaFin(reserva.getFechaFin());
		r.setFechaIni(reserva.getFechaIni());
		r.setObservaciones(reserva.getObservaciones());
		r.setPlaza(reserva.getPlaza());
		r.setUsuario(reserva.getUsuario());
	}

	@Override
	public void delete(int numero) {
		repository.getReservas().remove(numero);
	}

	@Override
	public List<Reserva> getAll() {
		return new ArrayList<Reserva>(repository.getReservas().values());
	}
}
