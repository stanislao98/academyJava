package it.capgemini.academy.giorno4;

import it.capgemini.academy.giorno4.exception.CerchioException;
import it.capgemini.academy.giorno4.exception.EtaException;
import it.capgemini.academy.giorno4.exception.TargaException;

public class EserciziEccezioni {

	// 1 scrivere un metodo statico stringLength(String s) che restituisca la
	// lunghezza di una stringa
	// anche se gli viene passato un null (restituendo 0 in tal caso).
	// senza usare costrutti if

	public static void main(String[] args) {
		// System.out.println(stringLength(null));
		try {
			checkTarga("123457");
		} catch (TargaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int stringLength(String s) {

		try {
			return s.length();
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}

	}
	// 2 creare TargaException da sollevare in caso di targa non valida
	// che porti un messaggio "la targa 'targa inserita non è valida'"
	// testarla (gestita) in un main

	// opzionale modificare classe veicolo affinché sollevi l'eccezione in caso di
	// targa non valida

	// opz:
	// 3 impedire che un'istanza di Persona abbia età negativa

	// 4 impedire che un cerchio abbia raggio <=0

	// 5 in una delle eccezioni custom create, scrivere più costruttori in
	// overloading in modo da
	// avere un messaggio di default quando si chiama il costruttore vuoto e un
	// messaggio
	// parametrico quando si chiama l'altro

	public static void checkTarga(String targa) throws TargaException {
		if (!(targa != null && targa.length() == 7))
			throw new TargaException(targa);

	}

	public static void validaEta(int eta) throws EtaException {
		if (eta < 0)
			throw new EtaException();

	}

	public static void validaRaggio(double raggio) throws CerchioException {
		if (raggio <= 0)
			throw new CerchioException();
	}
}
