package it.capgemini.academy.giorno7.collection.list;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("B");

		ll.addFirst("F");
		ll.addLast("L");

		System.out.println(ll);

		//di tutti i ...first esiste il corrispondente ...last
		
		ll.getFirst(); //solleva eccezione su lista vuota
		ll.peekFirst(); //restituisce null su lista vuota
		
		ll.removeFirst();  //solleva eccezione su lista vuota
		ll.pollFirst(); //restituisce null su lista vuota
		
		ll.pop();
		
		ll.push("P"); // equivalente a addFirst
	

		

	}
}
