package it.capgemini.academy.giorno3.test;

import it.capgemini.academy.giorno3.model.Cerchio;
import it.capgemini.academy.giorno3.model.Persona;
import it.capgemini.academy.giorno4.exception.CerchioException;


public class TestCerchio {
	public static void main(String[] args) throws CerchioException {

		Cerchio c = new Cerchio(10, 0, 0);
		System.out.println(c.getRaggio());
		
		c.setRaggio(3);
		
		System.out.println(c);
		
		System.out.println(c.getCirconferenza());
		
		System.out.println(c.getX());
		Cerchio c2 = Cerchio.cerchioDaCirconferenza(0);

	}
}
