package controle;
import financeiro.*;
/**
 * Classe respons�vel por apresentar uma integra��o integra��o com o controle de dados e interface para o usu�rio
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */

public class ControleUsuario {
	private Usuario[] usuario;
	private int qtdUsuarios;
	
	public ControleUsuario(ControleDados d) {
		usuario = d.getUsuario();
		qtdUsuarios = d.getQtUsuario();
		
	}
	
	public String[] getNomeUsuario() {
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