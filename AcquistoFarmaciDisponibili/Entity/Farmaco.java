package Entity;

import java.util.ArrayList;

/**
 * 
 */
public class Farmaco {

	//dichiarazione variabili
	private int codice;
	private String nome;
	private Double prezzo;
	private int quantitàDisponibili;
	private TipoFarmaco tipoFarmaco;
	private boolean prescrivibile;
	private ArrayList<PrincipioAttivo> principiAttivi = new ArrayList<PrincipioAttivo>();

	//costruttore
	public Farmaco(String nome, Double prezzo, int quantitàDisponibili, boolean prescrivibile, TipoFarmaco tipoFarmaco, int codice) {
		
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantitàDisponibili = quantitàDisponibili;
		this.tipoFarmaco = tipoFarmaco;
		this.prescrivibile = prescrivibile;
		
	}
	
	
	public void addPrincipioAttivo(PrincipioAttivo p) {
		principiAttivi.add(p);
	}

	public int getCodice() {
		return codice;
	}


	public int getQuantitàDisponibile() {
		return quantitàDisponibili;
	}
	
	public boolean getPrescrivibile() {
		return prescrivibile;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public Double getPrezzo() {
		return prezzo;
	}
	
	public TipoFarmaco getTipoFarmaco() {
		return tipoFarmaco;
	}
	
	public void setQuantita(int quantitàDisponibili) {
		this.quantitàDisponibili = quantitàDisponibili;
	}
	
	public String toString() {
		return "Farmaco Disponibile:  Codice: "+codice+", "+nome+", prezzo: "+prezzo+", disponibili: "+quantitàDisponibili+", "+principiAttivi+","+tipoFarmaco;
	}

}