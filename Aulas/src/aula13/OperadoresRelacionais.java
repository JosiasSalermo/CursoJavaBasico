package aula13;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		System.out.println("valor1 == valor2: " + (valor1 == valor2));
		System.out.println(valor1 == valor2 ? "igual" : "diferente");
		
		System.out.println("valor1 != valor2: " + (valor1 != valor2));
		System.out.println(valor1 != valor2 ? "diferente" : "igual");
		
		System.out.println("valor1 > valor2: " + (valor1 > valor2));
		System.out.println(valor1 > valor2 ? "maior" : "menor");
		
		System.out.println("valor1 >= valor2: " + (valor1 >= valor2));
		System.out.println(valor1 >= valor2 ? "maior ou igual" : "Não é maior nem igual");
		
		System.out.println("valor1 < valor2: " + (valor1 < valor2));
		System.out.println(valor1 < valor2 ? "menor" : "não é menor");
		
		System.out.println("valor1 <= valor2: " + (valor1 <= valor2));
		System.out.println(valor1 <= valor2 ? "menor ou igual" : "não é menor nem igual");

	}

}
