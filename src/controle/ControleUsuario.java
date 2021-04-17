package controle;
import financeiro.*;

public class ControleUsuario {
	private Usuario[] usuario;
	private int qtdUsuarios;
	
	public ControleUsuario(ControleDados d) {
		usuario = d.getUsuario();
		qtdUsuarios = d.getQtUsuario();
		
	}
	
	public String[] getNomeAluno() {
		String[] s = new String[qtdUsuarios];
		for(int i = 0; i < qtdUsuarios; i++) {
			s[i] = usuario[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdUsuarios;
	}

	public void setQtd(int qtd) {
		this.qtdUsuarios = qtd;
	}
	
	public String getNome(int i) {		
		return usuario[i].getNome();
	}
	
	public String getEmail(int i) {
		return usuario[i].getEmail();
		
	}
	
	public void setQtUsuario(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}
	

	
}