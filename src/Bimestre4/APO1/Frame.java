package Bimestre4.APO1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;

public class Frame extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JMenuBar menuBar;
	JMenu obras;	
	
	public static void main(String[] args) {
		JFrame frame = null;
		IniciarFrame(frame);
	}

	public static void IniciarFrame(JFrame frame) {
		frame = new Frame();
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	//Construtor
	Frame(){
		setTitle("Livraria XYZ");
		setBounds(450, 170, 550, 320);
		getContentPane().setBackground(Color.white);
		
		menuBar = new JMenuBar();
		obras = new JMenu("Obras Literárias");
		
		gerarMenuItem();
		
		menuBar.add(obras);
		setJMenuBar(menuBar);
	}


	//Gerando Items
	JMenuItem cadastrar, alterar, consultar, relatorio, excluir, sair;
	
	public void gerarMenuItem() {
		cadastrar = new JMenuItem("Cadastrar");
		cadastrar.addActionListener(this);
		
		alterar = new JMenuItem("Alterar");
		alterar.addActionListener(this);
		
		consultar = new JMenuItem("Consultar");
		consultar.addActionListener(this);
		
		relatorio = new JMenuItem("Relatorio");
		relatorio.addActionListener(this);
		
		excluir = new JMenuItem("Excluir");
		excluir.addActionListener(this);
		
		sair = new JMenuItem("Sair do Sistema");
		sair.addActionListener(this);
		
		obras.add(cadastrar);
		obras.add(alterar);
		obras.add(consultar);
		obras.add(relatorio);
		obras.add(excluir);
		obras.add(sair);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
