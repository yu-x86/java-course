package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int soma = 0;
		int pares = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				soma += vect[i];
				pares++;
			}
		}
		
		double media;
		
		if(soma == 0) {
			System.out.println("Nenhum numero par");
		} else {
			media = soma / pares;
			System.out.printf("Media dos pares = %.1f", media);
		}
		
		
		sc.close();
	}

}