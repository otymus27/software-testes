public class CalculadoraApp {

    public int somaInteiros(int a, int b) {
        return a + b;
    }

    public int divideInteiros(int a, int b) {
        return a / b;
    }

    public int multiplicaInteiros(int a, int b) {
        return a * b;
    }

    public boolean testarPar(int numero){
        int resto = numero % 2;
        if(resto == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        CalculadoraApp app = new CalculadoraApp();
        int resultado = app.somaInteiros(10, 5);
        System.out.println(resultado);

        int resultado2 = app.divideInteiros(10, 2);
        System.out.println(resultado2);

        int resultado3 = app.multiplicaInteiros(10, 3);
        System.out.println(resultado3);

        if(app.testarPar(21)){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
