package it.capgemini.academy.giorno7.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import it.capgemini.academy.giorno3.model.Cerchio;
import it.capgemini.academy.giorno6.esercizioenum.Persona;

public class TreeSetTest {
	
	
	public static void main(String[] args) {
		TreeSet<Double> ts = new TreeSet<>();
		// tree perchè organizza i dati in una struttura ad albero
		ts.add(23423.54);
		ts.add(34.4);
		ts.add(0.0);
		ts.add(10.0);
		
		System.out.println(ts);
		//Li ordina utilizzando il compareTo della classe
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.higher(10.0));//>
		System.out.println(ts.lower(10.0));//<
		System.out.println(ts.ceiling(10.0)); //>=
		System.out.println(ts.floor(34.4));//<=
		
		Iterator<Double> i = ts.descendingIterator();
		System.out.println("\nScorro al contrario");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		TreeSet<Double> ts2 = (TreeSet<Double>) ts.descendingSet();
		System.out.println("\n" + ts2);
		
		TreeSet<Double> ts3 = (TreeSet<Double>) ts.headSet(100.); //sottoinsieme di numeri minori di 100
		System.out.println("\n" + ts3);
		
		TreeSet<Cerchio> tsc = new TreeSet<>();
		Cerchio c = new Cerchio(10);
		//attenzione: cerchio non implementa comparable
		
//		Comparator<Persona> comp = new Comparator<Persona>() {
//			@Override
//			public int compare(Persona o1, Persona o2) {
//				// TODO Auto-generated method stub
//				
//				if(o1.getEta() > o2.getEta()) 
//					return 1;
//				else if(o1.getEta() < o2.getEta())
//					return -1;
//				else 
//					return 0;
//			}
//		};
		
		TreeSet<Persona> tsp = new TreeSet<>();
		Persona p = new Persona("Marco", "Rossi");
		p.setEta(14);
		Persona p2 = new Persona("Mario", "Gialli");
		p2.setEta(12);
		Persona p3 = new Persona("Giovanni", "Bianchi");
		p3.setEta(94);
		Persona p4 = new Persona("Aldo", "Verdi");
		p4.setEta(16);
		Persona p5 = new Persona("Alice", "Viola");
		p5.setEta(21);
		
		tsp.add(p);
		tsp.add(p2);
		tsp.add(p3);
		tsp.add(p4);
		tsp.add(p5);
		
		for (Persona persona : tsp) {
			System.out.println(persona);
		}

	}

}
