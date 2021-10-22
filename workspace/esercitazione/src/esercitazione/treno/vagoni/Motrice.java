package esercitazione.treno.vagoni;

import esercitazione.treno.Vagone;

public class Motrice extends Vagone {

	private double pesoMotore;
	private int potenza;

	public Motrice(int id, double pesoBase, double pesoMotore, int potenza) {
		super(id, pesoBase);
		this.pesoMotore = pesoMotore;
		this.potenza = potenza;
	}
	
	@Override
	public String toString() {
		return "Motrice [pesoMotore=" + pesoMotore + ", potenza=" + potenza + "]";
	}

	public double calcolaPeso() {
		return super.pesoBase + pesoMotore;
	}

	public double getPesoMotore() {
		return pesoMotore;
	}

	public int getPotenza() {
		return potenza;
	}

	public void setPesoMotore(double pesoMotore) {
		this.pesoMotore = pesoMotore;
	}

	public void setPotenza(int potenza) {
		this.potenza = potenza;
	}

}
