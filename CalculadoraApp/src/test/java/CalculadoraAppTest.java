
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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

    // Depois de cada caso de teste, faz limpeza do objeto para liberar espaço em memoria
    @AfterEach
    void limpar(){
        calc = null;
    }

}
