package it.capgemini.academy.giorno4.model;

import it.capgemini.academy.giorno3.model.Persona;
import it.capgemini.academy.giorno4.exception.TargaException;
import it.capgemini.academy.giorno4.EserciziEccezioni;


public abstract class Veicolo {
// una classe ASTRATTA non pu? essere istanziata
//si usa in genere per essere a capo di una gerarchia di classi concrete di cui si voglia uniformare
//parte dello stato e del comportamento 
// pu? contenere metodi astratti
	/*
	 * field -proprietario : Persona -targa : String -marca : String -modello :
	 * String -prezzo : int
	 * 
	 * methods +constructor(fields) +constructor()
	 * 
	 * +getters +setters
	 * 
	 * 
	 * 
	 */
	private Persona proprietario;
	private String targa;
	private String marca;
	private String modello;
	private int prezzo;

	public abstract double getimportoBollo();

	public abstract String getTipologia();
	// i metodi astratti non hanno corpo, obbligano tutte le sottoclassi dirette a
	// implementarli

	public Veicolo(Persona proprietario, String targa, String marca, String modello, int prezzo)  {
		// super();
		targa = (String) targa;
		
		//this.targa = checkTarga(targa) ? targa : "targa nulla";

		try {
			EserciziEccezioni.checkTarga(targa);
			this.targa = targa;
		} catch (TargaException e) {
			// TODO: handle exception
			e.printStackTrace();
			this.targa = "targa non valida";
		}
		this.proprietario = proprietario;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
	}

	public Veicolo() {
	}


	
	

	public Persona getProprietario() {
		return proprietario;
	}

	public void setProprietario(Persona proprietario) {
		this.proprietario = proprietario;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa)  {
		//this.targa = checkTarga(targa) ? targa : "Targa nulla";
		try {
			EserciziEccezioni.checkTarga(targa);
			this.targa = targa;
		} catch (TargaException e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Veicolo [proprietario=" + proprietario + ", targa=" + targa + ", marca=" + marca + ", modello="
				+ modello + ", prezzo=" + prezzo + "]";
	}

}
