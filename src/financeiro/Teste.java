package financeiro;

public class Teste {
	static Usuario u;
	static Receita r;
	static Despesas d;
	static Impostos i;
	static Rendimentos h;
	static PlanoDeContas p;


	public static void main(String[] args) {
		//teste do programa sem input
		
	
		u = new Usuario ("Matheus Akio", 
				"matheus.akio2@gmail.com");
		
		r = new Receita (1500.00, 
				0);
		
		d = new Despesas (700.00, 
				200);
		
		i = new Impostos (100.00);
		
		h = new Rendimentos (0);
		
		p = new PlanoDeContas (0);
		
		
		
		double montanteFinal = (( r.getReceitaFixa() + r.getReceitaVariavel() + h.getRendimentos()) - (d.getDepesasFixas() + d.getDepesasVariavel() + i.getImpostos() + p.getPlanos() ));
		
		
		
		
		System.out.println(u.toString());
		System.out.println(r.toString());
		System.out.println(d.toString());
		System.out.println(i.toString());
		System.out.println(h.toString());
		System.out.println(p.toString());
		System.out.printf("Montante Final = %.2f %n",  (montanteFinal));

	}
	
	

}
