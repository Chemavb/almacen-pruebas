package com.iprsw.gestionparking.backend.ServiceDAO;

import java.util.List;

import com.iprsw.gestionparking.backend.model.Propietario;

public interface PropietarioDAO {
	
	public void create(Propietario propietario);
	
	public Propietario read(String codigo);
	
	public void update(Propietario propietario);
	
	public void delete(String numero);
	
	//Obtención de listas
	
	public List<Propietario> getAll();
	
}
