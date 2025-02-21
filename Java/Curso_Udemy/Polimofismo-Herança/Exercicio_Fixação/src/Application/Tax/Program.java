package Application.Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Tax.individual;
import entities.Tax.Company;
import entities.Tax.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Anual Income: ");
				double anualIncome = sc.nextDouble();
				
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Anual Income: ");
				double anualIncome = sc.nextDouble();
				
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			
		}
		System.out.println("TAXES PAID:");
		
		double total = 0;
		for(TaxPayer tax : list) {
			System.out.println(tax.getName() + String.format(": $ %.2f", tax.tax()));
			total += tax.tax();
		}
		System.out.println("Total taxes: $" + total);
		
		
		sc.close();
	}
}
