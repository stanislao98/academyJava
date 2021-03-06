package it.capgemini.academy.giorno4.model;

import it.capgemini.academy.giorno3.model.Persona;

public class Moto extends Veicolo {
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
	
	private static final double COEFF = 1.8;
	
	private int nCilindri;
	private int numeroRuote;
	
	
	
	
	
	public Moto(Persona proprietario, String targa, String marca, String modello, int prezzo, int nCilindri,int numeroRuote) {
		super(proprietario, targa, marca, modello, prezzo);
		this.nCilindri = nCilindri;
		this.numeroRuote = numeroRuote;
	}
	
	public Moto() {
		
	};
	public int getnCilindri() {
		return nCilindri;
	}
	public void setnCilindri(int nCilindri) {
		this.nCilindri = nCilindri;
	}
	public int getNumeroRuote() {
		return numeroRuote;
	}
	public void setNumeroRuote(int numeroRuote) {
		this.numeroRuote = numeroRuote;
	}
	public double getCoeff() {
		return COEFF;
	}
	
	@Override
	public double getimportoBollo() {
		return 10*nCilindri*COEFF*numeroRuote;
		
	};
	@Override
	public String getTipologia() {
		return "Moto";
	}

	@Override
	public String toString() {
		return "Moto [nCilindri=" + nCilindri + ", numeroRuote=" + numeroRuote + ", getnCilindri()=" + getnCilindri()
				+ ", getNumeroRuote()=" + getNumeroRuote() + ", getCoeff()=" + getCoeff() + ", getimportoBollo()="
				+ getimportoBollo() + ", getTipologia()=" + getTipologia() + ", getProprietario()=" + getProprietario()
				+ ", getTarga()=" + getTarga() + ", getMarca()=" + getMarca() + ", getModello()=" + getModello()
				+ ", getPrezzo()=" + getPrezzo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	//non vuota di 7 caratteri
	
	
	
	
}
