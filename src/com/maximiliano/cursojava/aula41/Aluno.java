package com.maximiliano.cursojava.aula41;

public class Aluno extends Pessoa{

	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso )  {
		super(nome, endereco, telefone);
		this.curso = curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
	    return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("6546546");
		this.setCpf("65465465");
	}
	
    public String obterEtiquetaEndereco() {
    	
		String s = "Endereço do Aluno: ";
		s+= this.getEndereco();
		return s;
	}

	public void imprimirEtiquetaEndereco() {

		System.out.println("impressão endereço do Aluno");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
}
