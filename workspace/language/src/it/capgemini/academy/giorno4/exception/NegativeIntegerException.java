package it.capgemini.academy.giorno4.exception;

public class NegativeIntegerException extends Exception {
	
	public NegativeIntegerException() {
		super("Non puoi inserire un numero negativo");
		//rimandiamo al costruttore della superclasse che prende String  
	}
	
}
