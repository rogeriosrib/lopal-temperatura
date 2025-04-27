package br.dev.roger.temperatura.gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaConversor {
	
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	public void criarTela() {

		JFrame tela = new JFrame();

		Dimension tamanho = new Dimension();
		tamanho.setSize(460, 400);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(30, 80, 385, 35);

		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius : ");
		labelCelsius.setBounds(30, 50, 200, 35);
		
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(labelCelsius);
		
		tela.setVisible(true);
	}

}
