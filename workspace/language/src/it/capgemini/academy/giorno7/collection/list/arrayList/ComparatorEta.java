package it.capgemini.academy.giorno7.collection.list.arrayList;

import java.util.Comparator;

import it.capgemini.academy.giorno6.esercizioenum.Persona;
// sovrascrive il metodo compare
public class ComparatorEta implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		if(o1.getEta() < o2.getEta())
			return -1;
		else if(o1.getEta() > o2.getEta())
			return 1;
		return 0;
	}
	
	

}
