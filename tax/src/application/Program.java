package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List<TaxPayer> taxPayer = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char typeOfPayer = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(typeOfPayer == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				taxPayer.add(new Individual(name, income, healthExpenditures));
			} else if(typeOfPayer == 'c') {
				System.out.print("Number of employess: ");
				int numberOfEmployess = sc.nextInt();
				taxPayer.add(new Company(name, income, numberOfEmployess));
			}
		}
		System.out.println();
		
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for(TaxPayer tp : taxPayer) {
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.totalTax()));
			sum += tp.totalTax();
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $" + String.format("%.2f", sum));
		
		sc.close();
	}

}
