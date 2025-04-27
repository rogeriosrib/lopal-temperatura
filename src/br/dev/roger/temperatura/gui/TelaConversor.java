package br.dev.roger.temperatura.gui;

import java.awt.Dimension;
import java.awt.Font;

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
	
	private Font labelFont = new Font("Arial", Font.BOLD, 13);

	public void criarTela() {

		JFrame tela = new JFrame();

		Dimension tamanho = new Dimension();
		tamanho.setSize(460, 350);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(30, 50, 380, 35);

		labelCelsius = new JLabel();
		labelCelsius.setFont(labelFont);
		labelCelsius.setText("Temperatura em graus celsius : ");
		labelCelsius.setBounds(30, 20, 250, 35);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(230, 100, 180, 40);;
		
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setBounds(30, 100, 180, 40);;
		
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		
		tela.setVisible(true);
	}

}
