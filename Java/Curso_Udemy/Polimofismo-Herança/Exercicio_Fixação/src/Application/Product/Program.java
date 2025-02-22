package Application.Product;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product.Product;
import entities.Product.UsedProduct;
import entities.Product.ImportedProduct;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>(); 
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
		
			System.out.println("Product #" + i + "data: ");
			System.out.println("Common, used or imported (C/U/I)?");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			if(ch == 'I') {
				System.out.println("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				ImportedProduct imp =  new ImportedProduct(name, price, customsFee);
				list.add(imp);
			} else if(ch == 'U') {
				Date manufactureDate = null;
				
				UsedProduct used = new UsedProduct(name, price, manufactureDate);
				list.add(used);
				
			} else {
				Product product = new Product(name, price);
				list.add(product);
			}
			
			System.out.println();
			System.out.println();
			for(Product product: list) {
				System.out.println(product.getName() + " $ " + price + " " + product.priceTag());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
