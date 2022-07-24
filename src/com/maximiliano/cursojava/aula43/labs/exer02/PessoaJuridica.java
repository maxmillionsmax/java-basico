package com.maximiliano.cursojava.aula43.labs.exer02;

public class PessoaJuridica extends Contribuinte{

	private String cnpj;
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	@Override
	public double calcularImposto() {
	
		return this.getRendaBruta() *0.1;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "] Imposto a ser pago -> "+calcularImposto()+"\n" + super.toString();
	}
	
}
