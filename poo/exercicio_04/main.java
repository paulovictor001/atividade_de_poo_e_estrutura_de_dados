package exercicio_04;

public class main {

    public static void main(String[] args){
        ContaBancaria contabancaria1 = new ContaBancaria("1234", "paulo", 1000.00);
        ContaBancaria contabancaria2 = new ContaBancaria("4321", "victor", 1000.00);
        
        contabancaria1.consultarSaldo();
        contabancaria1.depositar(500.00);
        contabancaria1.consultarSaldo();
        contabancaria1.sacar(3000.00);
        contabancaria1.consultarSaldo();
        
        contabancaria2.consultarSaldo();
        contabancaria2.depositar(1000.00);
        contabancaria2.consultarSaldo();
        contabancaria2.sacar(1500.00);
        contabancaria2.consultarSaldo();
    }
}