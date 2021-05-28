package aula27;

public class Carro {
	
	// Atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	// Métodos - Ações
	
	
	// Método Sem Retorno
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é:" + capCombustivel * consumoCombustivel );
	}
	
	// Método Com Retorno
	double obterAutonomia() {
		System.out.println("Metodo obterAutonomia foi chamado");
		
		return capCombustivel * consumoCombustivel;
	}
	
	
	// Método com Parâmetro
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
}
