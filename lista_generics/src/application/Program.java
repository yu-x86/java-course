package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.add(value);
		}
		
		ps.print();
		
		Integer x = ps.first();
		System.out.print("First: " + x);
		
		sc.close();
	}

}
