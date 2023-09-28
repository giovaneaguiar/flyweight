public class Pedido {

    private int numeroPedido;
    private String nomeCliente;
    private Cidade cidadeEntrega;

    public Pedido(int numeroPedido, String nomeCliente, Cidade cidadeEntrega) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.cidadeEntrega = cidadeEntrega;
    }

    public String obterPedido() {
        return "Pedido #" + this.numeroPedido +
                " - Cliente: " + this.nomeCliente +
                " - Cidade de Entrega: " + cidadeEntrega.getNome() +
                ", " + cidadeEntrega.getUf();
    }
}
