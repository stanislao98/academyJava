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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import it.capgemini.academy.giorno6.eserciziocarta.Movimento.TipoMovimento;
import it.capgemini.academy.giorno6.eserciziocarta.comparatori.ComparatorImporto;
import it.capgemini.academy.giorno6.eserciziocarta.exception.pagamentoMassimoException;
import it.capgemini.academy.giorno6.eserciziocarta.exception.prelievoMassimoException;
import it.capgemini.academy.giorno6.esercizioenum.Persona;
import it.capgemini.academy.giorno6.io.InputOutput;

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
	 * IL SALDO NON PUò ESSERE NEGATIVO il prelievo massimo è di 1000 per la normale
	 * e 2000 per la gold sollevare un'eccezione custom in caso di violazione
	 * 
	 * implementare i metodi dell'interfaccia tenedo conto che -la carta normale ha
	 * una commissione di 2 euro per la ricarica e la gold no -il prelievo ha una
	 * commissione di 2 euro per la normale e 1 per la gold -ogni 10 euro di
	 * pagamento con gold danno un punto
	 * 
	 * testare le funzionalità
	 */
	private String numCarta;
	private Persona intestatario;
	private double saldo;
	private Date ultimoMovimento;
	private static final int COMMISSIONERICARICA = 2;
	private static final int COMMISSIONEPRELIEVO = 2;
	private ArrayList<Movimento> listaMovimenti = new ArrayList<>();
	private Logger logger;
	
	
	public void setLogging() {
		Logger logger = Logger.getLogger("logMovimento");
		logger.setLevel(Level.ALL);

		FileHandler fileHandler = null;

		try {
			fileHandler = new FileHandler("movimento.xml");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.addHandler(fileHandler);
		this.logger = logger;
	}

	
	

	public Carta(String numCarta, Persona intestatario, double saldo, Date ultimoMovimento) {
		super();
		this.numCarta = numCarta;
		this.intestatario = intestatario;
		this.saldo = saldo;
		this.ultimoMovimento = ultimoMovimento;
		setLogging();
	}

	
	public void logging(Movimento movimento) {
		
		logger.info(movimento.toString());
	}
	
	public void stampaMovimenti () {
		for (Movimento m : listaMovimenti) {
			System.out.println(m);
		}
	}
	
	public void downloadMovimenti () {
		String PATH = "C:\\Users\\stani\\OneDrive\\Desktop\\academyJava\\workspace\\language\\src\\it\\capgemini\\academy\\movimento.txt";
		File file = new File(PATH);
		InputOutput.creaFile(file);
		
		FileWriter writer = null;
		BufferedWriter buffWriter = null;
		
		try {
			writer = new FileWriter(file, true);
			buffWriter = new BufferedWriter(writer);
			for(Movimento m : listaMovimenti)
				buffWriter.write("\n" + m.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (buffWriter != null)
					buffWriter.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public void ordinaPerImporto() {
		ComparatorImporto compImporto = new ComparatorImporto();
		this.listaMovimenti.sort(compImporto);
		
	}
	public void ricarica(double quantita) {
		this.saldo += quantita - COMMISSIONERICARICA;
		this.ultimoMovimento = new Date(System.currentTimeMillis());
		Movimento movimento = new Movimento(TipoMovimento.RICARICA, quantita, this.ultimoMovimento);
		logging(movimento);
		listaMovimenti.add(movimento);


	}

	public void prelievo(double quantita) throws prelievoMassimoException {

		if (quantita > 1000)
			throw new prelievoMassimoException();
		if (this.saldo - quantita - COMMISSIONEPRELIEVO < 0)
			throw new prelievoMassimoException();
		this.saldo -= (quantita + COMMISSIONEPRELIEVO);
		this.ultimoMovimento = new Date(System.currentTimeMillis());
		Movimento movimento = new Movimento(TipoMovimento.PRELIEVO, quantita, this.ultimoMovimento);
		logging(movimento);
		listaMovimenti.add(movimento);


	}

	public void pagamento(double quantita) throws pagamentoMassimoException {

		if (this.saldo - quantita < 0)
			throw new pagamentoMassimoException();
		this.saldo -= quantita;
		this.ultimoMovimento = new Date(System.currentTimeMillis());
		Movimento movimento = new Movimento(TipoMovimento.PAGAMENTO, quantita, this.ultimoMovimento);
		logging(movimento);
		listaMovimenti.add(movimento);

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
