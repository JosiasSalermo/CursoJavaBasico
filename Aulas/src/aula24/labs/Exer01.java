package aula24.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoAbajur = true;
		lampada.tipoLampeao = true;
		lampada.tipoLuminaria = true;
		lampada.tipoPendente = true;
		
		lampada.telefones = new String[5];
		lampada.telefones[0] = "Abajur";
		
		System.out.println(lampada.modelo);
	
		
	

	}

}
