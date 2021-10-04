package it.capgemini.academy.giorno6.eserciziocarta;

import java.util.Date;

import it.capgemini.academy.giorno6.esercizioenum.Persona;

public class Test {

	/*
	 * creare un'interfaccia "CartaPrepagata" che espone i metodi "ricarica", "prelievo", "pagamento"
	 * 
	 * due classi "Carta" e "CartaGold" con il seguente stato 
	 * 
	 *  -numCarta: String
	 *  -intestatario: Persona
	 *  -saldo : double 
	 *  -punti : int (solo Gold)
	 *  -ultimoMovimento : java.util.Date (opzionale)
	 *  
	 *  fare in modo che non sia possibile a chiunque di modificare il saldo aggirando i metodi
	 *  esposti dall'interfaccia.
	 *  
	 *  IL SALDO NON PU� ESSERE NEGATIVO
	 *  il prelievo massimo � di 1000 per la normale e 2000 per la gold
	 *  sollevare un'eccezione custom in caso di violazione
	 *  
	 *  implementare i metodi dell'interfaccia tenedo conto che 
	 *  -la carta normale ha una commissione di 2 euro per la ricarica e la gold no
	 *  -il prelievo ha una commissione di 2 euro per la normale e 1 per la gold
	 *  -ogni 10 euro di pagamento con gold danno un punto
	 *  
	 *  testare le funzionalit�
	 */
	
	public static void main(String[] args) {
		
		//i try si potevano inserire qui
		Persona p = new Persona("Mario", "Rossi");
		Date d = new Date(System.currentTimeMillis());
		Carta carta = new Carta("1234", p, 516.4, d);
		carta.prelievo(500);
		//carta.pagamento(40);
		System.out.println(carta.getSaldo());
		CartaGold cartaGold = new CartaGold("1234", p, 900, 2, d);
		cartaGold.pagamento(30);
		
		cartaGold.pagamento(90);
		
		cartaGold.pagamento(6);
;

		System.out.println(cartaGold.getPunti());
		
		//System.out.println(CartaGold.pre);
	}
}
