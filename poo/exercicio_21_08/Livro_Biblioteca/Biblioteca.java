package Livro_Biblioteca;

public class Biblioteca {
    private Livro[] livros;
    private int quantidadeLivrosAdicionados = 0;

    public Biblioteca(int quantidadeLivrosSuportados){
        this.livros = new Livro[quantidadeLivrosSuportados];
    }

    public void adicionarLivro(Livro livro){
        this.livros[quantidadeLivrosAdicionados] = livro;
        this.quantidadeLivrosAdicionados ++;
    }

    public void emprestarLivro(String titulo){
        Livro livro = this.bookExists(titulo);
        if (livro instanceof Livro) {
            livro.emprestar();
            System.out.printf("O livro %s foi emprestado\n", livro.getTitulo());
        }
        else{
            System.out.printf("O livro %s não se encontra\n", titulo);
        }
    }

    public void devolverLivro(String titulo){
        Livro livro = this.bookExists(titulo);

        if (livro instanceof Livro ) {
            livro.devolver();
            System.out.printf("livro %s devolvido\n", livro.getTitulo());
        }
        else{
            System.out.printf("O livro %s não se encontra\n", titulo);
        }
    }

    public void mostrarLivro(){
        for (Livro livro : this.livros){
            if (livro instanceof Livro){
                System.out.println(livro);
            }
        }
    }

    public Livro bookExists(String titulo){
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

}
