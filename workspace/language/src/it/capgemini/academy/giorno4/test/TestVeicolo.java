package it.capgemini.academy.giorno4.test;
import it.capgemini.academy.giorno3.model.Persona;
import it.capgemini.academy.giorno4.model.*;
import it.capgemini.academy.giorno4.exception.TargaException;

public class TestVeicolo {
	public static void main(String[] args) throws TargaException
	{
		
		//Veicolo v = new Veicolo();
		
		//System.out.println(v);
		
		//es. creare due classi Auto e Moto che estendano Veicolo
		
		/*
		 * Auto extends Veicolo
		 * coeffAuto = 4.2
		 * fields
		 * -numero porte: int
		 * -potenzaCV: double
		 * -classeEmissioni : int
		 * 
		 * methods
		 * +getters
		 * +setters
		 * +toString
		 * 
		 * calcola bollo potenza*coeffAuto*(1/classeEmissioni+1)
		 * 
		 * 
		 */
		
		
		/*
		 * MOTO
		 * 
		 * 	coeffMoto = 1.8
		 * 
		 * 
		 * fields
		 * -nCilindri : int
		 * -numeroRuote : int
		 * 
		 * methods
		 * +getters
		 * +setters
		 * +toString
		 *
		 * calcola bollo 10*nCilindri*coeffMoto*numeroRuote
		 * 
		 */
		Persona p = new Persona();
		
		 Moto mo = new Moto();
		 
		 mo.setTarga(null);
		 //System.out.println(mo.getTarga());

		
	}
}
