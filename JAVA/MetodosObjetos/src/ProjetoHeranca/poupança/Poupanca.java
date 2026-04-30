package ProjetoHeranca.poupança;

import ProjetoHeranca.conta.Conta;

public class Poupanca extends Conta {
    private double taxaRendimento;

    public Poupanca(int num, double saldo, double taxaRendimento) {
        super(num, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        saldo += saldo * taxaRendimento / 100;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
