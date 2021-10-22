package it.capgemini.academy.giorno7.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		// coppia chiave valore
		HashMap<Integer, String> m = new HashMap<>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(null, null);
		m.put(8, "c");
		
		System.out.println(m);
		
		System.out.println(m.get(8));
		
		System.out.println(m.put(2, "ciao"));
		
		System.out.println(m);

		Set<Integer> ks = m.keySet();
		// Metodo che riporta il set delle chiavi
	
		Collection<String> vc = m.values();
		for(String s : vc) {
			System.out.println(s);
		}
		
		Set<Entry<Integer,String>> es = m.entrySet();
		System.out.println(es);
		
		System.out.println(m.size());
		
		m.containsKey(1);
		m.containsValue("ciao");
		
		// LinkedHashMap mantiene l'ordine di inserimento delle chiavi
		// TreeMap mantiene ordinate le chiavi secondo il compareTo
		// offre metodi firstKey(), lastEntry()...
		
	}
}
