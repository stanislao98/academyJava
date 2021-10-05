package it.capgemini.academy.giorno7.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import it.capgemini.academy.giorno6.esercizioenum.Persona;

public class Esercizi {

	public static void main(String[] args) {

		Persona p = new Persona("Marco", "Rossi");
		p.setEta(14);
		Persona p2 = new Persona("Mario", "Gialli");
		p2.setEta(12);
		Persona p3 = new Persona("Giovanni", "Bianchi");
		p3.setEta(14);
		Persona p4 = new Persona("Aldo", "Verdi");
		p4.setEta(16);
		Persona p5 = new Persona("Alice", "Viola");
		p5.setEta(21);

		ArrayList<Persona> list = new ArrayList<>();
		list.add(p);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		// System.out.println(getOlder(list));
		// System.out.println(getAdults(list));
		removePerson(list);

		for (Persona persona : list) {

			System.out.println(persona);
		}

	}

	// 1 metodo che restituisca la persona più anziana della lista fornita

	public static Persona getOlder(ArrayList<Persona> list) {
		Persona older = list.get(0);
		for (Persona p : list) {
			if (p.getEta() > older.getEta())
				older = p;
		}
		return older;
	}

	// 2 metodo che restituisca la lista dei maggiorenni

	public static ArrayList<Persona> getAdults(ArrayList<Persona> lista) {
		ArrayList<Persona> adults = new ArrayList<Persona>();
		Iterator<Persona> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Persona p = iterator.next();
			if (p.getEta() >= 18)
				adults.add(p);
		}

		return adults;
	}

	// 3 metodo void che rimuova le persone con il nome che inizia per 'a'
	// non restituisce una nuova lista. Provare i vari modi per scorrere la lista.

	public static void removePerson(ArrayList<Persona> lista) {
		

		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Persona persona = (Persona) iterator.next();
			if(persona.getNome().charAt(0) == 'A')
				iterator.remove();
		}
		ArrayList<Persona> personToRemove = new ArrayList<Persona>();

//		for(Persona p: lista) {
//			if(p.getNome().charAt(0) == 'A')
//				personToRemove.add(p);
//		}
//		lista.removeAll(personToRemove);
	}

	// b alla carta prepagata va aggiunta una funzionalità (nuovo metodo
	// interfaccia) di logging dei movimenti,
	
	// una di stampa(in console) lista movimenti e una di download lista
	// movimenti--> genera un file
	// (opz) strutturare il main di test come una UI stile bancomat
	// classe Movimento

	/*
	 * classe Movimento
	 * 
	 * fields -tipo : TipoMovimento (creare enum statico interno) 
	 * -importo: double
	 * -data : java.util.Date (ricordare che il costruttore vuoto restituisce
	 * un'istanza con data e ora dell'istanziamento
	 * 
	 * (opzionale) metodi di ordinamento per importo e per data della lista
	 * 
	 */

}
