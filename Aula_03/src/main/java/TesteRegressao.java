public class TesteRegressao {

    // Método para fazer testes de regressão, ou seja, testar o que foi alterado e verificar se continua funcionando
    public int descontoProgressivo(int quantidade){
        if (quantidade <= 10){
            return 5;
        }else if (quantidade <= 20){ // ERRO: deveria ser <= 20
            return 10;
        }else {
            return 15;
        }
    }



}
