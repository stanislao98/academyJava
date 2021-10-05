package it.capgemini.academy.giorno6.eserciziocarta;

import java.util.Date;

import it.capgemini.academy.giorno6.eserciziocarta.exception.pagamentoMassimoException;
import it.capgemini.academy.giorno6.eserciziocarta.exception.prelievoMassimoException;
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
		Date d = new Date(2021, 10, 25, 20, 15);
		
		Carta carta = new Carta("1234", p, 516.4, d);
		try {
			carta.prelievo(500);
		} catch (prelievoMassimoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			carta.pagamento(40);
		} catch (pagamentoMassimoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(carta.getSaldo());
		System.out.println(carta.getUltimoMovimento());
		CartaGold cartaGold = new CartaGold("1234", p, 900, 2, d);
		//System.out.println(d);
		//System.out.println(CartaGold.pre);
	}
}

