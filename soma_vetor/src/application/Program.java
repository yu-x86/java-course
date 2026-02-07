package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		for(int i = 0; i < vect.length; i++) {
			if(i == 0) {
				System.out.print("Valores = ");
			}
			System.out.printf("%.2f ", vect[i]);
		}
		double soma = 0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		double media = soma / vect.length;
		System.out.println("\nSoma = " + soma);
		System.out.println("Media = " + media);
		
		sc.close();
	}
}
