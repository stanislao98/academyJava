package it.capgemini.academy.giorno3.model;
//una classe è sottoclasse se nella dichiarazione ripèorta la keywords extend
//Ha bisogno di super, se non c'è super ci vuole nella superclasse una costruttore senza parametri.
public class Studente extends Persona {
	
	private String matricola;
	private String codiceCorso;
	public Studente(String nome, String cognome, String eta, char genere, boolean sposato, String matricola, String codiceCorso) {
		super(nome, cognome, eta, genere, sposato); //chiama il costruttore della superclasse
		this.matricola = matricola;
		this.codiceCorso = codiceCorso;
		// TODO Auto-generated constructor stub
	}
	public Studente() {}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", codiceCorso=" + codiceCorso + "]" + super.toString() + " " + super.getInitials();
	}
	
	
	
}
