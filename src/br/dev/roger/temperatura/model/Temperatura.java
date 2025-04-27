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
		
		public void exibirDados() {
			System.out.println("-----------------");
			System.out.println("Dados da circunferência");
			System.out.println("temperatura" + converterParaKelvin(celsius));

	}
	

}
