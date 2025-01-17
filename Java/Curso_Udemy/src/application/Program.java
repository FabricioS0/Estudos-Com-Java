package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.funcionario;

public class Program {
	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 funcionario fun = new funcionario();
		 
		 
		 //Entrada de dados//
		 System.out.print("Name: ");
		 fun.name = sc.nextLine();
		 System.out.print("Gross Salary: ");
		 fun.grossSalary = sc.nextDouble();
		 System.out.print("Tax: ");
		 fun.tax = sc.nextDouble();
		 
		 // Saida inicial //
		 
		 System.out.println(fun);
		 
		// entrada update // 
		 
		 System.out.print("Which percentage to increase salary?");
		 double percentage = sc.nextDouble();
		 fun.increseSalary(percentage);
		 
		 // Ultima Saida //
		 
		 System.out.println();
		 System.out.println("Updated data: " + fun);
		 
		 sc.close();
	}
}
