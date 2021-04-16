package financeiro;

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
