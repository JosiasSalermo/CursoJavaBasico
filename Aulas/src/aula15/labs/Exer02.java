package aula15.labs;

import java.util.Scanner;
// Fa�a um Programa que pe�a um valor e mostre na tela se o 
// valor � positivo ou negativo

public class Exer02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		int num = scan.nextInt();
		
		if(num >=0) {
			System.out.println("O n�mero informado � positivo");
		}else {
			System.out.println("O n�mero informado � negativo");
		}

	}

}
