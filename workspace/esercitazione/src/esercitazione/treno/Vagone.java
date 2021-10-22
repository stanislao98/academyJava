package esercitazione.treno;

public abstract class Vagone {
	private int id;
 	public double pesoBase;
 	//private TipoVagone tipoVagone;
 	public abstract double calcolaPeso();
 	
// 	public enum TipoVagone {
// 		MOTRICE,
// 		CARGO,
// 		PASSEGGERI,
// 		RISTORANTE;
// 	}
 	
 	public Vagone (int id, double pesoBase) {
 		//this.tipoVagone = tipoVagone;
 		this.id = id;
 		this.pesoBase = pesoBase;
 	}

	public int getId() {
		return id;
	}

	public double getPesoBase() {
		return pesoBase;
	}

//	public TipoVagone getTipoVagone() {
//		return tipoVagone;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPesoBase(double pesoBase) {
		this.pesoBase = pesoBase;
	}

//	public void setTipoVagone(TipoVagone tipoVagone) {
//		this.tipoVagone = tipoVagone;
//	}

	@Override
	public String toString() {
		return "Vagone [id=" + id + ", pesoBase=" + pesoBase + "]";
	}
 	
 	
}
