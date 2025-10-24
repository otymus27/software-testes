import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TratandoExcecaoTest {
    TratandoExcecao excecao = new TratandoExcecao();


    @Test
    public void testDivisaoPorZeroLancaExcecaoComMensagemCorreta(){
        // Execução do caso de teste
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            excecao.dividir(10,0);
        });

        // Verificação do caso de teste
        assertEquals("Divisão por zero não permitida", exception.getMessage());
    }

}
