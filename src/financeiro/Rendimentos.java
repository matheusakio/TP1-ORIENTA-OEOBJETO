package financeiro;
/**
 * Classe responsável pelo valor do rendimento 
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */

public class Rendimentos {
	private double rendimentos;
	// Classe para investimentos
	public Rendimentos(double h) {
		rendimentos = h;
	}
	
	public String toString() {
		return "Rendimento de investimentos: R$ " + rendimentos;
	}
	
	public double getRendimentos()  {
		return rendimentos;
		
	}
	
	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	


}
