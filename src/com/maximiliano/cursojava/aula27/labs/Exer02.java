package com.maximiliano.cursojava.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "965-56";
		conta.agencia = "987987987";
		conta.especial =true;
		conta.limiteEspecial = 100;
		conta.valorEspecialUsado = 1000;
		conta.saldo = -10;
		
		
		System.out.println("saldo da conta  "+conta.numero+" = "+conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(30);
		
		if (saqueEfetuado) {
			System.out.println("saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente de "+conta.saldo);
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		
		if (saqueEfetuado) {
			System.out.println("saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente de "+conta.saldo);
		}
		
		conta.depositar(50);
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		
		if (saqueEfetuado) {
			System.out.println("saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente de "+conta.saldo);
		}

		conta.realizarSaque(1000);
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial");
		}else {
			System.out.println("Não esta usando cheque especial");
		}
		conta.consultarSaldo();
	}
}
