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

public class TelaCadastroFinanceiro implements ActionListener {

	private JFrame janela;
	private JLabel labelReceitaFixa= new JLabel("Receita Fixa: ");
	private JTextField valorReceitaFixa;
	private JLabel labelReceitaVariavel= new JLabel("Receita Variavel: ");
	private JTextField valorReceitaVariavel;
	private JLabel labelDespesaFixa= new JLabel("Despesa Fixa: ");
	private JTextField valorDespesaFixa;
	private JLabel labelDespesaVariavel= new JLabel("Despesa Variavel: ");
	private JTextField valorDespesaVariavel;
	private JLabel labelImpostos = new JLabel("Imposto: ");
	private JTextField valorImpostos;
	private JLabel labelPlanoDeContas = new JLabel("Plano de contas: ");
	private JTextField valorPlanoDeContas;
	private JLabel labelRendimentos = new JLabel("Rendimentos: ");
	private JTextField valorRendimentos;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	//private String[] novoDado = new String[9];
	//private static ControleDados dados;
	//private int posicao;
	//private int opcao;
	private String s;

	public void inserirCadastro(int op, ControleDados d, int pos) { // tela para cadastro financeiro do usuario

		//opcao = op;
		//posicao = pos;
		//dados = d;

		if (op == 1) s = "Cadastro de Financeiro";


		janela = new JFrame(s);

		//Preenche dados com dados do aluno clicado
		if (op == 3) {
	

		} else{ //Não preenche com dados

			valorReceitaFixa = new JTextField(200);
			valorReceitaVariavel = new JTextField(200);
			valorDespesaFixa = new JTextField(200);
			valorDespesaVariavel = new JTextField(200);
			valorImpostos = new JTextField(200);
			valorPlanoDeContas = new JTextField(200);
			valorRendimentos = new JTextField(200);

			botaoSalvar.setBounds(245, 260, 115, 30);
		}
		// interface do usuario

		labelReceitaFixa.setBounds(30, 20, 150, 25);
		valorReceitaFixa.setBounds(180, 20, 180, 25);
		labelReceitaVariavel.setBounds(30, 50, 150, 25);
		valorReceitaVariavel.setBounds(180, 50, 180, 25);
		labelDespesaFixa.setBounds(30, 80, 150, 25);
		valorDespesaFixa.setBounds(180, 80, 180, 25);
		labelDespesaVariavel.setBounds(30, 110, 150, 25);
		valorDespesaVariavel.setBounds(180, 110, 180, 25);
		labelImpostos.setBounds(30, 140, 150, 25);
		valorImpostos.setBounds(180, 140, 180, 25);
		labelPlanoDeContas.setBounds(30, 170, 150, 25);
		valorPlanoDeContas.setBounds(180, 170, 180, 25);
		labelRendimentos.setBounds(30, 200, 150, 25);
		valorRendimentos.setBounds(180, 200, 180, 25);
	



		this.janela.add(labelReceitaFixa);
		this.janela.add(valorReceitaFixa);
		this.janela.add(labelReceitaVariavel);
		this.janela.add(valorReceitaVariavel);
		this.janela.add(labelDespesaFixa);
		this.janela.add(valorDespesaFixa);
		this.janela.add(labelDespesaVariavel);
		this.janela.add(valorDespesaVariavel);   
		this.janela.add(labelImpostos);
		this.janela.add(valorImpostos);   
		this.janela.add(labelPlanoDeContas);
		this.janela.add(valorPlanoDeContas);   
		this.janela.add(labelRendimentos);
		this.janela.add(valorRendimentos);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(425, 350);
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