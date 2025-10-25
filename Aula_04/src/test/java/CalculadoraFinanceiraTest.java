import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculadoraFinanceiraTest {

    @Mock
    private ConversorDeMoeda conversorFalso;

    @InjectMocks
    private CalculadoraFinanceira calculadoraFinanceira;

    @Test
    public void deveSomarValorEmReaisComValorConvertidoDeDolar() {
        // Arrange: simula a conversao
        when(conversorFalso.dolarParaReal(10.0)).thenReturn(50.0);

        // Act: executa o metodo real
        double resultado = calculadoraFinanceira.somarEmReais(100.0, 10.0);

        // Assert: verifica o resultado
        assertEquals(150.0, resultado);

        // Verificação: garante que o metodo do mock foi chamado com o valor correto
        verify(conversorFalso).dolarParaReal(10.0);
    }
}
