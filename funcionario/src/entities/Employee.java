package entities;

public class Employee {
	public String name;
	//Salário bruto
	public double grossSalary;
	//Imposto
	public double tax;
	
	//Salario liquido
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * (percentage / 100);
	}
	public String toString() {
		return name 
				+ ", $" 
				+ String.format("%.2f", netSalary())
				+ "%n";
	}
}
