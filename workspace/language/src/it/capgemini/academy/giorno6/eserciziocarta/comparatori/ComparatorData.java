package it.capgemini.academy.giorno6.eserciziocarta.comparatori;


import java.util.Comparator;

import it.capgemini.academy.giorno6.eserciziocarta.Movimento;

public class ComparatorData implements Comparator<Movimento> {
	@Override
	public int compare(Movimento o1, Movimento o2) {
		// TODO Auto-generated method stub
		if(o1.getData().after(o2.getData()))
		
			return 1;
		else if(o1.getData().before(o2.getData()))
			return -1;
		return 0;
	}

}
