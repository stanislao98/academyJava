package it.capgemini.academy.giorno4.test;

public class Eccezioni {
	public static void main(String[] args) {
		// tutte le eccezioni sono nella gerarchia di Exception

		try {
			//blocco try per contenere istruzioni a rischio
			//all'interno del blocco le eccezioni sollevate fanno slatare il flusso direttamente al blocco catch
			
			
			String stringa = null;
			stringa.length();
			// blocco try per contenere istruzioni a rischio
			try {
				int x = 123 / 0;
			} catch (ArithmeticException e) {
				e.printStackTrace();
				
			}

			System.out.println("Istruzione non eseguita");
			// un errore di runtime blocca il flusso del programma
		} catch (NullPointerException e) {
			// blocco catch per catturare l'eccezione
			System.out.println(e.getMessage());
			// System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println("Gestione stringa");

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println("Gestione aritmetica");

		} // l'ordine dei catch è dal particolare al generale. Quindi devono essere inserite in ordine gerarchico

		finally {
			//finally opzionale purchè ci sia il catch
			// esegue anche in caso di eccezione non catchata

			System.out.println("Istruzione eseguita");

		}
	
		

		// quello che viene dopo esegue solo se l'eccezione è catturata

		System.out.println("istruzione eseguita");

	}

}
