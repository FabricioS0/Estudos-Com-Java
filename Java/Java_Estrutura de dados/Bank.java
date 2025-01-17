public class Bank {
    private int numConta;
    private String name;
    private double saldo;

    public Bank(int numConta, String name){
        this.name = name;
        this.numConta = numConta;

    }
    public Bank(String name,int numConta, double saldoInicial ){
        this.name = name;
        this.numConta = numConta;
        deposito(saldoInicial);
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public int getnumConta(){
        return numConta;
    }
    
    public double getsaldo(){
        return saldo;
    }

    public void deposito(double valor){
     this.saldo += valor;

    }
    public void saque(double valor){
        this.saldo -= valor + 5.0;
    }

    public String tosString(){
        return "Conta" + numConta + ", nome " + name + ", saldo R$" + String.format("%2.f", saldo);
    }

}
