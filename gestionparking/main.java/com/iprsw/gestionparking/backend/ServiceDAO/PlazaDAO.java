package com.iprsw.gestionparking.backend.ServiceDAO;

import java.util.List;

import com.iprsw.gestionparking.backend.model.Plaza;

public interface PlazaDAO {
	
	public Plaza read(int numero);
	
	public void update(Plaza propietario);
	
	//Obtenci�n de listas
	
	public List<Plaza> getAll();
}
