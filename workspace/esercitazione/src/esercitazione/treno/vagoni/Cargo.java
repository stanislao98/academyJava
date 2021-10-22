package esercitazione.treno.vagoni;

import esercitazione.treno.Vagone;

public class Cargo extends Vagone {
	private String TipoMerci;
	private double pesoMerci;
	private boolean imballaggio;
	
	
	public Cargo(int id, double pesoBase, String tipoMerci, double pesoMerci, boolean imballaggio) {
		super(id, pesoBase);
		TipoMerci = tipoMerci;
		this.pesoMerci = pesoMerci;
		this.imballaggio = imballaggio;
	}
	
	@Override
	public String toString() {
		return "Cargo [TipoMerci=" + TipoMerci + ", pesoMerci=" + pesoMerci + ", imballaggio=" + imballaggio + "]";
	}

	public double calcolaPeso() {
		if(imballaggio) 
			return super.pesoBase + pesoMerci + 0.10*(super.pesoBase + pesoMerci);
		else
			return super.pesoBase + pesoMerci;
	}

	public String getTipoMerci() {
		return TipoMerci;
	}

	public double getPesoMerci() {
		return pesoMerci;
	}

	public boolean isImballaggio() {
		return imballaggio;
	}

	public void setTipoMerci(String tipoMerci) {
		TipoMerci = tipoMerci;
	}

	public void setPesoMerci(double pesoMerci) {
		this.pesoMerci = pesoMerci;
	}

	public void setImballaggio(boolean imballaggio) {
		this.imballaggio = imballaggio;
	}
	
	
	
}
