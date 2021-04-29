package interfaceUsuario;

import controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// menu principal da interface do usuario, aqui é onde tudo começa a acontecer
public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle Financeiro");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton usuario = new JButton("Usuário");
	private static JButton cadastro = new JButton("Cadastro Financeiro");
	private static JButton resultado = new JButton("Resultado Financeiro");
	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		// configuração da interface do usuario
		titulo.setFont(new Font("Arial", Font.BOLD, 40));
		titulo.setBounds(240, 20, 300, 60);
		usuario.setBounds(280, 100, 200, 60);
		cadastro.setBounds(280, 200, 200, 60);
		resultado.setBounds(280, 300, 200, 60);
		
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
		// as actions aparecendo
		TelaMenu menu = new TelaMenu();
		
		usuario.addActionListener(menu);
		cadastro.addActionListener(menu);
		resultado.addActionListener(menu);
	}
	
	// botoes para ir para pagina de usuario (Ver usuario e cadastro), Cadastro financeiro e resultado financeiro respectivamente.
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == usuario)
			new TelaUsuario().mostrarDados(dados, 1);
		
		if(src == cadastro)
			new TelaCadastroFinanceiro().inserirCadastro(1, dados ,0);		
		//if(src == resultado)
			//new TelaResultadoFinanceiro().resultadoFinanceiro(dados, 2);

	}
}
