package Pessoa_endereco;

public class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero){
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString(){
        return String.format("rua: %s, número: %d,", this.rua, this.numero);
    }
}
