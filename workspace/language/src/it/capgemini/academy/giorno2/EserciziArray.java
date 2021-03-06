package it.capgemini.academy.giorno2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

import javax.print.DocFlavor.STRING;

public class EserciziArray {

	public static void main(String[] args) {
		//String[] arrayString = { "Ciao", "soffitto", "casco", "cane", "gatto" };
		//int[] arrayInt = { -1, -4, -5, -8, 9 };
		//printStringWithS(arrayString);
		//System.out.println(findMax1(arrayInt));
		//System.out.println(contains(-1, arrayInt));
		// System.out.println(IntStream.of(arrayInt).toArray());
		System.out.println(reverseString("Buongiorno a tutti quanti"));
		System.out.println(capitalizeCharacter("Buongiorno a tutti", 'a'));
		System.out.println(invertCharacters("ciao tutti"));
		System.out.println(invertWords("Ciao a tutti"));
		System.out.println(palindroma("i topi non avevano nipoti"));
		mixWords("i topi non avevano nipoti");
		mixWords1("i topi non avevano nipoti");

	}

	// 1 fornito un array di interi, restituire la somma dei valori
	public static int sumArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;

	}

	// 2 fornito un array di stringhe, stampare tutte le stringhe che contengono la
	// lettera 's'

	public static void printStringWithS(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].contains("s"))
				System.out.println(array[i]);
		}

	}

	// 3 fornito un array di interi, restituire il valore massimo
	public static int findMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	public static int findMax1(int[] array) {
		int[] arraySorted = IntStream.of(array).sorted().toArray();
		return arraySorted[array.length - 1];
	}

	// 4 scrivere un metodo "boolean contains(int n, int[] array)"
	// che restituisce true se n ? presente nell'array
	public static boolean contains(int n, int[] array) {
		boolean contains = false;

		// return IntStream.of(array).anyMatch(x -> x == n);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n)
				contains = true;
		}
		return contains;
	}
	
	
	//5 fornita una stringa che rappresenta una frase, restituire il numero di parole
	
	public static int numWords (String stringa) {
		String[] array = stringa.split(" ");
		return array.length;
	}
	
	//6 fornita una stringa che rappresenta una frase, restituire una stringa composta dalle
	// stesse parole ma con la prima e l'ultima invertite
	
	public static String reverseString(String stringa) {
		String[] array = stringa.split(" ");
		String primoElemento = array[0];
		array[0] = array[array.length - 1];
		array[array.length-1] = primoElemento;
		
		return ricomponi(array);
	}
	
	public static String ricomponi (String[] array) {
		String stringaRicomposta="";
		for (int i = 0; i < array.length; i++) {
			stringaRicomposta += array[i] + " ";
		}
		return stringaRicomposta.trim();
	}
	
	//7 fornita una stringa, se la stringa contiene la lettera 'a', sostituirla con la maiuscola
	// 'A'
	// opzionale: fornire in ingresso il carattere da capitalizzare.
	
	public static String capitalizeCharacter(String stringa, char c) {
		String[] array = stringa.split(" ");
		for (int i = 0; i < array.length; i++) {
			
			
			if (array[i].indexOf(c) != -1) 
				
				//array[i].setCharAt(array[i].indexOf(c), Character.toUpperCase(c));
			array[i] = array[i].substring(0,array[i].indexOf(c)) + Character.toUpperCase(c)+array[i].substring(array[i].indexOf(c)+1);


		}
		return ricomponi(array);
		
		
	}
	//8 restituire una stringa invertita rispetto a quella fornita (i caratteri)
	
	public static String invertCharacters(String stringa) {
		String[] array = stringa.split(" ");
		char[] ch;
		for (int i = 0; i < array.length; i++) {
			ch = array[i].toCharArray();
			char temp;
			for (int j = 0; j < ch.length /2; j++) {
				temp = ch[j];
				ch[j] = ch[ch.length - 1 - j];
				ch[ch.length - 1 - j] = temp;
			}
			array[i] = String.valueOf(ch);
		}
		return ricomponi(array);
	}
	
	//9 restire una stringa con le parole in ordine inverso
	public static String invertWords(String stringa) {
		String[] array = stringa.split(" ");
		String temp;
		for (int i = 0; i < array.length /2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 -i];
			array[array.length - 1 - i] = temp;
		}
		return ricomponi(array);
	}
	 
	//10 restituire true se la stringa fornita ? una frase palindroma, ignorando gli spazi.
	public static boolean palindroma(String stringa) {
		boolean b = false;
		stringa=stringa.toLowerCase();
		stringa = stringa.replaceAll("\\s","");

		char[] ch=stringa.toCharArray();
		//System.out.println(ch);
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ch[ch.length - 1 - i])
				count++;
		}
		if (count == ch.length) 
			b=true;
		
		return b;


}
		//11 mischiare a caso le parole in una stringa
	public static void mixWords(String stringa) {
		String[] array = stringa.split(" ");
		Collections.shuffle(Arrays.asList(array));
		System.out.println(ricomponi(array));
		
		
	}
	public static void mixWords1(String stringa) {
		Random random = new Random();
        random.nextInt();
		String[] array = stringa.split(" ");
		for (int i = 0; i < array.length; i++) {
			int change = random.nextInt(array.length);
			String temp = array[i];
			array[i] = array[change];
			array[change] = temp;
		}
		System.out.println(ricomponi(array));
	}
}
