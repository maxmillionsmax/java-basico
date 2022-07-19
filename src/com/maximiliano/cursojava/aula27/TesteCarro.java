package com.maximiliano.cursojava.aula27;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		Carro fusca = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 60;
		van.consumoCombustivel = 2;
		

		double autonomiaVan = van.obterAutonomia();
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Marca -> "+van.marca);
		System.out.println("Modelo -> "+van.modelo);
		System.out.println("Numero de passageiros -> "+van.numPassageiros);
		System.out.println("Tanque de combustivel -> "+van.capCombustivel);
		System.out.println("Consumo de combustivel -> "+van.consumoCombustivel);
		System.out.println("autonomiaVan -> "+autonomiaVan);
		System.out.println("qtdCombustivel10 -> "+qtdCombustivel10);
		System.out.println("qtdCombustivel15 -> "+qtdCombustivel15);
		
		
		
	}

}
