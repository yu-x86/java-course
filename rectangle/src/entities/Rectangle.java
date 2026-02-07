package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		double result = width * height;
		return result;
	}
	public double perimeter() {
		double result = 2 * (width + height);
		return result;
	}
	public double diagonal() {
		double result = Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
		return result;
	}
}
