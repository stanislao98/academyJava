//	public void prelievo(double quantita) throws prelievoMassimoException {
//
//		if (quantita > 1000)
//			throw new prelievoMassimoException();
//		
//		if (this.saldo - quantita < 0)
//			throw new prelievoMassimoException();
//		else {
//			this.saldo -= (quantita + COMMISSIONEPRELIEVO);
//			this.ultimoMovimento = new Date(System.currentTimeMillis());
//
//		}
//	}
package it.capgemini.academy.giorno6.eserciziocarta;

import java.util.Date;

import it.capgemini.academy.giorno6.eserciziocarta.exception.pagamentoMassimoException;
import it.capgemini.academy.giorno6.eserciziocarta.exception.prelievoMassimoException;
import it.capgemini.academy.giorno6.esercizioenum.Persona;

public class Carta implements CartaPrepagata {
	/*
	 * creare un'interfaccia "CartaPrepagata" che espone i metodi "ricarica",
	 * "prelievo", "pagamento"
	 * 
	 * due classi "Carta" e "CartaGold" con il seguente stato
	 * 
	 * -numCarta: String -intestatario: Persona -saldo : double -punti : int (solo
	 * Gold) -ultimoMovimento : java.util.Date (opzionale)
	 * 
	 * fare in modo che non sia possibile a chiunque di modificare il saldo
	 * aggirando i metodi esposti dall'interfaccia.
	 * 
	 * IL SALDO NON PU� ESSERE NEGATIVO il prelievo massimo � di 1000 per la normale
	 * e 2000 per la gold sollevare un'eccezione custom in caso di violazione
	 * 
	 * implementare i metodi dell'interfaccia tenedo conto che -la carta normale ha
	 * una commissione di 2 euro per la ricarica e la gold no -il prelievo ha una
	 * commissione di 2 euro per la normale e 1 per la gold -ogni 10 euro di
	 * pagamento con gold danno un punto
	 * 
	 * testare le funzionalit�
	 */
	private String numCarta;
	private Persona intestatario;
	private double saldo;
	private Date ultimoMovimento;
	private static final int COMMISSIONERICARICA = 2;
	private static final int COMMISSIONEPRELIEVO = 2;

	public Carta(String numCarta, Persona intestatario, double saldo, Date ultimoMovimento) {
		super();
		this.numCarta = numCarta;
		this.intestatario = intestatario;
		this.saldo = saldo;
		this.ultimoMovimento = ultimoMovimento;
	}

	public void ricarica(double quantita) {
		this.saldo += quantita - COMMISSIONERICARICA;
		this.ultimoMovimento = new Date(System.currentTimeMillis());

	}


	public void prelievo(double quantita) {

		try {
			if (quantita > 1000)
				throw new prelievoMassimoException();
			if (this.saldo - quantita - COMMISSIONEPRELIEVO < 0)
				throw new prelievoMassimoException();
			this.saldo -= (quantita + COMMISSIONEPRELIEVO);
			this.ultimoMovimento = new Date(System.currentTimeMillis());
		} catch (prelievoMassimoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void pagamento(double quantita) {
		try {
			if (this.saldo - quantita < 0)
				throw new pagamentoMassimoException();
			this.saldo -= quantita;
			this.ultimoMovimento = new Date(System.currentTimeMillis());
		} catch (pagamentoMassimoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getNumCarta() {
		return numCarta;
	}

	public Persona getIntestatario() {
		return intestatario;
	}

	public double getSaldo() {
		return saldo;
	}

	public Date getUltimoMovimento() {
		return ultimoMovimento;
	}

	public void setNumCarta(String numCarta) {
		this.numCarta = numCarta;
	}

	public void setIntestatario(Persona intestatario) {
		this.intestatario = intestatario;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setUltimoMovimento(Date ultimoMovimento) {
		this.ultimoMovimento = ultimoMovimento;
	}

}