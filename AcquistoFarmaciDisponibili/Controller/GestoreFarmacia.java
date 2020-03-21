package Controller;

import java.util.ArrayList;

import Entity.Farmaco;

/**
 * 
 */
public class GestoreFarmacia {
	
	static ArrayList<Farmaco> Farmaci;
	
	ArrayList<Farmaco> Farmaci_disponibili;

	
	public GestoreFarmacia() {
		Farmaci = new ArrayList<Farmaco>();
		
		Farmaci_disponibili = new ArrayList<Farmaco>();
	}


	public void inserisciFarmaco(Farmaco f) {
		Farmaci.add(f);
	}

	public void modificaFarmaco(Farmaco f, int qta) {
		f.setQuantita(qta);
	}

	public void rimuoviFarmaco(Farmaco f) {
		Farmaci.remove(f);
	}

	public void inviaLista() {
		// TODO implement here
	}

	public ArrayList<Farmaco> visualizzaListaFarmaci() {
		
		for (Farmaco f : Farmaci) {
			if(f.getQuantitàDisponibile()>0) {
				Farmaci_disponibili.add(f);
			}
		}
		
		
		return Farmaci_disponibili;
	}

	public void registraUtente() {
		// TODO implement here
	}

}