package com.iprsw.gestionparking.backend.ServicesDAOImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.iprsw.gestionparking.backend.ServiceDAO.ReservaDAO;
import com.iprsw.gestionparking.backend.ServiceDAO.impl.ReservaDAOImpl;
import com.iprsw.gestionparking.backend.helper.Repository;
import com.iprsw.gestionparking.backend.helper.RepositoryImpl;
import com.iprsw.gestionparking.backend.model.Planta;
import com.iprsw.gestionparking.backend.model.Plaza;
import com.iprsw.gestionparking.backend.model.Propietario;
import com.iprsw.gestionparking.backend.model.Reserva;

public class ReservaDAOImplTest {

	private ReservaDAO reservaDAO = new ReservaDAOImpl();
	private Repository repository = new RepositoryImpl();
	
	private Propietario p = new Propietario("87652387D","Eduardo","Paez","de la Torre");
	private Plaza pz = new Plaza(4,3,6,Planta.SOTANO1,"Limpia",true);
	private Reserva r = new Reserva(13,pz,p,new Date(),new Date(),"");
	private Reserva rUpd = new Reserva(342,pz,p,new Date(),new Date(),"");
	
	@Test
	public void create(){
		//TODO		
		int sizeIni = repository.getReservas().size();
		reservaDAO.create(r);
		assertEquals(sizeIni+1,repository.getReservas().size());
	}
	
	@Test
	public void delete(){
		//TODO
		int sizeIni = repository.getReservas().size();
		reservaDAO.delete(92);
		assertEquals(sizeIni-1, repository.getPropietarios().size());
	}
	
	@Test
	public void testRead() {
		Reserva r = reservaDAO.read(342);
		assertTrue(r.getUsuario().getNombre().equals("Jose Juan")&&r.getUsuario().getApe1().equals("Lopez")&&r.getUsuario().getApe2().equals("Maldonado"));
	}
	
	@Test
	public void testGetAll() {
		int sizeIni = repository.getPropietarios().size();
		List<Reserva> reservas = reservaDAO.getAll();
		assertEquals(sizeIni, reservas.size());
	}
	
	@Test
	public void testUpdate() {
		Reserva r = repository.getReservas().get(rUpd.getCodigo());
		reservaDAO.update(r);
		assertTrue(r.getCodigo()==rUpd.getCodigo()&&!r.getUsuario().getDNI().equals(rUpd.getUsuario().getDNI())&&!r.getUsuario().getNombre().equals(rUpd.getUsuario().getNombre())&&!r.getUsuario().getApe1().equals(rUpd.getUsuario().getApe1())&&!r.getUsuario().getApe2().equals(rUpd.getUsuario().getApe2()));
		
	}

}
