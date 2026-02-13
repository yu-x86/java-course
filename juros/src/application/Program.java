package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		InterestService b = new BrazilInterestService(2.0);
		double payment = b.payment(amount, months);
		System.out.println("Payment after " + months + " months:");
		System.out.print(String.format("%.2f", payment));
		
		sc.close();
	}

}
