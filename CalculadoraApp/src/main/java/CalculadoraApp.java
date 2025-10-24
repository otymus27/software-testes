public class CalculadoraApp {

    public int somaInteiros(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        CalculadoraApp app = new CalculadoraApp();
        int resultado = app.somaInteiros(10, 20);
        System.out.println(resultado);
    }
}
