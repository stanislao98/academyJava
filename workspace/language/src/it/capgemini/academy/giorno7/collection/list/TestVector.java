package it.capgemini.academy.giorno7.collection.list;

import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		// size 0, capacity 10 
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		Vector<String> v2 = new Vector<>(100);
		
		Vector<String> v3 = new Vector<>(2,3);//(capacity,increment)
		
		v3.add("a");
		v3.add("b");
		v3.add("c");
		
		System.out.println(v3.capacity());
		
		v3.ensureCapacity(15);
		
		System.out.println(v3.capacity());
		
		v3.trimToSize();
		
		System.out.println(v3.capacity());

	}
	
	
}
