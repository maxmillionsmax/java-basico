package com.maximiliano.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
        Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 60;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.numPassageiros);
				
		Carro fusca = new Carro("Volksvagem", "Fusca 71", 5, 55.9, 10.3);
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println(fusca.numPassageiros);
		System.out.println(fusca.capCombustivel);
		System.out.println(fusca.consumoCombustivel);
		

	}

}
