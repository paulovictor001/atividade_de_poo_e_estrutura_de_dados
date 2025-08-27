package carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("ford", 2007);

        System.out.printf("marca: %s ano: %d",carro.getMarca(), carro.getAno());
    }
}
