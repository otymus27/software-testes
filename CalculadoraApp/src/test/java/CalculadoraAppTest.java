import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraAppTest {
    @Test
    public void testSomaInteiros(){

        // Configuração do caso de teste
        CalculadoraApp calc = new CalculadoraApp();

        // Execução do caso de teste
        int resultado = calc.somaInteiros(10, 20);


        // Verificação do caso de teste
        assertEquals(30, resultado);
    }
}
