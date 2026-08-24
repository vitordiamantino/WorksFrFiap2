package exercicio13.view;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;

public class MenuPrincipal {
    public void menu() {
        String[] item = {"Vendedor", "Venda", "Finalizar"};
        String opcao;

        do {
            opcao = (String) showInputDialog(null,
                                    "Selecione uma opção",
                                    "*** MENU PRINCIPAL ***",
                                    INFORMATION_MESSAGE,
                                    null,
                                    item,
                                    item[0]);
            switch(opcao.toLowerCase()) {
                case "vendedor" -> new MenuVendedor().menu();
                case "venda" -> new MenuVenda().menu();
            }
        }
        while(!opcao.toLowerCase().equals("finalizar"));
    }

}
