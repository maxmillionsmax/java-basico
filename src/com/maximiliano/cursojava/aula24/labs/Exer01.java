package com.maximiliano.cursojava.aula24.labs;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.cor = "Amarelo";
		lampada.potencia = 7;
		lampada.tipoAbaju = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abauju";
		lampada.tipos[1] = "Lampeões";
	}

}
