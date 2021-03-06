package it.capgemini.academy.giorno1;

import java.util.Scanner;

public class EserciziStringheEIf {
	/*
	 * ogni esercizio ? un metodo differente che poi chiameremo da un main per testare 
	 */
	//1) forniti due interi in ingresso , restituire il maggiore
	public static void main(String[] args) {
		System.out.println("Inserisci nome: ");
		System.out.println("Inserisci cognome: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		String cognome = scanner.nextLine();
		
		System.out.println("Il massimo ?: " + maxInt(1,8));
		
		elevamentoPotenza(10);
		
		System.out.println(containsIgnoreCase("gatto", "a"));
		String string1 = "cane";
		String string2 = "gatto";
		
		
		printIndex(string1);
		
		System.out.println(getLonger("cane", "gatto"));
		
		System.out.println(ritornaIniziali(nome, cognome));
	}
	
	public static int maxInt(int a, int b) {
		return a > b ? a : b;
		
			
	}
	
	//2) fornito un intero , determinare se risulti maggiore di 100 dopo essere elevato
	// alla terza potenza, stampare a video il risultato
	
	public static void elevamentoPotenza(int a) {
		if (Math.pow(a, 3) > 100)
			System.out.println(Math.pow(a, 3));
	}
	
	
	//3) Scrivere un metodo equivalente al contains() della classe String ma che ignori il case
	public static boolean containsIgnoreCase(String a, String b) {
	
		//return a.toLowerCase().contains(b.toLowerCase());
		return a.matches("(?i).*"+ b + ".*");
	
	}
	
	//4) Fornita in ingresso una stringa stampare a video l'indice del carattere 'a'
	//qualora lo contenga
	
	public static void printIndex(String string) { 
		if (containsIgnoreCase(string, "a")) {
			System.out.println("L'indice della a all'interno di " + string + " ?: " + string.indexOf("a"));
		} else 
			System.out.println("La stringa " + string + "non contiene la lettera a");
		
	}
	//5) fornite in ingresso due stringhe, restituire la pi? lunga
	// restituire "stessa lunghezza" in caso 
	
	public static String getLonger(String a, String b) {
		if (a.length() > b.length()) 
			return a;
		else if (a.length() < b.length())
			return b;
		else 
			return "stessa lunghezza";
		}				
	
		
	
	//6) forniti in ingresso un nome e un cognome, restituisce una stringa formata dalle iniziali in  maiuscolo
	//
	//
	public static String ritornaIniziali (String nome, String cognome) {
		return Character.toString(nome.charAt(0)).toUpperCase() + " " + Character.toString(cognome.charAt(0)).toUpperCase();
		//return String.valueOf(nome.charAt(0)).toUpperCase() + String.valueOf(cognome.charAt(0)).toUpperCase();
	}
	

	
	}
