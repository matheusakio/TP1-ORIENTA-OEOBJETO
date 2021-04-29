package interfaceUsuario;
import financeiro.*;

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
	private JLabel labelRendimentos = new JLabel("Rendimentos: ");
	private JTextField valorRendimentos;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	public static ControleDados dados = new ControleDados();
	static Receita FinanceiroReceitas;
	static Despesas FinanceiroDespesas;
	static Impostos FinanceiroImpostos;
	static Rendimentos FinanceiroRendimento;
	static PlanoDeContas FinanceiroPlano;
	String PlanoFinal;
	//private String[] novoDado = new String[9];
	//private static ControleDados dados;
	//private int posicao;
	//private int opcao;
	private String nomePagina;

	public void inserirCadastro(int op, ControleDados d, int pos) { // tela para cadastro financeiro do usuario

		//opcao = op;
		//posicao = pos;
		//dados = d;

		if (op == 1) nomePagina = "Cadastro de Financeiro";


		janela = new JFrame(nomePagina);

		//Preenche dados com dados do aluno clicado
		if (op == 3) {
	

		} else{ //Não preenche com dados

			valorReceitaFixa = new JTextField(200);
			valorReceitaVariavel = new JTextField(200);
			valorDespesaFixa = new JTextField(200);
			valorDespesaVariavel = new JTextField(200);
			valorImpostos = new JTextField(200);
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
		labelRendimentos.setBounds(30, 170, 150, 25);
		valorRendimentos.setBounds(180, 170, 180, 25);
	



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
			FinanceiroReceitas = new Receita(Double.parseDouble(valorReceitaFixa.getText()), Double.parseDouble(valorReceitaVariavel.getText()));
			String ReceitaFinal = String.valueOf(FinanceiroReceitas.getReceitaFixa() + FinanceiroReceitas.getReceitaVariavel());
			FinanceiroDespesas = new Despesas(Double.parseDouble(valorDespesaFixa.getText()), Double.parseDouble(valorDespesaVariavel.getText()));
			String DespesaFinal = String.valueOf(FinanceiroDespesas.getDepesasFixas() + FinanceiroDespesas.getDepesasVariavel());
			FinanceiroImpostos = new Impostos(Double.parseDouble(valorImpostos.getText()));
			//String ImpostoFinal = String.valueOf(FinanceiroImpostos.getImpostos());
			FinanceiroRendimento = new Rendimentos(Double.parseDouble(valorRendimentos.getText()));
			double calculoMontanteFinal =(FinanceiroRendimento.getRendimentos() + FinanceiroReceitas.getReceitaFixa() + FinanceiroReceitas.getReceitaVariavel()) - (FinanceiroDespesas.getDepesasFixas() + FinanceiroDespesas.getDepesasVariavel() - FinanceiroImpostos.getImpostos()); 
			String MontanteFinal = String.valueOf(calculoMontanteFinal);
			if(calculoMontanteFinal > 0) {
				PlanoFinal = "Sim, você está positivo";
			}else {
				PlanoFinal = "Nao, você está negativo";
			}
			new TelaResultadoFinanceiro().resultadoFinanceiro(dados, 2, ReceitaFinal, DespesaFinal, MontanteFinal, PlanoFinal);
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