package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		list.add(new Rectangle(3.0, 2.0));
		list.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(list));
		
		sc.close();
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0;
		for(Shape shape : list) {
			sum += shape.area(); 
		}
		return sum; 
	}
}
