package br.dev.roger.temperatura.model;

public class Temperatura {


	private double celsius;
	
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
		
	public double converterParaKelvin(double kelvin) {
		double temperatura = celsius + 273.15;
		return temperatura;
		
	}
	
	public double converterParaFahrenheit(double fahrenheit) {
		double temperatura = celsius * 1.8 + 32;
		return temperatura;
		
	}
		
		public void exibirDados() {
			System.out.println("-----------------");
			System.out.println("Dados da circunferência");
			System.out.println("temperatura celsius em kelvin " + converterParaKelvin(celsius));
			System.out.println("temperatura celsius em Fahrenheit " + converterParaFahrenheit(celsius));

	}
	

}
