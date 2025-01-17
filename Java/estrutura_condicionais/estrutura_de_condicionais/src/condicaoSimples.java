public class condicaoSimples {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }
        System.out.println(saldo);
    }
}

//A condição simples é a utilização do if para uma executar um fluxo de instruções.
