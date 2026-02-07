package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Order order;
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt1);
		Client client = new Client(name, email, birthDate);
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		System.out.print("How many items to order: ");
		int n = sc.nextInt();
		order = new Order(Instant.now(), OrderStatus.valueOf(status), client);
		for(int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Product quantity: ");
			int productQuantity = sc.nextInt();
			OrderItem item = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
			order.addItem(item);
		}
		
		System.out.println();
		
		System.out.println("ORDER SUMMARY:");
		System.out.print(order);
		
		sc.close();
	}

}
