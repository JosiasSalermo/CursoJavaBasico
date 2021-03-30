
public class Variaveis {

    public static void main(String[] args){

        // convenção Java
        int idade = 20;
        String nome = "Loiane";
        String nomeDoMeuCachorro = "totô";
        String ano = "2021";

        idade = 25;

        // aceito, mas não utilizado
        int _idade;
        int $idade;

        // não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;

        System.out.println("Idade -" + idade);
        System.out.println("Nome - " + nome);

        // má prática
        int a = 10;
        String b = "Loiane";
    }
}