package it.capgemini.academy.giorno1;

public class Metodi {
	
	public static void main(String[] args) {
		int n = 4;
		int m = 8;
		int o = 3;
		double x = 4;
		double y = 9; 
		
		double media = Metodi.media(n, m);
		// metodo statico chiamato con la sintassi NomeClasse.nomeMetodo(parametri )
		// qui il nome classe � opzionale perch� stiamo nella stessa classe
		System.out.println("la media tra " + x + " e " + y + " � "  + media(x,y));
		System.out.println("la media tra " + n + " e " + m + " � "  + media(n,m));
		System.out.println("la media tra " + n + " e " + m + " � "  + media(n,m,o));


	
	}
	
	public static double media(int a, int b) {
		// il nome del metodo pi� il numero e il datatype dei parametri costituiscono 
		// la FIRMA del metodo
		double res = (a+b)/2;
		return res;
	}
	public static double media(int a, int b,int c) {
		/*
		 * metodo in overloading che differisce per numero di parametri, ma in base ai parametri viene scelto il metodo.
		 */
		 return (a+b+c)/3;

	}
	public static double media(double a, double b) {
		/*
		 * metodo in overloading che differisce per numero di parametri 
		 */
		 return (a+b)/2;

	}
}
