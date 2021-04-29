package financeiro;
/**
 * Classe responsável despesas fixas e variaveis para coletação de dados
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */

public class Despesas {
	private double despesasFixas;
	private double despesasVariavel;
	
	public Despesas(double df, double dv) {
		despesasFixas = df;
		despesasVariavel = dv;
	}
	
	public String toString() {
		return "Despesas Fixas (Aluguel, prestações, luz, água, etc...): R$ " + despesasFixas + "\nDespesas Variaveis (Lanche, Festas, Cinema, etc...) : R$" + despesasVariavel;
	}
	
	public double getDepesasFixas()  {
		return despesasFixas;
		
	}
	public void setDespesasFixas(double despesasFixas) {
		this.despesasFixas = despesasFixas;
	}
	
	public double getDepesasVariavel()  {
		return despesasVariavel;
		
	}
	public void setDespesasVariavel(double despesasVariavel) {
		this.despesasVariavel = despesasVariavel;
	}


}
