package it.capgemini.academy.giorno3.model;

import it.capgemini.academy.giorno1.EserciziStringheEIf;
import it.capgemini.academy.giorno4.exception.EtaException;
import it.capgemini.academy.giorno4.EserciziEccezioni;

public class Persona {
	/*
	 * class diagram Persona fields -nome: String -cognome : String -et? : int
	 * -genere: char -sposato : boolean
	 * 
	 * methods +stampaIniziali(pubblico) +getIniziali(); String
	 * 
	 * +Persona(nome,cognome,et?, genere,sposato)
	 * 
	 * <<constructor>> +allGetters +allSetters +toString
	 */
	private String nome;
	private String cognome;
	private int eta;
	private char genere;
	private boolean sposato;

	public Persona(String nome, String cognome, int eta,char genere, boolean sposato) {
		this.nome = nome;
		this.cognome = cognome;
		
		try {
			EserciziEccezioni.validaEta(eta);
			this.eta = eta;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			this.eta = 0;
		}
		this.genere=genere;
		this.sposato=sposato;
	}
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	public Persona() {
		super();
	}
	
//	private void validaEta (String eta) throws EtaException {
//		if (Integer.parseInt(eta) < 0) {
//			throw new EtaException();
//		}
//	}
		

	public String getInitials() {
		return EserciziStringheEIf.ritornaIniziali(this.nome, this.cognome);
	}

	public void printInitials() {
		System.out.println(EserciziStringheEIf.ritornaIniziali(this.nome, this.cognome));
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEta() {
		return eta;
	}
	
	public char getGenere() {
		return genere;
	}
	
	public boolean getSposato() {
		return sposato;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setEta(int eta) {
		try {
			EserciziEccezioni.validaEta(eta);
			this.eta = 0;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	public void setGenere(char genere) {
		this.genere = genere;
	}
	
	public void setSposato(boolean sposato) {
		this.sposato = sposato;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", genere=" + genere + ", sposato="
				+ sposato + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		//result = prime * result + ((eta == null) ? 0 : eta.hashCode());
		result = prime * result + genere;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Persona other = (Persona) obj;
//		if (cognome == null) {
//			if (other.cognome != null)
//				return false;
//		} else if (!cognome.equals(other.cognome))
//			return false;
//		if (eta == null) {
//			if (other.eta != null)
//				return false;
//		} else if (!eta.equals(other.eta))
//			return false;
//		if (genere != other.genere)
//			return false;
//		if (nome == null) {
//			if (other.nome != null)
//				return false;
//		} else if (!nome.equals(other.nome))
//			return false;
//		return true;
//	}
	
	
}
