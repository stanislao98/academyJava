package it.capgemini.academy.giorno1;

public class Stringhe {
	public static void main (String[] args) {
	
		String stringa = new String(); 
		/*
		 * String, con chiamata ad un costruttore. Di default ? una stringa vuota.
		 */
		
		String stringaScolpita = "stringa";
		
		String stringaDefault;
		// valore default null se non inizializzata
		
		String stringaNull = null;
		
		String stringsVuota = "";
		//la stringa vuota ? spesso chiamata blank
		
		String stringaDaIntero = String.valueOf(100); 
		/* metodo statico poich? nomeClasse.nomeMetodo
		 * valueOf() sono un insieme di metodi che costruiscono stringhe a partire 
		 * dal valore che gli viene passato in ingresso ne esiste uno per ogni tipo primitivo
		 */
		//String intero = 100; ==> errore
		
		String stringaProva = " ciao Ciao";
		System.out.println(stringaProva.toLowerCase());
		// nomeIstanza.nomeMetodo() ? una chiamata  a un metodo di istanza
		System.out.println(stringaProva.toUpperCase());
		System.out.println(stringaProva);
		
		System.out.println(stringaProva.endsWith("O"));
		System.out.println(stringaProva.substring(2, 4).toUpperCase());
		// restutuisce la sotto stringa tra gli indici
		System.out.println(stringaProva.trim());
		//elimina spazi a inizio e fine
		System.out.println(stringaProva.charAt(3));
		//restituisce il carattere corrispondente all'indice
		
		System.out.println(stringaProva.contains("Ciao"));
		
		System.out.println(stringaProva.indexOf("a"));
		System.out.println(stringaProva.lastIndexOf("a"));
		System.out.println(stringaProva.isEmpty());
		System.out.println(stringaProva.replace("Ciao", "miao"));
		System.out.println(stringaProva.replaceAll(".* .*", "*"));
		// il primo parametro viene interpretato come regular expression (regex)
		System.out.println(stringaDaIntero.equals(stringaProva));
		// uguaglianza 
		String stringa2 = stringaProva.toLowerCase();
		System.out.println(stringaProva.equalsIgnoreCase(stringa2));
		//Controlla l'uguaglianza ignorando le lettere maiuscole e minuscole
		System.out.println(stringaProva.length());
		
		


		
	}
}
