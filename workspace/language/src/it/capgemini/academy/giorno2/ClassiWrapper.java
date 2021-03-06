package it.capgemini.academy.giorno2;

public class ClassiWrapper {
	
	/*
	 * oggetti wrapper sono oggetti che inscatolano un valore 
	 * di tipo primitivo
	 */
	/*
	 * Wrapper classes provide a way to use primitive 
	 * data types (int, boolean, etc..) as objects.
	 */
	
	public static void main(String[] args) {
		int x = 0;
		Integer y = 100;
		Integer z=100;
		System.out.println(y==z);
		Integer interoW = new Integer(1);
		//boxing
		System.out.println(interoW);
		
		Integer interoW2 = 1; 
		//autoboxing
		int interoP = interoW;
		//autounboxing
		System.out.println(interoW == interoW2); 
		//false, l'uguale confronta gli hashcode quando viene usato tra oggetti
		//solo se 100 ritorna vero
		System.out.println(interoW.equals(interoW2));
		
		//--METODI STATICI
		//true
		int interoP2 = Integer.parseInt("120");
		//restituisce int
		int interoP3 = Integer.valueOf("12");
		//restituisce Integer
		
		boolean b = Boolean.parseBoolean("true");
		String carattere = Character.toString('c');
		
		Character.toLowerCase('K');
		//--METODI DI ISTANZA
		Character c = 'h';
		c.toString();
		int primitivo = 4;
		Integer wrapp = 8;
		metodo(primitivo);
		
	}
	
	static void metodo(Integer n) {
		System.out.println("Int");
	}
	static void metodo(double n) {
		System.out.println("double");
	}
	

}
