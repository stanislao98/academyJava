package it.capgemini.academy.giorno2.costruttiiterativi;

import java.util.Scanner;

public class EserciziIterazioni {
	//1 calcolare e restituire la somma dei numeri interi da 1 a 10
	//opzionale : da 1 a n(passato in ingresso)
	
	public static void main(String[] args) {
		//System.out.println(somma(10));
		//System.out.println(tabellina(9));
		System.out.println(potenza(3,-1));
		//System.out.println(media(10));
		//sommaDifferenza();
		//sommaConSoglia();
	}
	
	public static int somma(int n) {
		int sum = 0;
		for (int i=0;i<=n;i++) {
			sum+=i;
	}
		return sum;
		
		
	}
	
	
	//2 calcolare e restituire la media dei numeri da 1 a 10
	//Stessa opzione
	public static double media(int n) {
		return (double)EserciziIterazioni.somma(n)/n;
	}
	
	//3 fornito in ingresso un intero, stamparne a video la tabellina
	public static String tabellina(int n) {
		int i=0;
		String tabellina="TABELLINA\t\n---------\n";
		while(i<=10) {
			tabellina+=n + "x" + i + " = "+ n*i + "\n";
			i++;
		}
		return tabellina;
	}
	
	//4 forniti una base ed un esponente, restituire il risultato della potenza 
	//senza usare Math.pow()
	public static double potenza(int base, int esponente) {
		double potenza=1;
		for(int i=0;i<Math.abs(esponente);i++) {
			potenza=potenza*base;
		}
		return esponente < 0 ? (double)1/potenza : potenza;
		
	}
	
	//5 richiedere 10 interi da tastiera, sommare i primi 5 e poi sottarrre gli altri
	// stampare a video il risultato;
	public static void sommaDifferenza() {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int risultato=0;
		for(int i=0;i<5;i++) {
			numero = scanner.nextInt();
			risultato += numero;
		}
		for (int i=0;i<5;i++) {
			numero = scanner.nextInt();
			risultato -=numero;
		}
		
		System.out.println("Il risultato ?: " + risultato);
	}
	
	
	//6 richiedere all'utente di inserire interi finch? la somma non superi 100
	public static void sommaConSoglia() {
		Scanner scanner = new Scanner(System.in);
		int somma=0;
		while(somma<=100) {
			System.out.println("Inserire intero: \n");
			somma += scanner.nextInt(); 
		}
		System.out.println("Somma superata!");
	}
	
}
