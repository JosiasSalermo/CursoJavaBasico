package aula14;

import java.util.Scanner;

public class MultiplosIfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o pre�o do item");
		double valor = scan.nextDouble();
		
		if(valor <= 10 ) {
			System.out.println("Est� barato, pode comprar");
		}else if(valor > 10 && valor < 15) {
			System.out.println("Voc� pode pedir um desconto");
		}else if(valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
		}else {
			System.out.println("Muito caro");
		}

	}

}
