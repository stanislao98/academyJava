package esercitazione.treno;

import java.util.LinkedList;

import esercitazione.treno.eccezioni.numMassimoMotriciException;
import esercitazione.treno.eccezioni.numMassimoRistorantiException;
import esercitazione.treno.vagoni.Cargo;
import esercitazione.treno.vagoni.Motrice;
import esercitazione.treno.vagoni.Passeggeri;
import esercitazione.treno.vagoni.Ristorante;

public class TestTreno {
	public static void main(String[] args) {
		Motrice v1 = new Motrice(12, 23.4, 10, 10);
		Cargo v2 = new Cargo(20, 10, "A", 20, true);
		Passeggeri v3 = new Passeggeri(11, 20, 10);
		Ristorante v4 = new Ristorante(10, 20, 20, 20);
		Passeggeri v5 = new Passeggeri(11, 20, 10);
		Passeggeri v6 = new Passeggeri(11, 20, 10);
		Motrice v7 = new Motrice(12, 23.4, 10, 10);
		Cargo v8 = new Cargo(20, 10, "A", 20, true);
		Cargo v9 = new Cargo(20, 10, "A", 20, true);
		Cargo v10 = new Cargo(20, 10, "A", 20, true);
		Cargo v11 = new Cargo(20, 10, "A", 20, true);
		Cargo v12 = new Cargo(20, 10, "A", 20, true);
		Cargo v13 = new Cargo(20, 10, "A", 20, true);

		
		Treno treno = new Treno("treno1");
		
		try {
			treno.aggiungiVagone(v3); //A
			treno.aggiungiVagone(v7); //M
			treno.aggiungiVagone(v4); //R
			treno.aggiungiVagone(v2); //A
			treno.aggiungiVagone(v5); //A
			treno.aggiungiVagone(v6); //A
			treno.aggiungiVagone(v8); //A
			treno.aggiungiVagone(v10); //A
			treno.aggiungiVagone(v11); //A
			treno.aggiungiVagone(v12); //A
			treno.aggiungiVagone(v1); //M
			treno.aggiungiVagone(v9); //A
			treno.aggiungiVagone(v13); //A
			
			
		} catch (numMassimoMotriciException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (numMassimoRistorantiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		treno.calcolaPesoTotale();
		treno.scriviTreno();
		
//		System.out.println(treno.getPesoTotale());
//		
		
//		System.out.println(v1.getTipoVagone());
//		System.out.println(v2.getTipoVagone());
//		System.out.println(v3.getTipoVagone());
//		System.out.println(v4.getTipoVagone());
//		
		LinkedList<Vagone> lista = new LinkedList<>();
		lista = treno.getListaVagoni();
		lista.forEach(t -> {
			System.out.println(t.toString());
		});
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(l.size()/2,2);
		System.out.println(l);
	
	}

}
