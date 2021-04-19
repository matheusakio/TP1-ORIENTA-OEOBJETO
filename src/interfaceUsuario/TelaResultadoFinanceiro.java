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
// tela onde teremos todos resultados recolhidos nas telas anteriores

public class TelaResultadoFinanceiro implements ActionListener {
	private JFrame janela = new JFrame("Resultado Financeiro");
	private JButton atualizar = new JButton("Atualizar");
	private static JLabel receita = new JLabel("Receita: ");
	private JTextField valorReceita;
	private static JLabel despesas = new JLabel("Despesas: ");
	private JTextField valorDespesas;
	private static JLabel montante = new JLabel("Estou positivo? ");
	private JTextField valorMontante;
	private static JLabel planos = new JLabel("Planos futuro possível? ");
	private JTextField valorPlanos;
	
	public static ControleDados dados = new ControleDados();
	
	public void resultadoFinanceiro(ControleDados d, int op) {
		if (op == 3) {
			

		} else{ 

			valorReceita = new JTextField(200);
			valorDespesas = new JTextField(200);
			valorMontante = new JTextField(200);
			valorPlanos = new JTextField(200);

			atualizar.setBounds(245, 260, 115, 30);
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
		this.janela.add(atualizar);
		
		this.janela.setLayout(null);
		
		
		this.janela.setSize(425, 350);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.janela.setVisible(true);
		atualizar.addActionListener(this);
	}
	
	// botão para atualizar os dados do usuario
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == atualizar)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a atualizar", null, 
					JOptionPane.INFORMATION_MESSAGE);
	}
}
