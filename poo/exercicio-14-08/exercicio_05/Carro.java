package exercicio_05;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void informacoesCarro(){
        System.out.printf("marca: %s, modelo: %s, ano:%d\n",this.marca, this.modelo, this.ano);
    }

    public void ligar(){
        System.out.println("Carro ligado");
    }
}
