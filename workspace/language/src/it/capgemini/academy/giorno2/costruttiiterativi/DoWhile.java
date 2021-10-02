package it.capgemini.academy.giorno2.costruttiiterativi;

public class DoWhile {
	public static void main(String[] args) {
		int x=0;
		
		do {
			System.out.println("istruzione eseguita sempre almeno una volta");
		} while (x>10);
		
		while (x>10) {
			System.out.println("istruzione mai eseguita");
		}
	}
}
