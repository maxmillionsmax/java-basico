package com.maximiliano.cursojava.aula24.labs;

public class Exer05 {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.numero = "123456";
		contaCorrente.agencia = "987987987";
		contaCorrente.limiteEspecial = 123424;
		contaCorrente.saldo = 987986546;
		
		System.out.println("contaCorrente.numero = "+contaCorrente.numero);
		System.out.println("contaCorrente.agencia  = "+contaCorrente.agencia );
		System.out.println("contaCorrente.limiteEspecial = "+contaCorrente.limiteEspecial);
		System.out.println("contaCorrente.saldo = "+contaCorrente.saldo);
		
	}

}
