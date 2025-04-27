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
		tamanho.setSize(500, 400);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		textCelsius.setText("Temperatura em graus Celsius:");
		textCelsius.setBounds(50, 50, 50, 50);
		
		
		
		
		
		tela.setVisible(true);
	}

}
