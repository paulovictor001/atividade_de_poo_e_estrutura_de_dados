package Pessoa_endereco;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("paulo victor", 18, new Endereco("Rua Ligação", 10));
         Pessoa pessoa2 = new Pessoa("João", 55, new Endereco("Rua São João", 1));

        System.out.println(pessoa1);
        System.out.println(pessoa2);   
    }

}
