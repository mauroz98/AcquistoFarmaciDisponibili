package Entity;

import java.util.*;

public class ClienteRegistrato {
	
	//dichiarazione variabili
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String codiceFiscale;
	private String tesseraSanitaria;
	private String cartaCredito;

	 //Costruttore
	public ClienteRegistrato(String nome,String cognome, Date dataNascita, String codiceFiscale, String tesseraSanitaria, String cartaCredito) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.codiceFiscale = codiceFiscale;
		this.tesseraSanitaria = tesseraSanitaria;
		this.cartaCredito = cartaCredito;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setcodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public void settesseraSanitaria(String tesseraSanitaria) {
		this.tesseraSanitaria = tesseraSanitaria;
	}
	
	public void setcartaCredito(String cartaCredito) {
		this.cartaCredito = cartaCredito;
	}
	
	public String getNome() {
	    return nome;
	    }
	
	public String getCognome() {
	return cognome;
	    }

	public Date getDataNascita() {
	return dataNascita;
	    }

	public String getCodiceFiscale() {
	return codiceFiscale;
	    }

	public String getTesseraSanitaria() {
	return tesseraSanitaria;
	    }

	public String getCartaDicredito() {
	return cartaCredito;
	    }
}