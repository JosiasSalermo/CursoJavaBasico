package aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && verdadeiro);
        System.out.println(verdadeiro && falso);

        System.out.println(verdadeiro || verdadeiro);
        System.out.println(verdadeiro || falso);

        System.out.println(verdadeiro ^ verdadeiro);
        System.out.println(falso ^ falso);
        System.out.println(verdadeiro ^ falso);

        System.out.println(!verdadeiro);
        System.out.println(!falso);
    }
}
