package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		
		double mediaDoVetor = soma / vect.length;
		System.out.printf("Media do vetor = %.3f\n", mediaDoVetor);
		
		System.out.println("Elementos abaixo da media: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < mediaDoVetor) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}