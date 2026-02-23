package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print("Name: ");
			sc.next();
			String name = sc.nextLine();
			System.out.print("ID: ");
			int id = sc.nextInt();
			set.add(new Student(name, id));
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print("Name: ");
			sc.next();
			String name = sc.nextLine();
			System.out.print("ID: ");
			int id = sc.nextInt();
			set.add(new Student(name, id));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print("Name: ");
			sc.next();
			String name = sc.nextLine();
			System.out.print("ID: ");
			int id = sc.nextInt();
			set.add(new Student(name, id));
		}
		
		System.out.println("Total students: " + set.size());
		sc.close();
	}

}
