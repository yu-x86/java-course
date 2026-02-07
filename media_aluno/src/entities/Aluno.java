package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void checaSePassou() {
		double result = nota1 + nota2 + nota3;
		if(nota1 >= (30 * (60.0 / 100)) && nota2 >= (35 * (60.0 / 100)) && nota3 >= (35 * (60.0 / 100))) {
			System.out.printf("Nota final: %.2f%n", result);
			System.out.println("PASSOU");
		} else {
			System.out.printf("Nota final: %.2f%n", result);
			System.out.println("REPROVOU");
			double faltou = 60 - result;
			System.out.printf("FALTARAM %.2f PONTOS", faltou);
		}
	}
}
