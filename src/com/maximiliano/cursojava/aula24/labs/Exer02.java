package com.maximiliano.cursojava.aula24.labs;

public class Exer02 {

	public static void main(String[] args) {

		Livro livro = new Livro();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2014;
		livro.isbn = "132132sdf3213fsd";
		
		System.out.println("Nome do livro = "+livro.nome);
		System.out.println("autro do livro = "+livro.autor);
		System.out.println("Ano lancamento do livro = "+livro.anoLancamento);
	}

}
