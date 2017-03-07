package com.iprsw.gestionparking.backend.ServiceDAO.impl;

import java.util.ArrayList;
import java.util.List;

import com.iprsw.gestionparking.backend.ServiceDAO.PlazaDAO;
import com.iprsw.gestionparking.backend.helper.Repository;
import com.iprsw.gestionparking.backend.helper.RepositoryImpl;
import com.iprsw.gestionparking.backend.model.Plaza;
import com.iprsw.gestionparking.backend.model.Propietario;

public class PlazaDAOImpl implements PlazaDAO {

	private Repository repository = new RepositoryImpl();
	

	@Override
	public Plaza read(int numero) {
		List<Plaza> plazas = getAll();
		Plaza plaza = null;
		boolean sal = false;
		for(int i=0 ; i < plazas.size() && !sal ; i++){
			if(plazas.get(i) != null && plazas.get(i).getnPlaza() == numero){
				plaza = plazas.get(i);
				sal = true;
			}
		}
		return plaza;
	}

	@Override
	public void update(Plaza plaza) {
		Plaza pz = read(plaza.getnPlaza());
		pz.setAncho(plaza.getAncho());
		pz.setLargo(plaza.getLargo());
		pz.setLiberada(plaza.isLiberada());
		pz.setObservaciones(plaza.getObservaciones());
		pz.setPlanta(plaza.getPlanta());
	}

	@Override
	public List<Plaza> getAll() {
		List<Plaza> plazas = new ArrayList<Plaza>();
		for(Propietario p: repository.getPropietarios().values()){
			plazas.add(p.getPlaza());
		}
		return plazas;
	}

}
