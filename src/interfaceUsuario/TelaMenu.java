package interfaceUsuario;

import controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle Financeiro");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton usuario = new JButton("Usuário");
	private static JButton cadastro = new JButton("Cadastro Financeiro");
	private static JButton resultado = new JButton("Resultado Financeiro");
	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 40));
		titulo.setBounds(240, 20, 300, 60);
		usuario.setBounds(280, 200, 200, 60);
		cadastro.setBounds(280, 300, 200, 60);
		resultado.setBounds(280, 100, 200, 60);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(usuario);
		janela.add(cadastro);
		janela.add(resultado);
		
		janela.setSize(800, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		usuario.addActionListener(menu);
		cadastro.addActionListener(menu);
		resultado.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == usuario)
			new TelaUsuario().mostrarDados(dados, 1);
		
		if(src == cadastro)
			new TelaCadastroFinanceiro().inserirCadastro(1, dados ,0);		
		if(src == resultado)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a salvar", null, 
					JOptionPane.INFORMATION_MESSAGE);
	}
}
