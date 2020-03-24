package Entity;

public class OrdineFarmaco {
	
	//dichiarazione variabili
	private int quantità;
	private Farmaco farmaco;	
	
	//costruttore
	public OrdineFarmaco(int quantità, Farmaco farmaco) {
		this.quantità = quantità;
		this.farmaco = farmaco;
	}

	public int getQuantita() {
		return quantità;
	}
	
	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	
	public Farmaco getFarmaco() {
		return farmaco;
	}
	
	public void setFarmaco(Farmaco farmaco){
		this.farmaco = farmaco;
	}
	
	public String toString() {
		return ""+quantità+" "+farmaco.getNome();
	}
}