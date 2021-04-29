package financeiro;
/**
 * Classe respons�vel pela cria��o de imposto
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */
public class Impostos {
	private double impostosDespesas;
	// Cria��o de impostos
	
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
