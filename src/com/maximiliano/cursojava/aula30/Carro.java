package com.maximiliano.cursojava.aula30;

 class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro() {

	}
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 par�metros");
		
	}
	
	public Carro(String marca, String modelo) {
		
		this(marca,modelo,10);
		System.out.println("Chamando o construtor com 2 par�metros");
	}
	
	void exibirAutonomia() {
		
		System.out.println("A autonimia do carro �: "+this.capCombustivel*this.consumoCombustivel+" km");
	}
	double obterAutonomia() {

		return this.capCombustivel*this.consumoCombustivel;
		
	}
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/this.capCombustivel;
		
		return qtdCombustivel;
	}
}
