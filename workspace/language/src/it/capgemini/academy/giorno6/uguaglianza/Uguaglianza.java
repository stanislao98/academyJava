package it.capgemini.academy.giorno6.uguaglianza;

import it.capgemini.academy.giorno3.model.Persona;

public class Uguaglianza {
	
	// Variabili di tipo primitivo
	
	
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = x; //assegnazione per valore, viene allocata nuova memoria.

		y = 3;

		System.out.println("x = "+ x +"\ny = " + y);

		// Oggetti 
		
		Persona tizio = new Persona("ajeje", "brazorf");
		
		Persona caio = tizio;//assegnazione per reference (indirizzo)
		
		tizio.setNome("gigi");//viene cambiato il nome di tizio e di caio
		System.out.println(caio.toString());
		
		System.out.println(tizio == caio);//sono uguali come reference in quanto puntano allo stesso oggetto
		
		Persona sempronio = new Persona("gigi","brazorf");
		
		System.out.println(tizio == sempronio); //sono uguali per contenuto ma non per refernce -->false
		
		System.out.println(tizio.equals(sempronio)); //--> false
		System.out.println("Stampa hashcode");
		System.out.println(tizio.hashCode());
		System.out.println(caio.hashCode());
		System.out.println(sempronio.hashCode());
		System.out.println("---------------");
		
		//System.out.println(tizio.toString().equals(sempronio.toString())); //---> to String
		
		// equals() ereditato da Object non confronta per contenuto
		// possiamo implementare equals () (e hashCode() col generatore) nella classe di eclipse) nella classe
		//in modo da far confrontare per contenuto. VOlendo anche limitatamente ad un sottoinsieme dello stato
		
}
	
	
}





