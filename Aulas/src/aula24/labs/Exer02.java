package aula24.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Masering ExtJS";
		livro.autor = "Loiane Groner";
		livro.isbn = "BR123456";
		livro.qtdPaginas = 300;
		livro.anoLancamento = 2015;
		
		System.out.println("Nome do Livro:" + livro.nome);
		System.out.println("Autor: " + livro.autor);
		System.out.println("ISBN: " + livro.isbn);
		System.out.println("Número de Páginas: " + livro.qtdPaginas);
		System.out.println("Ano de Lançamento: " + livro.anoLancamento);
	}

}
