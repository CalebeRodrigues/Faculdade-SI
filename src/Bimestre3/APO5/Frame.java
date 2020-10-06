package Bimestre3.APO5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class Frame extends JFrame implements ItemListener {

	private static final long serialVersionUID = 1L;
	JCheckBox check1, check2, check3, check4, check5, check6;
	
	
	public static void main(String[] args) {
		Iniciar(new JFrame());
	}
	
	public static void Iniciar(JFrame frame) {
		frame = new Frame();
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	//Construtor
	Frame(){
		getContentPane().setBackground(Color.GREEN);
		setBounds(250, 50, 300, 110);
		setTitle("Qual o tipo de filme preferido?");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		check1 = new JCheckBox("Ficção");
		check1.setBackground(Color.GREEN);
		check1.addItemListener(this);
		
		check2 = new JCheckBox("Romance");
		check2.setBackground(Color.GREEN);
		check2.addItemListener(this);
		
		check3 = new JCheckBox("Aventura");
		check3.setBackground(Color.GREEN);
		check3.addItemListener(this);
		
		check4 = new JCheckBox("Drama");
		check4.setBackground(Color.GREEN);
		check4.addItemListener(this);
		
		check5 = new JCheckBox("Histórico");
		check5.setBackground(Color.GREEN);
		check5.addItemListener(this);
		
		check6 = new JCheckBox("Outros");
		check6.setBackground(Color.GREEN);
		check6.addItemListener(this);
		
		getContentPane().add(check1);
		getContentPane().add(check2);
		getContentPane().add(check3);
		getContentPane().add(check4);
		getContentPane().add(check5);
		getContentPane().add(check6);
	}
	
	public void itemStateChanged(ItemEvent e) {

	}

}
