package Entity;



public class PrincipioAttivo {
	
	//dichiarazione variabili
	private int codice = 0;
	private String nome;
	private String tipo;
	private int quantitàResidua;

	//costruttore
	public PrincipioAttivo(String nome, String tipo, int quantitàResidua) {
		this.codice ++;
		this.nome = nome;
		this.tipo = tipo;
		this.quantitàResidua =quantitàResidua;
	}

	
	public int getCodiceP() {
		return codice;
	}
	
	public String getNomeP() {
		return nome;
	}
	public String getTipoP() {
		return tipo;
	}
	
	public int getqtaRes() {
		return quantitàResidua;
	}

	public String toString() {
		return "Principio Attivo: "+nome+", "+tipo;
	}

}