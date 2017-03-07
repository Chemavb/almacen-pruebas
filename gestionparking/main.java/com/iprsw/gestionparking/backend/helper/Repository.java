package com.iprsw.gestionparking.backend.helper;

import java.util.Map;

import com.iprsw.gestionparking.backend.model.Propietario;
import com.iprsw.gestionparking.backend.model.Reserva;

public interface Repository {
	
	public Map<String, Propietario> getPropietarios();

	public Map<Integer, Reserva> getReservas();
	
}
