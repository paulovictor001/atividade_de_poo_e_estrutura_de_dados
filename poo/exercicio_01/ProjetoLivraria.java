package exercicio_01;

public class ProjetoLivraria {
    public static void main(String[] args){
        Livro livroPoo = new Livro();
        Livro livroEstruturaDados = new Livro();

        livroPoo.titulo = "poo em java";
        livroPoo.numeroPaginas = 1000;
        livroPoo.anoPublicacao = 2008;
        livroPoo.preco = 250.00;

        livroEstruturaDados.titulo = "Estrutura de dados";
        livroEstruturaDados.numeroPaginas = 500;
        livroEstruturaDados.anoPublicacao = 2015;
        livroEstruturaDados.preco = 150.00;

        System.out.printf("titulo: %s\n", livroPoo.titulo);
        System.out.printf("Número de paginas: %d\n", livroPoo.numeroPaginas);
        System.out.printf("Ano de publicação: %d\n", livroPoo.anoPublicacao);
        System.out.printf("Preço: %.2f\n", livroPoo.preco);

        System.out.printf("titulo: %s\n", livroEstruturaDados.titulo);
        System.out.printf("Número de paginas: %d\n", livroEstruturaDados.numeroPaginas);
        System.out.printf("Ano de publicação: %d\n", livroEstruturaDados.anoPublicacao);
        System.out.printf("Preço: %.2f\n", livroEstruturaDados.preco);
        


    }
}
