package it.capgemini.academy.giorno6.eserciziocarta;



public interface CartaPrepagata {
	public void ricarica(double quantita);
	public void prelievo(double quantita);
	public void pagamento(double quantita);
}