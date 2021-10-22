package it.capgemini.academy.giorno7;

import java.util.LinkedList;
import java.util.Vector;

public class StudioPersonale {
	// LinkedList usa una lista doppiamente concatenata. 
	// Ingloba la classe AbstractList e implementa List
	// e Deque
	
	/*
	 * 1 Può contenere elementi duplicati
	 * 2 Mantiene l'ordine di inserimento
	 * 3 Si può usare come lista, stack o coda
	 */
	
public static void main(String[] args) {
	  LinkedList<String> al=new LinkedList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay"); 
	  
	  
	  /*
	   * E' un'array dinamico che può aumentare o diminuire le dimensioni. Implementa l'interfaccia List
	   * vector() Vettore vuoto di dimensione 10
	   * vector(int initialCapacity) vettore vuoto con dimensione initialCapacity
	   * vector(int initialCapacity, int capacityIncrement) vettore vuoto con dimensione iniziale e incremento
	   * 
	   */
	  
	  Vector<String> vec = new Vector<String>(3,10);
	    vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        System.out.println(vec.capacity());
		vec.ensureCapacity(15);
		vec.trimToSize(); // La capacità diventare pari al numero di elementi contenuti
		
		/*
		 * HashSet
		 * E' usata per creare una collezione che usa le tabelle hash per memorizzare le informazioni.
		 * Eredita la classe AbstractSet e implementa l'interfaccia Set
		 * -Ogni elemento + unico
		 */
} 
}
