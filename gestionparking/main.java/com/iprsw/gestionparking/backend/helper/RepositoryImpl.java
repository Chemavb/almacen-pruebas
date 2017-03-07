package com.iprsw.gestionparking.backend.helper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.iprsw.gestionparking.backend.model.Planta;
import com.iprsw.gestionparking.backend.model.Plaza;
import com.iprsw.gestionparking.backend.model.Propietario;
import com.iprsw.gestionparking.backend.model.Reserva;

public class RepositoryImpl implements Repository{

	private static final Map<String, Propietario> PROPIETARIOS = new HashMap<String, Propietario>();
	private static final Map<Integer, Reserva> RESERVAS = new HashMap<Integer, Reserva>();

	static {
		Plaza pz1 = new Plaza(1,5,8,Planta.SOTANO1,"Amplia",false);
		Plaza pz2 = new Plaza(2,4,7,Planta.SOTANO2,"Limpia",true);
		Plaza pz3 = new Plaza(3,5,5,Planta.SOTANO2,"Organizada",false);
		Plaza pz4 = new Plaza(4,3,6,Planta.SOTANO1,"Limpia",true);
		
		Propietario p1 = new Propietario("13412423J","Jose Juan","Lopez","Maldonado",pz1);
		Propietario p2 = new Propietario("82168272L","Pablo","Ferreira","Galvez",pz3);
		Propietario p3 = new Propietario("13412423P","Jose Juan","Lopez","Maldonado",pz4);
		Propietario p4 = new Propietario("23512359A","German","Garrido","Layun",pz2);
		
		PROPIETARIOS.put(p1.getDNI(), p1);
		PROPIETARIOS.put(p2.getDNI(), p2);
		PROPIETARIOS.put(p3.getDNI(), p3);
		PROPIETARIOS.put(p4.getDNI(), p4);
		
		Reserva r1 = new Reserva(12,pz1,p1,new Date(),new Date(),"");
		Reserva r2 = new Reserva(342,pz4,p3,new Date(),new Date(),"");
		Reserva r3 = new Reserva(53,pz3,p2,new Date(),new Date(),"");
		Reserva r4 = new Reserva(92,pz2,p4,new Date(),new Date(),"");
		
		RESERVAS.put(r1.getCodigo(), r1);
		RESERVAS.put(r2.getCodigo(), r2);
		RESERVAS.put(r3.getCodigo(), r3);
		RESERVAS.put(r4.getCodigo(), r4);
	}

	public RepositoryImpl() {

	}

	public Map<String, Propietario> getPropietarios() {
		return PROPIETARIOS;
	}

	public Map<Integer, Reserva> getReservas() {
		return RESERVAS;
	}

}
