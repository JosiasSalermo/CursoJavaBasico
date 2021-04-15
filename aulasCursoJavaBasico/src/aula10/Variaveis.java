public class Variaveis {
    

    public static void main(String[] args) {
        
        // Convenção Java
        int idade = 20;
        String nome = "Loiane";
        String nomeDoMeuCachorro = "totô";
        String ano = "2021";

        // Reatribuir a variável
        idade = 25;

        // aceito, mas não utilizado
        int _idade;
        int $idade;

        // Não é convenção Java
        String nome_do_meu_cachorro;

        String NomeDoMeuCachorro; /* iciaiar com Maiúscula só Classe */

        System.out.println("Idade - " + idade);
        System.out.println("Nome - " + nome);

        // má prática
        int a = 10;
        String b = "Loiane";
    }
}
