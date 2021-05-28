package aula27;

public class Carro {
	
	// Atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	// M�todos - A��es
	
	
	// M�todo Sem Retorno
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �:" + capCombustivel * consumoCombustivel );
	}
	
	// M�todo Com Retorno
	double obterAutonomia() {
		System.out.println("Metodo obterAutonomia foi chamado");
		
		return capCombustivel * consumoCombustivel;
	}
	
	
	// M�todo com Par�metro
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
}
