package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "f:\\produtos.csv";
		List<Product> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String products = br.readLine();
			while(products != null) {
				String[] fields = products.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				products = br.readLine();
			}
			Product mostExpensiveProduct = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.print(mostExpensiveProduct);
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
