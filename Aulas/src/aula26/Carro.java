package aula26;

public class Carro {

	// Atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// M�todos
	double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
}
