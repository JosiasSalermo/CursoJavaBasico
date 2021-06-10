// Faça um Programa que verifique se uma letra digitada é 
// vogal ou consoante

package aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra:");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("a") ||
				letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i") || 
				letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u")) {
			System.out.println("vogal");
		}else {
			System.out.println("consoante");
		}
	}

}
