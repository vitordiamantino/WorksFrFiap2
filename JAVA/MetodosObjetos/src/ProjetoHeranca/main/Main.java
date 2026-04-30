package ProjetoHeranca.main;

import ProjetoHeranca.conta.Conta;
import ProjetoHeranca.corrente.ContaCorrente;
import ProjetoHeranca.poupança.Poupanca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<>();
        lista.add(new ContaCorrente(1, 8500, 80000));
        lista.add(new Poupanca(2, 2500, 10));

        for (Conta conta : lista){
            conta.depositar(1000);
            System.out.println(conta);
            System.out.println(conta.getSaldoDisponivel());

        }
    }
}
