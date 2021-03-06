package it.capgemini.academy.giorno6.esercizioenum;

import it.capgemini.academy.giorno6.enumerazioni.GiornoDellaSettimana;
import it.capgemini.academy.giorno6.enumerazioni.StatoCivile;

public class Test {
	public static void main(String[] args) {

		/*
		 * togliere il campo booleano "sposato" e aggiungere  "statoCivile" creando un Enum apposito
		 * che abbia valori 
		 * -sposato
		 * -sposata
		 * -celibe
		 * -nubile
		 * -divorziato
		 * -divorziata
		 * -vedovo
		 * -vedova
		 * 
		 * come da convenzione : costruttore, getter, setter
		 * 
		 * applicare il principio di incapsulamento in modo da mantenere funzionante l'interazione con eventuali
		 * altri ambienti che chiamino i vecchi metodi
		 * prendere spunto dalla classe cerchio
		 * 
		 * 
		 * testare adeguatamente i casi d'uso possibili
		 * 		
		 */
		
		Persona p = new Persona("mario", "rossi", 22, 'f', StatoCivile.CELIBE);
		System.out.println(p.getSposato());
		p.setSposato(true);
		p.setSposato(true);
		System.out.println(p.getStatoCivile());

	}
	
		
	
}
