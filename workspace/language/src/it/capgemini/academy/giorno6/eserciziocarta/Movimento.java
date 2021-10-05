package it.capgemini.academy.giorno6.eserciziocarta;

import java.util.Date;

public class Movimento {
	public static enum TipoMovimento {
		PRELIEVO, RICARICA, PAGAMENTO;

	}

	private TipoMovimento tipo;
	private double importo;
	private Date data;

	public Movimento(TipoMovimento tipo, double importo, Date data) {
		this.tipo = tipo;
		this.importo = importo;
		this.data = data;
	}

	public TipoMovimento getTipo() {
		return tipo;
	}

	public double getImporto() {
		return importo;
	}

	public Date getData() {
		return data;
	}

	public void setTipo(TipoMovimento tipo) {
		this.tipo = tipo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Movimento [tipo=" + tipo + ", importo=" + importo + ", data=" + data + "]";
	}
	
	
	
	
}
