package M5Ex02;

public class ItemPedido {
    String produto;
    double valor;
    int qtdComprado;

    public ItemPedido(String produto, double valor, int qtdComprado) {
        this.produto = produto;
        this.valor = valor;
        this.qtdComprado = qtdComprado;
    }

    public double totalParcial(){
        return valor * qtdComprado;
    }


}
