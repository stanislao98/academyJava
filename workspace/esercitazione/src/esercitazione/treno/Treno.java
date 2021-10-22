package esercitazione.treno;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;



import esercitazione.treno.eccezioni.numMassimoMotriciException;
import esercitazione.treno.eccezioni.numMassimoRistorantiException;
import esercitazione.treno.vagoni.Cargo;
import esercitazione.treno.vagoni.Motrice;
import esercitazione.treno.vagoni.Passeggeri;
import esercitazione.treno.vagoni.Ristorante;

public class Treno {

	private String nome;
	private double pesoTotale;
	private LinkedList<Vagone> listaVagoni = new LinkedList<>();

	public Treno(String nome) {
		this.nome = nome;
	}

	public void calcolaPesoTotale() {
		//ho dimenticato di svuotare la variabile pesoTotale
		this.pesoTotale = 0.;
		listaVagoni.forEach(vagone -> {
			this.pesoTotale += vagone.calcolaPeso();
		});
	}
	
//TODO : KSLAKLS
//	public void aggiungiVagone(Vagone vagone) throws numMassimoMotriciException, numMassimoRistorantiException {
//		int numMotrice = 0;
//		int numRistoranti = 0;
//		int numAltriVagoni = 0;
//
//		for (Vagone v : listaVagoni) {
//			if (v.getTipoVagone().equals(TipoVagone.MOTRICE))
//				numMotrice++;
//			if (v.getTipoVagone().equals(TipoVagone.RISTORANTE))
//				numRistoranti++;
//			if (v.getTipoVagone().equals(TipoVagone.PASSEGGERI) || v.getTipoVagone().equals(TipoVagone.CARGO))
//				numAltriVagoni++;
//		}
//
//		switch (vagone.getTipoVagone()) {
//		case MOTRICE:
//			// controlla il numero di vagoni Motrice
//			if (numMotrice == 2)
//				throw new numMassimoMotriciException();
//			else if (numMotrice == 0) {
//		
//				listaVagoni.addLast(vagone);
//				calcolaPesoTotale();
//			} else if (numMotrice == 1) {
//			
//					listaVagoni.addFirst(vagone);
//					calcolaPesoTotale();
//			}
//				
//			break;
//		case RISTORANTE:
//			if (numRistoranti == 1)
//				throw new numMassimoRistorantiException();
//			else {
//				listaVagoni.add(listaVagoni.size() / 2, vagone);
//				calcolaPesoTotale();
//			}
//
//			break;
//		default:
//			if (numAltriVagoni % 2 == 0 && listaVagoni.size() != 0) {
//				listaVagoni.add(1, vagone);
//				calcolaPesoTotale();
//			} else if (numAltriVagoni % 2 != 0 && numMotrice == 1) {
//				listaVagoni.add(listaVagoni.size() - 1, vagone);
//				calcolaPesoTotale();
//
//			} else if (numAltriVagoni % 2 != 0 && numMotrice == 2) {
//				listaVagoni.add(listaVagoni.size() -1 , vagone);
//				calcolaPesoTotale();
//			} else if (numAltriVagoni % 2 != 0 && numMotrice == 0) {
//				listaVagoni.add(1,vagone);
//			} else if (listaVagoni.size() == 0) {
//				listaVagoni.add(vagone);
//				calcolaPesoTotale();
//			}
//			break;
//		}
//
//	}
	
	
	
	public void aggiungiVagone(Vagone vagone) throws numMassimoMotriciException, numMassimoRistorantiException {
		int numMotrice = 0;
		int numRistoranti = 0;
		int numAltriVagoni = 0;

		for (Vagone v : listaVagoni) {
			if (v instanceof Motrice )
				numMotrice++;
			if (v instanceof Ristorante)
				numRistoranti++;
			if (v instanceof Passeggeri || v instanceof Cargo)
				numAltriVagoni++;
		}

		
		if (vagone instanceof Motrice) {
			// controlla il numero di vagoni Motrice
			if (numMotrice == 2)
				throw new numMassimoMotriciException();
			else if (numMotrice == 0) {
		
				listaVagoni.addLast(vagone);
				calcolaPesoTotale();
			} else if (numMotrice == 1) {
			
					listaVagoni.addFirst(vagone);
					calcolaPesoTotale();
			}
				
		}
		
		if (vagone instanceof Ristorante) {
		
			if (numRistoranti == 1)
				throw new numMassimoRistorantiException();
			else {
				listaVagoni.add(listaVagoni.size() / 2, vagone);
				calcolaPesoTotale();
			}

		}
		
		if (vagone instanceof Passeggeri || vagone instanceof Cargo) {
		
			if (numAltriVagoni % 2 == 0 && listaVagoni.size() != 0) {
				listaVagoni.add(1, vagone);
				calcolaPesoTotale();
			} else if (numAltriVagoni % 2 != 0 && numMotrice == 1) {
				listaVagoni.add(listaVagoni.size() - 1, vagone);
				calcolaPesoTotale();

			} else if (numAltriVagoni % 2 != 0 && numMotrice == 2) {
				listaVagoni.add(listaVagoni.size() -1 , vagone);
				calcolaPesoTotale();
			} else if (numAltriVagoni % 2 != 0 && numMotrice == 0) {
				listaVagoni.add(1,vagone);
			} else if (listaVagoni.size() == 0) {
				listaVagoni.add(vagone);
				calcolaPesoTotale();
			}
			
		}
	}

	

	public void scriviTreno() {

		boolean controlloCreazione = false;
		File file = new File("C:\\Users\\stani\\OneDrive\\Desktop\\treno.txt");

		if (file.exists())
			System.out.println("esiste gia");
		else
			try {
				controlloCreazione = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		if (controlloCreazione)
			System.out.println("creato il file " + file.getName());
		else
			System.out.println("impossibile creare");

		FileWriter writer = null;
		BufferedWriter buffWriter = null;

		try {
			writer = new FileWriter(file, true);
			buffWriter = new BufferedWriter(writer);
			for (Vagone v : listaVagoni) {
				buffWriter.write("\n" + v.toString());
			}
			System.out.println("file scritto");
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

	public String getNome() {
		return nome;
	}

	public double getPesoTotale() {
		return pesoTotale;
	}

	public LinkedList<Vagone> getListaVagoni() {
		return listaVagoni;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPesoTotale(double pesoTotale) {
		this.pesoTotale = pesoTotale;
	}

	public void setListaVagoni(LinkedList<Vagone> listaVagoni) {
		this.listaVagoni = listaVagoni;
	}

}
