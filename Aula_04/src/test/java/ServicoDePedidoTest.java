import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pedidos.Pedido;
import pedidos.RepositorioDePedidos;
import pedidos.ServicoDePedido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

// Habilita o uso de @Mock e @InjectMocks com JUnit 5
@ExtendWith(MockitoExtension.class)
public class ServicoDePedidoTest {

    @Mock
    private RepositorioDePedidos repositorioFalso;

    @InjectMocks
    private ServicoDePedido servico; // Recebe automaticamente o mock no construtor

    @Test
    public void deveRetornarDescricaoDoPedido() {
        // Arrange: simula um pedido
        Pedido pedidoFalso = new Pedido(2, "Pedido de teste n 1");
        when(repositorioFalso.buscarPorId(2)).thenReturn(pedidoFalso);// when é metodo do Mockito

        // Quando chamamos o metodo de servico
        String resultado = servico.obterDescricaoDoPedido(2);

        // Então a descrição dever estar correta
        assertEquals("Pedido de teste n 1", resultado);
    }
}
