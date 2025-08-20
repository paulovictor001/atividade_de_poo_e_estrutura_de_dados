package exercicio_05;

public class main {
    public static void main(String[] args){
        Carro carro1 = new Carro("Ford", "Mustang", 2026);
        Carro carro2 = new Carro("Chevrolet", "Onix", 2020);
    
        carro1.informacoesCarro();

        carro1.marca = "Fiat";
        carro1.modelo = "Argo";
        carro1.ano = 2025;

        carro1.informacoesCarro();

        carro2.informacoesCarro();
        carro2.ligar();

    }
    
}
