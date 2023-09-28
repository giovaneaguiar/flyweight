import java.util.HashMap;
import java.util.Map;

public class Restaurante {
    private Map<Integer, Pedido> pedidos = new HashMap<>();

    public void fazerPedido(int numeroPedido, String nomeCliente, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Pedido pedido = new Pedido(numeroPedido, nomeCliente, cidade);
        pedidos.put(numeroPedido, pedido);
    }

    public String obterPedido(int numeroPedido) {
        Pedido pedido = pedidos.get(numeroPedido);
        if (pedido != null) {
            return pedido.obterPedido();
        } else {
            return "Pedido não encontrado.";
        }
    }
}
