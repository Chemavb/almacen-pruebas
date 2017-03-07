package com.iprsw.gestionparking.backend.ServicesDAOImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.iprsw.gestionparking.backend.ServiceDAO.PropietarioDAO;
import com.iprsw.gestionparking.backend.ServiceDAO.impl.PropietarioDAOImpl;
import com.iprsw.gestionparking.backend.helper.Repository;
import com.iprsw.gestionparking.backend.helper.RepositoryImpl;
import com.iprsw.gestionparking.backend.model.Propietario;

public class PropietarioDAOImplTest {

	private PropietarioDAO propietarioDAO = new PropietarioDAOImpl();
	private Repository repository = new RepositoryImpl();
	private Propietario p = new Propietario("82168272L","Pablo", "Ferreira", "Galeano");
	private Propietario p2 = new Propietario("87678532X","Martin", "Pelayo", "Covaleda");
	private String DNI = "13412423J";
	private String DNI2 = "82168272L";
	@Test
	public void create(){
		//TODO		
		int sizeIni = repository.getPropietarios().size();
		propietarioDAO.create(p2);
		assertEquals(sizeIni+1,repository.getPropietarios().size());
	}
	
	@Test
	public void delete(){
		//TODO
		int sizeIni = repository.getPropietarios().size();
		propietarioDAO.delete(DNI);
		assertEquals(sizeIni-1, repository.getPropietarios().size());
	}
	
	@Test
	public void testRead() {
		Propietario p = propietarioDAO.read(DNI2);
		assertTrue(p.getNombre().equals("Pablo")&&p.getApe1().equals("Ferreira")&&p.getApe2().equals("Galvez"));
	}
	
	@Test
	public void testGetAll() {
		int sizeIni = repository.getPropietarios().size();
		List<Propietario> propietarios = propietarioDAO.getAll();
		assertEquals(sizeIni, propietarios.size());
	}
	
	@Test
	public void testUpdate() {
		Propietario pRepo= repository.getPropietarios().get(p.getDNI());
		propietarioDAO.update(p);
		assertTrue(pRepo.getDNI().equals(p.getDNI())&&pRepo.getNombre().equals(p.getNombre())&&pRepo.getApe1().equals(p.getApe1())&&!pRepo.getApe2().equals(p.getApe2()));
	}
	
	

}
