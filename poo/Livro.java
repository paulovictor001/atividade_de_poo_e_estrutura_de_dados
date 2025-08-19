public class Livro{
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

    void cadastrar(){
        System.out.println("Cadastrando no banco de dados...");
    }

    double calcFrete(String cep){
        double valorFrete;
        System.out.printf("Calculando frete para o Cep %s", cep);

        valorFrete=0;
        return valorFrete;
    }

    void vender(){
        System.out.printf("Vendendo livro por R$ %.2f", preco);
    }

    String trocar(){
        return "Livro trocado"; 
    }
}