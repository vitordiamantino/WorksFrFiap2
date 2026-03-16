package M5Ex02;

public class Main {
    public static void main(String[] args) {
        // gerando 3 itens
        ItemPedido item1 = new ItemPedido("mouse", 50,3 );
        ItemPedido item2 = new ItemPedido("monitor", 1000,2 );
        ItemPedido item3 = new ItemPedido("caderno", 100,5 );

        //gerando 2 pedidos
        Pedido pedido1 = new Pedido("16/03/2026", 2);
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        Pedido pedido2 = new Pedido("20/01/2026", 1);
        pedido2.adicionarItem(item3);

        //gerando um cliente
        Cliente cliente = new Cliente("Vitor", 123, 2);

        cliente.adicionarPedido(pedido1);
        cliente.adicionarPedido(pedido2);

        System.out.println("total de todos os pedidos: R$ " + cliente.total());

    }
}
