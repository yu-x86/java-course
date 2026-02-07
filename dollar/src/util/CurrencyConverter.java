package util;

public class CurrencyConverter {
	public static double dollarQuantity(double quantity, double price) {
		double result = (quantity * price);
		return result;
	}
	public static double totalToPaid(double quantity) {
		double result = quantity + (quantity * (6.0 / 100));
		return result;
	}
}
