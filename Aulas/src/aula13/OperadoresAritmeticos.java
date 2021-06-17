package aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado); // 3
		
		resultado = resultado - 1;
		System.out.println(resultado); // 2
		
		resultado = resultado * 2;
		System.out.println(resultado); // 4
		
		resultado = resultado / 2;
		System.out.println(resultado); // 2
		
		resultado = resultado + 8;
		System.out.println(resultado); // 10
		
		resultado = resultado % 7;
		System.out.println(resultado); // 3
		
		String primeiroNome = "Esta �";
		String segundoNome = "uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado); // 4
		
		// resultado = resultado + 1
		resultado++;
		System.out.println(resultado);
		
		System.out.println(resultado++); // 5
		System.out.println(resultado); // 6
		
		/* mesma coisa que...
		 * System.out.println(resultado);
		 * resultado = resultado + 1;
		 * que � a mesma coisa que 
		 * resultado++
		 * ou 
		 * resultado += 1; 
		 * 
		 * */
		System.out.println(resultado); // 6
		
		
		System.out.println(++resultado); // 7
		/* mesma coisa que 
		 * resultado += 1;
		 * System.out.println(resultado);
		 * */
		
		resultado--;
		System.out.println(resultado); //6
		System.out.println(resultado--); // 6
		System.out.println(resultado); // 5
		System.out.println(--resultado); // 4
		

	}

}
