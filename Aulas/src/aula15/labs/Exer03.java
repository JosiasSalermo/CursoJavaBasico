// Faça um Programa que verifique se uma letra digitada é 
// "F" ou "M". Conforme a letra escrever: F - Feminino
// M - Masculino, Sexo Inválido.
package aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra (F ou M:");
		String input = scan.next();
		
		if(input.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		}else if(input.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		}else {
			System.out.println("Sexo inválido");
		}
	}

}
