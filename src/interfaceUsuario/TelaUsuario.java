package interfaceUsuario;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


/**
 * Classe respons?vel pela interface grafica do cadastro do usuario, aqui ? onde vemos todos usuarios cadastrados e redireciona para o cadastro de novos usuarios
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */
public class TelaUsuario implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastro;
	private JButton refresh;

	private static ControleDados dados;
	private JList<String> listaUsuariosCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1:// Mostrar dados dos usuarios cadastrados (JList)
			listaNomes = new ControleUsuario(dados).getNomeUsuario();
			listaUsuariosCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Usuarios");
			titulo = new JLabel("Usuarios Cadastros");
			cadastro = new JButton("Cadastrar");
			refresh = new JButton("Atualizar");
			// interface dos usuarios cadastrados
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaUsuariosCadastrados.setBounds(20, 50, 350, 120);
			listaUsuariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaUsuariosCadastrados.setVisibleRowCount(10);

			cadastro.setBounds(70, 177, 100, 30);
			refresh.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaUsuariosCadastrados);
			janela.add(cadastro);
			janela.add(refresh);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastro.addActionListener(this);
			refresh.addActionListener(this);
			listaUsuariosCadastrados.addListSelectionListener(this);

			break;
			
		default:
			JOptionPane.showMessageDialog(null,"Op??o n?o encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}



	//Captura eventos relacionados aos bot?es da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo usuario
		if(src == cadastro)
			new TelaCadastroUsuario().inserirEditar(1, dados, this, 1);


		// Atualiza a lista de nomes dos usuarios mostrada no JList
		if(src == refresh) {
			listaUsuariosCadastrados.setListData(new ControleUsuario(dados).getNomeUsuario());			
			listaUsuariosCadastrados.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaUsuariosCadastrados) {
			new TelaCadastroUsuario().inserirEditar(3, dados, this, 
					listaUsuariosCadastrados.getSelectedIndex());
		}

	}

}