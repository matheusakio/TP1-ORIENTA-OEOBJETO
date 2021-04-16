package financeiro;

public class Impostos {
	private double impostosDespesas;
	// Criação de impostos
	
	public Impostos(double iD) {
		impostosDespesas = iD;
	}
	
	public String toString() {
		return "Impostos (Iptu, Ipva, IRRF): R$ " + impostosDespesas;
	}
	
	public double getImpostos()  {
		return impostosDespesas;
		
	}
	public void setImpostos(double impostosDespesas) {
		this.impostosDespesas = impostosDespesas;
	}

}
