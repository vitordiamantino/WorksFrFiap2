package Exercicio4Processador;

import FilasSequencias.filas.FilaInt;

import java.util.Scanner;

public class Processador {
    public static void main(String[] args) {
            Scanner le = new Scanner(System.in);
            FilaInt fila = new FilaInt();
            fila.init();
            int opcao;
            do {
                System.out.println("1- Submeter processo para execução");
                System.out.println("2- Executar processo");
                System.out.println("3- Shutdown");
                opcao = le.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("Informe o PID:");
                        int pid = le.nextInt();
                        fila.enqueue(pid);
                        break;
                    case 2:
                        if (fila.isEmpty()){
                            System.out.println("Não há processos na fila");
                        }
                        pid = fila.dequeue();
                        System.out.println("Aluno: "+ pid + "será atendido agora");
                        System.out.println("...Executando...");
                        System.out.println("Processo foi concluido? (1-sim):");
                        int resp = le.nextInt();
                        if (resp == 1) {
                            System.out.println("O processo: "+pid+" foi finalizado!");
                        }
                        fila.enqueue(pid);
                        break;
                    case 3:
                        if (!fila.isEmpty()){
                            System.out.println("Há alunos aguardando na fila!");
                            opcao = 0;
                        }
                        break;
                    default:
                        System.out.println("Opção Invalida");
                }
            }
            while (opcao !=3);

        }
    }

}
