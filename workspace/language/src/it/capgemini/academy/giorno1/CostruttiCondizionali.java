package it.capgemini.academy.giorno1;

import java.util.Scanner;
// classi  appartenenti ad altri package necessitano essere importate
//import java.util.Scanner;

// per importare un package intero 
public class CostruttiCondizionali {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un intero");
		int intero = scanner.nextInt();
		// non � statico perch� prendo un'istanza
		System.out.println("hai inserito: " + intero);
	
	if(10 > 10) 
		System.out.println("numero minore di 10");
		
	else if (intero<20) 
		System.out.println("numero tra 10 e 20");
	
	else 
		System.out.println("maggiore di 20");
	// le graffe non servono solo se nel corpo ci sono pi� istruzioni
	
	if(intero == 1)
		System.out.println("intero");
	if(intero !=1)
		System.out.println("intero diverso da 1");
	if(!(intero < 0))
		System.out.println("non negativo");
	if(intero >=0)
		System.out.println("maggiore o uguale a 0");
	//notare gli ultimi due sono equivalenti
	if(intero > 0 && intero < 11)
		System.out.println("Compreso tra 1 e 10");
	if(intero < 0 || intero > 10)
		System.out.println("minore di 0 oppure maggiore di 10");
	boolean controllo = (intero == 1 || intero >100);
	if(controllo)
		System.out.println("1 o maggiore di 100");
	String parita = intero%2==0? "pari":"dispari";
	//operatore ternario
	System.out.println("intero � " + parita);
	
	int n = scanner.nextInt();
	switch(n) {
	case 1 :
		System.out.println("hai inserito 1");
		//se manca il break, esegue anche il blocco successivo
	case 2:
		System.out.println("hai inserito 2");
		break;
	case 10:
		System.out.println("hai inserito 3");
		break;
	default : 
		System.out.println("hai inserito un valore diverso da 1, 2 e 10");
	}

	
	}
	
	}

