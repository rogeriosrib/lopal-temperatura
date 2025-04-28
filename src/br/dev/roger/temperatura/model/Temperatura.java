package br.dev.roger.temperatura.model;

public class Temperatura {


	private double celsius;
	
	// Métodos getters e setters
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
		
	// Métodos para conversão da temperatura
	public double converterParaKelvin() {
		double temperatura = celsius + 273.15;
		return temperatura;
		
	}
	
	public double converterParaFahrenheit() {
		double temperatura = celsius * 1.8 + 32;
		return temperatura;
		
	}
	
		
}
