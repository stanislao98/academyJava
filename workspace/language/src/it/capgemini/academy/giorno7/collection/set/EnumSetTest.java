package it.capgemini.academy.giorno7.collection.set;

import java.util.EnumSet;

import it.capgemini.academy.giorno6.enumerazioni.GiornoDellaSettimana;

public class EnumSetTest {

	public static void main(String[] args) {
		EnumSet<GiornoDellaSettimana> es = EnumSet.allOf(GiornoDellaSettimana.class);
		// non ha costruttori pubblici
		System.out.println(es);
		es.add(GiornoDellaSettimana.DOMENICA);
		System.out.println(es);

		EnumSet<GiornoDellaSettimana> es2 = EnumSet.noneOf(GiornoDellaSettimana.class);
		System.out.println(es2);
		es2.add(GiornoDellaSettimana.MARTEDI);
		es2.add(GiornoDellaSettimana.GIOVEDI);

		System.out.println(es2);// ordina in base all'ordine che hanno nell'enum

		EnumSet<GiornoDellaSettimana> es3 = EnumSet.of(GiornoDellaSettimana.MERCOLEDI, GiornoDellaSettimana.DOMENICA,
				GiornoDellaSettimana.SABATO);
		
		EnumSet<GiornoDellaSettimana> es4 = EnumSet.range(GiornoDellaSettimana.MERCOLEDI,GiornoDellaSettimana.SABATO);
		System.out.println(es4);

	}

}
