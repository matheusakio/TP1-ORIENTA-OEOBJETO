package financeiro;


public class Dados {
	private  Usuario[] usuario = new Usuario[50];
	private int qtdUsuarios = 0;
	private Receita [] receita = new Receita[50];
	private int qtdReceita = 0;
	private Despesas[] despesas = new Despesas[50];
	private int qtdDespesas = 0;
	private Impostos[] impostos = new Impostos[50];
	private int qtdImpostos = 0;
	private Rendimentos[] rendimentos = new Rendimentos[50];
	private int qtdRendimentos = 0;
	private PlanoDeContas [] plano = new PlanoDeContas[50];
	private int qtdPlano = 0;
	
	// dados do usuario, setados para 5 usuarios e com dados pre setados porque estava chachando quando tentava criar um input 
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			 usuario[i] = new Usuario ("Matheus Akio", 
					"matheus.akio2@gmail.com");
			
			receita[i] = new Receita (1500.00, 
					0);
			
			despesas[i] = new Despesas (700.00, 
					200);
			
			impostos[i] = new Impostos (100.00);
			
			rendimentos[i] = new Rendimentos (0);
			
			plano[i] = new PlanoDeContas (0);		
		}
		
		qtdUsuarios = 5;
		qtdReceita = 5;
		qtdDespesas = 5;
		qtdImpostos = 5;
		qtdRendimentos = 5;
		qtdPlano = 5;
	}
	
	
	public Usuario[] getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario[] usuario) {
		this.usuario = usuario;
	}
	
	public void inserirEditarUsuario(Usuario a, int pos) {
		this.usuario[pos] = a;
		if(pos == qtdUsuarios) qtdUsuarios++;
	}
	
	public int getQtdUsuario() {
		return qtdUsuarios;
	}
	public void setQtdUsuario(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}
	public Receita[] getReceita() {
		return receita;
	}
	public void setReceita(Receita[] receita) {
		this.receita = receita;
	}
	public int getQtdReceita() {
		return qtdReceita;
	}
	public void setQtdReceita(int qtdReceita) {
		this.qtdReceita = qtdReceita;
	}
	
	public Despesas[] getDespesas() {
		return despesas;
	}
	
	public void setDespesas(Despesas[] despesas) {
		this.despesas = despesas;
	}
	
	
	public int getQtdDespesas() {
		return qtdDespesas;
	}
	public void setQtdDespesas(int qtdDespesas) {
		this.qtdDespesas = qtdDespesas;
	}
	public Impostos[] getImpostos() {
		return impostos;
	}
	public void setImpostos(Impostos[] impostos) {
		this.impostos = impostos;
	}
	public int getQtdImpostos() {
		return qtdImpostos;
	}
	public void setQtdImpostos(int qtdImpostos) {
		this.qtdImpostos = qtdImpostos;
	}
	public Rendimentos[] getRendimentos() {
		return rendimentos;
	}
	public void setRendimentos(Rendimentos[] rendimentos) {
		this.rendimentos = rendimentos;
	}
	public int getQtdRendimentos() {
		return qtdRendimentos;
	}
	public void Rendimentos(int qtdRendimentos) {
		this.qtdRendimentos = qtdRendimentos;
	}
	
	public PlanoDeContas[] getPlanoDeContas() {
		return plano;
	}
	public void setPlanoDeContas(PlanoDeContas[] plano) {
		this.plano = plano;
	}
	public int getQtdPlano() {
		return qtdPlano;
	}
	public void PlanoDeContas(int qtdPlano) {
		this.qtdPlano = qtdPlano;
	}
	

}
