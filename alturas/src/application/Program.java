package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i = 0; i < altura.length; i++) {
			soma += altura[i];
		}
		
		double alturaMedia = soma / altura.length;
		System.out.printf("Altura media: %.2f\n", alturaMedia);
		
		double cont = 0;

		for(int i = 0; i < idade.length; i++) {
			if(idade[i] < 16) {
				cont++;
			}
		}
		double pessoasNovas = cont * 100 / idade.length;;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", pessoasNovas);
		
		for(int i = 0; i < idade.length; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
