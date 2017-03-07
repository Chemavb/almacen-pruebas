package com.iprsw.cajondesastre.comparables;

import java.util.Comparator;

public class PasajeroComparatorByName implements Comparator<Pasajero>{

	@Override
	public int compare(Pasajero p1, Pasajero p2) {
		String s1 = p1.getApe1()+p1.getApe2()+p1.getNombre();
		String s2 = p2.getApe1()+p2.getApe2()+p2.getNombre();
		return s1.compareTo(s2);
	}

}
