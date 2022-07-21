package com.maximiliano.cursojava.aula29;

public class Carro2 {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro2() {

	}
	public Carro2(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	void exibirAutonomia() {
		
		System.out.println("A autonimia do carro é: "+capCombustivel*consumoCombustivel+" km");
	}
	double obterAutonomia() {

		return capCombustivel*consumoCombustivel;
		
	}
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}
