package it.capgemini.academy.giorno2.costruttiiterativi;

public class For {
	/*
	 * for(inizializzazione;condizione;incremento) {}
	 */
	public static void main(String[] args) {
		for(int i=0;i<=100;i+=10) {
			System.out.println("numero " + i/10);
		}
		int i; //lo scope del contatore è limitato al costrutto for
		int contatore = 0;
		for(i = 100;i<=1000; i+=64) {
			contatore++;
			System.out.println(contatore);
			
		}
		for(i = 5; i > 0;i--) {
			System.out.println("conto alla rovescia");
		}
	}
		
}
