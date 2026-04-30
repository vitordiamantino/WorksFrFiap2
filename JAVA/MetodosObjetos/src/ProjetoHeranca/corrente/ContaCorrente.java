package ProjetoHeranca.corrente;

import ProjetoHeranca.conta.Conta;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int num, double saldo, double limite) {
        super(num, saldo);
        this.limite = limite;
    }

    @Override
    public double getSaldoDisponivel() {
        return saldo + limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
