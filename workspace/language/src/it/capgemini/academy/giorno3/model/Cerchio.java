package it.capgemini.academy.giorno3.model;

import it.capgemini.academy.giorno4.exception.CerchioException;
import it.capgemini.academy.giorno4.EserciziEccezioni;

public class Cerchio {
	//private double x,y;
	public static final double PI = 3.14; 
	private double raggio;
	
	private double[] coord = new double[2];
	// possono essere iniziallizzate qui
	//private double x;
	//private double y;
	// variabili di istanza o campi della classe
	// l'insieme di questi si definisce stato della classe
	public Cerchio(double raggio, double x, double y)  {
		try {
			EserciziEccezioni.validaRaggio(raggio);
			this.raggio = raggio;

		} catch (CerchioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// this.keyword che simboleggia l'istanza a cui ? riferito il metodo
		this.coord[0] = x;
		this.coord[1] = y;
//		this.x = x;
//		this.y = y;
		
		//metodo di istanza (straamente) considerato cone riferito all'istanza stessa
		
		
	}
	public Cerchio(double raggio) {
		try {
			EserciziEccezioni.validaRaggio(raggio);
			this.raggio = raggio;
		} catch (CerchioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public double getRaggio() {
		return raggio;
	}
	public double getX() {
		//return x;
		return coord[0];
	}
	public double getY() {
		//return y;
		return coord[1];
	}
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	public void setX(double x) {
		//this.x = x;
		this.coord[0] = x;
	}
	public void setY(double y) {
		//this.y = y;
		this.coord[1] = y;
	}
	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + ", x=" + coord[0] + ", y=" + coord[1] + "]";
	}
	
	//abbiamo sovrascritto o implementato in maniera polimorfica il metodo toString
	//ESEMPIO DI POLIMORFISMO
	public double getArea() {
		return PI*Math.pow(raggio,2);
	}
	
	public double getCirconferenza() {
		return 2*raggio*PI;
	}//ESEMPIO DI INCAPSULAMENTO
	
	public static Cerchio cerchioDaCirconferenza(double circ) {
		return new Cerchio(circ/2*PI);
	}
	//abbiamo sovrascritto o implementato in maniera polimorfica il metodo toString
	
	
}
