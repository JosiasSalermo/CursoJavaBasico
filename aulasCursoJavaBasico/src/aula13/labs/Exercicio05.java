package aula13.labs;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        // xFaça um Programa que converta metros para centímetro x

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de metros");
        double metros = scan.nextDouble();

        // 1 m = 100 cm
        double cm = metros * 100;

        System.out.println(metros + " m é igual a " + cm + " cm");
    }
}