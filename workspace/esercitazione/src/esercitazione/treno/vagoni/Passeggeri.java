package esercitazione.treno.vagoni;

import esercitazione.treno.Vagone;

public class Passeggeri extends Vagone {
	private int numPasseggeri;
	private final int PESOMEDIO = 70;
	
	
	public Passeggeri(int id, double pesoBase, int numPasseggeri) {
		super(id, pesoBase);
		this.numPasseggeri = numPasseggeri;
	}
	
	@Override
	public String toString() {
		return "Passeggeri [numPasseggeri=" + numPasseggeri + ", PESOMEDIO=" + PESOMEDIO + "]";
	}

	public double calcolaPeso() {
		return super.pesoBase + PESOMEDIO*numPasseggeri;
	}

	public int getNumPasseggeri() {
		return numPasseggeri;
	}

	public int getPESOMEDIO() {
		return PESOMEDIO;
	}

	public void setNumPasseggeri(int numPasseggeri) {
		this.numPasseggeri = numPasseggeri;
	}
	
	

}
