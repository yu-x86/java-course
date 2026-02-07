package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		
		int quantity = sc.nextInt();
		
		Product produto = new Product(name, price, quantity);
		
		System.out.printf("Product data: " + produto.toString());
		System.out.print("Enther the number of products to be added in stock: ");
		int productQuantity = sc.nextInt();
		produto.addProducts(productQuantity);
		System.out.printf("Updated data: " + produto.toString());
		System.out.print("Enter the number of products to be removed from stock: ");
		productQuantity = sc.nextInt();
		produto.removeProducts(productQuantity);
		System.out.printf("Updated data: " + produto.toString());
		sc.close();
	}

}
