package AcquistoFarmaciDisponibili;

import Controller.*;
import Entity.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		
			scan = new Scanner(System.in);
	
			GestoreFarmacia gestoreFarmacia = GestoreFarmacia.getSingleton();
			GestoreAcquisti gestoreAcquisti = GestoreAcquisti.getSingleton();
			
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
			
			String codRicetta = null;
			
			System.out.println("Risultati ricerca: \n");
			
			for(Farmaco f: farmaci_disponibili) {
				System.out.println(f+ "\n");
			}
			
			ArrayList<Integer> quantità_acquisti2 = new ArrayList<Integer>();
			ArrayList<Farmaco> acquisti2 = new ArrayList<Farmaco>();
			
			boolean statoacq = false;
			int w=0;
			
			while(statoacq==false) {
				
				System.out.println("Inserisci il codice del " + (w + 1)+ " Farmaco:");
				int codiceFarmacoAcquisto = scan.nextInt();
				if(codiceFarmacoAcquisto == 1){
				acquisti2.add(F);
				}
				else if(codiceFarmacoAcquisto == 2){
				acquisti2.add(F1);
				}
				else if(codiceFarmacoAcquisto == 3){
				acquisti2.add(F2);
				}
				else if(codiceFarmacoAcquisto == 4){
					acquisti2.add(F3);
					}
				else if(codiceFarmacoAcquisto == 5){
					acquisti2.add(F4);
					}
				System.out.println("Vuoi inserire un altro farmaco? (si/no)");
				String risposta = scan.next();
				if(risposta.contentEquals("no")) {
				statoacq = true;
				}
				w++;
				}
			
			Farmaco[] acquisti = new Farmaco[acquisti2.size()];
			
			acquisti2.toArray(acquisti);
			
			for(int k=0;k<acquisti.length;k++) {
				System.out.println("Inserisci quantità per il farmaco: " +acquisti[k].toString2());
				quantità_acquisti2.add(scan.nextInt());
			}
		
			int [] quantità_acquisti = new int [quantità_acquisti2.size()];
			
			for(int y=0; y<quantità_acquisti.length;y++) {
				quantità_acquisti[y] = quantità_acquisti2.get(y);
			}
			
			for(int j=0; j<quantità_acquisti.length;j++) {
				if(acquisti[j].getPrescrivibile()==true) {
					System.out.println("Il farmaco: " +acquisti[j].toString2()+ " richiede la prescrizione medica. \n" );
					System.out.println("Inserisci codice ricetta: ");
					codRicetta = scan.next();
				}
			}
			
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
