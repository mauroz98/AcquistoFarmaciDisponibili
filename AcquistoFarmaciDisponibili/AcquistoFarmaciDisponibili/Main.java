package AcquistoFarmaciDisponibili;

import Controller.*;
import Entity.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
			GestoreFarmacia gestoreFarmacia = GestoreFarmacia.getSingleton();
			GestoreAcquisti gestoreAcquisti = GestoreAcquisti.getSingleton();
			
			Scanner scan = new Scanner(System.in);
			
			String Nprincipio = "Paracetamolo";
			int qtaResiduaPrincipio = 30;
			String tipoPrincipio = "antinfiammatorio";
			PrincipioAttivo Pa = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			Nprincipio = "Ketoprofene";
			qtaResiduaPrincipio = 20;
			tipoPrincipio = "antinfiammatorio";
			PrincipioAttivo Pa1 = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			Nprincipio = "Rinazina";
			qtaResiduaPrincipio = 17;
			tipoPrincipio = "antiAggreganti";
			PrincipioAttivo Pa2 = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			Nprincipio = "Sodio Citrato";
			qtaResiduaPrincipio = 31;
			tipoPrincipio = "antiAcidi";
			PrincipioAttivo Pa3 = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			Nprincipio = "Acido Citrico";
			qtaResiduaPrincipio = 13;
			tipoPrincipio = "Analgesico";
			PrincipioAttivo Pa4 = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			int codice = 1;
			String nomeFarmaco = "Tachipirina";
			double prezzoFarmaco = (float) 7.5;
			int qtaFarmaco = 9;
			boolean is_prescrivibile = false;
			TipoFarmaco produzione = TipoFarmaco.COMMERICIALE;
			Farmaco F = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione, codice);
			F.addPrincipioAttivo(Pa);
			
			codice = 2;
			nomeFarmaco = "OKI";
			prezzoFarmaco = (float) 8.5;
			qtaFarmaco = 8;
			is_prescrivibile = false;
			produzione = TipoFarmaco.COMMERICIALE;
			Farmaco F1 = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione, codice);
			F1.addPrincipioAttivo(Pa1);
			
			codice = 3;
			nomeFarmaco = "Pillole alle erbe";
			prezzoFarmaco = (float) 11.5;
			qtaFarmaco = 13;
			is_prescrivibile = false;
			produzione = TipoFarmaco.GALENICO;
			Farmaco F2 = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione, codice);
			F2.addPrincipioAttivo(Pa4);
			
			codice = 4;
			nomeFarmaco = "BIOCHETASI";
			prezzoFarmaco = (float) 8.5;
			qtaFarmaco = 17;
			is_prescrivibile = false;
			produzione = TipoFarmaco.GALENICO;
			Farmaco F3 = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione, codice);
			F3.addPrincipioAttivo(Pa3);
			
			codice = 5;
			nomeFarmaco = "Aspirina";
			prezzoFarmaco = (float) 8.5;
			qtaFarmaco = 13;
			is_prescrivibile = true;
			produzione = TipoFarmaco.COMMERICIALE;
			Farmaco F4 = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione,codice);
			F4.addPrincipioAttivo(Pa2);
			
			gestoreFarmacia.inserisciFarmaco(F);
			gestoreFarmacia.inserisciFarmaco(F1);
			gestoreFarmacia.inserisciFarmaco(F2);
			gestoreFarmacia.inserisciFarmaco(F3);
			gestoreFarmacia.inserisciFarmaco(F4);
			
			ArrayList<Farmaco> farmaci_disponibili = gestoreFarmacia.visualizzaListaFarmaci();
			
			String codRicetta = "ABC123";
			
			System.out.println("Risultati ricerca: \n");
			
			for(Farmaco f: farmaci_disponibili) {
				System.out.println(f+ "\n");
			}
			
			Farmaco acquisti[]= {F1, F4};
			int [] quantità_acquisti = {3, 6};
			
			for(int i=0; i<quantità_acquisti.length;i++) {
				if(quantità_acquisti[i]>acquisti[i].getQuantitàDisponibile()) {
					System.out.println("Errore, quantità farmaco selezionata eccessiva");
					System.exit(1);
				}
			
			}
				Ordine o = gestoreAcquisti.acquistaFarmaco(codRicetta, acquisti, quantità_acquisti);
				System.out.println(o);
	}

}
