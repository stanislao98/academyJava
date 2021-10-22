package it.capgemini.academy.giorno6.eserciziocarta;

import java.awt.Image;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import it.capgemini.academy.giorno6.eserciziocarta.Movimento.TipoMovimento;
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
	public static Logger logger =  Logger.getLogger("logMovimento");

	public Test () {
		logger.setLevel(Level.ALL);

		FileHandler fileHandler = null;
		try {
			fileHandler = new FileHandler("movimento.xml");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.addHandler(fileHandler);

	}

	public static void main(String[] args) {
		
		//i try si potevano inserire qui
		Persona p = new Persona("Mario", "Rossi");
		Date d = new Date(2021, 10, 25, 20, 15);
		
		Carta carta = new Carta("1234", p, 1516.4, d);
	
	
		CartaGold cartaGold = new CartaGold("1234", p, 1900, 2, d);
		
		//Logger logger = Logger.getLogger("logMovimento");

		FileHandler fileHandler = null;

		try {
			fileHandler = new FileHandler("movimento.xml");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.addHandler(fileHandler);
		
		carta.setLogger(logger);
		Scanner scanner = new Scanner(System.in);

		int scelta = 100;
	
		while(scelta !=0) {
			System.out.println("-----SCEGLIERE IL TIPO DI MOVIMENTO-----");
			System.out.println("1. Ricarica\n2. Pagamento\n3. Prelievo\n4. Download movimenti\n5. Stampa Movimenti\n0. Per uscire");
			scelta = scanner.nextInt();
			if(scelta==0)
				break;
			double importo ;
			switch (scelta) {
				
			case 1:
				System.out.println("Inserire importo");
				importo = scanner.nextDouble();
				carta.ricarica(importo);
				System.out.println(carta.getSaldo());
				break;
			case 2:
				try {
					System.out.println("Inserire importo");
					importo = scanner.nextDouble();
					carta.pagamento(importo);
				} catch (pagamentoMassimoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.println("Inserire importo");
					importo = scanner.nextDouble();
					carta.prelievo(importo);
				} catch (prelievoMassimoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				carta.downloadMovimenti();
				break;
			case 5:
				carta.stampaMovimenti();
				break;
			}
		}
		
		//carta.ordinaPerImporto();
		//carta.stampaMovimenti();

		
	}
}