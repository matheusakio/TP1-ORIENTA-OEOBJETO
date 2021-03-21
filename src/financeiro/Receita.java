package financeiro;

public class Receita {
	private double receitaFixa;
	private double receitaVariavel;
	
	public Receita(double rf, double rv) {
		receitaFixa = rf;
		receitaVariavel = rv;
	}
	
	public String toString() {
		return "Receitas Fixas (Salário, pensão, mesada, etc...): R$ " + receitaFixa + "\nReceitas Variaveis (Freelances, Vendas, etc...) : R$ " + receitaVariavel;
	}
	
	public double getReceitaFixa()  {
		return receitaFixa;
		
	}
	public void setReceitaFixa(double receitaFixa) {
		this.receitaFixa = receitaFixa;
	}
	
	public double getReceitaVariavel()  {
		return receitaVariavel;
		
	}
	public void setReceitaVariavel(double receitaVariavel) {
		this.receitaVariavel = receitaVariavel;
	}


}
