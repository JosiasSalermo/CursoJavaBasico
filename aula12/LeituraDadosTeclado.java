package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        // Apenas primeiro nome
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        // Inteiro
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        // Double
        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: " + altura);
    }
}