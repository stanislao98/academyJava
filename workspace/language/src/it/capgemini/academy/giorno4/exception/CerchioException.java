package it.capgemini.academy.giorno4.exception;

public class CerchioException extends Exception {
	public CerchioException () {
		super("raggio non valido");
	}
}