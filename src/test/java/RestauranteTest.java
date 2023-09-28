import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestauranteTest {

    private Restaurante restaurante;

    @BeforeEach
    public void setUp() {
        restaurante = new Restaurante();
    }

    @Test
    public void testFazerPedido() {
        restaurante.fazerPedido(1, "Giovane", "Juiz de Fora", "MG");
        restaurante.fazerPedido(2, "Maria", "Rio de Janeiro", "RJ");

        assertEquals("Pedido #1 - Cliente: Giovane - Cidade de Entrega: Juiz de Fora, MG", restaurante.obterPedido(1));
        assertEquals("Pedido #2 - Cliente: Maria - Cidade de Entrega: Rio de Janeiro, RJ", restaurante.obterPedido(2));
    }

    @Test
    public void testPedidoNaoEncontrado() {
        restaurante.fazerPedido(1, "Giovane", "Juiz de Fora", "MG");
        restaurante.fazerPedido(2, "Maria", "Rio de Janeiro", "RJ");

        assertEquals("Pedido não encontrado.", restaurante.obterPedido(3));
    }
}
