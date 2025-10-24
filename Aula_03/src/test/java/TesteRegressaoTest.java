import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TesteRegressaoTest {
    TesteRegressao testeRegressao = new TesteRegressao();

    @Test
    public void testDesconto5(){
        // Execução do caso de teste
        int desconto = testeRegressao.descontoProgressivo(9);

        // Verificação do caso de teste
        assertEquals(5, desconto);
    }

    @Test
    public void testDesconto10(){
        // Execução do caso de teste
        int desconto = testeRegressao.descontoProgressivo(19);

        // Verificação do caso de teste
        assertEquals(10, desconto);
    }

    @Test
    public void testDesconto15(){
        // Execução do caso de teste
        int desconto = testeRegressao.descontoProgressivo(29);

        // Verificação do caso de teste
        assertEquals(15, desconto);
    }

}
