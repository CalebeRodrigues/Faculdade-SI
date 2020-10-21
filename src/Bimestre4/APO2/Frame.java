package Bimestre4.APO2;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class Frame extends JFrame {

	public static void main(String[] args) {
		Frame janela = new Frame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	JLabel nMatricula, periodo, nota, mensal;
	JFormattedTextField txtMatricula, txtPeriodo, txtNota, txtMensal;
	MaskFormatter mask, mask2, mask3, mask4;
	
	public Frame() {
		super("Sistema Faculdade");
		Container container = null;
		setLayout(null);
		
		configLabel();
		
		configMask();
		
		addFrame(container);
	}
	
	public void addFrame(Container container) {
		container = getContentPane();
		
		container.add(nMatricula); container.add(txtMatricula);
		container.add(periodo);    container.add(txtPeriodo);
		container.add(nota);	   container.add(txtNota);
		container.add(mensal);	   container.add(txtMensal);

		setSize(450,320);
		setVisible(true);
	}
	
	public void configLabel() {
		nMatricula = new JLabel("Matricula:");
		nMatricula.setBounds(50, 50, 100, 20);
		
		periodo = new JLabel("Periodo:");
		periodo.setBounds(50, 100, 100, 20);
		
		nota = new JLabel("Nota:");
		nota.setBounds(50, 150, 100, 20);
		
		mensal = new JLabel("Mensalidade:");
		mensal.setBounds(50, 200, 100, 20);
	}
	
	public void configMask() {
		try {
			mask = new MaskFormatter("#########");
			mask.setPlaceholder("_");
			txtMatricula = new JFormattedTextField(mask);
			
			mask2 = new MaskFormatter("####/#");
			mask2.setPlaceholder("_");
			txtPeriodo = new JFormattedTextField(mask2);
			
			
			mask3 = new MaskFormatter("##,#");
			mask3.setPlaceholder("_");
			txtNota = new JFormattedTextField(mask3);
			
			
			mask4 = new MaskFormatter("R$ #.###,##");
			mask4.setPlaceholder("_");
			txtMensal = new JFormattedTextField(mask4);
	
		
			txtMatricula.setBounds(200, 50, 100, 20);
			txtPeriodo.setBounds(200, 100, 100, 20);
			txtNota.setBounds(200, 150, 100, 20);
			txtMensal.setBounds(200, 200, 100, 20);
		}
		catch(Exception e) {
			
		}
	}
	
	
	
}


