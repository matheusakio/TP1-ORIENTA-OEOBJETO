package interfaceUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;
// tela para cadastrar um novo usuario
public class TelaCadastroUsuario implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelEmail = new JLabel("Email: ");
	private JTextField valorEmail;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	//private String[] novoDado = new String[9];
	private static ControleDados dados;
	//private int posicao;
	//private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, // tela para casdatrar novo usuario, editar ou excluir
			TelaUsuario p, int pos) {

		//opcao = op;
		//posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Aluno";
		if (op == 3) s = "Detalhe de Aluno";

		janela = new JFrame(s);

		//Preenche dados com dados do aluno clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getUsuario()[pos].getNome(), 200);
			valorEmail = new JTextField(dados.getUsuario()[pos].getEmail(),200);		

		}  else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorEmail = new JTextField(200);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEmail.setBounds(30, 50, 150, 25);
		valorEmail.setBounds(180, 50, 180, 25);


		//Coloca os campos relacionados email do usuario
		if (op == 1 || op == 3 ) {
			this.janela.add(labelEmail);
			this.janela.add(valorEmail);

		}


		//Coloca botoes de excluir e salvar
		if (op == 3) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}
		// interface do cadastro
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	// botoes para salvar e exluir (precisam ser melhorados, por isso estão com information
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a salvar", null, 
					JOptionPane.INFORMATION_MESSAGE);
/*			try {
				if(opcao == 1) //cadastro de novo aluno
					novoDado[0] = Integer.toString(dados.getQtUsuario());


				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorEmail.getText();


			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}*/
		} 

		if(src == botaoExcluir) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a excluir", null, 
					JOptionPane.INFORMATION_MESSAGE);
			/* boolean res = false;

			if (opcao == 3) {//exclui aluno
				res = dados.removerAluno(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}

*/
			
		} 
	}
	

	/* public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno está matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o professor está responsável\n"
				+ "por alguma disciplina. Se sim, substitua\n "
				+ "o professor e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}*/

} 