package com.maximiliano.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Maximiliano");
		//contato.setEndereco("Brazil - Minas gerais- Belo horizonte");
		//contato.setTelefone("31654654654");
		
		//criar objeto endereco
		Endereco endereco = new Endereco();
		endereco.setNomeRua("WAR");
		endereco.setNumero("666");
		endereco.setComplemento("n/a");
		endereco.setCidade("Belo Horizonte");
		endereco.setEstado("Californi");
		endereco.setCep("362655555");
		
		Telefone telefone = new Telefone();
		telefone.setDDD("31");
		telefone.setNumero("321654321");
		telefone.setTipo("Fixo");
		
		Telefone telefone2 = new Telefone();
		telefone2.setDDD("11");
		telefone2.setNumero("98979797");
		telefone2.setTipo("Celular");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setEndereco(endereco);
		contato.setTelefones(telefones);
		
		System.out.println("Nome => "+contato.getNome());
		
		/*if (contato !=null && contato.getTelefone()!=null) {
			
			System.out.println("DDD => "+contato.getTelefone().getDDD()+" - "
					+ " Numero -> "+ contato.getTelefone().getNumero()+" "
							+ " Tipo:  "+contato.getTelefone().getTipo());
			
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			System.out.println("Telefones:");
			for (Telefone t : contato.getTelefones()) {
				System.out.println("DDD - "+t.getDDD()+" numero "+t.getNumero()+" tipo: "+t.getTipo());
			}
		}
		
		if (contato !=null && contato.getEndereco()!=null) {
			
			System.out.println("Endereço => "+contato.getEndereco().getCidade());
		}
		
	}

}
