package it.capgemini.academy.giorno6.classiinterne.enumerazioni;

public class Test {

	public static void main(String[] args) {
		GiornoDellaSettimana giorno = GiornoDellaSettimana.LUNEDI;

		GiornoDellaSettimana giornoDaStringa = GiornoDellaSettimana.valueOf("MARTEDI");
		// valueOf vuole il nome
		System.out.println(giornoDaStringa);

		// toString restituisce il nome

		System.out.println(giornoDaStringa.getNome());

	}
}
