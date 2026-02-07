package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		
		List<Employee> employee = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employee.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int employeeId = sc.nextInt();
		
		boolean found = false;
		for(Employee emp: employee) {
			if(emp.getId() == employeeId) {
				found = true;
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				emp.salaryIncrease(percentage);
				System.out.println();
			}
		}
		
		
		if(found == false) {
			System.out.println("This id does not exist!");
			System.out.println();
		}
		
		System.out.println("List of employess:");
		for(Employee emp: employee) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}

}
