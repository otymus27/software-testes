
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculadoraAppTest {
    CalculadoraApp calc = new CalculadoraApp();


    // Antes de cada teste, cria uma nova instancia para o objeto
    @BeforeEach
    public void configura(){
        calc = new  CalculadoraApp();
    }

    @Test
    public void testSomaInteiros(){

        // Execução do caso de teste
        int resultado = calc.somaInteiros(10, 20);


        // Verificação do caso de teste
        assertEquals(30, resultado);
    }

    @Test
    public void testDivideInteiros(){
        // Execução do caso de teste
        int resultado = calc.divideInteiros(10, 5);


        // Verificação do caso de teste
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicaInteiros(){
        // Execução do caso de teste
        int resultado = calc.multiplicaInteiros(10, 5);


        // Verificação do caso de teste
        assertEquals(50, resultado, "Multiplicação mal-sucedida!");
    }

    @ParameterizedTest
    @ValueSource(ints = {0,2,4,6})
    public void testTestaPar(int numero){
        assertTrue(calc.testarPar(numero), "O número "+ numero + " deveria ser par.");
    }

    // Depois de cada caso de teste, faz limpeza do objeto para liberar espaço em memoria
    @AfterEach
    void limpar(){
        calc = null;
    }

}
