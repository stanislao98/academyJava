package esercitazione.treno.vagoni;

import esercitazione.treno.Vagone;

public class Ristorante extends Vagone{
	private double pesoTavoli;
	private double pesoAttrezzature;
	
	public Ristorante(int id, double pesoBase, double pesoTavoli, double pesoAttrezzature) {
		super(id, pesoBase);
		this.pesoTavoli = pesoTavoli;
		this.pesoAttrezzature = pesoAttrezzature;
	}
	
	@Override
	public String toString() {
		return "Ristorante [pesoTavoli=" + pesoTavoli + ", pesoAttrezzature=" + pesoAttrezzature + "]";
	}

	public double calcolaPeso() {
		return super.pesoBase + pesoTavoli + pesoAttrezzature;
	}

	public double getPesoTavoli() {
		return pesoTavoli;
	}

	public double getPesoAttrezzature() {
		return pesoAttrezzature;
	}

	public void setPesoTavoli(double pesoTavoli) {
		this.pesoTavoli = pesoTavoli;
	}

	public void setPesoAttrezzature(double pesoAttrezzature) {
		this.pesoAttrezzature = pesoAttrezzature;
	}
	
	
	

}
