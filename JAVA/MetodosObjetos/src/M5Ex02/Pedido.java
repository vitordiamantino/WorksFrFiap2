package M5Ex02;

import java.util.Random;

public class Pedido {
    int numero;
    String data;
    ItemPedido[] item;
    int index;

    public Pedido(String data, int totalItens) {
        Random random = new Random();
        this.numero = random.nextInt(1000, 9999);
        this.data = data;
        this.item = new ItemPedido[totalItens];
    }
    public void adicionarItem(ItemPedido itemPedido){
        if (index < item.length){
            item[index] = itemPedido;
            index++;
        }
    }
    public double valorTotal(){
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += item[i].totalParcial();
        }
        return  total;
    }
}
