package Livro_Biblioteca;

public class Main {
    public static void main(String[] args) {
        
        Livro codigoLimpo = new Livro("Código limpo", "Robert C. Martin");
        Livro comoProgramarC = new Livro("Como Programar em C++", "vitinho");
        Livro entendendoAlgoritmos = new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava");
        Biblioteca bibliotecaUnama = new Biblioteca(5);
    
        bibliotecaUnama.adicionarLivro(codigoLimpo);
        bibliotecaUnama.adicionarLivro(comoProgramarC);
        bibliotecaUnama.adicionarLivro(entendendoAlgoritmos);
        bibliotecaUnama.mostrarLivro();
        bibliotecaUnama.emprestarLivro("Código limpo");
        bibliotecaUnama.emprestarLivro("Como Programar em C++");
        bibliotecaUnama.mostrarLivro();
        bibliotecaUnama.devolverLivro("Como Programar em C++");
        bibliotecaUnama.mostrarLivro();
    }
}
