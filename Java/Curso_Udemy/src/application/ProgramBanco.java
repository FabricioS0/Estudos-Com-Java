package application;

import java.util.Locale;
import entidades.Conta_banco;

public class ProgramBanco {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Conta_banco c1 = new Conta_banco("Fabricio S",15755,"19-1",15000.00,"2024-06-21");
		
		c1.sacar(5000.00);
		
		c1.depositar(150000.00);
		
		c1.rendimentos(10.00);
		
		System.out.println();
		System.out.print(c1);
	}
}
