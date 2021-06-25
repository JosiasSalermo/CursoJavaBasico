package aula15;

import java.util.Scanner;

public class SwitchCaseElegante {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da Semana");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia útil");
			break;
		case 1:
		case 7:
			System.out.println("Fim de semana");
			break;
		default:
			System.out.println("Não é um dia da semana válido");
		}
	}

}
