package aula12;

import java.util.Scanner;

public class LeituraVariosDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu primeiro nome,"
				+ "idade, quantidade de filhos,"
				+ "altura"
				+ "e se tem bichinho de estima��o" );
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		int qtdFilhos = scan.nextInt();
		double altura = scan.nextDouble();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bichinhos de estima��o?" + temPet);
		
	}

}
