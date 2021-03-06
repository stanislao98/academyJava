package it.capgemini.academy.giorno3.test;

import it.capgemini.academy.giorno3.model.Persona;
import it.capgemini.academy.giorno3.model.Studente;

public class TestPersona {
	public static void main(String[] args) {
		Persona persona = new Persona("Stani", "Fidanza", 22, 'M', false);
		System.out.println(persona.toString());
		persona.printInitials();
		System.out.println(persona.getSposato());
		Persona tizio = new Studente("Stani", "Fidanza", -2, 'M', false, "571635","765");
		// posso assegnare un'istanza della sottoclasse a una variabile tipizzata con la superclasse
		tizio.printInitials(); //la sottoclasse eredita tutti i metodi della superclasse
		//System.out.println(tizio.getMatricola());
		System.out.println(tizio.getNome());
		System.out.println(tizio.toString());
		System.out.println(((Studente)tizio).getMatricola()); 
		//senza cast non vede il metodo della sottoclasse
		
		Studente s = new Studente();
		provaP(s);
		//un metodo che prende in ingresso la superclasse prende in ingresso anche la sottoclasse
		//la sottoclasse vede completamente la superclasse
		Persona p = new Persona();
		//provaS((Studente)p);
		//un metodo che prende in ingresso la sottoclasse non accetta un oggetto della superclasse
		//ad esempio persona non ha la matricola, e non vede la sottoclasse
		// il compilatore permette il cast alla sottoclasse ma poi solleva ClassCastException
		//provaS((Studente)tizio);
	}
	
	static void provaP(Persona p) {
		System.out.println("persona");
	}
	
	static void provaS(Studente s) {
		System.out.println("studente");
		//s.getMatricola();
	}
	
	
	
}
