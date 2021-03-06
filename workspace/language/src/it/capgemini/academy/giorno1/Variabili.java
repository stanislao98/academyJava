package it.capgemini.academy.giorno1;

public class Variabili {	
	private int variabileDiIstanza;
	/*
	 * variabile dichiarata nel corpo della classe
	 * ma all'esterno dei metodi. 
	 * fa riferimento all'istanza specifica
	 * sono anche dette "campi della classe"
	 * 
	 * (se pubblica si pu? richiamare con "nomeIstanza.nomevariabile"
	 */
	public static int variabileDiClasse;
	/*
	 * sempre nel corpo della classe, all'esterno dei metodi
	 * ma marcata dalla keyword "static"
	 * fa riferimento alla classe
	 * sono anche dette "variabili statiche"
	 * (se pubblica si pu? richiamare con "NomeClasse.nomeVariabile"
	 */
	public static final int COSTANTE_INTERA = 7;
	/*
	 * COSTANTE. Il valore non pu? essere modificato
	 * va inizializzata al momento della dichiarazione
	 */
	public static void main(String[] args) {
		//variabileDiIstanza = 1; non ha senso perch? non c'? un'istanza attiva
		variabileDiClasse = 1;
		int variabileLocale;
		/*
		 * dichiarata all'interno dei metodi
		 * il suo ciclo vitale dipende dal metodo in cui ? definita
		 */
		variabileLocale=1;
		System.out.println(COSTANTE_INTERA);
		
	}
}

