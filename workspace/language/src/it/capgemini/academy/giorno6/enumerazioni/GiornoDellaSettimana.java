package it.capgemini.academy.giorno6.enumerazioni;

public enum GiornoDellaSettimana {

	LUNEDI(1, "Lunedì",Boolean.FALSE),
	MARTEDI(2, "Martedi",Boolean.FALSE),
	MERCOLEDI(3, "Mercoledi", Boolean.FALSE),
	GIOVEDI(4, "Giovedi", Boolean.FALSE),
	VENERDI(5, "Venerdi", Boolean.FALSE),
	SABATO(6, "Sabato", Boolean.FALSE),
	DOMENICA(7, "Domenica", Boolean.TRUE);
	
	
	private int numeroGiorno;
	private String nome;
	private Boolean festivo;
	
	private GiornoDellaSettimana(int numeroGiorno, String nome, Boolean festivo) {
		this.numeroGiorno = numeroGiorno;
		this.nome = nome;
		this.festivo = festivo;
	}

	public int getNumeroGiorno() {
		return numeroGiorno;
	}

	public String getNome() {
		return nome;
	}

	public Boolean getFestivo() {
		return festivo;
	}

//	public void setNumeroGiorno(int numeroGiorno) {
//		this.numeroGiorno = numeroGiorno;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public void setFestivo(Boolean festivo) {
//		this.festivo = festivo;
//	}
//	
	
	
	
	
	
	
	
}
