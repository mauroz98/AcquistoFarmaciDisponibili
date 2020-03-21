package Controller;

import java.util.ArrayList;
import Entity.Ordine;
import Entity.Stato;
import Entity.Farmaco;

public class GestoreAcquisti {
	
	private static GestoreAcquisti singleton = new GestoreAcquisti();
	
	//dichiarazione variabili
	ArrayList<Farmaco> Farmaci_disponibili;
	
	//costruttore
	public GestoreAcquisti() {
		Farmaci_disponibili = new ArrayList<Farmaco>();
	}
	
	public static GestoreAcquisti getSingleton() {
		return singleton;
	}


	public Ordine acquistaFarmaco(String codice_ricetta, Farmaco[] farmaco, int[] qtaFarmaco ) {
		
		Ordine o = new Ordine(codice_ricetta, farmaco, qtaFarmaco);
		autorizzaAcquisto(o);
		return o;
	}

	public void autorizzaAcquisto(Ordine o) {
		o.setStato(Stato.AUTORIZZATO);
	}

	public void generaReport() {
	}

}