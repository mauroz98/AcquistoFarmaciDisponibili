package Controller;

import java.util.ArrayList;

import Entity.Farmaco;


public class GestoreFarmacia {
	
	private static GestoreFarmacia singleton = new GestoreFarmacia();
	
	//dichiarazione variabili
	static ArrayList<Farmaco> Farmaci;
	ArrayList<Farmaco> Farmaci_disponibili;

	//costruttore
	public GestoreFarmacia() {
		Farmaci = new ArrayList<Farmaco>();				//Array di tutti i farmaci
		Farmaci_disponibili = new ArrayList<Farmaco>();	//Array per l'utente con tutti i farmaci disponibili
	}

	public static GestoreFarmacia getSingleton() {
		return singleton;
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
			if(f.getQuantitàDisponibile()>0) {	//ciclo for che restituisce i farmaci disponibili
				Farmaci_disponibili.add(f);
			}
		}
		return Farmaci_disponibili;
	}

	public void registraUtente() {
		// TODO implement here
	}

}