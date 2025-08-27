package Livro_Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void emprestar(){
        this.disponivel = false;
    }

    public void devolver(){
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return String.format("Titulo: %s, Autor: %s, Disponivel: %s", this.titulo, this.autor, this.disponivel ? "sim" : "não");
    }
}
