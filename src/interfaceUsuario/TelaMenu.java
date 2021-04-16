package interfaceUsuario;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import financeiro.*;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle Financeiro");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton usuario = new JButton("Usuário");
	private static JButton cadastro = new JButton("Cadastro Financeiro");
	private static JButton resultado = new JButton("Resultado Financeiro");
	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		usuario.setBounds(140, 100, 100, 30);
		cadastro.setBounds(140, 150, 100, 30);
		resultado.setBounds(140, 50, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(usuario);
		janela.add(cadastro);
		janela.add(resultado);
		
		janela.setSize(400, 250);
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
			new TelaCadastroFinanceiro().mostrarDados(dados, 2);
		
		if(src == resultado)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matrícula", null, 
					JOptionPane.INFORMATION_MESSAGE);
	}
}
