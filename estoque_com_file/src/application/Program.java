package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		//caminho do arquivo
		System.out.print("Enter file path: ");
		String originalFilePath = sc.nextLine();
		
		//cria o objeto arquivo
		File originalFile = new File(originalFilePath);
		//pega a pasta onde está o arquivo
		String originalFileFolder = originalFile.getParent();
		
		//cria a subpasta out
		boolean success = new File(originalFileFolder + "\\out").mkdir();
		
		//define o caminho do novo csv
		String newFilePath = originalFileFolder + "\\out\\summary.csv";
	
		try(BufferedReader br = new BufferedReader(new FileReader(originalFile))){
			String line = br.readLine();
			while(line != null) {
				String[] data = line.split(",", 3);
				String name = data[0];
				double value = Double.parseDouble(data[1]);
				int quantity = Integer.parseInt(data[2]);
				products.add(new Product(name, value, quantity));
				line = br.readLine();
			}
			
			System.out.println();
			
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath))){
				for(Product product : products) {
					bw.write(product.getName() + "," + String.format("%.2f", product.total()));
					bw.newLine();
				}
				System.out.println("New file created!");
				
			} catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		} catch(IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		sc.close();
	}

}
