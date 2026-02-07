package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		int maiorIdade = 0;
		int posicaoMaisVelho = 0;
		for(int i = 0; i < n; i++) {
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaisVelho = i;
			}
		}
		
		String maisVelho = nome[posicaoMaisVelho];
		
		System.out.print("Pessoa mais velha: " + maisVelho);
		sc.close();
	}

}