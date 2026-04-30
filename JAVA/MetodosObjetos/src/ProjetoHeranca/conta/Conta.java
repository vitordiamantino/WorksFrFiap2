package ProjetoHeranca.conta;

public class Conta {
    protected int numConta;
    protected double saldo;

    public Conta(int num, double saldo) {
        this.numConta = num;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public double getSaldoDisponivel(){
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
