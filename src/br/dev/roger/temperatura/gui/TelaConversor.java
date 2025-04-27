package br.dev.roger.temperatura.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.roger.temperatura.model.Temperatura;

public class TelaConversor {

	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	// Criando fontes e cores usadas
	private Font labelFont = new Font("Arial", Font.BOLD, 13);
	private Color labelsColor = new Color(255, 0, 0);

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
		buttonKelvin.setFont(labelFont);
		buttonKelvin.setBounds(230, 100, 180, 35);
		;

		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setFont(labelFont);
		buttonFahreinheit.setBounds(30, 100, 180, 35);
		;

		labelResultado = new JLabel();
		labelResultado.setText("");
		labelResultado.setFont(labelFont);
		labelResultado.setBounds(165, 180, 180, 30);
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setForeground(labelsColor);
		labelMensagemErro.setFont(labelFont);
		labelMensagemErro.setBounds(45, 210, 400, 50);
		


		buttonFahreinheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
				Temperatura resultado = new Temperatura();
				double celsius = Double.parseDouble(textCelsius.getText());
				resultado.setCelsius(celsius);
				double fahreinheit = resultado.converterParaFahrenheit();
				labelResultado.setText(fahreinheit + "° Fahreinheit");
				textCelsius.setText(null);
				textCelsius.requestFocus();
				
				} catch (NumberFormatException ex) {
					labelMensagemErro.setText("Digite apenas números \n sem letras ou outros caracteres");
		            labelResultado.setText(null);
		            textCelsius.setText(null);
		            textCelsius.requestFocus();
		        }
			}
		});
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
				Temperatura resultado = new Temperatura();
				double kelvin = Double.parseDouble(textCelsius.getText());
				resultado.setCelsius(kelvin);
				double celsius = resultado.converterParaKelvin();
				labelResultado.setText(celsius + "° Kelvin");
				textCelsius.setText(null);
				textCelsius.requestFocus();
				} catch (NumberFormatException ex) {
					labelMensagemErro.setText("Digite apenas números \n sem letras ou outros caracteres");
		            labelResultado.setText(null);
		            textCelsius.setText(null);
		            textCelsius.requestFocus();
		        }
				
			}
		});
		
		

		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);

		tela.setVisible(true);
	}

}
