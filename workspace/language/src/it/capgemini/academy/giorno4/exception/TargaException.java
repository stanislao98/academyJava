package it.capgemini.academy.giorno4.exception;

public class TargaException extends Exception {

	// 5 in una delle eccezioni custom create, scrivere pi? costruttori in
	// overloading in modo da
	// avere un messaggio di default quando si chiama il costruttore vuoto e un
	// messaggio
	// parametrico quando si chiama l'altro

	public TargaException() {
		super("La targa inserita non ? valida");
	}

	public TargaException(String targa) {
		super("La targa: " + targa + " non ? valida");
	}
}
