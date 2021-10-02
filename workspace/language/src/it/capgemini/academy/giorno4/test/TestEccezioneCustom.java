package it.capgemini.academy.giorno4.test;
import java.util.Scanner;


import it.capgemini.academy.giorno4.exception.NegativeIntegerException;
public class TestEccezioneCustom {
	public static void main(String[] args) {
		int n = 0;

		try {
			 n = inserisciIntero();
		} catch (NegativeIntegerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(n);
		//n=3; //le variabili dichiarate nel blocco try hanno lo scope solo nel blocco try
	}
/*
 *RuntimeException non richiede di gestire l'eccezione, quindi non è necessario il throws declaration nel metodo 
 */
	public static int inserisciIntero() throws NegativeIntegerException {
		
		int intero = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un intero non negativo");
		intero = scanner.nextInt();
		if(intero < 0) {
			throw new NegativeIntegerException();
		}
		return intero;

	}
	
}

