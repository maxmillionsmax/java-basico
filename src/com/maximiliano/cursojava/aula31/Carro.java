package com.maximiliano.cursojava.aula31;

public class Carro {

	 public String marca;
	 String modelo;
	 int numPassageiros;
	 double capCombustivel;
	 private double consumoCombustivel;
	
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
		System.out.println("Chamando o construtor com 3 parâmetros");
		
	}
	
	public Carro(String marca, String modelo) {
		
		this(marca,modelo,10);
		System.out.println("Chamando o construtor com 2 parâmetros");
	}
	
	public void exibirAutonomia() {
		
		System.out.println("A autonimia do carro é: "+this.capCombustivel*this.consumoCombustivel+" km");
	}
	public double obterAutonomia() {

		return this.capCombustivel*this.consumoCombustivel;
		
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		
		return this.divideKMPorConsumoCombustivel(km);
	}
}
