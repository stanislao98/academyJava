package it.capgemini.academy.giorno2.costruttiiterativi;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		int i = 0;
		while (i<=30) {
			System.out.println("iterazione n. "+i++);
		}
		
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		boolean controllo = true;
		int contatore = 0;
		while(controllo && contatore != 3) {
			System.out.println("inserire 0 per uscire");
			controllo =scanner.nextInt()!=0;
			contatore++;
		}
	}
}
