package it.capgemini.academy.giorno2;

public class Cast {
	/*
	 * il cast trasforma temporaneamente il tipo di una variabile 
	 * a patto che siano compatibili.
	 * cast tra tipi complessi è possibile a patto che si tratti di classi nella stessa gerarchia 
	 */
	public static void main(String[] args) {
		double d = 12.34;
		System.out.println((int)d);
		System.out.println(Math.ceil(d));
		
		int n = 7;
		System.out.println(n/2.0);
		System.out.println((double)n/2);
		char c = 'd';
		String s = ""+c;
		
	}
}
