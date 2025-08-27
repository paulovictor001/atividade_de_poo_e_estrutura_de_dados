package contaBancaria;

public class ContaBancaria {
    private int  numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo){
        this.setNumeroConta(numeroConta);
        this.setSaldo(saldo);
    }

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void sacar(double valorSaque){
        if (this.saldo < valorSaque){
            System.out.println("saldo insuficiente");
        }
        else{
            this.saldo -= valorSaque;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
