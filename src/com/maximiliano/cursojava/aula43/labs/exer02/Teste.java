package com.maximiliano.cursojava.aula43.labs.exer02;

public class Teste {

	public static void main(String[] args) {

		PessoaFisica pessoaFisica1 = new PessoaFisica();		
		pessoaFisica1.setNome("Contribuinte 01");
		pessoaFisica1.setRendaBruta(100);
		pessoaFisica1.setCpf("566.265.810-23");
		
		PessoaFisica pessoaFisica2 = new PessoaFisica();
		pessoaFisica2.setNome("Contribuinte 02");
		pessoaFisica2.setRendaBruta(1500);
		pessoaFisica2.setCpf("150.285.730-85");
		
		PessoaFisica pessoaFisica3 = new PessoaFisica();
		pessoaFisica3.setNome("Contribuinte 03");
		pessoaFisica3.setRendaBruta(2800);
		pessoaFisica3.setCpf("170.519.610-12");
		
		PessoaFisica pessoaFisica4 = new PessoaFisica();
		pessoaFisica4.setNome("Contribuinte 04");
		pessoaFisica4.setRendaBruta(3600);
		pessoaFisica4.setCpf("781.769.110-03");
		
		PessoaFisica pessoaFisica5 = new PessoaFisica();
		pessoaFisica5.setNome("Contribuinte 05");
		pessoaFisica5.setRendaBruta(4000);
		pessoaFisica5.setCpf("820.046.320-62");
		
   /***********************************************************************************************/		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("Contriuinte_Juridica 1");
		pessoaJuridica.setRendaBruta(1000);
		pessoaJuridica.setCnpj("54.601.665/0001-80");
		
		PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
		pessoaJuridica1.setNome("Contriuinte_Juridica 2");
		pessoaJuridica1.setRendaBruta(100000);
		pessoaJuridica1.setCnpj("76.507.720/0001-00");
		
		PessoaJuridica pessoaJuridica2 = new PessoaJuridica();
		pessoaJuridica2.setNome("Contriuinte_Juridica 3");
		pessoaJuridica2.setRendaBruta(896585);
		pessoaJuridica2.setCnpj("91.814.365/0001-05");
		
		Contribuinte[] contribuintes = new Contribuinte[8];
		contribuintes[0] = pessoaFisica1;
		contribuintes[1] = pessoaFisica2;
		contribuintes[2] = pessoaFisica3;
		contribuintes[3] = pessoaFisica4;
		contribuintes[4] = pessoaFisica5;
		contribuintes[5] = pessoaJuridica;
		contribuintes[6] = pessoaJuridica1;
		contribuintes[7] = pessoaJuridica2;
		
		for (Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte);
		}
	}

}
