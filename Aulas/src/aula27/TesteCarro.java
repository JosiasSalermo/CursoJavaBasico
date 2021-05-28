package aula27;

public class TesteCarro {

	public static void main(String[] args) {
		
		// instanciar o Objeto
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		System.out.println(van.consumoCombustivel);
		
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Quantidade de Combustível 10 = " + qtdCombustivel10);
		System.out.println("Quantidade de Combustível 15 = " + qtdCombustivel15);
	}

}
