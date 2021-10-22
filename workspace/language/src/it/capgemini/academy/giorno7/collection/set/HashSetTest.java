package it.capgemini.academy.giorno7.collection.set;

import java.util.HashSet;

import it.capgemini.academy.giorno6.esercizioenum.Persona;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();

		hs.add(1);
		hs.add(3);
		hs.add(3);
		hs.add(2);
		hs.add(2);

		System.out.println(hs); // non ha inserito i duplicati

		for (Integer i : hs) {
			System.out.println(i);

		}
		
		HashSet<Double> hsD = new HashSet<>();
		hsD.add(23423.54);
		hsD.add(34.4);
		hsD.add(0.0);
		hsD.add(10.0);
		
		System.out.println(hsD); //li ordina in base all'hashcode
		for(Double d : hsD) {
			System.out.println(d.hashCode());
		}
		HashSet<Persona> hsP = new HashSet<>();
		Persona p = new Persona("Marco", "Rossi");
		p.setEta(14);
		Persona p2 = new Persona("Mario", "Gialli");
		p2.setEta(12);
		Persona p3 = new Persona("Matteo", "Bianchi");
		p3.setEta(94);
		Persona p4 = new Persona("Aldo", "Verdi");
		p4.setEta(16);
		Persona p5 = new Persona("Alice", "Viola");
		p5.setEta(21);
		
		
		hsP.add(p);
		hsP.add(p2);
		hsP.add(p3);
		hsP.add(p4);
		hsP.add(p5);
		
		System.out.println(hsP);
		
		
		
		
		
		
		
		
		
	
	}
}
