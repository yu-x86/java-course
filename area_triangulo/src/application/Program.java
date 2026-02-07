package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measures of triangle X:");
		double lado_x1 = sc.nextDouble();
		double lado_x2 = sc.nextDouble();
		double lado_x3 = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		double lado_y1 = sc.nextDouble();
		double lado_y2 = sc.nextDouble();
		double lado_y3 = sc.nextDouble();
		double p = (lado_x1 + lado_x2 + lado_x3) / 2;
		double area_x = Math.sqrt(p * (p - lado_x1) * (p - lado_x2) * (p - lado_x3));
		p = (lado_y1 + lado_y2 + lado_y3) / 2;
		double area_y =  Math.sqrt(p * (p - lado_y1) * (p - lado_y2) * (p - lado_y3));
		System.out.printf("Triangle X area: %.4f%n", area_x);
		System.out.printf("Triangle Y area: %.4f%n", area_y);
		if(area_x > area_y){
			System.out.print("Larger area: X");
		} else if(area_x < area_y){
			System.out.println("Larger area: Y");
		} else {
			System.out.println("X and Y are equals");
		}
		sc.close();
	}

}
