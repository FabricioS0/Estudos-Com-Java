package entidades;

import java.io.PrintStream;

public class Conta_banco {
	public String titular;
	public int num;
	public String agencia;
	public Double saldo;
	public String data;
	
	public Conta_banco(String titular, int num, String agencia, Double saldo, String data) {
        this.titular = titular;
        this.num = num;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data = data;
    }
	public void sacar(Double valor){
		if(valor > saldo) {
			System.out.println("Valor maior que o saldo");	
		}
			
		Double limiteRisco = saldo * 0.15;
		
		if(saldo - valor <= limiteRisco){
			this.saldo -= valor;
			System.out.println("Valor sacado! saldo proximo do seu limite!");
			System.out.printf("Saque realizado com sucesso, saldo atual: " + "%.2f" , saldo);
			System.out.println();
		} else{
			this.saldo -= valor;
			System.out.printf("Saque realizado com sucesso, saldo atual: " + "%.2f" , saldo);
			System.out.println();
		}
	}
	public void depositar(Double valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.printf("Deposito realizado: " + "%.2f" , saldo);
			System.out.println();
		} else {
			System.out.println("Deposito indisponivel!");
			System.out.println();
		}
	}
	public PrintStream rendimentos(Double porcentagem) {
		Double rendimentos = saldo + (saldo * porcentagem / 100);
		return System.out.printf("O valor do rendimento foi de; R$ "+ "%.2f", rendimentos);
		
	}
	public String toString() {
		return "Conta com o titular: " + titular + ", número: " + num + ", agencia: " + agencia + String.format(", saldo de R$: %.2f", saldo) + saldo + ". Criado na seguinte data: " + data;
		
	}
}
