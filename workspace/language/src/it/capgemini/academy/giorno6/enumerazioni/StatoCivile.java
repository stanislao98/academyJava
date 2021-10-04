package it.capgemini.academy.giorno6.enumerazioni;

public enum StatoCivile {

	SPOSATO("sposato"), 
	SPOSATA("sposata"),
	CELIBE("celibe"),
	NUBILE("nubile"),
	DIVORZIATO("divorziato"),
	DIVORZIATA("divorziata"), 
	VEDOVO("vedovo"), 
	VEDOVA("vedova");

	private String stato;


	private StatoCivile(String stato) {
		this.stato = stato;

	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

}
