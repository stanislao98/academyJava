package it.capgemini.academy.giorno7.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.InterfaceAddress;

import it.capgemini.academy.giorno6.esercizioenum.Persona;

public class Reflection {

	public static void main(String[] args) {

		// classe Class. Un'istanza rappresenta una classe
		// non ha costruttore pubblico
		// 3 modi per ottenere istanza

		Class classe = String.class;
		System.out.println(classe);

		String s = "";
		// Tutte le classi ereditano il metodo getClass
		Class classe1 = s.getClass();
		Class classe2 = null;

		try {
			classe2 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(classe.equals(classe1));
		// true
		System.out.println(classe == classe2);
		// true --> viene restituita sempre la stessa istanza
		// analisiClasse(classe2);
		// analisiCostruttori(classe);
		Class<Persona> persona = Persona.class;
		analisiCampi(persona);
		System.out.println("\n\n");
		analisiMetodi(persona);
	}

	private static void analisiClasse(Class classe) {
		System.out.println(classe.isInterface());
		System.out.println(classe.getSuperclass());

		try {
			String s = (String) classe.newInstance();
			Object c = classe.newInstance();
			System.out.println(s);
			System.out.println(c.getClass());
			System.out.println(((String) c).length());

		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void analisiCostruttori(Class classe) {
		Constructor[] arrCostr = classe.getConstructors();
		System.out.println("la classe " + classe.getName() + "ha " + arrCostr.length + " costruttori ");
		for (int i = 0; i < arrCostr.length; i++) {
			System.out.println("\n\n" + arrCostr[i]);
			Class[] parametri = arrCostr[i].getParameterTypes();
			if (parametri.length == 0)
				System.out.println("ha solo il costruttore vuoto");
			else {
				System.out.println("parametri : ");
				for (int j = 0; j < parametri.length; j++) {
					System.out.println("\n" + parametri[j].getName());
				}
			}
		}
	}

	/*
	 * scrivere i metodi analisiCampi e analisiMetodi ispirati a quelli sopra
	 */

	private static void analisiCampi(Class classe) {
		Field campi[] = classe.getDeclaredFields();
		System.out.println("la classe ha " + campi.length);
		for (int i = 0; i < campi.length; i++) {
			System.out.println(campi[i]);
			System.out.println("getName() " + campi[i].getName());
			System.out.println("getType().getName() " + campi[i].getType().getName());

		}

	}

	private static void analisiMetodi(Class classe) {
		Method metodi[] = classe.getMethods();
		for (int i = 0; i < metodi.length; i++) {
			System.out.println(metodi[i]);
			System.out.println("\n\n");
			System.out.println("getModifiers() " + metodi[i].getModifiers());
			System.out.println(Modifier.toString(metodi[i].getModifiers()));
			System.out.println("getParameterTypes() " + metodi[i].getParameterTypes());
			System.out.println("getName() " + metodi[i].getName());
		}
	}
}
