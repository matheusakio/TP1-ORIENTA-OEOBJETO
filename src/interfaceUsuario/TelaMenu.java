package interfaceUsuario;

import controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Classe responsável pela interface grafica do meno principal, aqui é onde tudo começa a acontecer
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle Financeiro");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton usuario = new JButton("Usuário");
	private static JButton cadastro = new JButton("Cadastro Financeiro");

	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		// configuração da interface do usuario
		titulo.setFont(new Font("Arial", Font.BOLD, 40));
		titulo.setBounds(240, 20, 300, 60);
		usuario.setBounds(280, 150, 200, 60);
		cadastro.setBounds(280, 250, 200, 60);

		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(usuario);
		janela.add(cadastro);

		
		janela.setSize(800, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		// as actions aparecendo
		TelaMenu menu = new TelaMenu();
		
		usuario.addActionListener(menu);
		cadastro.addActionListener(menu);

	}
	
	// botoes para ir para pagina de usuario (Ver usuario e cadastro), Cadastro financeiro e resultado financeiro respectivamente.
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == usuario)
			new TelaUsuario().mostrarDados(dados, 1);
		
		if(src == cadastro)
			new TelaCadastroFinanceiro().inserirCadastro(1, dados ,0);		


	}
}
