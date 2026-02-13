package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		String path = "d:\\funcionarios.csv";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			String employeeCsv = bf.readLine();
			while(employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				employees.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = bf.readLine();
			}
			
			Collections.sort(employees);
			for(Employee emp : employees) {
				System.out.println(emp.getName() + ", $" + emp.getSalary());
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
