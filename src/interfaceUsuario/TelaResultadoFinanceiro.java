package interfaceUsuario;
import java.awt.event.ActionEvent;
/**
 * Classe responsável pela interface grafica do resultado financeiro, aqui é onde todos sados são recolhidos e resumidos para o usuario
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.JOptionPane;
import controle.*;
// tela onde teremos todos resultados recolhidos nas telas anteriores
import financeiro.Despesas;
import financeiro.Impostos;
import financeiro.PlanoDeContas;
import financeiro.Receita;
import financeiro.Rendimentos;
import financeiro.Usuario;

public class TelaResultadoFinanceiro {
	private JFrame janela = new JFrame("Resultado Financeiro");

	private static JLabel receita = new JLabel("Receita: ");
	private static JTextField valorReceita;
	private static JLabel despesas = new JLabel("Despesas: ");
	private static JTextField valorDespesas;
	private static JLabel montante = new JLabel("Montante Final? ");
	private static JTextField valorMontante;
	private static JLabel planos = new JLabel("Planos futuro possível? ");
	private static JTextField valorPlanos;
	
	public static ControleDados dados = new ControleDados();

	
	public void resultadoFinanceiro(ControleDados d, int op, String ReceitaFinal, String DespesaFinal, String MontanteFinal, String PlanoFinal) {

		
		if (op == 2) {
			
			//FinanceiroReceitas = new Receita (1500.00, 
			//		0);
			//String ReceitaFinal = String.valueOf(FinanceiroReceitas.getReceitaFixa() + FinanceiroReceitas.getReceitaVariavel());
		 	valorReceita = new JTextField(ReceitaFinal);
			valorDespesas = new JTextField(DespesaFinal);
			valorMontante = new JTextField(MontanteFinal);
			valorPlanos = new JTextField(PlanoFinal);


			

		}
		// interface da pagina resultado finaceiro
		receita.setBounds(30, 20, 150, 25);
		valorReceita.setBounds(180, 20, 180, 25);
		despesas.setBounds(30, 50, 150, 25);
		valorDespesas.setBounds(180, 50, 180, 25);
		montante.setBounds(30, 80, 150, 25);
		valorMontante.setBounds(180, 80, 180, 25);
		planos.setBounds(30, 110, 150, 25);
		valorPlanos.setBounds(180, 110, 180, 25);
		this.janela.add(receita);
		this.janela.add(valorReceita);
		this.janela.add(despesas);
		this.janela.add(valorDespesas);
		this.janela.add(montante);
		this.janela.add(valorMontante);
		this.janela.add(planos);
		this.janela.add(valorPlanos);

		
		this.janela.setLayout(null);
		
		
		this.janela.setSize(425, 350);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.janela.setVisible(true);

	}
	

}
