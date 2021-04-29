package financeiro;
import java.util.*;

public class Usuario {
	
	// criação do usuario, com nome email e data de nascimento
	private Date dataNasc;
	private String nome;
	private String email;

	
	public Usuario(String n, String e) {
		nome = n;
		email = e;
	}
	

//	public String toString() {	
//		return "Nome do Úsuario: " + nome + ", Email: " + email;
//	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
