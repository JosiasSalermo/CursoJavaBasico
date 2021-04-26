import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        // Faça um programa que peça um número e então 
        // mostre a mensagem O número informado foi [numero]
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O numero informado foi: " + numero);
    }
}
