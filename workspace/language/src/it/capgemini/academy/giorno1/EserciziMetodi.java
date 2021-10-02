package it.capgemini.academy.giorno1;

public class EserciziMetodi {
	public static final double PIGRECO = 3.14;
	double altezza = 4;
	double base = 4;
	double raggio = 10; 

	/*
	 * scrivere un metodo che restituisca l'area di un triangolo 
	 * di base b e altezza h (passati in ingresso)
	 * 
	 */
	/*
	 * Scrivere un metodo che stampi a video la circonferenza di raggio r passato in ingresso
	 */
	
	public static void main(String[] args) {
		double altezza = 4;
		double base = 4;
		double raggio = 10; 
		System.out.println("L'area del triangolo è " + area(base, altezza));
		EserciziMetodi.circonferenza(raggio);
	}
	
	public static double area (double b, double h) {
		return (b*h)/2;
	}
	public static void circonferenza(double r) {
		System.out.println("La circonferenza è " + 2*PIGRECO*r);

	}
}
