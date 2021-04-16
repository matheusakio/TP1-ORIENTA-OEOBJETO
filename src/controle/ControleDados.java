package controle;

import financeiro.*;

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
	
	
	/*public boolean inserirEditarUsuario(String[] dadosUsuario) {
		if(!dadosUsuario[3].matches("[0-9]+") || !dadosUsuario[4].matches("[0-9]+") || 
				!dadosUsuario[5].matches("[0-9]+") || !dadosUsuario[6].matches("[0-9]+")) {
			return false;
		} else {
			Usuario a = new Usuario(dadosUsuario[1], dadosUsuario[2], Integer.parseInt(dadosUsuario[3]), 
						Integer.parseInt(dadosUsuario[4]), new CPF(Integer.parseInt(dadosUsuario[5]),
								Integer.parseInt(dadosUsuario[6])));
				d.inserirEditarUsuario(a, Integer.parseInt(dadosUsuario[0]));
				return true;
		}
	}*/
	
	public boolean removerAluno(int i) {
		String alunoRemovido = d.getUsuario()[i].getNome();

		if(i == (d.getQtdUsuario() - 1)) { // O aluno a ser removido está no final do array
			d.setQtdUsuario(d.getQtdUsuario() - 1);
			d.getUsuario()[d.getQtdUsuario()] = null;
			return true;
		} else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(d.getUsuario()[cont].getNome().compareTo(alunoRemovido) != 0) {
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
	
