package contaBancaria;


public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234566, 1500.00);

        System.out.println(conta.getSaldo());
        conta.depositar(500.00);
        System.out.println(conta.getSaldo());
        conta.sacar(1000.00);
        System.out.println(conta.getSaldo());

    }
}
