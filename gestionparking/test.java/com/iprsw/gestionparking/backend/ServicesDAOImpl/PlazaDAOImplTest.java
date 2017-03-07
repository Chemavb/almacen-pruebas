package com.iprsw.gestionparking.backend.ServicesDAOImpl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iprsw.gestionparking.backend.ServiceDAO.PlazaDAO;
import com.iprsw.gestionparking.backend.ServiceDAO.impl.PlazaDAOImpl;
import com.iprsw.gestionparking.backend.helper.Repository;
import com.iprsw.gestionparking.backend.helper.RepositoryImpl;
import com.iprsw.gestionparking.backend.model.Planta;
import com.iprsw.gestionparking.backend.model.Plaza;

/**
 * IMPORTANTE!!!! Todos los métodos @Test deben ser independientes unos de otros
 * 
 * 
 * Esto significa que se pueden ejecutar en cualquier orden
 * Esto significa que deben "dejar las cosas" en el mismo estado
 * 
 */
public class PlazaDAOImplTest {
	
	private Repository repository = new RepositoryImpl();
	private PlazaDAO plazaDAO = new PlazaDAOImpl();
	
	@Test
	public void read(){
		Plaza p = plazaDAO.read(1);
		assertTrue(p.getAncho() == 5 && p.getLargo() == 8 && p.getPlanta().equals(Planta.SOTANO1) && p.getObservaciones().equals("Amplia") && !p.isLiberada());
	}
	
	@Test
	public void update(){
		Plaza p = new Plaza(2,6,8,Planta.SOTANO2,"Limpia",false);
		Plaza pRead = plazaDAO.read(p.getnPlaza());
		assertTrue(p.getnPlaza() == pRead.getnPlaza() && p.getAncho() != pRead.getAncho() && p.getLargo() != pRead.getLargo() && p.getPlanta().equals(pRead.getPlanta()) && p.getObservaciones() == pRead.getObservaciones() && p.isLiberada() != pRead.isLiberada());
	}
	
	@Test
	public void getAll(){
		assertEquals(plazaDAO.getAll().size(), repository.getPropietarios().size());
	}
	
	
}
