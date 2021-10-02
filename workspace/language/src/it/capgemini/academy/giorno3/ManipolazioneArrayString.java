package it.capgemini.academy.giorno3;

import java.util.Arrays;

import it.capgemini.academy.giorno2.Array;

public class ManipolazioneArrayString {

	public static void main(String[] args) {
		
		String stringa = "esercizi sulle stringhe";
		
		String[] arrayStr = stringa.split(" ");
		
		System.out.println(Arrays.toString(arrayStr));
		
		String stringaRicomposta = "";
		
		//Ricomporre la stringa
		
		for (int i = 0; i < arrayStr.length; i++) {
			stringaRicomposta += arrayStr[i] + " ";
		}
		
		System.out.println(stringaRicomposta);
		
		stringaRicomposta=stringaRicomposta.trim();
		
		System.out.println(stringa.length());//23
		
		System.out.println(stringaRicomposta.length());//24 senza trim
		
		String stringa2 = "parola";
		
		char[] arrChar = stringa2.toCharArray();
		
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println(arrChar[i]);
		}
		
		System.out.println(Arrays.toString(arrChar));
		
		
		
		
	}

}
