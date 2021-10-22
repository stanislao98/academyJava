package it.capgemini.academy.giorno6.esercizioenum;

import it.capgemini.academy.giorno1.EserciziStringheEIf;
import it.capgemini.academy.giorno4.exception.EtaException;
import it.capgemini.academy.giorno6.enumerazioni.StatoCivile;
import it.capgemini.academy.giorno4.EserciziEccezioni;

public class Persona implements Comparable<Persona> {
	/*
	 * class diagram Persona fields -nome: String -cognome : String -età : int
	 * -genere: char -sposato : boolean
	 * 
	 * methods +stampaIniziali(pubblico) +getIniziali(); String
	 * 
	 * +Persona(nome,cognome,età, genere,sposato)
	 * 
	 * <<constructor>> +allGetters +allSetters +toString
	 */
	private String nome;
	private String cognome;
	private int eta;
	private char genere;
	private StatoCivile stato;

	public Persona(String nome, String cognome, int eta, char genere, StatoCivile stato) {
		this.nome = nome;
		this.cognome = cognome;
		this.stato = stato;

		try {
			EserciziEccezioni.validaEta(eta);
			this.eta = eta;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			this.eta = 0;
		}

		this.genere = genere;
		// this.sposato=sposato;
	}

	public Persona(String nome, String cognome, int eta, char genere, boolean sposato) {
		this.nome = nome;
		this.cognome = cognome;
		setSposato(sposato);

		try {
			EserciziEccezioni.validaEta(eta);
			this.eta = eta;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			this.eta = 0;
		}

		this.genere = genere;
		// this.sposato=sposato;
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
		return (this.stato.getStato() == StatoCivile.SPOSATA.getStato()
				|| this.stato.getStato() == StatoCivile.SPOSATO.getStato());
	}

	public StatoCivile getStatoCivile() {
		return stato;
	}

	public void setStatoCivile(String stato) {
		this.stato.setStato(stato);
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
			this.eta = eta;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void setGenere(char genere) {
		this.genere = genere;
	}

	public void setSposato(boolean sposato) {
		String statoOld = this.stato.getStato().toString();

		if ((this.getSposato()) && (sposato) && (Character.toLowerCase(this.getGenere()) == 'm')) {
			this.stato = StatoCivile.DIVORZIATO;
		} else if ((this.getSposato() && sposato && Character.toLowerCase(this.getGenere()) == 'f'))
			this.stato = StatoCivile.DIVORZIATA;

		if (sposato && !(statoOld == "sposato" || statoOld == "sposata")
				&& Character.toLowerCase(this.getGenere()) == 'm')
			this.stato = StatoCivile.SPOSATO;
		else if (sposato && !(statoOld == "sposata" || statoOld == "sposato")
				&& Character.toLowerCase(this.getGenere()) == 'f')
			this.stato = StatoCivile.SPOSATA;

	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", genere=" + genere + ", sposato="
				+ stato.SPOSATO + "]";
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		if (o.eta > eta) {
			return 1;
		} else if (o.eta < eta) {
			return -1;
		} else
			return 0;
	}

}
