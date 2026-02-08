package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Folder path: ");
		String folderPath = sc.nextLine();
		
		File path = new File(folderPath);
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file: files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		boolean success = new File(folderPath + "\\pastateste").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
