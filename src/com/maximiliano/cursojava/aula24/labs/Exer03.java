package com.maximiliano.cursojava.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {

		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2014;
		livro.isbn = "132132sdf3213fsd";
		livro.preco = 12.45;
		
		System.out.println("Nome do livro = "+livro.nome);
		System.out.println("autro do livro = "+livro.autor);
		System.out.println("Ano lancamento do livro = "+livro.anoLancamento);
		System.out.println("Ano lancamento do livro = "+livro.preco);
		
	}

}
