package financeiro;

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
