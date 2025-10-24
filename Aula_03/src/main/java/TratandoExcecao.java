public class TratandoExcecao {

    public int dividir(int a, int b) {
        if (b == 0) {
            throw  new ArithmeticException("Divisão por zero não permitida");
        }
        return a / b;
    }

}
