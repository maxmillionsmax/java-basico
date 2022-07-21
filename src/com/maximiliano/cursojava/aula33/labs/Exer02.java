package com.maximiliano.cursojava.aula33.labs;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.setNumero("965-56");
		conta.setAgencia("987987987");
		conta.setEspecial(true);
		conta.setLimiteEspecial(5);
		conta.setValorEspecialUsado(1000);
		conta.setSaldo(10);
		
		
		System.out.println("saldo da conta  "+conta.getNumero()+" é "+conta.getSaldo());
		
		boolean saqueEfetuado = conta.realizarSaque(30);
		
		if (saqueEfetuado) {
			System.out.println("saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente de "+conta.getSaldo());
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		
		if (saqueEfetuado) {
			System.out.println("saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente de "+conta.getSaldo());
		}
		
		conta.depositar(50);
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		
		if (saqueEfetuado) {
			System.out.println("saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente de "+conta.getSaldo());
		}

		conta.realizarSaque(1000);
		System.out.println("Tentativa de saque de 1000 reais");
		if (saqueEfetuado) {
			System.out.println("saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente de "+conta.getSaldo());
		}
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial");
		}else {
			System.out.println("Não esta usando cheque especial");
		}
		conta.consultarSaldo();
	}
}
