package com.iprsw.gestionparking.backend.ServiceDAO.impl;

import java.util.ArrayList;
import java.util.List;

import com.iprsw.gestionparking.backend.ServiceDAO.PropietarioDAO;
import com.iprsw.gestionparking.backend.helper.Repository;
import com.iprsw.gestionparking.backend.helper.RepositoryImpl;
import com.iprsw.gestionparking.backend.model.Propietario;

public class PropietarioDAOImpl implements PropietarioDAO{

	private Repository repository = new RepositoryImpl();
	
	@Override
	public void create(Propietario propietario) {
		repository.getPropietarios().put(propietario.getDNI(), propietario);
	}

	@Override
	public Propietario read(String codigo) {
		return repository.getPropietarios().get(codigo);
	}

	@Override
	public void update(Propietario propietario) {
		Propietario p = repository.getPropietarios().get(propietario.getDNI());
		p.setApe1(propietario.getApe1());
		p.setApe2(propietario.getApe2());
		p.setDireccion(propietario.getDireccion());
		p.setEmail(propietario.getEmail());
		p.setNombre(propietario.getNombre());
		p.setPiso(propietario.getPiso());
		p.setTlfFijo(propietario.getTlfFijo());
		p.setTlfMovil(propietario.getTlfMovil());
		p.setPlaza(propietario.getPlaza());
	}

	@Override
	public void delete(String codigo) {
		repository.getPropietarios().remove(codigo);
	}

	@Override
	public List<Propietario> getAll() {
		return new ArrayList<Propietario>(repository.getPropietarios().values());
	}
	
}
