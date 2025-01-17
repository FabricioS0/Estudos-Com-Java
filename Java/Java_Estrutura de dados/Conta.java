public class Conta{
    private String Titular;
    private int numConta;
    private double saldo = 0;

    public Conta(String Titular, int numConta, double saldo){
        this.Titular = Titular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getTitular(){
        return Titular;
    }
    public void setTitular(String Titular){
        this.Titular = Titular;
    }

    public int getnumConta(){
        return numConta;
    }
    public void setnumConta(int numConta){
        this.numConta = numConta;
    }
    

    public void sacar(double valor){
        if( valor < saldo ){
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso, cliente "+ Titular + " seu saldo agora é: R$ " + saldo);
        } else{
            System.out.println("Saldo indisponivel!");
        }
    }

    public void depositar(double valor){
        if( valor > 0){
            saldo = saldo + valor;
            System.out.println("Deposito realizado com sucesso, cliente "+ Titular + " seu saldo agora é: R$ " + saldo);
        } else{
            System.out.println("Deposito indisponivel!");
        }
    }

    public void calculaRendimento(){
        double valor = saldo * 0.1;
        System.out.println("O valor de investimento fica R$ " + valor);
    }


}




