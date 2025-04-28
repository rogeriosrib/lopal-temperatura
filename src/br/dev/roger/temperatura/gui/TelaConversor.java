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
	// Criando atributos da TelaConversor
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	// Criando fontes e cores usadas
	private Font FontDefault = new Font("Arial", Font.BOLD, 14);
	private Font FontResultado = new Font("Arial", Font.BOLD, 16);
	private Font ErrorFont = new Font("Arial", 3, 17);
	private Color labelsColor = new Color(255, 0, 0);

	// Método que cria a tela
	public void criarTelaConversor() {

		// Criando a tela usando JFrame e definindo tamanho através do Dimension
		JFrame tela = new JFrame();

		Dimension tamanho = new Dimension();

		// Defino tamanho
		tamanho.setSize(460, 350);
		tela.setSize(tamanho);

		// Defino função do botão fechar
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Título da tela
		tela.setTitle("Conversor de Temperatura");

		// Me permite posicionar os JLabels Jbuttons e Jframes usando xy
		tela.setLayout(null);

		// Centraliza o Jframe
		tela.setLocationRelativeTo(null);

		// Define que a tela não seja redimensionável
		tela.setResizable(false);

		// Campo para colocar o número desejado de Celsius
		textCelsius = new JTextField();
		textCelsius.setBounds(30, 50, 380, 35);

		// Texto informando o que deve ser colocado no campo
		labelCelsius = new JLabel();
		// Defino a fonte do campo
		labelCelsius.setFont(FontDefault);
		labelCelsius.setText("Temperatura em graus celsius : ");
		// Defino posição
		labelCelsius.setBounds(30, 18, 250, 35);

		// Botão que realiza a conversão de Celsius para Kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setFont(FontDefault);
		buttonKelvin.setBounds(230, 100, 180, 35);

		// Botão que realiza a conversão de Celsius para Kelvin
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setFont(FontDefault);
		buttonFahreinheit.setBounds(30, 100, 180, 35);

		// Texto que informa o resultado
		labelResultado = new JLabel();
		labelResultado.setText("");
		labelResultado.setFont(FontResultado);
		labelResultado.setBounds(160, 160, 180, 30);

		// Texto que informa o usuário caso coloque uma informação errada
		labelMensagemErro = new JLabel();
		labelMensagemErro.setForeground(labelsColor);
		labelMensagemErro.setFont(ErrorFont);
		labelMensagemErro.setBounds(100, 200, 400, 50);

		// Adicionando função ao botão Fahreinheit
		buttonFahreinheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Try tenta converter o número atribuido ao campo, caso seja um caracter
				// inválido ele usa o catch
				try {
					Temperatura resultado = new Temperatura();
					double celsius = Double.parseDouble(textCelsius.getText());
					resultado.setCelsius(celsius);
					double fahreinheit = resultado.converterParaFahrenheit();
					labelResultado.setText(fahreinheit + "° Fahreinheit");
					textCelsius.setText(null);
					textCelsius.requestFocus();
					labelMensagemErro.setText(null);

					// Torna visível a mensagem de erro, limpa os campos e direciona para o campo de
					// digitação
				} catch (NumberFormatException ex) {
					labelMensagemErro.setText(
							"<html>&nbsp;Por favor digite algum número<br> sem letras ou outros caracteres</html>");
					;
					labelResultado.setText(null);
					textCelsius.setText(null);
					textCelsius.requestFocus();
				}

			}
		});

		// Adicionando função ao botão Kelvin
		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Try tenta converter o número atribuido ao campo, caso seja um caracter
				// inválido ele usa o catch
				try {
					Temperatura resultado = new Temperatura();
					double kelvin = Double.parseDouble(textCelsius.getText());
					resultado.setCelsius(kelvin);
					double celsius = resultado.converterParaKelvin();
					labelResultado.setText(celsius + "° Kelvin");
					textCelsius.setText(null);
					textCelsius.requestFocus();
					labelMensagemErro.setText(null);

					// Torna visível a mensagem de erro, limpa os campos e direciona para o campo de
					// digitação
				} catch (NumberFormatException ex) {
					labelMensagemErro.setText(
							"<html>&nbsp;Por favor digite algum número<br> sem letras ou outros caracteres</html>");
					labelResultado.setText(null);
					textCelsius.setText(null);
					textCelsius.requestFocus();
				}

			}
		});

		// Adicionando Labels, Jbuttons e Jframes ao painel de contéudo
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);

		// Tornando a tela visível
		tela.setVisible(true);
	}

}
