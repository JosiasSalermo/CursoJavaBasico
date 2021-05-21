package aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		// Criação de objetos
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println("Marca:" + van.marca);
		System.out.println("Modelo: " + van.modelo);
		System.out.println("Número de Passageiros: " + van.numPassageiros + " pessoas");
		System.out.println("Capacidade de combustível: " + van.capCombustivel + " litros" );
		System.out.println("Consumo de Combustível" + van.consumoCombustivel + " km/l");
		
		
		// Fusca
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;

	}

}
