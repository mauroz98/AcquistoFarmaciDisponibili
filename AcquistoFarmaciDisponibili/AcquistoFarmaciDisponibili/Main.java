package AcquistoFarmaciDisponibili;

import Controller.*;
import Entity.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
			GestoreFarmacia gestoreFarmacia = new GestoreFarmacia();
			GestoreAcquisti gestoreAcquisti = new GestoreAcquisti();
			
			String Nprincipio = "Paracetamolo";
			int qtaResiduaPrincipio = 30;
			String tipoPrincipio = "antinfiammatorio";
			
			PrincipioAttivo Pa = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			Nprincipio = "Ketoprofene";
			qtaResiduaPrincipio = 20;
			tipoPrincipio = "antinfiammatorio";
			
			PrincipioAttivo Pa1 = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			Nprincipio = "Rinazina";
			qtaResiduaPrincipio = 20;
			tipoPrincipio = "antiAggreganti";
			
			PrincipioAttivo Pa2 = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			Nprincipio = "Sodio Citrato";
			qtaResiduaPrincipio = 20;
			tipoPrincipio = "antiAcidi";
			
			PrincipioAttivo Pa3 = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			Nprincipio = "Acido Citrico";
			qtaResiduaPrincipio = 20;
			tipoPrincipio = "Analgesico";
			
			PrincipioAttivo Pa4 = new PrincipioAttivo(Nprincipio, tipoPrincipio, qtaResiduaPrincipio);
			
			
			String nomeFarmaco = "Tachipirina";
			double prezzoFarmaco = (float) 7.5;
			int qtaFarmaco = 45;
			boolean is_prescrivibile = true;
			TipoFarmaco produzione = TipoFarmaco.COMMERICIALE;
			
			Farmaco F = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione);
			
			F.addPrincipioAttivo(Pa);
			
			nomeFarmaco = "OKI";
			prezzoFarmaco = (float) 8.5;
			qtaFarmaco = 23;
			is_prescrivibile = true;
			produzione = TipoFarmaco.COMMERICIALE;
			Farmaco F1 = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione);
			F1.addPrincipioAttivo(Pa1);
			
			nomeFarmaco = "Pillole alle erbe";
			prezzoFarmaco = (float) 8.5;
			qtaFarmaco = 23;
			is_prescrivibile = true;
			produzione = TipoFarmaco.GALENICO;
			Farmaco F2 = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione);
			F2.addPrincipioAttivo(Pa4);
			
			nomeFarmaco = "BIOCHETASI";
			prezzoFarmaco = (float) 8.5;
			qtaFarmaco = 23;
			is_prescrivibile = true;
			produzione = TipoFarmaco.GALENICO;
			Farmaco F3 = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione);
			F3.addPrincipioAttivo(Pa3);
			
			
			nomeFarmaco = "Aspirina";
			prezzoFarmaco = (float) 8.5;
			qtaFarmaco = 23;
			is_prescrivibile = true;
			produzione = TipoFarmaco.COMMERICIALE;
			Farmaco F4 = new Farmaco(nomeFarmaco, prezzoFarmaco, qtaFarmaco, is_prescrivibile, produzione);
			F4.addPrincipioAttivo(Pa2);
			
			gestoreFarmacia.inserisciFarmaco(F);
			gestoreFarmacia.inserisciFarmaco(F1);
			gestoreFarmacia.inserisciFarmaco(F2);
			gestoreFarmacia.inserisciFarmaco(F3);
			gestoreFarmacia.inserisciFarmaco(F4);
			
			ArrayList<Farmaco> farmaci_disponibili = gestoreFarmacia.visualizzaListaFarmaci();
			
			System.out.println("Risultati ricerca: \n");
			
			for(Farmaco f: farmaci_disponibili) {
				System.out.println(f+ "\n");
			}
			
			String codRicetta= "ABC123";
			
			Farmaco [] acquisti = {F1, F4};
			int [] quantità_acquisti = {2, 7};
			Ordine o = gestoreAcquisti.acquistaFarmaco(codRicetta, acquisti, quantità_acquisti);
			
		
			System.out.println(o);
	}

}
