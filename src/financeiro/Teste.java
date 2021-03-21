package financeiro;

public class Teste {
	static Usuario u;
	static Receita r;
	static Despesas d;


	public static void main(String[] args) {
		
	
		u = new Usuario ("Matheus Akio", 
				"matheus.akio2@gmail.com");
		
		r = new Receita (1500.00, 
				0);
		
		d = new Despesas (700.00, 
				200);
		
		double montanteFinal = (( r.getReceitaFixa() + r.getReceitaVariavel()) - (d.getDepesasFixas() + d.getDepesasVariavel()));
		
		
		
		
		System.out.println(u.toString());
		System.out.println(r.toString());
		System.out.println(d.toString());
		System.out.printf("Montante Final = %.2f %n",  (montanteFinal));

	}
	
	

}
