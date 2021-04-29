package controle;

import financeiro.*;


// controle de dados para integração com a interface
public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Usuario[] getUsuario() {
		return this.d.getUsuario();
	}
	
	public int getQtUsuario() {
		return this.d.getQtdUsuario();
	}
	
    public boolean inserirEditarUsuario(String[] dadosUsuario) {
		Usuario a = new Usuario(dadosUsuario[1], dadosUsuario[2]);

		d.inserirEditaUsuario(a, Integer.parseInt(dadosUsuario[0]));
		return true;
	}
    
	
	
	
	public boolean removerUsuario(int i) {
		String UsuarioRemovido = d.getUsuario()[i].getNome();

		if(i == (d.getQtdUsuario() - 1)) { // O aluno a ser removido está no final do array
			d.setQtdUsuario(d.getQtdUsuario() - 1);
			d.getUsuario()[d.getQtdUsuario()] = null;
			return true;
		} else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(d.getUsuario()[cont].getNome().compareTo(UsuarioRemovido) != 0) {
				cont++;
			}
			for(int j = cont; j < d.getQtdUsuario() - 1; j++) {
				d.getUsuario()[j] = null;
				d.getUsuario()[j] = d.getUsuario()[j+1];
			}
			d.getUsuario()[d.getQtdUsuario()] = null;
			d.setQtdUsuario(d.getQtdUsuario() - 1);
			return true;
		}
	}
}
	
