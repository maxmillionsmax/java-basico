package com.maximiliano.cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonimia do carro é: "+capCombustivel*consumoCombustivel+" km");
	}
}
