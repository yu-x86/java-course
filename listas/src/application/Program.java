package application;

import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Maria");
		nomes.add("Alex");
		nomes.add("Bob");
		nomes.add("Anna");
		nomes.add("Teste");
		nomes.add(2, "Marco");
		
		nomes.remove("Teste");
		
		System.out.println(nomes.size());
		
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		System.out.println("-------------------");
		
		nomes.removeIf(x -> x.charAt(0) == 'M');
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Index of Bob: " + nomes.indexOf("Bob"));
		
		List<String> result = nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		String name = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
	}

}

