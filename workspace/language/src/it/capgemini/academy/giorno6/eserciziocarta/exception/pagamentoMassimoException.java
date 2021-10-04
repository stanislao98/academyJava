package it.capgemini.academy.giorno6.eserciziocarta.exception;

public class pagamentoMassimoException extends Exception {
	public pagamentoMassimoException() {
		super("Pagamento non consentito");
	}
}
