package it.capgemini.academy.giorno7.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.print.attribute.standard.RequestingUserName;

import it.capgemini.academy.giorno6.esercizioenum.Persona;

public class TestSort {
	public static void main(String[] args) {
		Persona p = new Persona("Marco", "Rossi");
		p.setEta(34);
		Persona p2 = new Persona("Mario", "Gialli");
		p2.setEta(32);
		Persona p3 = new Persona("Giovanni", "Bianchi");
		p3.setEta(14);
		Persona p4 = new Persona("Aldo", "Verdi");
		p4.setEta(76);
		Persona p5 = new Persona("Alice", "Viola");
		p5.setEta(21);

		ArrayList<Persona> list = new ArrayList<>();
		list.add(p);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

		ComparatorEta compEta = new ComparatorEta();
		list.sort(compEta);
		for (Persona persona : list) {
			System.out.println(persona);
		}
		
		//ordinaNome(list);
		//Collections.sort(list);
		// sort(list) ordina in base all'ordinamento naturale della classe	
		// ovvero quello definito dal metodo compareTo() dell'interfaccia comparable
		
	}
	
	
	//Possiamo definire il comparatore anche in questo modo
	public static void ordinaNome(ArrayList<Persona> lista) {
		
		Comparator<Persona> comp = new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return o1.getNome().compareToIgnoreCase(o2.getNome());
				// notare che non abbiamo gestito una potenziale nullPointerException
			}
			
		}; //classe anonima che implementa comparator
		
		
	}
}
