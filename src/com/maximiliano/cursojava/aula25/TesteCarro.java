package com.maximiliano.cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 60;
		van.consumoCombustivel = 0.2;
		
		
		Carro fusca = new Carro();
		
		fusca.marca = "Volksvagem";
		fusca.modelo = "Fusca 71";
		fusca.numPassageiros = 5;
		fusca.capCombustivel = 55.9;
		fusca.consumoCombustivel = 0.5;
		
		System.out.println("Marca -> "+van.marca);
		System.out.println("Modelo -> "+van.modelo);
		System.out.println("Numero de passageiros -> "+van.numPassageiros);
		System.out.println("Tanque de combustivel -> "+van.capCombustivel);
		System.out.println("Consumo de combustivel -> "+van.consumoCombustivel);
		van.exibirAutonomia();
		
		System.out.println();
		
		System.out.println("Marca -> "+fusca.marca);
		System.out.println("Modelo -> "+fusca.modelo);
		System.out.println("Numero de passageiros -> "+fusca.numPassageiros);
		System.out.println("Tanque de combustivel -> "+fusca.capCombustivel);
		System.out.println("Consumo de combustivel -> "+fusca.consumoCombustivel);
		fusca.exibirAutonomia();
		
	}

}
