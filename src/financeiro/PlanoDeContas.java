package financeiro;
/**
 * Classe responsável criação plano futuro
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */
public class PlanoDeContas {
	private double planos;
	// Classe para planos futuros
	
	public PlanoDeContas(double p) {
		planos = p;
	}
	
	
	public String toString() {
		return "Planos de gastos futuros: R$ " + planos;
	}
	
	public double getPlanos()  {
		return planos;
		
	}
	public void setPlanos(double planos) {
		this.planos = planos;
	}

}
