// Fa?a um programa que leia tr?s n?meros e mostre o maior
package aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com primeiro n?mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com segundo n?mero:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com terceiro n?mero:");
		int num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >=  num3) {
			System.out.println("num1 ? maior:" + num1);
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println("num2 ? maior:" + num2);
		}else if(num3 >= num1 && num3 >= num2) {
			System.out.println("num3 ? maior:" + num3);
		}
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("num1 ? menor:" + num1);
		}else if(num2 <= num1 && num2 <= num3) {
			System.out.println("num2 ? menor:" + num2);
		}else if(num3 <= num1 && num3 <= num2) {
			System.out.println("num3 ? menor:" + num3);
		}
	}

}
