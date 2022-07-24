package com.maximiliano.cursojava.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*************Teste Conta bancaria****************");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente conta Simples");
		contaSimples.setNumConta("987654321321");
		
		contaSimples.depositar(100);

		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);
		
        System.out.println("\n*************Teste Conta Poupança***************");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente conta Poupança");
		contaPoupanca.setNumConta("987654321321");
		contaPoupanca.setDiaRendimento(25);
		
		contaPoupanca.depositar(100);

		realizarSaque(contaPoupanca, 50);
		
		realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Novo rendimento aplicado, novo de saldo é de = "+contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, saldo é de = "+contaPoupanca.getSaldo());
		}
		System.out.println(contaPoupanca);
		
		System.out.println("\n*************Teste Conta Especial****************");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente conta Especial");
		contaEspecial.setNumConta("987987");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);

		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = "+conta.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para saque de  = "+valor+"; saldo de  = "+conta.getSaldo());
		}
		
	}

}
