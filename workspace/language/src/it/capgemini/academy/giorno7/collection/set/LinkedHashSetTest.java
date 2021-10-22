package it.capgemini.academy.giorno7.collection.set;

import java.util.LinkedHashSet;

import it.capgemini.academy.giorno6.esercizioenum.Persona;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet();
		//mantiene l'ordine di inserimento grazie ad una linkedList interna
		
		
		
		lhs.add(5);
		lhs.add(2);
		lhs.add(7);
		lhs.add(2);
		
		System.out.println(lhs);
		LinkedHashSet<Persona> pls = new LinkedHashSet<>();
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
		
		
		pls.add(p);
		pls.add(p2);
		pls.add(p3);
		pls.add(p4);
		pls.add(p5);
		
		pls.forEach( per -> {
			System.out.println(per);
		});
		
	
		
		
	}
}
