package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] notaSem1 = new double[n];
		double[] notaSem2 = new double[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno");
			nome[i] = sc.nextLine();
			notaSem1[i] = sc.nextDouble();
			notaSem2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < n; i++) {
			if((notaSem1[i] + notaSem2[i]) / 2 >= 6) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}