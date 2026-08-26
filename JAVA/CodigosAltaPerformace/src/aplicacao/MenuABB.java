package aplicacao;

import arvores.AbbInt;

import java.util.Scanner;

public class MenuABB {
    static void main(){
        Scanner le = new Scanner(System.in);
        AbbInt abb = new AbbInt();
        int opcao = 0;
        do {
            System.out.println(" 0 - Sair do programa\n " +
                    "1 - Inserir um valor no ANN\n" +
                    "2 - Apresente em ordem os elementos ABB\n");
            System.out.println("Opção: ");
            opcao = le.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Encerrado o programa");
                    break;
                case 1:
                    System.out.println("Informe o valor a ser inserido");
                    int valor = le.nextInt();
                    abb.root = abb.inserir(abb.root, valor);
                    break;
                case 2:
                    System.out.println("Apresentação dos elementos presentes na ABB");
                    abb.mostrarEmOrdem(abb.root);
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção Invalida");
            }while (opcao != 0);

        }
    }

}
