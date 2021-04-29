package financeiro;

/**
 * Classe responsável pelo dados iniciais do usuario
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */
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
	
	
	public void fillWithSomeData() {
		for(int i = 0; i < 0; i++) {
			 usuario[i] = new Usuario ("usuario"+i, 
					"email"+i);
			
			receita[i] = new Receita ((i+1)*112233, (i+1)*112233);
			
			despesas[i] = new Despesas ((i+1)*112233, (i+1)*112233);
			
			impostos[i] = new Impostos ((i+1)*112233);
			
			rendimentos[i] = new Rendimentos ((i+1)*112233);
			
			plano[i] = new PlanoDeContas ((i+1)*112233);		
		}
		
		qtdUsuarios = 0;
		qtdReceita = 0;
		qtdDespesas = 0;
		qtdImpostos = 0;
		qtdRendimentos = 0;
		qtdPlano = 0;
	}
	
	
	public Usuario[] getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario[] usuario) {
		this.usuario = usuario;
	}
	
	public void inserirEditaUsuario(Usuario a, int pos) {
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
