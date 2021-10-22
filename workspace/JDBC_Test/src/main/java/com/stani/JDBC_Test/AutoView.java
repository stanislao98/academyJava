package com.stani.JDBC_Test;
//Vista di una identità
public class AutoView {
	private String marca;
	private String targa;
	private String modello;
	
	
	
	public String getMarca() {
		return marca;
	}
	public String getTarga() {
		return targa;
	}
	public String getModello() {
		return modello;
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
	@Override
	public String toString() {
		return "AutoView [marca=" + marca + ", targa=" + targa + ", modello=" + modello + "]";
	}
	
}
