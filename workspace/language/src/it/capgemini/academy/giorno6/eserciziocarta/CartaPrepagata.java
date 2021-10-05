package it.capgemini.academy.giorno6.eserciziocarta;

import java.util.ArrayList;

import it.capgemini.academy.giorno6.eserciziocarta.exception.pagamentoMassimoException;
import it.capgemini.academy.giorno6.eserciziocarta.exception.prelievoMassimoException;


// b alla carta prepagata va aggiunta una funzionalità (nuovo metodo
// interfaccia) di logging dei movimenti,
// una di stampa(in console) lista movimenti e una di download lista
// movimenti--> genera un file
// (opz) strutturare il main di test come una UI stile bancomat
// classe Movimento

/*
 * classe Movimento
 * 
 * fields -tipo : TipoMovimento (creare enum statico interno) 
 * -importo: double
 * -data : java.util.Date (ricordare che il costruttore vuoto restituisce
 * un'istanza con data e ora dell'istanziamento
 * 
 * (opzionale) metodi di ordinamento per importo e per data della lista
 * 
 */




public interface CartaPrepagata {
	public void ricarica(double quantita);
	public void prelievo(double quantita) throws prelievoMassimoException;
	public void pagamento(double quantita) throws pagamentoMassimoException;
	public void logging(Movimento movimento);
	public void stampaMovimenti();
	public void downloadMovimenti();
	public void ordinaPerImporto();
}
