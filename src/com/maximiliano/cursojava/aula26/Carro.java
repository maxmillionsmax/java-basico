package com.maximiliano.cursojava.aula26;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonimia do carro é: "+capCombustivel*consumoCombustivel+" km");
	}
	double obterAutonomia() {

		System.out.println("Metodo obterAutonomia foi chamado");		
		
		return capCombustivel*consumoCombustivel;
		
	}
}
