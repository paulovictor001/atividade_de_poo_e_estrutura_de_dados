package pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        System.out.println("instanciando objeto");
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString(){
        return String.format("nome: %s idade: %d",this.nome, this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


}
