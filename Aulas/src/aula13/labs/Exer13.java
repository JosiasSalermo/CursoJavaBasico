/*
 * */
package aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhadas ");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto /100) * 11;
		double totalDesconto = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDesconto;
		
		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("INSS:" + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR:" + ir);
		System.out.println("Total desconto: " + totalDesconto);
		System.out.println("Salario liquido:" + salarioLiquido);
	}

}
