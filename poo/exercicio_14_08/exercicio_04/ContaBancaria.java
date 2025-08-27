package exercicio_04;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.printf("%s seu saldo é de R$ %s\n",this.titular, this.saldo);
    }

    public void sacar(double valor){
        if (valor > this.saldo){
            System.out.printf("%s, O valor do saque é maior que seu saldo saque: R$ %.2f saldo: R$%.2f\n",this.titular, valor, this.saldo);
            return;
        }
        else{
            this.saldo -= valor;
            System.out.printf("%s, você sacou R$ %.2f. Seu saldo é de R$ %.2f\n",this.titular, valor, this.saldo);
        }

    }

    public void consultarSaldo(){
        System.out.printf("%s, seu saldo é de R$ %.2f\n",this.titular, this.saldo);
    }


}
