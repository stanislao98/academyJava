package it.capgemini.academy.giorno7.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import javax.lang.model.element.Element;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> listaInteri = new ArrayList<>();
		// System.out.println(listaInteri.size());
		// il metodo si chiama size e non length

		listaInteri.add(1);
		listaInteri.add(2);
		listaInteri.add(3);
		listaInteri.add(4);

		// System.out.println(listaInteri.get(2));
		// gli indici partono da 0 come negli array
		// System.out.println(listaInteri.size());

		// modi per scorrere :

//		for (int i = 0; i < listaInteri.size(); i++) {
//			System.out.println(listaInteri.get(i));
//
//		}
//
//		for (Integer x : listaInteri) {
//			// for(tipo nome:collezione)
//			// for(tipo nome : collezione)
//			System.out.println(x);
//		}
		listaInteri.remove(3);
		// esiste anche il remove(Object obj)

//		Iterator<Integer> iterator = listaInteri.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

		// metodi utili
		listaInteri.add(0, 123);
		// add aggiunge all'indice fornito e fa scalare gli altri

		listaInteri.add(4, 47);
		listaInteri.set(3, 99);
		// sostituisce l'elemento all'indice fornito
		
		
		for (Integer x : listaInteri) {
			// for(tipo nome:collezione)
			// for(tipo nome : collezione)
			System.out.println(x);
		}
	}
}
