package com.maximiliano.cursojava.aula40;

public class Professor extends Pessoa{

	private double salario;
	private String[] cursos;
		
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	public double calcularSalarioLiquido() {
		
		return 0;
	}
	
    public String obterEtiquetaEndereco() {
    	
		String s = "Endereço do Professor: ";
		s+= this.getEndereco();
		return s;
	}

}
