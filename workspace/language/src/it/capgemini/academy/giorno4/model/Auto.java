package it.capgemini.academy.giorno4.model;
import it.capgemini.academy.giorno3.model.Persona;

public class Auto extends Veicolo implements EsempioInterfaccia {
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
	//private double importoBollo;
	private static final double COEFFAUTO = 4.2;
	private int numeroPorte;
	private double potenzaCV;
	private int classeEmissioni;
	
	@Override
	public void mettiInMoto() {
		System.out.println("VROOM");
	}
	
	
	public Auto(Persona proprietario, String targa, String marca, String modello, int prezzo, int numeroPorte,
			double potenzaCV, int classeEmissioni) {
		super(proprietario, targa, marca, modello, prezzo);
		this.numeroPorte = numeroPorte;
		this.potenzaCV = potenzaCV;
		this.classeEmissioni = classeEmissioni;
	}
	

	public int getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
	public double getPotenzaCV() {
		return potenzaCV;
	}
	public void setPotenzaCV(double potenzaCV) {
		this.potenzaCV = potenzaCV;
	}
	public int getClasseEmissioni() {
		return classeEmissioni;
	}
	public void setClasseEmissioni(int classeEmissioni) {
		this.classeEmissioni = classeEmissioni;
	}
	
	@Override
	public double getimportoBollo() {
		return potenzaCV*COEFFAUTO*(1/classeEmissioni +1);
		
	};
	@Override
	public String getTipologia() {
		return "Auto";
	}

	@Override
	public String toString() {
		return "Auto [numeroPorte=" + numeroPorte + ", potenzaCV=" + potenzaCV + ", classeEmissioni=" + classeEmissioni
				+ ", getNumeroPorte()=" + getNumeroPorte() + ", getPotenzaCV()=" + getPotenzaCV()
				+ ", getClasseEmissioni()=" + getClasseEmissioni() + ", getimportoBollo()=" + getimportoBollo()
				+ ", getTipologia()=" + getTipologia() + ", getProprietario()=" + getProprietario() + ", getTarga()="
				+ getTarga() + ", getMarca()=" + getMarca() + ", getModello()=" + getModello() + ", getPrezzo()="
				+ getPrezzo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	
}
