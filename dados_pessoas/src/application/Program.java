package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = 0;
		double soma = 0;
		int quantidadeHomens = 0;
		
		for(int i = 0; i < altura.length; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			} else if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if(genero[i] == 'F') {
				soma += altura[i];
			} else {
				quantidadeHomens++;
			}
		}
		double mediaMulheres = soma / (genero.length - quantidadeHomens);
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
		System.out.print("Numero de homens = " + quantidadeHomens);
		
		sc.close();
	}

}