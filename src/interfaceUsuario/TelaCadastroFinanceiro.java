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
/**
 * Classe responsável por pela interface grafica de cadastrar todos dados financeiros do usuario, sendo ela redirecionado para o resultado final que colhe todas essas informações
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */

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
	private JButton botaoSalvar = new JButton("Resultado Financeiro");
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

			botaoSalvar.setBounds(220, 260, 170, 30);
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
		}// precisa implementar a logica casa nao ouver nenhum campo prenchidos

	}

	




} 