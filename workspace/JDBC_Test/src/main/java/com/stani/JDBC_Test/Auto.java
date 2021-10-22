package com.stani.JDBC_Test;

public class Auto {
	private int id;
	private String marca;
	private String targa;
	private String modello;
	private int elettrica;
	private int kw;
	
	
	public Auto(int id, String marca, String targa, String modello, int elettrica, int kw) {
		super();
		this.id = id;
		this.marca = marca;
		this.targa = targa;
		this.modello = modello;
		this.elettrica = elettrica;
		this.kw = kw;
	}
	public Auto() {}
	public int getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public String getTarga() {
		return targa;
	}

	public String getModello() {
		return modello;
	}

	public int getElettrica() {
		return elettrica;
	}

	public int getKw() {
		return kw;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setElettrica(int elettrica) {
		this.elettrica = elettrica;
	}

	public void setKw(int kw) {
		this.kw = kw;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", targa=" + targa + ", modello=" + modello + ", elettrica="
				+ elettrica + ", kw=" + kw + "]";
	}
}
