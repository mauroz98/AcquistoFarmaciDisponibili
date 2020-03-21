package Entity;

import java.util.ArrayList;

/**
 CREAZIONE ORDINE
 */
public class Ordine {

	private String codiceRicetta;
	private int identificativo;
	private Stato stato = Stato.PENDENTE;
	
	public ClienteRegistrato proprietrario;
	
	private ArrayList<OrdineFarmaco> farmaco_ord = new ArrayList<OrdineFarmaco>();
	
	
	public Ordine(String codiceRicetta,Farmaco[] farmaco, int [] qtaFarmaco) {
		
		this.identificativo++;
		this.codiceRicetta = codiceRicetta;
		
		for(int i = 0; i< farmaco.length; i++) {
			
			farmaco_ord.add(new OrdineFarmaco(qtaFarmaco[i], farmaco[i]));
			
		}
		
	}
	
	public int getIdentificativo() {
		return identificativo;
	}
	
	public ArrayList<OrdineFarmaco> getFarmaco(){
		return farmaco_ord;
	}
	
	public Stato getStato() {
		return stato;
	}
	
	public void getCodiceRicetta(String ricetta) {
		this.codiceRicetta = ricetta;
	}


	public String getCodiceRicetta() {
		return codiceRicetta;
	}
	
	public void setStato(Stato s) {
		this.stato = s;
	}
	
	public String toString() {
		return "ORDINE: Codice ordine: "+identificativo+", Codice ricetta: "+codiceRicetta+","+farmaco_ord;
	}




}