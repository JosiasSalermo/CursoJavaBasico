package aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		
		contato1.nome = "João";
		contato1.endereco = "Av. Paulista, 1000";
		contato1.email = "joao@email.com";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "9-9999-9999";
		contato1.telefones[1] = "9-9999-9988";
		contato1.telefones[2] = "9-9999-9977";

	}

}
