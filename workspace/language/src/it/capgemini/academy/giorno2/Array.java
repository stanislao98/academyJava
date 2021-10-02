package it.capgemini.academy.giorno2;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] arrayInteri = new int[10];
		// creaiamo un array di interi di lunghezza 10
		// inizializzati al valore di default del datatype
	
		
		System.out.println(arrayInteri);
		String stringaDaArray = Arrays.toString(arrayInteri);
		//metodo statico della classe Arrays
		System.out.println(stringaDaArray);
		int[] arrayInteri2 = {4,54, 21, -8, 0, 12};
		Arrays.sort(arrayInteri2);
		//modifica l'array passatogli
		//metodo statico della classe Arrays per ordinare
		//quicksort a 2 pivot (nlogn)
		
		System.out.println(Arrays.toString(arrayInteri2));
		System.out.println("lunghezza="+arrayInteri.length);
		// length non � una chiamata ad un  metodo ma un attributo
		
		System.out.println(arrayInteri2[3]);
		// chiamata dell'elemento per indice
		System.out.println(arrayInteri2[arrayInteri2.length-1]);
		// ultimo elemento
		
		for (int i = 0; i < arrayInteri2.length; i++) {
			//stampa i valori pari
			if(arrayInteri2[i]%2==0) {
				System.out.println(arrayInteri2[i]);
			}
			}
		
		arrayInteri2[0] = 0;
		System.out.println(Arrays.toString(arrayInteri2));
		// sovrascrivo
		
		String[] arrayString = new String[5];
		//valore di default � null
		System.out.println(Arrays.toString(arrayString));
		String[] arrayString2 = {"abc", "def"};
		System.out.println(Arrays.toString(arrayString2));
		
		int[][] arrayMultidim = new int[2][3];
		int[][] arrayMultidim2 = {{1,2},{3,4,5},{6,7}};
		int[][] arrayMultidim3 = {arrayInteri,arrayInteri2};
		System.out.println(arrayMultidim2.length);
		System.out.println(arrayMultidim[0]);
		//Scorrere array bi-dimensionale
		for(int i=0; i< arrayMultidim2.length;i++) {
			System.out.println("sto scorrendo l'array n." +i);
			for(int j = 0; j < arrayMultidim2[i].length;j++) {
				System.out.println(arrayMultidim2[i][j]);
			}
		}
		

	}	
	
	
}
